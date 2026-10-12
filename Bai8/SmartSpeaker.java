package Bai8;

public class SmartSpeaker extends Device implements Adjustable, WifiConnectable{
    private int volume  = 50;
    public SmartSpeaker(String id, String name){
        super(id, name);
    }
    @Override
    public void increase(){
        volume = Math.min(100, volume + 10);
    }
    @Override
    public void decrease(){
        volume = Math.max(0, volume - 10);
    }
    @Override
    public void connectWifi(){
        System.out.println(this.getName() + " connected to wifi");
    }
}
