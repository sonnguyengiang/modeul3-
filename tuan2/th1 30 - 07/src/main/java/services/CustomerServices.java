package services;

import models.Customer;

import java.util.ArrayList;

public class CustomerServices {
    public ArrayList<Customer> list = new ArrayList<>();

    public CustomerServices(){
        list.add(new Customer("nguyen van khoi", "20-12-2001", "hanoi","img/1.jpg"));
        list.add(new Customer("nguyen bao binh", "20-12-2001", "hanoi","img/1.jpg"));
        list.add(new Customer("nguyen le lon", "20-12-2001", "hanoi","img/1.jpg"));
    }

    public void save(Customer customer){
        list.add(customer);
    }

    public void delete(int index){
        list.remove(index);
    }
}
