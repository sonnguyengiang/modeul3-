package services;

import dao.SelectAccount;
import models.Account;

import java.sql.SQLException;
import java.util.ArrayList;

public class AccountServices {
    public ArrayList<Account> list = new ArrayList<>();

    public AccountServices(){
        try {
            list = (ArrayList<Account>) SelectAccount.seclect();
        } catch (SQLException | ClassNotFoundException throwables){
            throwables.printStackTrace();
        }
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
