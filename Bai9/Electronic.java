package Bai9;

public class Electronic extends Product{
    private final int warrantMonths;

    public Electronic(String id, String name, int warrantMonths){
        super(id, name);
        this.warrantMonths = warrantMonths;
    }
    @Override
    public String getDetail(){
        return warrantMonths + " thang bao hanh.";
    }
}
