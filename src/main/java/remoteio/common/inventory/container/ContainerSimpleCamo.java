package remoteio.common.inventory.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Slot;

import remoteio.common.inventory.InventoryItem;
import remoteio.common.inventory.container.core.ContainerItemPhantom;
import remoteio.common.inventory.container.slot.SlotPhantom;

/**
 * @author dmillerw
 */
public class ContainerSimpleCamo extends ContainerItemPhantom {

    public ContainerSimpleCamo(EntityPlayer player, InventoryItem inventory) {
        super(inventory, player.inventory.currentItem + 27 + inventory.getSizeInventory());

        addSlotToContainer(new SlotPhantom(inventory, 0, 80, 35));

        // Player inventory
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlotToContainer(new Slot(player.inventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for (int i = 0; i < 9; ++i) {
            this.addSlotToContainer(new Slot(player.inventory, i, 8 + i * 18, 142));
        }
    }
}
