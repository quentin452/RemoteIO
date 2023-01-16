package remoteio.common.inventory.container;

import net.minecraft.entity.player.InventoryPlayer;
import remoteio.common.inventory.container.core.ContainerIO;
import remoteio.common.tile.TileRemoteInventory;

/**
 * @author dmillerw
 */
public class ContainerRemoteInventory extends ContainerIO {

    public ContainerRemoteInventory(InventoryPlayer inventoryPlayer, TileRemoteInventory tile) {
        super(inventoryPlayer, tile);
    }
}
