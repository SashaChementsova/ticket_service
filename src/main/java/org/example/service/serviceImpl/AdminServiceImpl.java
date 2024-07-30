package org.example.service.serviceImpl;

import org.example.model.Admin;
import org.example.model.Client;
import org.example.service.AdminService;

import java.util.List;

public class AdminServiceImpl implements AdminService {
    @Override
    public void doAdminMenu(Admin admin, List<Client> clients){
        admin.printRole();
        admin.checkTicket(clients.get(0).getTicket("t4tf4"));
    }
}
