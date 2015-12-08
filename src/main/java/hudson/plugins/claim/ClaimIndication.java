package hudson.plugins.claim;

import com.sonyericsson.jenkins.plugins.bfa.model.indication.FoundIndication;
import hudson.model.AbstractBuild;

/**
 * Created by eerilio on 9/17/15.
 */
public class ClaimIndication extends FoundIndication {

    public ClaimIndication(AbstractBuild build, String originalPattern, String matchingFile, String matchingString) {
        super(build, originalPattern, matchingFile, matchingString);
    }
}
