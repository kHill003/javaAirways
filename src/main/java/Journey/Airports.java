package Journey;

public enum Airports {
    EDINBURGH ("EDI"),
    LONDON ("LDN"),
    DELHI ("DEH"),
    DENVER( "DEN");

    private final String abv;

    Airports(String abv) {
        this.abv = abv;
    }
    public String getAbv(){
        return abv;
    }
}
