package entities;

import annotations.GenStatus;
import annotations.GenSystem;
import io.dummymaker.annotation.special.GenRenameExport;
import io.dummymaker.annotation.string.GenPhrase;

public class SpaceshipDescription {

    @GenSystem
    private System system;

    @GenPhrase
    private String description;

    @GenStatus
    private String flightReadinessStatus;

    @GenRenameExport(name = "spaceship_description")
    public SpaceshipDescription() {

    }

}
