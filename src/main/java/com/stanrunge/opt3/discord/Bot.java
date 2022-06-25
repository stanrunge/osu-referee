package com.stanrunge.opt3.discord;

import com.stanrunge.opt3.Config;
import com.stanrunge.opt3.discord.commands.Ping;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.interactions.commands.build.SubcommandData;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.requests.restaction.CommandListUpdateAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.security.auth.login.LoginException;

public class Bot extends ListenerAdapter {
    @Autowired @Value("${discord.token}") private static String token;

    public static void main() throws LoginException {
        System.out.println("Starting com.stanrunge.opt3.osu! referee bot\n");

        JDA jda = JDABuilder.createLight(Config, GatewayIntent.GUILD_MESSAGES)
                .addEventListeners(new Bot())
                .setActivity(Activity.playing("com.stanrunge.opt3.osu!"))
                .build();

        CommandListUpdateAction commands = jda.updateCommands();

        commands.addCommands(
                Commands.slash("match", "Creates a match to referee.")
                        .addSubcommands(new SubcommandData("create", "Creates a match to referee."))
                        .addSubcommands(new SubcommandData("delete", "Deletes a match."))
                        .addSubcommands(new SubcommandData("play", "Plays a match."))
        );

        commands.addCommands(
                Commands.slash("ping", "Tests if the bot is working properly.")
        );

        commands.queue();
    }

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        switch (event.getName()) {
//            case "creatematch" -> Match.run(event);
            case "ping" -> Ping.run(event);
        }
    }
}
