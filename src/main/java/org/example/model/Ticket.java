package org.example.model;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;

public class Ticket {
    private String ID;
    private String concertHall;
    private String eventCode;
    private long time;
    private boolean isPromo;
    private StadiumSector stadiumSector;
    private double allowedBackpack;

    private BigDecimal price;

    public Ticket() {

    }
    public Ticket(String ID, String concertHall, String eventCode, long time, boolean isPromo, StadiumSector stadiumSector, double allowedBackpack, BigDecimal price) {
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

    public String getID() {
        return ID;
    }

    public String getConcertHall() {
        return concertHall;
    }

    public String getEventCode() {
        return eventCode;
    }

    public boolean isPromo() {
        return isPromo;
    }

    public double getAllowedBackpack() {
        return allowedBackpack;
    }

    public BigDecimal getPrice() {
        return price;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return time == ticket.time && isPromo == ticket.isPromo && Double.compare(allowedBackpack, ticket.allowedBackpack) == 0 && Objects.equals(ID, ticket.ID) && Objects.equals(concertHall, ticket.concertHall) && Objects.equals(eventCode, ticket.eventCode) && stadiumSector == ticket.stadiumSector && Objects.equals(price, ticket.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, concertHall, eventCode, time, isPromo, stadiumSector, allowedBackpack, price);
    }
}
