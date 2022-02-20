package relismdev.cf.rcore.eventListeners;

import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import java.util.List;
import java.util.concurrent.BlockingQueue;

public class blockBreaking implements Listener {

    @EventHandler
    public void onPlaceEvent(BlockPlaceEvent event){
        Block b = event.getBlock();
        System.out.println(event.getPlayer().getName() + " ha piazzato, nel senso vero della parola però : " + b.getBlockData().getMaterial() + " in posizione : x(" +
                b.getX() + ") y(" + b.getY() + ") z(" + b.getZ() + ")");
    }

}
