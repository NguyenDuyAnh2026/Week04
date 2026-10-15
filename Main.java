
public class Main {

    static void checkAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException(
                    "Tuoi khong duoc am!"
            );
        }

        System.out.println("Tuoi hop le: " + age);
    }

    public static void main(String[] args) {
        try {
            checkAge(20);
            checkAge(-5);
            checkAge(18);
        } catch (IllegalArgumentException e) {
            System.out.println("Loi: " + e.getMessage());
        }

        System.out.println("Chuong trinh tiep tuc.");
    }
}
