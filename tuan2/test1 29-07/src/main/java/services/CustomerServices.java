package services;

import models.Customer;

import java.util.ArrayList;

public class CustomerServices {
    public ArrayList<Customer> list = new ArrayList<>();

    public CustomerServices(){
        list.add(new Customer(1,"nam","nam@gmail.com","ha noi"));
    }

    public void save(Customer customer){
        list.add(customer);
    }

    public void edit(Customer customer, int index){
        list.set(index, customer);
    }

    public void remove(int index){
        list.remove(index);
    }

    public Customer findById(int id){
        for (Customer x: list){
            if (x.getId() == id){
                return x;
            }
        }
        return null;
    }
}
