package Bai10;

import java.util.ArrayList;
import java.util.List;

// lop generic
public class LibrarySection<T extends MediaItem> {
    private final String title;
    private final ArrayList<T> items = new ArrayList<>();

    public LibrarySection(String title){
        this.title = title;
    }
    public void add_phan_tu(T item){
        items.add(item);
    }

    public void display(){
        System.out.println(title + ":");
        for(T item : items){
            System.out.println(item.getInfor()); // da hinh
        }
    }
}
