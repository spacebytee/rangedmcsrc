package net.mcreator.rangedmc;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

public class MCreatorRangedMC extends rangedmc.ModElement {

	public MCreatorRangedMC(rangedmc instance) {
		super(instance);
	}

	public static CreativeTabs tab = new CreativeTabs("tabRangedMCGuns") {

		@SideOnly(Side.CLIENT)
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(MCreatorM4.block, (int) (1));
		}

		@SideOnly(Side.CLIENT)
		public boolean hasSearchBar() {
			return true;
		}
	}.setBackgroundImageName("item_search.png");
}
