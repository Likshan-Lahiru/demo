public class Jet { //1990
    String name;

    int wing;

    String gasCapacity;

    
    public void canCapture(){
        System.out.println("Osoon");
    }



}

public class Jet2 extends Jet { //2000
   
    int extraGasTank;
    String guard;


    public void canGuard(){
        System.out.println("guard");
    }

    
    public void canCapture(){
        System.out.println("in moon");
    }
    
    
}
