package relismdev.cf.rcore.eventListeners;

import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class mobDamaging implements Listener {

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    @EventHandler
    public void onMobDamage(EntityDamageByEntityEvent event){
        Entity damager = event.getDamager();
        Entity damaged = event.getEntity();
        double damage = event.getDamage();

        damager.sendMessage(damager.getName() + ", hai danneggiato " + damaged.getName() + " per " + round(damage, 2) + " di danno !!");
    }
}
