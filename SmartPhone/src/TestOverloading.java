/**
 * Created by hp on 10/26/2015.
 */
public class TestOverloading {

    public static void main(String[] args) {
        OverloadingDemo obj1 = new OverloadingDemo();

        obj1.display();
        obj1.display(25);
        obj1.display("Nadeesha");
        obj1.display(25,"Nadeesha");

    }
}
