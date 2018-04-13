package generators;

import entities.PersonalData;
import io.dummymaker.factory.IProduceFactory;
import io.dummymaker.factory.impl.GenProduceFactory;
import io.dummymaker.generator.IGenerator;

public class PersonalDataGenerator implements IGenerator<PersonalData> {
    private final static IProduceFactory factory = new GenProduceFactory();

    public PersonalData generate() {
        return factory.produce(PersonalData.class);
    }
}
