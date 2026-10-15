package Bai9;

public abstract class Product {
    private final String id;
    private final String name;

    public Product(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getId(){ return id; }
    public String getName(){ return name;}

    public abstract String getDetail(); // thong tin moi loai hang se dc dinh nghia sau
}
