package Bai8;

public abstract class Device {
    private final String id;
    private final String name;
    private boolean on;

    public Device(String id, String name){
        this.id = id;
        this.name = name;
        this.on = true; // gia su ban dau dang bat
    }
    public String getId(){ return id;}

    public String getName(){ return name;}

    public boolean isOn(){ return on;}

    public void turnOn(){
        on = true;
        System.out.println(name + " turned on!");
    }

    public void turnOff(){
        on = false;
        System.out.println(name + " turned off!");
    }
}
