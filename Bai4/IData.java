package Bai4;

public interface IData {
    void show(); // Mặc định là public abstract
}

class DataManager implements IData {
    // Cố tình KHÔNG ghi public
    public void show() {
        System.out.println("Show Data");
    }
}


