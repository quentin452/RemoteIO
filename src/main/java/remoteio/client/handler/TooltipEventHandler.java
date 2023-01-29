package remoteio.client.handler;

import net.minecraft.util.StatCollector;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

/**
 * @author dmillerw
 */
public class TooltipEventHandler {

    @SubscribeEvent
    public void itemTooltipEvent(ItemTooltipEvent event) {
        if (event.itemStack.hasTagCompound() && event.itemStack.getTagCompound().hasKey("inhibit")) {
            byte inhibit = event.itemStack.getTagCompound().getByte("inhibit");
            event.toolTip.add(StatCollector.translateToLocal("inhibitor.tooltip"));
            if (inhibit == 1) {
                event.toolTip.add(" - " + StatCollector.translateToLocal("inhibitor.item"));
            } else {
                event.toolTip.add(" - " + StatCollector.translateToLocal("inhibitor.block"));
            }
        }
    }
}
