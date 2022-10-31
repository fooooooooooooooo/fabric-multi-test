package multitest;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import multitest.api.MultitestApi;

public class Multitest implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("multitest");

    @Override
    public void onInitialize() {
        var message = new MultitestApi().hello();

        LOGGER.info(message);
    }
}
