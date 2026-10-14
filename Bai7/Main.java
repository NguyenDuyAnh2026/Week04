package Bai7;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // ep de dung dau 0.4 cho so thap phan
        int n = sc.nextInt();
        List<Student> stds = new ArrayList<>();

        for(int i=0; i<n; i++){
            String id = sc.next();
            String name = sc.next();
            double gpa = sc.nextDouble();
            stds.add(new Student(id, name, gpa));
        }
        // [1] filter :
        stds.removeIf(student -> student.getGpa() < 5.0);
        System.out.println("After removing GPA < 5.0");
        for(Student s : stds){
            System.out.println(s);
        }

        // [2]. sort :
        stds.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println();
        System.out.println("After sorting by name");
        for(Student s : stds){
            System.out.println(s);
        }

        // [3] operation : khong in ra de khop output
        Operation<Double> add = (a, b) -> a + b;
        Operation<Double> sub = (a, b) -> a - b;
        Operation<Double> mul = (a, b) -> a * b;
        Operation<Double> div = (a, b) -> a / b;
    }
}
