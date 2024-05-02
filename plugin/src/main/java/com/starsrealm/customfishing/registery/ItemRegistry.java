package com.starsrealm.customfishing.registery;

import com.starsrealm.nylon.registry.BukkitRegistry;
import com.starsrealm.nylon.registry.propertry.MaterialProperty;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;

public final class ItemRegistry {

    private ItemRegistry() {

    }

    public static void register() {

    }

    private static final MaterialProperty.Builder EASY_BUILD = new MaterialProperty.Builder();

    private static final Item.Properties FISH_PROPERTIES = new Item.Properties().food(Foods.COD);

    // Common Registry
    public static final Item RUBBISH = registerItem(new Item(new Item.Properties()), "rubbish", EASY_BUILD);
    public static final Item FISHFINDER = registerItem(new Item(new Item.Properties()), "fishfinder", EASY_BUILD);
    public static final Item DELICATE_HOOK = registerItem(new Item(new Item.Properties()), "delicate_hook", EASY_BUILD);

    //Bait
    public static final Item SIMPLE_BAIT = registerItem(new Item(new Item.Properties()), "simple_bait", EASY_BUILD);
    public static final Item MAGNETIC_BAIT = registerItem(new Item(new Item.Properties()), "magnetic_bait", EASY_BUILD);
    public static final Item WILD_BAIT = registerItem(new Item(new Item.Properties()), "wild_bait", EASY_BUILD);


    // Fish Registry
    public static final Item RAINBOW_FISH = registerFish("rainbow_fish");

    public static final Item TUNA_FISH = registerFish("tuna_fish");
    public static final Item TUNA_FISH_SILVER_STAR = registerFish("tuna_fish_silver_star");
    public static final Item TUNA_FISH_GOLDEN_STAR = registerFish("tuna_fish_golden_star");

    public static final Item PIKE_FISH = registerFish("pike_fish");
    public static final Item PIKE_FISH_SILVER_STAR = registerFish("pike_fish_silver_star");
    public static final Item PIKE_FISH_GOLDEN_STAR = registerFish("pike_fish_golden_star");

    public static final Item GOLD_FISH = registerFish("gold_fish");
    public static final Item GOLD_FISH_SILVER_STAR = registerFish("gold_fish_silver_star");
    public static final Item GOLD_FISH_GOLDEN_STAR = registerFish("gold_fish_golden_star");

    public static final Item PERCH_FISH = registerFish("perch_fish");
    public static final Item PERCH_FISH_SILVER_STAR = registerFish("perch_fish_silver_star");
    public static final Item PERCH_FISH_GOLDEN_STAR = registerFish("perch_fish_golden_star");

    public static final Item MULLET_FISH = registerFish("mullet_fish");
    public static final Item MULLET_FISH_SILVER_STAR = registerFish("mullet_fish_silver_star");
    public static final Item MULLET_FISH_GOLDEN_STAR = registerFish("mullet_fish_golden_star");

    public static final Item SARDINE_FISH = registerFish("sardine_fish");
    public static final Item SARDINE_FISH_SILVER_STAR = registerFish("sardine_fish_silver_star");
    public static final Item SARDINE_FISH_GOLDEN_STAR = registerFish("sardine_fish_golden_star");

    public static final Item CARP_FISH = registerFish("carp_fish");
    public static final Item CARP_FISH_SILVER_STAR = registerFish("carp_fish_silver_star");
    public static final Item CARP_FISH_GOLDEN_STAR = registerFish("carp_fish_golden_star");

    public static final Item CAT_FISH = registerFish("cat_fish");
    public static final Item CAT_FISH_SILVER_STAR = registerFish("cat_fish_silver_star");
    public static final Item CAT_FISH_GOLDEN_STAR = registerFish("cat_fish_golden_star");

    public static final Item OCTOPUS = registerFish("octopus");
    public static final Item OCTOPUS_SILVER_STAR = registerFish("octopus_silver_star");
    public static final Item OCTOPUS_GOLDEN_STAR = registerFish("octopus_golden_star");

    public static final Item SUNFISH = registerFish("sunfish");
    public static final Item SUNFISH_SILVER_STAR = registerFish("sunfish_silver_star");
    public static final Item SUNFISH_GOLDEN_STAR = registerFish("sunfish_golden_star");

    public static final Item RED_SNAPPER_FISH = registerFish("red_snapper_fish");
    public static final Item RED_SNAPPER_FISH_SILVER_STAR = registerFish("red_snapper_fish_silver_star");
    public static final Item RED_SNAPPER_FISH_GOLDEN_STAR = registerFish("red_snapper_fish_golden_star");

    public static final Item SALMON_VOID_FISH = registerFish("salmon_void_fish");
    public static final Item SALMON_VOID_FISH_SILVER_STAR = registerFish("salmon_void_fish_silver_star");
    public static final Item SALMON_VOID_FISH_GOLDEN_STAR = registerFish("salmon_void_fish_golden_star");

    public static final Item WOODSKIP_FISH = registerFish("woodskip_fish");
    public static final Item WOODSKIP_FISH_SILVER_STAR = registerFish("woodskip_fish_silver_star");
    public static final Item WOODSKIP_FISH_GOLDEN_STAR = registerFish("woodskip_fish_golden_star");

    public static final Item STURGEON_FISH = registerFish("sturgeon_fish");
    public static final Item STURGEON_FISH_SILVER_STAR = registerFish("sturgeon_fish_silver_star");
    public static final Item STURGEON_FISH_GOLDEN_STAR = registerFish("sturgeon_golden_star");

    public static final Item BLUE_JELLYFISH = registerFish("blue_jellyfish");
    public static final Item BLUE_JELLYFISH_SILVER_STAR = registerFish("blue_jellyfish_silver_star");
    public static final Item BLUE_JELLYFISH_GOLDEN_STAR = registerFish("blue_jellyfish_golden_star");

    public static final Item PINK_JELLYFISH = registerFish("pink_jellyfish");
    public static final Item PINK_JELLYFISH_SILVER_STAR = registerFish("pink_jellyfish_silver_star");
    public static final Item PINK_JELLYFISH_GOLDEN_STAR = registerFish("pink_jellyfish_golden_star");

    private static Item registerFish(String path) {
        return BukkitRegistry.register(new Item(FISH_PROPERTIES), new ResourceLocation("starsfish", path), EASY_BUILD);
    }

    private static Item registerItem(Item item, String path, MaterialProperty.Builder materialProperty) {
        return BukkitRegistry.register(item, new ResourceLocation("starsfish", path), materialProperty);
    }
}
