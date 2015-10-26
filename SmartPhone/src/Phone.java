/**
 * Created by hp on 10/25/2015.
 */


public class Phone {

    private String operatingSystem;
    private String brand;
    private int price;
    private float batteryLife;

    Phone( String operatingSystem,String brand,int price ,float batteryLife ){
        operatingSystem = this.operatingSystem;
        brand = this.brand;
        price = this.price;
        batteryLife = this.batteryLife;
    }

    public String getBrand(){
        return this.brand;
    }

    public static void main(String[] args) {
        Phone HTCDesire820 = new Phone("Android OS, v4.4.2 (KitKat)","HTC",34950, 424 );
        Phone MicrosoftLumia535 = new Phone("Microsoft Windows Phone 8.1","Microsoft",16600, 336);
        Phone GalaxyS6edge = new Phone("Android OS, v5.1.1 (Lollipop)","Samsung", 96250, 680);
    }
}



