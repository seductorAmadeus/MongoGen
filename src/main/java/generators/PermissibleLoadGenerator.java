package generators;

import io.dummymaker.generator.IGenerator;

import java.util.concurrent.ThreadLocalRandom;

public class PermissibleLoadGenerator implements IGenerator<Integer> {

    public Integer generate() {
        return ThreadLocalRandom.current().nextInt(100, 10000 + 1);
    }
}
