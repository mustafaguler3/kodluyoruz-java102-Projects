package entities;

import services.Insurance;

import java.util.Calendar;
import java.util.Date;

public class TravelInsurance extends Insurance {

    public TravelInsurance() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.JULY,1);
        this.setName("Car-Insurance");
        this.setPrice(160);
        this.setStartDate(calendar.getTime());

        calendar.add(Calendar.DECEMBER,10);
        this.setEndDate(calendar.getTime());
    }

    @Override
    public void calculate() {
        this.setPrice(this.getPrice()*2.3);
    }
}
