package entities;

import services.Account;
import services.AddressService;
import services.Impl.AddressServiceImpl;

public class Individual extends Account {

    private User user;

    public Individual(User user) {
        super(user);
    }

    @Override
    public void addPolicy() {

    }

    @Override
    public void addAddress(String address) {

    }

    @Override
    public int compareTo(Account o) {
        return this.user.getName().compareTo(o.getUser().getName());
    }
}
