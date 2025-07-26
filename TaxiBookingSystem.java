package com.practice.Level3.TaxiBookingSystem;
import java.sql.SQLOutput;
import java.util.*;

public class TaxiBookingSystem {
    private static final int DEFAULT_SIZE=2;
    private final List<Taxi> taxiList;
    private int taxiCount;

    public TaxiBookingSystem(){
        this(DEFAULT_SIZE);
    }

    public TaxiBookingSystem(int taxiCount){
        this.taxiCount=taxiCount;
        taxiList=new ArrayList<>();
        for(int i=0;i<taxiCount;++i){
            taxiList.add(new Taxi());
        }
    }

    public void bookTaxi(char pickUpLocation,char dropLocation,int pickUpTime){

        Taxi bestTaxi=null;
        int taxiDistance=Integer.MAX_VALUE;
        for(Taxi taxi:taxiList){
            int currentDistance=Math.abs(pickUpLocation-taxi.getCurrentLocation());
            if(taxi.getDropTime()<=pickUpTime && (currentDistance<taxiDistance || currentDistance==taxiDistance && taxi.getEarnings()< bestTaxi.getEarnings())){
                bestTaxi=taxi;
                taxiDistance=currentDistance;
            }
        }

        if(bestTaxi==null){
            System.out.println("Sorry! we have no taxi available for the current Time");
            return ;
        }

        int kilometer=15;
        int distance=Math.abs(pickUpLocation-dropLocation);
        int dropTime=pickUpTime+distance;

        int firstFiveKM=100;
        int remainingDistance=(distance*kilometer)-5;
        int fare=firstFiveKM+(remainingDistance*10);

        bestTaxi.assignRide(pickUpLocation,dropLocation,pickUpTime,dropTime,fare);
        System.out.println("Taxi no "+bestTaxi.getTaxiId()+" Booked");
    }

    public void displayTaxis(){
        for(Taxi taxi:taxiList){
            System.out.println("--------------------------------------------------");
            System.out.println("Taxi id: "+taxi.getTaxiId());
            System.out.println("Taxi pickUpLocation: "+taxi.getPickUpLocation());
            System.out.println("Taxi dropLocation: "+taxi.getDropLocation());
            System.out.println("Taxi pickUpTime: "+taxi.getPickUpTime());
            System.out.println("Taxi dropTime: "+taxi.getDropTime());
            System.out.println("Taxi earnings: "+taxi.getEarnings());

            System.out.println("Booking History :");
            List<String> bookingHistory=taxi.getBookingHistory();

            if(bookingHistory==null){
                System.out.println("No booking history!");
            }
            else{
                for(String report:bookingHistory){
                    System.out.println(report);
                }
            }

        }
    }
}
