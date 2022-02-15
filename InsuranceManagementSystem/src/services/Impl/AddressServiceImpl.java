package services.Impl;

import entities.User;
import services.Address;
import services.AddressService;

public class AddressServiceImpl {

    public static void addAddress(User user, Address address) {
        user.getAddresses().add(address);
    }

}
