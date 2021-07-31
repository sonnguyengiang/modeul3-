package services;

import controllers.AccountServlet;
import models.Account;

import java.util.ArrayList;

public class AccountServices {
    public ArrayList<Account> list = new ArrayList<>();

    public AccountServices(){
        list.add(new Account(1,"minh","buiminh","buiminh@gmail.com"));
        list.add(new Account(2,"bao","baopika","bao@gmail.com"));
        list.add(new Account(3,"viet","viet123","viet@gmail.com"));
    }

    public void save(Account account){
        list.add(account);
    }

    public void delete(int index){
        list.remove(index);
    }

    public void edit(Account account, int index){
        list.set(index, account);
    }

    public boolean checkLogin(String userName, String password){
        for (Account x: list){
            if (x.getUserName().equals(userName)){
                if (x.getPassword().equals(password)){
                    return true;
                }
            }
        }
        return false;
    }
}
