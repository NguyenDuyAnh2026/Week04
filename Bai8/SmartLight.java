package Bai8;

public class SmartLight extends Device implements  Adjustable{
    private int brightness = 50;
    public SmartLight(String id, String name){
        super(id, name);
    }
    @Override
    public void increase(){
        brightness = Math.min(100, brightness + 10);
    }
    @Override
    public void decrease(){
        brightness = Math.max(0, brightness - 10);
    }

}
