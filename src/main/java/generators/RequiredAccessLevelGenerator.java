package generators;

import io.dummymaker.generator.IGenerator;

import java.util.concurrent.ThreadLocalRandom;

public class RequiredAccessLevelGenerator implements IGenerator<Integer> {

    public Integer generate() {
        return ThreadLocalRandom.current().nextInt(1, 10 + 1);
    }
}
