package services;

import entities.User;
import enums.AuthenticationStatus;
import exceptions.InvalidAuthenticationException;

import java.util.List;
import java.util.Objects;

public abstract class Account implements Comparable<Account>{

    private User user;
    private List<Insurance> insurances;

    public Account(User user){
        this.user = user;
    }

    public boolean isLogin(AuthenticationStatus status){
        return true;
    }

//    public User user(){
//        return new User();
//    }

    public List<Insurance> userInsurances(){
       return insurances;
    }


    public boolean loginControl(String email,String password) throws InvalidAuthenticationException {

        if(user.getEmail() == email && user.getPassword() == password){
            System.out.println(isLogin(AuthenticationStatus.SUCCESS));
            return true;
        }else{
            throw new InvalidAuthenticationException("No valid user");

        }

    }
    public abstract void addPolicy();

    public final void showUserInfo(){
        System.out.println(user.getName() + " " + user.getEmail()+ " "+user.getLastName());
        for (Address a :user.getAddresses()){
            System.out.println(a.getAddress());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(user, account.user);
    }

    public abstract void addAddress(String address);

    public void addInsurance(Insurance insurance){
        insurance.calculate();
        this.insurances.add(insurance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
