package People.Crew;

public class CabinCrew extends AllCrew {

    public CabinCrew(String name, CrewRoles role ){
        super(name, role);
    }


   public String giveAnnouncement(String announcement){
        return "Attention " + announcement;
   }
}
