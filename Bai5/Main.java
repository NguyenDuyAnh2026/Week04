package Bai5;

public class Main {
    public void main(String[] args) {
        Pair<String , Integer> age = new Pair<>("Tuoi", 20);
        Pair<String, String> studentId = new Pair<>("Ma SV", "24020355");
        Pair<Integer, Double> location = new Pair<>(105, 19.8);

        System.out.println(age);
        System.out.println(studentId);
        System.out.println(location);

        age.setValue(100);
        System.out.println(age);
    }
}
