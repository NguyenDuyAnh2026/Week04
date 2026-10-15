package Bai10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibrarySection<Book> bookSection = new LibrarySection<>("Khu vu Sach");
        LibrarySection<DVD> dvdSection = new LibrarySection<>("Khu vuc DVD");

        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String type = sc.next();
            String id = sc.next();
            String name = sc.next();
            String third = sc.next() ;// tac gia hoac dao dien
            int number = sc.nextInt(); // so page hoac thoi luong

            if(type.equals("B")){
                bookSection.add_phan_tu(new Book(id, name, third, number));
            }
            else if(type.equals("D")){
                dvdSection.add_phan_tu(new DVD(id, name, third, number));
            }
        }

        bookSection.display();
        System.out.println();
        dvdSection.display();
    }
}
