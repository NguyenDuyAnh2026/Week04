package Bai8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hub {
    private final List<Device> devices = new ArrayList<>();

    public void addDevice(Device d){
        devices.add(d);
    }

    public void turnOffAll(){
        System.out.println("Turn off all devices :");
        for(Device d : devices){
            d.turnOff();;
        }
    }

    public void setupWifi(){
        System.out.println("Setup wifi: ");
        for(Device d : devices){
            if(d instanceof WifiConnectable){
                ((WifiConnectable) d).connectWifi();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Hub hub = new Hub();

        for(int i=0; i<n; i++){
            String type = sc.next();
            String id = sc.next();
            String name = sc.next();
            Device d = null;

            switch(type){
                case "L": d = new SmartLight(id, name); break;
                case "AC": d = new AirConditioner(id, name); break;
                case "S": d = new SmartSpeaker(id, name); break;
                case "C": d = new Curtain(id, name); break;
            }
            if(d != null) hub.addDevice(d);
        }
        hub.turnOffAll();
        System.out.println();
        hub.setupWifi();
        sc.close();
    }
}
