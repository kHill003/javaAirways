package People.Crew;

import People.PeopleSuper;

public class AllCrew extends PeopleSuper {
   CrewRoles role;

    public AllCrew(String name, CrewRoles role){
        super(name);
        this.role = role;
    }
    public String getRole(){
        return role.getRole();
    }
}
