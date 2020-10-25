package tk.laspruca.tcplugin.commands;

import net.md_5.bungee.api.chat.*;
import net.md_5.bungee.api.chat.hover.content.Text;
import org.bukkit.command.*;

import static org.bukkit.ChatColor.*;

public class DiscordCommand implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
		commandSender.spigot().sendMessage(generateText());
		return true;
	}

	public static TextComponent generateText() {
		TextComponent text = new TextComponent(BLUE.toString() + BOLD.toString() + "Join the Technocraft Discord Server!");
		text.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://discord.gg/8F7RpsG"));
		text.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text("Click to join discord\n")));
		return text;
	}
}
