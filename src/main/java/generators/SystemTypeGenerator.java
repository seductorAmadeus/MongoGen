package generators;

import io.dummymaker.generator.IGenerator;

import java.util.Random;

public class SystemTypeGenerator implements IGenerator<String> {

    private final static String[] systemTypes = {"power_supply", "temperature_control", "control", "communication",
            "life_support", "orientation", "propulsion", "emergency_rescue"};

    public String generate() {
        return systemTypes[new Random().nextInt(systemTypes.length)];
    }
}
