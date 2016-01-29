package org.mcsg.double0negative.supercraftbros.classes;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ZombieClass extends PlayerClassBase{

	public ZombieClass(Player p) {
		super(p);
	}
	
	
	@SuppressWarnings("deprecation")
	public void PlayerSpawn(){
		player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 999999, 2));

		PlayerInventory i = player.getInventory();
		i.clear();
		
		//i.setHelmet(Colorizer.setColor(new ItemStack(Material.LEATHER_HELMET), 0, 100, 0));
        i.setHelmet(new ItemStack(Material.SKULL_ITEM, 1, (short) 2));
        /*
		i.setChestplate(Colorizer.setColor(new ItemStack(Material.LEATHER_CHESTPLATE), 0, 100, 0));
		i.setLeggings(Colorizer.setColor(new ItemStack(Material.LEATHER_LEGGINGS), 0, 100, 0));
		i.setBoots(Colorizer.setColor(new ItemStack(Material.LEATHER_BOOTS), 0, 100, 0));
		*/
        i.setChestplate(new ItemStack(Material.AIR));
        i.setLeggings(new ItemStack(Material.AIR));
        i.setBoots(new ItemStack(Material.AIR));

		ItemStack i1 = new ItemStack(Material.IRON_SPADE, 1);
		i1.addUnsafeEnchantment(Enchantment.KNOCKBACK, 1);
		i1.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 3);
		i.addItem(i1);


		player.updateInventory();
	}
	
	public ZombieClass newInstance(Player p){
		return new ZombieClass(p);
	}
	
	public String getName(){
		return "Zombie";
	}
	
}
