package org.example.service.serviceImpl;

import org.apache.commons.lang3.RandomStringUtils;
import org.example.model.*;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TicketServiceImpl
{
    private static ClientServiceImpl clientService;
    private static AdminServiceImpl adminService;

    public TicketServiceImpl() {
        clientService=new ClientServiceImpl();
        adminService=new AdminServiceImpl();
    }

    public static void main(String[] args )
    {
        Scanner scanner=new Scanner(System.in); int choice; String email,password,role;
        List<Client> clients=new ArrayList<>();
        Client client=new Client("A323", "email1","1234","+375298766776");
        client.addTicket(createTicket(StadiumSector.A));
        clients.add(client);
        Admin admin = new Admin("A3222","admin123","123","+375445635635");
        while(true){
            System.out.println("Enter the item of menu:\n"+
                    " 1) Sign up as Client\n"+
                    " 2) Sign in\n"+
                    " 3) Exit");
            choice=scanner.nextInt();
            switch (choice){
                case 1:{
                    clients.add(clientService.createClient(scanner));
                    clients.get(clients.size()-1).addTicket(createTicket(StadiumSector.B));
                    break;
                }
                case 2:{
                    System.out.println("Enter email:");
                    email=scanner.nextLine();
                    System.out.println("Enter password:");
                    password=scanner.nextLine();
                    if(email.equals(admin.getEmail())&&admin.getPassword().equals(password)){
                        adminService.doAdminMenu(admin,clients);
                    }
                    else{
                        for(Client client1:clients){
                            if(email.equals(client1.getEmail())&&client1.getPassword().equals(password))
                                clientService.doClientMenu(client1, clients);
                        }
                        System.out.println("Wrong password or email.");
                    }
                    break;
                }
                case 3:{
                    return;
                }
            }
        }
    }

    public static Ticket createTicket(StadiumSector stadiumSector){
        return new Ticket(generateID(),"Red Hall","t4tf4",getUnixTimestamp(2024,11, 5, 21,30),true,stadiumSector,45,stadiumSector.getMinPrice());
    }
    public static String generateID() {
        return RandomStringUtils.randomAlphanumeric(5);
    }
    public static long getUnixTimestamp(int year,int month, int day, int hour,int min){
        return LocalDate.of(year,month,day).atTime(hour,min).toInstant(ZoneOffset.UTC).getEpochSecond();
    }

}
