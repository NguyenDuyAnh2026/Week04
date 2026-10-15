package Bai9;

import java.util.ArrayList;
import java.util.List;

public abstract class Warehouse<T extends  Product> {
    protected final List<T> items = new ArrayList<>();

    // nhap kho :
    public void importItem(T item){
        items.add(item);
    }
    // xuat kho theo ma hang :
    public T exportItem(String id){
        for(int i = 0; i < items.size(); i++){
            if(items.get(i).getId().equals(id)){
                return items.remove(i);
            }
        }
        return null;
    }
    public abstract String getTitle();
    //kiem ke :
    public void printInventory(){
        System.out.println(getTitle() + ":");
        for(T item : items){
            System.out.println(item.getName() + " - " + item.getDetail());
        }
    }
}
