package generators;

import io.dummymaker.generator.IGenerator;

import java.util.Random;

public class ExpeditionMemberProfileGenerator implements IGenerator<String> {

    private final static String[] status = {"commander", "first_pilot", "navigator", "engineer", "cook", "physician", "payload_specialist", "passenger"};

    public String generate() {
        return status[new Random().nextInt(status.length)];
    }

}
