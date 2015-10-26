/**
 * Created by hp on 10/26/2015.
 */
public class OverloadingDemo {
    public void display(){
        System.out.println("Invoke 1st Method with No Parameters");
    }

    public void display(int i){
        System.out.println("Invoke 2nd Method with one Parameter (int)"+i);
    }

    public void display(String s){
        System.out.println("Invoke 3rd Method with one Parameter (String)"+s);
    }

    public void display(int i,String s){
        System.out.println("Invoke 4th Method with 2 Parameters (int ,String) int value = "+i+"String value = "+s);
    }
}
