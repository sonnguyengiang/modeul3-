package models;

public class Customer {
    private String name;
    private String ngaysinh;
    private String address;
    private String img;

    public Customer() {
    }

    public Customer(String name, String ngaysinh, String address, String img) {
        this.name = name;
        this.ngaysinh = ngaysinh;
        this.address = address;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
