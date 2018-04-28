package entities;

import annotations.GenPermissibleLoad;
import annotations.GenRequiredAccessLevel;
import annotations.GenStatus;
import annotations.GenSystemType;
import io.dummymaker.annotation.number.GenInteger;
import io.dummymaker.annotation.special.GenRenameExport;
import io.dummymaker.annotation.string.GenPhrase;
import io.dummymaker.annotation.time.GenDate;

import java.util.Date;

public class SpaceshipDescription {

    @GenInteger
    private Integer serialNumber;

    @GenSystemType
    private String type;

    @GenRequiredAccessLevel
    private Integer requiredAccessLevel;

    @GenDate
    private Date serviceLife;

    @GenPermissibleLoad
    private Integer permissibleLoad;

    @GenInteger
    private Integer loading;

    @GenInteger
    private Integer idleFactor;

    @GenStatus
    private String workStatus;

    @GenPhrase
    private String description;

    @GenStatus
    private String flightReadinessStatus;

    @GenRenameExport(name = "spaceship_description")
    public SpaceshipDescription() {

    }

}
