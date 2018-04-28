package entities;

import annotations.GenExpeditionMemberProfile;
import annotations.GenPersonalData;
import annotations.GenRequiredAccessLevel;
import io.dummymaker.annotation.number.GenInteger;
import io.dummymaker.annotation.special.GenRenameExport;
import io.dummymaker.annotation.string.GenCity;
import io.dummymaker.annotation.string.GenName;
import io.dummymaker.annotation.string.GenPhrase;
import io.dummymaker.annotation.time.GenDate;

import java.util.Date;

public class CrewProfile {

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

    @GenExpeditionMemberProfile
    private String expeditionMemberProfile;

    @GenInteger
    private Integer responsibleForSystem;

    @GenRenameExport(name = "crew_profile")
    public CrewProfile() {

    }
}
