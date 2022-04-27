package People;
//This is the super class.  We have created some methods to get and set name

public class PeopleSuper {
    public String name;

    public PeopleSuper(String name){
        this.name =name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
