package generators;

import io.dummymaker.generator.IGenerator;

import java.util.Random;

public class StatusGenerator implements IGenerator<String> {

    private final static String[] status = {"ready", "not_ready"};

    public String generate() {
        return status[new Random().nextInt(status.length)];
    }

}
