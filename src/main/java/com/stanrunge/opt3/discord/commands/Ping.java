package com.stanrunge.opt3.discord.commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

public class Ping {
    String name = "ping";
    String description = "Tests if the bot is working properly.";

    public static void run(SlashCommandInteractionEvent event) {
        event.reply("Pong!").queue();
    }
}
