package relismdev.cf.rcore.eventListeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class joinLeaveListener implements Listener {

    @EventHandler
    public void onJoinEvent(PlayerJoinEvent event){
        Player p = event.getPlayer();
        event.setJoinMessage(ChatColor.GOLD + p.getDisplayName() + " Just joined the server ^^");
    }

    @EventHandler
    public void onLeaveEvent(PlayerQuitEvent event){
        Player p = event.getPlayer();
        event.setQuitMessage(ChatColor.GOLD + p.getDisplayName() + " Just left us... :(");
    }

}
