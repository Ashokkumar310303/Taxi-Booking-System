package com.practice.Level3.TaxiBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class Taxi {
    private static int idGenerator=1;
    private int taxiId;
    private char currentLocation;
    private char pickUpLocation;
    private char dropLocation;
    private int pickUpTime;
    private int dropTime;
    private long earnings;
    private List<String> bookingHistory=new ArrayList<>();

    public Taxi(){
        this.taxiId=idGenerator++;
        this.currentLocation='A';
        this.pickUpLocation='A';
        this.dropLocation='A';
        this.earnings=0;
    }

    public int getTaxiId(){
        return taxiId;
    }

    public char getCurrentLocation(){
        return currentLocation;
    }

    public char getPickUpLocation(){
        return pickUpLocation;
    }

    public char getDropLocation(){
        return dropLocation;
    }

    public int getPickUpTime(){
        return pickUpTime;
    }

    public int getDropTime(){
        return dropTime;
    }

    public long getEarnings(){
        return earnings;
    }

    public List<String> getBookingHistory(){
        return bookingHistory;
    }

    private void setCurrentLocation(char currentLocation){
        this.currentLocation=currentLocation;
    }

    private void setPickUpLocation(char pickUpLocation){
        this.pickUpLocation=pickUpLocation;
    }

    private void setDropLocation(char dropLocation){
        this.dropLocation=dropLocation;
    }

    private void setPickUpTime(int pickUpTime){
        this.pickUpTime=pickUpTime;
    }

    private void setDropTime(int dropTime){
        this.dropTime=dropTime;
    }

    private void setEarnings(int earnings){
        this.earnings+=earnings;
    }

    public void assignRide(char pickUpLocation,char dropLocation,int pickUpTime,int dropTime,int fare){
        setCurrentLocation(dropLocation);
        setPickUpLocation(pickUpLocation);
        setDropLocation(dropLocation);
        setPickUpTime(pickUpTime);
        setDropTime(dropTime);
        setEarnings(fare);

        String report=" | Pickup - "+ pickUpLocation+" | Drop - "+dropLocation+" | pickup Time - "+pickUpTime+
                " | Drop time - "+dropTime+" | Fare - $"+fare;

        bookingHistory.add(report);
    }


}
