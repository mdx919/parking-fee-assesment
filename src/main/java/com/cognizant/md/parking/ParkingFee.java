package com.cognizant.md.parking;

public class ParkingFee {
    private int total;
    private int HOURLY_FEE = 5;


    public int calculateTotal(boolean pass, int hours) {
        if(pass) {
            total = 0;
            return total;
        } else if((hours * HOURLY_FEE)  > 30) {
            total = 30;
        } else if((hours * HOURLY_FEE)  <= 30) {
            total = hours * HOURLY_FEE;
        }
        return total;
    }
}
