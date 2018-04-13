package entities;

import annotations.GenRequiredAccessLevel;
import io.dummymaker.annotation.string.GenCity;
import io.dummymaker.annotation.string.GenName;
import io.dummymaker.annotation.string.GenPhrase;
import io.dummymaker.annotation.time.GenDate;
import io.dummymaker.export.impl.JsonExporter;

import java.util.Date;

public class PersonalData {
    @GenName
    private String fullName;

    @GenDate
    private Date birthDate;

    @GenCity
    private String city;

    @GenRequiredAccessLevel
    private Integer requiredAccessLevel;

    @GenPhrase
    private String specialSkills;

    @Override
    public String toString() {
        return new JsonExporter().exportAsString(this);
    }
}
