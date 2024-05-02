/*
 * This file is part of LuckPerms, licensed under the MIT License.
 *
 *  Copyright (c) lucko (Luck) <luck@lucko.me>
 *  Copyright (c) contributors
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 */

package net.momirealms.customfishing.libraries;

import com.google.common.collect.ImmutableList;
import org.apache.maven.model.Relocation;
import org.jetbrains.annotations.Nullable;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Locale;

/**
 * The dependencies used by CustomFishing.
 */
public enum CustomFishingDependency {

    ASM(
            "org.ow2.asm",
            "asm",
            "9.1",
            null,
            "asm"
    ),
    ASM_COMMONS(
            "org.ow2.asm",
            "asm-commons",
            "9.1",
            null,
            "asm-commons"
    ),
    JAR_RELOCATOR(
            "me.lucko",
            "jar-relocator",
            "1.7",
            null,
            "jar-relocator"
    ),
    COMMAND_API(
            "dev{}jorel",
            "commandapi-bukkit-shade",
            "9.3.0",
            null,
            "commandapi-bukkit"
    ),
    MARIADB_DRIVER(
            "org{}mariadb{}jdbc",
            "mariadb-java-client",
            "3.3.2",
            null,
            "mariadb-java-client"
    ),
    BOOSTED_YAML(
            "dev{}dejvokep",
            "boosted-yaml",
            "1.3.4",
            null,
            "boosted-yaml"
    ),
    NBT_API(
            "de{}tr7zw",
            "item-nbt-api",
            "2.12.3",
            "codemc",
            "item-nbt-api"
    ),
    EXP4J(
            "net{}objecthunter",
            "exp4j",
            "0.4.8",
            null,
            "exp4j"
    ),
    MYSQL_DRIVER(
            "com{}mysql",
            "mysql-connector-j",
            "8.3.0",
            null,
            "mysql-connector-j"
    ),
    H2_DRIVER(
            "com.h2database",
            "h2",
            "2.2.224",
            null,
            "h2database"
    ),
    SQLITE_DRIVER(
            "org.xerial",
            "sqlite-jdbc",
            "3.45.3.0",
            null,
            "sqlite-jdbc"
    ),
    HIKARI(
            "com{}zaxxer",
            "HikariCP",
            "5.0.1",
            null,
            "HikariCP"
    ),
    SLF4J_SIMPLE(
            "org.slf4j",
            "slf4j-simple",
            "2.0.12",
            null,
            "slf4j-simple"
    ),
    SLF4J_API(
            "org.slf4j",
            "slf4j-api",
            "2.0.12",
            null,
            "slf4j-api"
    ),
    MONGODB_DRIVER_CORE(
            "org{}mongodb",
            "mongodb-driver-core",
            "5.0.1",
            null,
            "mongodb-driver-core"
    ),
    MONGODB_DRIVER_SYNC(
            "org{}mongodb",
            "mongodb-driver-sync",
            "5.0.1",
            null,
            "mongodb-driver-sync"
    ),
    MONGODB_DRIVER_BSON(
            "org{}mongodb",
            "bson",
            "5.0.1",
            null,
            "mongodb-bson"
    ),
    JEDIS(
            "redis{}clients",
            "jedis",
            "5.1.2",
            null,
            "jedis"
    ),
    BSTATS_BASE(
            "org{}bstats",
            "bstats-base",
            "3.0.2",
            null,
            "bstats-base"
    ),
    BSTATS_BUKKIT(
            "org{}bstats",
            "bstats-bukkit",
            "3.0.2",
            null,
            "bstats-bukkit"
    ),
    COMMONS_POOL_2(
            "org{}apache{}commons",
            "commons-pool2",
            "2.12.0",
            null,
            "commons-pool2"
    ),
    INV_UI(
            "xyz{}xenondevs{}invui",
            "invui-core",
            "1.29",
            "xenondevs",
            "invui-core"
    ),
    INV_UI_ACCESS(
            "xyz{}xenondevs{}invui",
            "inventory-access",
            "1.29",
            "xenondevs",
            "inventory-access"
    ),
    BIOME_API(
            "com{}github{}Xiao-MoMi",
            "BiomeAPI",
            "0.3",
            "jitpack",
            "biome-api"
    ),
    GSON(
            "com.google.code.gson",
            "gson",
            "2.10.1",
            null,
            "gson"
    ),
    ADVENTURE_BUNDLE(
            "com.github.Xiao-MoMi",
            "Adventure-Bundle",
            "4.16.0",
            "jitpack",
            "adventure-bundle"
    );

    private final String mavenPath;

    CustomFishingDependency(String groupId, String artifactId, String version, String repo, String artifact) {
        this(groupId, artifactId, version, repo, artifact, new Relocation[0]);
    }

    CustomFishingDependency(String groupId, String artifactId, String version, String repo, String artifact, Relocation... relocations) {
        this.mavenPath = (groupId + ":" + artifactId + ":" + version).replace("{}", ".");
    }

    public String getMavenPath() {
        return mavenPath;
    }
}
