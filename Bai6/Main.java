package Bai6;

public class Main {
    public static void main(String[] args) {
        Integer[] nums = {5,1,3,2};
        ArrayUtils.sort(nums);
        ArrayUtils.print(nums);

        String[] langs = {"Java", "C++", "Python"};
        ArrayUtils.sort(langs);
        ArrayUtils.print(langs);

        Student[] students = {
                new Student("An", 3.2),
                new Student("Binh", 2.5),
                new Student("Chi", 3.8)
        };
        ArrayUtils.sort(students);
        ArrayUtils.print(students);
    }
}
