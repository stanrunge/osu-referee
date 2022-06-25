package com.stanrunge.opt3;

import com.stanrunge.opt3.discord.Bot;
import com.stanrunge.opt3.entities.Event;
import com.stanrunge.opt3.web.Challonge;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.security.auth.login.LoginException;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}