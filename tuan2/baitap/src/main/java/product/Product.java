package product;

public class Product{
    private int id;
    private String name;
    private String img;
    private int gia;

    public Product(){}

    public Product(int id, String name, String img, int gia) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.gia = gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
}
