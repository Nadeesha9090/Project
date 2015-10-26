/**
 * Created by hp on 10/26/2015.
 */
public class Vehicle {
    public void travel(){
        System.out.println("Using vehicle can easily travel");
    }
}
class  Car extends Vehicle{
    public void travel(){
        System.out.println("Using car can comfortably travel");
    }
}
class Test{
    public static void main(String[] args){

        Vehicle obj1=new Car();
        obj1.travel();    //Using car can comfortably travel

        obj1=new Vehicle();
        obj1.travel();    //Using vehicle can easily travel

    }
}
