package remoteio.common.core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import remoteio.common.lib.ModBlocks;

public class TabRemoteIO extends CreativeTabs {

    public static final TabRemoteIO TAB = new TabRemoteIO();

    private TabRemoteIO() {
        super("rio");
    }

    @Override
    public Item getTabIconItem() {
        return Item.getItemFromBlock(ModBlocks.remoteInterface);
    }
}
