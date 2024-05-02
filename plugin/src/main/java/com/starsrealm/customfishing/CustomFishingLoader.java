package com.starsrealm.customfishing;

import io.papermc.paper.plugin.loader.PluginClasspathBuilder;
import io.papermc.paper.plugin.loader.PluginLoader;
import io.papermc.paper.plugin.loader.library.impl.MavenLibraryResolver;
import net.momirealms.customfishing.libraries.CustomFishingDependency;
import org.eclipse.aether.artifact.DefaultArtifact;
import org.eclipse.aether.graph.Dependency;
import org.eclipse.aether.repository.RemoteRepository;
import org.jetbrains.annotations.NotNull;


public class CustomFishingLoader implements PluginLoader {
    @Override
    public void classloader(@NotNull PluginClasspathBuilder pluginClasspathBuilder) {
        MavenLibraryResolver resolver = new MavenLibraryResolver();

        resolver.addRepository(new RemoteRepository.Builder("maven", "default", "https://repo1.maven.org/maven2/").build());
        resolver.addRepository(new RemoteRepository.Builder("codemc", "default", "https://repo.codemc.org/repository/maven-public/").build());
        resolver.addRepository(new RemoteRepository.Builder("xenondevs", "default", "https://repo.xenondevs.xyz/releases/").build());
        resolver.addRepository(new RemoteRepository.Builder("jitpack", "default", "https://jitpack.io/").build());

        resolver.addDependency(new Dependency(new DefaultArtifact(CustomFishingDependency.GSON.getMavenPath()), null));
        resolver.addDependency(new Dependency(new DefaultArtifact(CustomFishingDependency.SLF4J_API.getMavenPath()), null));
        resolver.addDependency(new Dependency(new DefaultArtifact(CustomFishingDependency.SLF4J_SIMPLE.getMavenPath()), null));
        resolver.addDependency(new Dependency(new DefaultArtifact(CustomFishingDependency.COMMAND_API.getMavenPath()), null));
        resolver.addDependency(new Dependency(new DefaultArtifact(CustomFishingDependency.BOOSTED_YAML.getMavenPath()), null));
        resolver.addDependency(new Dependency(new DefaultArtifact(CustomFishingDependency.ADVENTURE_BUNDLE.getMavenPath()), null));
        resolver.addDependency(new Dependency(new DefaultArtifact(CustomFishingDependency.BIOME_API.getMavenPath()), null));
        resolver.addDependency(new Dependency(new DefaultArtifact(CustomFishingDependency.NBT_API.getMavenPath()), null));
        resolver.addDependency(new Dependency(new DefaultArtifact(CustomFishingDependency.EXP4J.getMavenPath()), null));
        resolver.addDependency(new Dependency(new DefaultArtifact(CustomFishingDependency.MYSQL_DRIVER.getMavenPath()), null));
        resolver.addDependency(new Dependency(new DefaultArtifact(CustomFishingDependency.MARIADB_DRIVER.getMavenPath()), null));
        resolver.addDependency(new Dependency(new DefaultArtifact(CustomFishingDependency.MONGODB_DRIVER_SYNC.getMavenPath()), null));
        resolver.addDependency(new Dependency(new DefaultArtifact(CustomFishingDependency.MONGODB_DRIVER_CORE.getMavenPath()), null));
        resolver.addDependency(new Dependency(new DefaultArtifact(CustomFishingDependency.MONGODB_DRIVER_BSON.getMavenPath()), null));
        resolver.addDependency(new Dependency(new DefaultArtifact(CustomFishingDependency.JEDIS.getMavenPath()), null));
        resolver.addDependency(new Dependency(new DefaultArtifact(CustomFishingDependency.COMMONS_POOL_2.getMavenPath()), null));
        resolver.addDependency(new Dependency(new DefaultArtifact(CustomFishingDependency.H2_DRIVER.getMavenPath()), null));
        resolver.addDependency(new Dependency(new DefaultArtifact(CustomFishingDependency.SQLITE_DRIVER.getMavenPath()), null));
        resolver.addDependency(new Dependency(new DefaultArtifact(CustomFishingDependency.BSTATS_BASE.getMavenPath()), null));
        resolver.addDependency(new Dependency(new DefaultArtifact(CustomFishingDependency.HIKARI.getMavenPath()), null));
        resolver.addDependency(new Dependency(new DefaultArtifact(CustomFishingDependency.INV_UI.getMavenPath()), null));
        resolver.addDependency(new Dependency(new DefaultArtifact(CustomFishingDependency.INV_UI_ACCESS.getMavenPath()), null));
        resolver.addDependency(new Dependency(new DefaultArtifact("xyz.xenondevs.invui:inventory-access-r18:1.29"), null));
        pluginClasspathBuilder.addLibrary(resolver);
    }
}
