package People.Crew;

public enum CrewRoles {
    PILOT("Pilot"),
    CAPTAIN("Captain"),
    HOST ("Host"),
    STEWARD("Steward"),
    TEAM_LEADER("Team leader"),
    FIRST_AIDER("First Aider");

    private final String role;

    CrewRoles(String role) {
        this.role = role;
    }
    public String getRole() {
        return role;
    }
}

