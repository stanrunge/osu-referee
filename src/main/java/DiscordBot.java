import com.mysql.cj.protocol.MessageListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;

public class DiscordBot extends ListenerAdapter {
    static Config config = new Config();

    public static void main() throws LoginException {
        JDA jda = JDABuilder.createLight(config.getDiscordToken(), GatewayIntent.GUILD_MESSAGES)
                .addEventListeners(new DiscordBot())
                .setActivity(Activity.playing("hello"))
                .build();

        jda.upsertCommand("ping", "Ping pong!").queue();
    }

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if (!event.getName().equals("ping")) return;
        event.reply("pong!").queue();
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        Message msg = event.getMessage();
        if (msg.getContentRaw().equals("hello")) {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("hi :)").queue();
        }
    }
}
