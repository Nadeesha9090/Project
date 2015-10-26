/**
 * Created by hp on 10/25/2015.
 */


public class Microsoft extends Phone {
    Microsoft(String operatingSystem, String model, int price, float batteryLife) {
        super(operatingSystem, model, price, batteryLife);
    }

    public String getBrand() {
        return "Phone belongs to Microsoft Brand ";
    }
}