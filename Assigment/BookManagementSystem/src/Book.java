
public class Book {
    private String code;
    private String title;
    private int qua;
    private double price;

    public Book() {
    }

    public Book(String code, String title, int qua, double price) {
        this.code = code;
        this.title = title;
        this.qua = qua;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQua() {
        return qua;
    }

    public void setQua(int qua) {
        this.qua = qua;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return String.format("%5s | %-7s | %05d | %.5f", code, title, qua, price);
    }
}
