package entities;

import annotations.GenExpeditionMemberProfile;
import annotations.GenPersonalData;
import io.dummymaker.annotation.number.GenInteger;
import io.dummymaker.annotation.special.GenRenameExport;

public class CrewProfile {

    @GenPersonalData
    private PersonalData personalData;

    @GenExpeditionMemberProfile
    private String expeditionMemberProfile;

    @GenInteger
    private Integer responsibleForSystem;

    @GenRenameExport(name = "crew_profile")
    public CrewProfile() {

    }
}
