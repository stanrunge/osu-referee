package discord;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.requests.restaction.CommandListUpdateAction;

import javax.security.auth.login.LoginException;

public class Bot extends ListenerAdapter {
    static Config config = new Config();

    public static void main() throws LoginException {
        JDA jda = JDABuilder.createLight(config.getDiscordToken(), GatewayIntent.GUILD_MESSAGES)
                .addEventListeners(new Bot())
                .setActivity(Activity.playing("hello"))
                .build();

        CommandListUpdateAction commands = jda.updateCommands();

        commands.addCommands(
                Commands.slash("creatematch", "Creates a match to referee.")
        );

        commands.addCommands(
                Commands.slash("test", "Tests if the bot is working properly.")
        );

        commands.queue();
    }

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        switch (event.getName()) {
            case "creatematch":
                break;
            case "test":
                event.reply("The bot is working properly!").queue();
                break;
        }
    }
}
