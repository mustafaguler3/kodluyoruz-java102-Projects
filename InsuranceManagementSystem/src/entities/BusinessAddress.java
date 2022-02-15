package entities;

import services.Address;

public class BusinessAddress implements Address {

    private String address;

    public BusinessAddress(String address) {
        this.address = address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAddress() {
        return address;
    }


}
