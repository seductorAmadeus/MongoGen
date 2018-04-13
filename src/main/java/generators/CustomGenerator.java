package generators;

import entities.System;
import io.dummymaker.factory.IProduceFactory;
import io.dummymaker.factory.impl.GenProduceFactory;
import io.dummymaker.generator.IGenerator;

public class CustomGenerator implements IGenerator<System> {
    private final static IProduceFactory factory = new GenProduceFactory();

    public System generate() {
        return factory.produce(System.class);
    }
}
