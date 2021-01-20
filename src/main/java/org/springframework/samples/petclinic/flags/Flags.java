import io.rollout.configuration.RoxContainer;
import io.rollout.flags.RoxFlag;
import io.rollout.flags.RoxVariant;

// Create Roxflags in the Flags container class
public class Flags implements RoxContainer {
    // Define the feature flags
    public RoxFlag enableTutorial = new RoxFlag(false);
    public RoxVariant titleColors = new RoxVariant("White", new String[] {"White", "Blue", "Green"});
}
