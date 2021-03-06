package mcmultipart.multipart;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;

/**
 * Implement this interface to create instances of your multiparts.
 */
public interface IPartFactory {

    /**
     * Creates a part from a part type.
     */
    public IMultipart createPart(String type, boolean client);

    /**
     * Implement this interface to create instances of your parts depending on the part type and the data stored in NBT or received in an
     * update packet.
     */
    public interface IAdvancedPartFactory {

        /**
         * Creates a part from a type and an update packet. Used when loading parts in the client.
         */
        public IMultipart createPart(String type, PacketBuffer buf);

        /**
         * Creates a part from a type and an NBT tag. Used when loading parts from NBT.
         */
        public IMultipart createPart(String type, NBTTagCompound tag);

    }

}
