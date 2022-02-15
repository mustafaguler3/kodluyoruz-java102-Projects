package services.Impl;

import entities.Enterprise;
import entities.Individual;
import entities.User;
import exceptions.InvalidAuthenticationException;
import services.Account;

import java.util.Date;
import java.util.TreeSet;

public class AccountManager {

    private TreeSet<Account> accounts;

    public AccountManager(){
        accounts = new TreeSet<>();
        accounts.add(new Individual(new User("Mustafa","Güler","m@hotmail.com","123","student",25,new Date())));
        accounts.add(new Enterprise(new User("Musa","Güler","musa@hotmail.com","1234","student",28,new Date())));
    }

    public Account login(String email,String password)  {
        Account account = null;
        try {
            for (Account a:accounts){
                if (a.loginControl(email,password)){
                    account = a;
                }
            }
        }catch (InvalidAuthenticationException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
        return account;
    }


}

















