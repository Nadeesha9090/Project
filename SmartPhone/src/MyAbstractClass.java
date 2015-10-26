/**
 * Created by hp on 10/26/2015.
 */
public abstract  class MyAbstractClass {
    public abstract void abstractMethod();
}

class MySubClass extends MyAbstractClass {

    public void abstractMethod() {
        System.out.println("My method implementation");
    }
}
class test{
    public static void main(String[] args) {
        MySubClass obj1 = new MySubClass();
        obj1.abstractMethod();
    }
}

