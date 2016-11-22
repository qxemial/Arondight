package io.github.qxemial.arondight;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GamePreInitializationEvent;
import org.spongepowered.api.plugin.Plugin;
import io.github.qxemial.PomData;

@Plugin(id = PomData.id, name = PomData.name, version = PomData.version)
public class ArondightPlugin {

    private Logger logger;
    
    @Inject private void setLogger(Logger logger) {this.logger = logger;}
    
    public Logger __GetLogger() {return this.logger;}

}
