import entities.CrewProfile;
import entities.SpaceshipDescription;
import io.dummymaker.export.IExporter;
import io.dummymaker.export.impl.JsonExporter;
import io.dummymaker.factory.IProduceFactory;
import io.dummymaker.factory.impl.GenProduceFactory;

import java.util.List;

public class App {
    public static void main(String[] args) {



        IProduceFactory factory = new GenProduceFactory();
        List<CrewProfile> crewProfiles = factory.produce(CrewProfile.class, 2000000);
        IExporter exporter = new JsonExporter().withPretty();
        exporter.export(crewProfiles);

    }
}