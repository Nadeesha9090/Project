/**
 * Created by hp on 10/25/2015.
 */


public class HTC extends Phone {
    HTC( String operatingSystem,String model,int price ,float batteryLife ){
        super(operatingSystem,model,price,batteryLife);
    }

    public String getBrand(){
        return "Phone belongs to HTC Brand ";
    }
}
