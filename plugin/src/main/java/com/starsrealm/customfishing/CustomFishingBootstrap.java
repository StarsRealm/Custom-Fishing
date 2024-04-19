package com.starsrealm.customfishing;

import com.starsrealm.customfishing.registery.ItemRegistry;
import io.papermc.paper.plugin.bootstrap.BootstrapContext;
import io.papermc.paper.plugin.bootstrap.PluginBootstrap;
import org.jetbrains.annotations.NotNull;

public class CustomFishingBootstrap implements PluginBootstrap {
    @Override
    public void bootstrap(@NotNull BootstrapContext bootstrapContext) {
        ItemRegistry.register();
    }
}
