public class Constructors {
    public Constructors(){
        System.out.println("This is default construcor");

    }
    public Constructors(String nane, int id){
        System.out.println("this is  a argument constructors");
    }

    public static void main(String[] args) {
        Constructors constructors;
        constructors = new Constructors();
        Constructors constructors1;
        constructors1 = new Constructors("challa venkata kalyan",20)
    }
}
