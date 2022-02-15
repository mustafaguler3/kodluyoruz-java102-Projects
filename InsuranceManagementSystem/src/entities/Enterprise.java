package entities;

import services.Account;
import services.Address;
import services.Impl.AddressServiceImpl;

public class Enterprise extends Account {

    private User user;

    public Enterprise(User user) {
        super(user);
    }

    @Override
    public void addPolicy() {

    }

    @Override
    public void addAddress(String address) {
        AddressServiceImpl.addAddress(this.getUser(),new BusinessAddress(address));
    }


    @Override
    public int compareTo(Account o) {
        return this.user.getName().compareTo(o.getUser().getName());
    }
}
