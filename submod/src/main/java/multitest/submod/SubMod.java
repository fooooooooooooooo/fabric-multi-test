package multitest.submod;

import multitest.Multitest;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("multitest-submod");

    @Override
    public void onInitialize() {
        var message = Multitest.hello();

        LOGGER.info(message + " from sub mod");
    }
}
