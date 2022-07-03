package Inheritance;

public class Test {
    public static void main(String[] args) {

        TV samsungTV = new TV("Samsung", "gt2000", 125.5f, "1080x1144", RemoteType.RfTechnologie, 75 );

        System.out.println(samsungTV);
        samsungTV.powerOff();
        samsungTV.powerOn();
        samsungTV.checkSound();
        System.out.println(samsungTV);



    }


}
