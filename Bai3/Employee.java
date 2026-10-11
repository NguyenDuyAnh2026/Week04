package Bai3;

public abstract class Employee implements  IWorkable{
    private String id;
    private String name;
    private double baseSalary;

    public Employee(String id, String name, double baseSalary){
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName(){return name;}

    public String getId(){ return id;}

    public double getBaseSalary(){
        return baseSalary;
    }

    public abstract double calculatePay();
}
