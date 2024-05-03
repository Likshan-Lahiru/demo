public class Alto1 { //1995
    int tier;

    String name;

    int enginecapacity;

    public void canMoveForward(){

        System.out.println("move");
    
    }

    public void canMoveBackward(){

        System.out.println("Move");
    
    }
    

}


public class Alto2 extends Alto1 { //2000
    String sheet;

    public void canTurnRight(){
        System.out.println("Right");
    }

    public void canTurnLeft(){
        System.out.println("Left");
    }

       
}
class OtherCar{
    String newFeatures;
}


public class Alto3 extends Alto2{//2005
    String sideMirror;

    public void canHorn(){
        System.out.println("horn");
    }
    public void canOnOFFLights(){
        System.err.println("lights");
    }

}

