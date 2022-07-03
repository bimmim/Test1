package Inheritance;


public class TV extends SmartDevice {
    private String resolution;
    private RemoteType remoteType;
    private int soundVolume;

    public TV(String brand, String model, float price, String resolution, RemoteType remoteType, int soundVolume) {
        super(brand, model, price);
        this.resolution = resolution;
        this.remoteType = remoteType;
        this.soundVolume = soundVolume;
    }

    public  void powerOff(){
        System.out.println("TV is Off");
    }
    public  void powerOn(){
        System.out.println("TV is On");
    }

    public  void checkSound(){
        if (soundVolume <= 50) {
            soundVolume = 30;
        } else {
            System.out.println("The sound is good");
        }

    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public RemoteType getRemoteType() {
        return remoteType;
    }

    public void setRemoteType(RemoteType remoteType) {
        this.remoteType = remoteType;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        this.soundVolume = soundVolume;
    }

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                ", resolution='" + resolution + '\'' +
                ", remoteType=" + remoteType +
                ", soundVolume=" + soundVolume +

                '}';
    }
}
