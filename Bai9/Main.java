package Bai9;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FoodWarehouse foodWh = new FoodWarehouse();
        ElectronicWarehouse elecWh = new ElectronicWarehouse();

        int n = sc.nextInt();

        for(int i=0;  i<n; i++){
            String type = sc.next();
            String id = sc.next();
            String name = sc.next();
            String extra = sc.next();

            if(type.equals("F")){
                foodWh.importItem(new Food(id, name, LocalDate.parse(extra)));
            }
            else{
                elecWh.importItem((new Electronic(id, name, Integer.parseInt(extra))));
            }
        }
        foodWh.printInventory();
        System.out.println();
        elecWh.printInventory();
    }
}
