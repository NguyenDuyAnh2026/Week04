package Bai9;

import java.time.LocalDate; // bieu dien ngay thang nam co san

public class Food extends  Product{
    private final LocalDate expiryDate;

    public Food(String id, String name, LocalDate expiryDate){
        super(id, name);
        this.expiryDate = expiryDate;
    }
    @Override
    public String getDetail(){
        return expiryDate.toString();
    }
}
