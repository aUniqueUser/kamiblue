package me.zeroeightsix.kami.module.modules.bewwawho.misc;

import me.zeroeightsix.kami.command.Command;
import me.zeroeightsix.kami.module.Module;
import me.zeroeightsix.kami.setting.Setting;
import me.zeroeightsix.kami.setting.Settings;

@Module.Info(name = "NoKamiChat", description = "Removes feedback messages and changes prefix.", category = Module.Category.MISC)
public class NoKamiChat extends Module {
    public static String prefix;
    public static Setting<Boolean> playSound = Settings.b("Play Sound", true);

    @Override
    public void onEnable() {
        prefix = Command.commandPrefix.getValue();
        Command.commandPrefix.setValue("whyareyoutypingthisinyourchatwtfididntsayyoucoulduseyourprefixstoptypingffs");
    }

    @Override
    public void onDisable() {
        Command.commandPrefix.setValue(prefix);
    }
}
