public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("baisal","programmer","google");
        Dancer dancer = new Dancer("jack","dancer","nonstop");
        Singer singer = new Singer("mirbek","singer","superstars");
        System.out.println(programmer.toString());
        System.out.println(dancer.toString());
        System.out.println(singer.toString());
        System.out.println(programmer.getName()+" "+programmer.coding()+", "+programmer.learn()+", "+programmer.walk()+", "+programmer.eat()+", company name: "+ programmer.getCompanyName());
        System.out.println(singer.getName()+" "+singer.singing()+", "+singer.learn()+", "+singer.walk()+","+singer.eat()+", band name: "+singer.getBandName());
        System.out.println(dancer.getName()+" "+dancer.dancing()+", "+dancer.learn()+", "+dancer.walk()+", "+dancer.eat()+", group name: "+dancer.getGroupName());
    }
}