plugins {
    id("io.papermc.paperweight.userdev") version "1.5.11"
    id("xyz.jpenilla.run-paper") version "2.2.3"
}

repositories {
    maven {
        name = "AliYun-Release"
        url = uri("https://packages.aliyun.com/maven/repository/2421751-release-ZmwRAc/")
        credentials {
            username = project.findProperty("aliyun.package.user") as String? ?: System.getenv("ALY_USER")
            password = project.findProperty("aliyun.package.password") as String? ?: System.getenv("ALY_PASSWORD")
        }
    }
    maven {
        name = "AliYun-Snapshot"
        url = uri("https://packages.aliyun.com/maven/repository/2421751-snapshot-i7Aufp/")
        credentials {
            username = project.findProperty("aliyun.package.user") as String? ?: System.getenv("ALY_USER")
            password = project.findProperty("aliyun.package.password") as String? ?: System.getenv("ALY_PASSWORD")
        }
    }
    maven("https://repo.xenondevs.xyz/releases")
}


dependencies {
    paperweight.devBundle("com.starsrealm.nylon", "1.20.4-R0.2-SNAPSHOT")
    compileOnly("com.starsrealm.starock:plugin:1.1.1-SNAPSHOT")
    compileOnly("com.starsrealm.starock:api:1.1.1-SNAPSHOT")
    compileOnly("xyz.xenondevs.invui:invui-core:1.25")
    compileOnly("xyz.xenondevs.invui:inventory-access-r18:1.25")

    // packet
    compileOnly("com.comphenix.protocol:ProtocolLib:5.1.0")

    // command
    compileOnly("dev.jorel:commandapi-bukkit-core:9.3.0")

    // nbt
    compileOnly("de.tr7zw:item-nbt-api:2.12.3")

    // bStats
    compileOnly("org.bstats:bstats-bukkit:3.0.2")

    // papi
    compileOnly("me.clip:placeholderapi:2.11.5")

    // config
    compileOnly("dev.dejvokep:boosted-yaml:1.3.2")

    // mythic
    compileOnly("io.lumine:Mythic-Dist:5.3.5")
    compileOnly("net.Indyuce:MMOItems-API:6.9.2-SNAPSHOT")
    compileOnly("io.lumine:MythicLib-dist:1.6-SNAPSHOT")
    compileOnly("net.Indyuce:MMOCore-API:1.12-SNAPSHOT")

    // Gson
    compileOnly("com.google.code.gson:gson:2.10.1")

    // eco
    compileOnly("com.willfp:eco:6.67.2")
    compileOnly("com.willfp:EcoJobs:3.47.1")
    compileOnly("com.willfp:EcoSkills:3.21.0")
    compileOnly("com.willfp:libreforge:4.48.1")

    // database
    compileOnly("org.xerial:sqlite-jdbc:3.45.1.0")
    compileOnly("com.h2database:h2:2.2.224")
    compileOnly("org.mongodb:mongodb-driver-sync:4.11.1")
    compileOnly("com.zaxxer:HikariCP:5.0.1")
    compileOnly("redis.clients:jedis:5.1.0")

    // others
    compileOnly("com.github.LoneDev6:api-itemsadder:3.5.0c-r5")
    compileOnly("io.th0rgal:oraxen:1.165.0")
    compileOnly("pers.neige.neigeitems:NeigeItems:1.16.24")
    compileOnly("com.github.Zrips:Jobs:4.17.2")
    compileOnly("com.github.Archy-X:AureliumSkills:Beta1.3.21")
    compileOnly("dev.aurelium:auraskills-api-bukkit:2.0.0-SNAPSHOT")
    compileOnly("com.github.MilkBowl:VaultAPI:1.7")
    compileOnly("org.betonquest:betonquest:2.0.0")
    compileOnly("xyz.xenondevs.invui:invui:1.27")
    compileOnly("com.github.Xiao-MoMi:Custom-Crops:3.4.4.1")
    implementation("com.github.Xiao-MoMi:BiomeAPI:0.3")

    // local jars
    compileOnly(files("libs/AdvancedEnchantments-api.jar"))
    compileOnly(files("libs/BattlePass-4.0.6-api.jar"))
    compileOnly(files("libs/RealisticSeasons-api.jar"))
    compileOnly(files("libs/mcMMO-api.jar"))
    compileOnly(files("libs/ClueScrolls-4.8.7-api.jar"))
    compileOnly(files("libs/notquests-5.17.1.jar"))
    compileOnly(files("libs/zaphkiel-2.0.24.jar"))

    // api module
    implementation(project(":api")) {
        exclude("de.tr7zw")
    }

    // adventure
    implementation("net.kyori:adventure-api:4.15.0")
    implementation("net.kyori:adventure-platform-bukkit:4.3.2")
}

tasks {
    shadowJar {
        relocate ("org.apache.commons.pool2", "net.momirealms.customfishing.libraries.commonspool2")
        relocate ("com.mysql", "net.momirealms.customfishing.libraries.mysql")
        relocate ("org.mariadb", "net.momirealms.customfishing.libraries.mariadb")
        relocate ("com.zaxxer.hikari", "net.momirealms.customfishing.libraries.hikari")
        relocate ("redis.clients.jedis", "net.momirealms.customfishing.libraries.jedis")
        relocate ("com.mongodb", "net.momirealms.customfishing.libraries.mongodb")
        relocate ("org.bson", "net.momirealms.customfishing.libraries.bson")
        relocate ("net.objecthunter.exp4j", "net.momirealms.customfishing.libraries.exp4j")
        relocate ("de.tr7zw.changeme", "net.momirealms.customfishing.libraries.changeme")
        relocate ("net.kyori", "net.momirealms.customfishing.libraries")
        relocate ("dev.jorel.commandapi", "net.momirealms.customfishing.libraries.commandapi")
        relocate ("dev.dejvokep.boostedyaml", "net.momirealms.customfishing.libraries.boostedyaml")
        relocate ("org.bstats", "net.momirealms.customfishing.libraries.bstats")
        relocate ("net.momirealms.biomeapi", "net.momirealms.customfishing.libraries.biomeapi")
    }
}
