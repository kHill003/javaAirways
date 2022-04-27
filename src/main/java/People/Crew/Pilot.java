package People.Crew;

import People.PeopleSuper;

public class Pilot extends AllCrew {
    private String licenceNum;

    public Pilot (String name,CrewRoles roles, String licenceNum ){
        super(name, roles);
        this.licenceNum  = licenceNum;
    }
    public String getLicenceNum(){
        return licenceNum;
    }
    public String flyPlane(){
        return "I can fly you know!";
    }
}
