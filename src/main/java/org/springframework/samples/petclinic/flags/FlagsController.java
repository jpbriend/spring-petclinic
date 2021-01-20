package org.springframework.samples.petclinic.flags;

import org.springframework.stereotype.Controller;
import io.rollout.configuration.RoxContainer;
import io.rollout.flags.RoxFlag;
import io.rollout.flags.RoxVariant;

// Create Roxflags in the Flags container class
@Controller
public class FlagsController implements RoxContainer {
    // Define the feature flags
    public RoxFlag enableTutorial = new RoxFlag(false);
    public RoxVariant titleColors = new RoxVariant("White", new String[] {"White", "Blue", "Green"});
}
