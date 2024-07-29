package org.example.model;

import java.math.BigDecimal;
import java.time.Instant;

public class Ticket {
    private String ID;
    private String concertHall;
    private int eventCode;
    private long time;
    private boolean isPromo;
    private StadiumSector stadiumSector;
    private double allowedBackpack;

    private BigDecimal price;

    public Ticket() {

    }
    public Ticket(String ID, String concertHall, int eventCode, long time, boolean isPromo, StadiumSector stadiumSector, double allowedBackpack, BigDecimal price) {
        this.ID = ID;
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.time = time;
        this.isPromo = isPromo;
        this.stadiumSector = stadiumSector;
        this.allowedBackpack = allowedBackpack;
        this.price=price;
    }

    public Ticket(String concertHall, long time, StadiumSector stadiumSector){
        this.concertHall = concertHall;
        this.time = time;
        this.stadiumSector=stadiumSector;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public StadiumSector getStadiumSector() {
        return stadiumSector;
    }

    public void setStadiumSector(StadiumSector stadiumSector) {
        this.stadiumSector = stadiumSector;
    }

    @Override
    public String toString() {
        String promo = isPromo? "yes" : "no";
        return "Ticket " +
                "ID " + ID +
                "\n Concert hall - " + concertHall+
                "\n Event Code - " + eventCode +
                "\n Time - " + Instant.ofEpochSecond(time).toString() +
                "\n Promo - " + promo +
                "\n Stadium sector - " + stadiumSector +
                "\n Allowed backpack - " + allowedBackpack +" kg"+
                "\n Price - " + price +" byn";
    }
}
