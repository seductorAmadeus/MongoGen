package entities;

import annotations.GenPermissibleLoad;
import annotations.GenRequiredAccessLevel;
import annotations.GenStatus;
import annotations.GenSystemType;
import io.dummymaker.annotation.number.GenInteger;
import io.dummymaker.annotation.time.GenDate;
import io.dummymaker.export.impl.JsonExporter;

import java.util.Date;

public class System {

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

    @Override
    public String toString() {
        return new JsonExporter().exportAsString(this);
    }
}
