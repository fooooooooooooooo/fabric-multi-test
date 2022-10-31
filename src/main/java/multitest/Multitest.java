package multitest;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import multitest.api.MultitestApi;

public class Multitest implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("multitest");

    @Override
    public void onInitialize() {
        var message = MultitestApi.hello();

        LOGGER.info(message + " from main mod");
    }

    public static String hello() {
        return MultitestApi.hello() + "from main mod";
    }
}
