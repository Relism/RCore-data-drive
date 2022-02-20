package relismdev.cf.rcore.eventListeners;

import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class blockPlacing implements Listener {

    @EventHandler
    public void onBreakEvent(BlockBreakEvent event){
        Block b = event.getBlock();
        System.out.println(event.getPlayer().getName() + " ha distrutto, intendo dire compleatamente obliterato : " + b.getBlockData().getMaterial() + " in posizione : x(" +
                b.getX() + ") y(" + b.getY() + ") z(" + b.getZ() + ")");
    }

}
