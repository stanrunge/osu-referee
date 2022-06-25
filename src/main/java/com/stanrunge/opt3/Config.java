package com.stanrunge.opt3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Value("${discord.token}")
    private String discordToken;

    @Bean
    public String getDiscordToken() {
        return discordToken;
    }
}
