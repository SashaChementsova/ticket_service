package org.example.model;

public class Admin extends User{
    @Override
    public void print(){
        printRole();
        System.out.println(
                "Email: "+getEmail()+
                "\n Phone: "+getPhone()+
                "\n Password: "+getPassword());
    }

    public Admin() {
    }

    public Admin(String ID, String email, String password, String phone) {
        super(ID, email, password, phone);
    }

    public void printRole(){
        System.out.println("ADMIN");
    }

    public String checkTicket(Ticket ticket){
        return "Ticket "+ticket.getID()+" "+ticket.getEventCode()+" is checked";
    }
}
