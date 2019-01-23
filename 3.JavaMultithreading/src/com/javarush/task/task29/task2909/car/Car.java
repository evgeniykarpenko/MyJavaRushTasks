package com.javarush.task.task29.task2909.car;

import java.util.Date;

public abstract class Car {

    static public final int TRUCK = 0;
    static public final int SEDAN = 1;
    static public final int CABRIOLET = 2;

    double fuel;

    public double summerFuelConsumption;
    public double winterFuelConsumption;
    public double winterWarmingUp;

    private int type;

    private boolean driverAvailable;
    private int numberOfPassengers;

    static public Car create(int type, int numberOfPassengers) {
        Car c = null;
        switch (type) {
            case TRUCK: c= new Truck(numberOfPassengers); break;
            case SEDAN: c= new Sedan(numberOfPassengers); break;
            case CABRIOLET: c= new Cabriolet(numberOfPassengers); break;
        }

      return c;
    }

    protected Car(int type, int numberOfPassengers) {
        this.type = type;
        this.numberOfPassengers = numberOfPassengers;
    }

    public void fill(double numberOfLiters) throws  Exception{
        if(numberOfLiters<0) throw new Exception();
        else fuel += numberOfLiters;


    }

    public double getTripConsumption(Date date, int length, Date SummerStart, Date SummerEnd) {
        double consumption;
        if (isSummer(date,SummerStart,SummerEnd)) {
            consumption = getSummerConsumption(length);
        } else {
            consumption = getWinterConsumption(length);
        }
        return consumption;
    }

    public int getNumberOfPassengersCanBeTransferred() {
        if (canPassengersBeTransferred() )

        return numberOfPassengers;

        return 0;
    }

    public boolean isDriverAvailable() {
        return driverAvailable;
    }

    public void setDriverAvailable(boolean driverAvailable) {
        this.driverAvailable = driverAvailable;
    }

    public void startMoving() {

        fastenDriverBelt();
        if (numberOfPassengers > 0) {
            fastenPassengersBelts();

        }
    }

    public void fastenPassengersBelts() {
    }

    public void fastenDriverBelt() {
    }

    public abstract int getMaxSpeed();


    public boolean isSummer(Date date , Date summerStart, Date summerEnd)
    {
        return !(date.before(summerStart) || date.after(summerEnd));
    }

    public double getWinterConsumption(int length)
    {
        return length *winterFuelConsumption + winterWarmingUp;
    }

    public double getSummerConsumption(int length)
    {
        return length *summerFuelConsumption;
    }

    private boolean canPassengersBeTransferred()
    {
        if(isDriverAvailable()&&(fuel>0)) return true;
        else return false;
    }
}





