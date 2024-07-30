package org.example.model;


import com.sun.beans.introspect.ClassInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client extends User{

    private List<Ticket> tickets;

    public Client(String ID, String email, String password, String phone) {
        super(ID, email, password, phone);
        this.tickets = new ArrayList<>();
    }
    public Client(){}
    public void printRole(){
        System.out.println("CLIENT");
    }
    @Override
    public void print(){
        printRole();
        super.print();
    }

    public List<Ticket> getTickets(){
        return tickets;
    }


    public void addTicket(Ticket ticket){
        tickets.add(ticket);
    }

    public Ticket getTicket(String eventCode){
        for(Ticket ticket:tickets) {
            if (Objects.equals(ticket.getEventCode(), eventCode)) return ticket;
        }
        return null;
    }
}
