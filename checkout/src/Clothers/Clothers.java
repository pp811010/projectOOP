package Clothers;


public abstract class Clothers {

    
    private String detail;
    private String Color;
    public Clothers(String detail, String Color){
     
        this.detail = detail;
        this.Color = Color;
    }
    public abstract String getName();
    public abstract int getPrice();
    public abstract String getPath();
    public abstract String getType();
    public abstract int getAmount();
 
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

}
