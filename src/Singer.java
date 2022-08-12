public class Singer extends Person {
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }
    public String singing(){
        return "sings";
    }
    public String playGuitar(){
        return "plays guitar";
    }

}
