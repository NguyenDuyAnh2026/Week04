package Bai3;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Employee> employees = new ArrayList<>();
        for(int i=0; i<n; i++){
            String type = sc.next();
            String id = sc.next();
            String name = sc.next();
            double baseSalary = sc.nextDouble();
            if(type.equals("O")){
                employees.add(new OfficeWorker(id, name, baseSalary));
            }
            else{
                int overtimeHours = sc.nextInt();
                employees.add(new Technician(id, name, baseSalary, overtimeHours));
            }
        }
        double total = 0;
        for(Employee em : employees){
            System.out.println(em);
            em.work();
            System.out.println("----------------------------");
            total += em.calculatePay();
        }
        System.out.println("Total Pay = " + String.format("%.1f", total));
    }
}
