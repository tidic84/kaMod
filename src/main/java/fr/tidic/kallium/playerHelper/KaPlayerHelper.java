package fr.tidic.kallium.playerHelper;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.fml.common.gameevent.TickEvent;


public class KaPlayerHelper
{
    /**
        * Method to set the player hitbox size
        * 
        * @param player
        *            _(EntityPlayer)_ Call the player from event
        * @param width
        *            _(float)_ Define the player width
        * @param height
        *            _(float)_ Define the player height
        * @param eyeHeight
        *            _(float)_ Define the player eyes Y position
        */
    public static void setPlayerSize(EntityPlayer player, float width, float height, float eyeHeight)
    {
        AxisAlignedBB axisalignedbb = player.getEntityBoundingBox();
 
        player.width = width;
        player.height = height;
 
        player.setEntityBoundingBox(new AxisAlignedBB(axisalignedbb.minX, axisalignedbb.minY, axisalignedbb.minZ,
                axisalignedbb.minX + (double) width, axisalignedbb.minY + (double) height,
                axisalignedbb.minZ + (double) width));
        player.getEntityBoundingBox().setMaxY(axisalignedbb.maxY);
 
        player.eyeHeight = eyeHeight;
    }
    
 
    /**
        * Method to reset the player hitbox size to default 
{1}
        * height = 1.8F 
{1}
        * width = 0.6F 
{1}
        * eyeHeight = 1.62F
{1}
        * 
        * @param player
        *            _(EntityPlayer)_ Call the player from event
        */
    public static void resetPlayerSize(EntityPlayer player)
    {
        setPlayerSize(player, 0.6F, 1.8F, player.getDefaultEyeHeight());
    }
}