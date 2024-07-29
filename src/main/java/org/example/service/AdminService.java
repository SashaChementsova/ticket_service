package org.example.service;

import org.example.model.Admin;
import org.example.model.Client;

import java.util.List;

public interface AdminService {
    public void doAdminMenu(Admin admin, List<Client> clients);
}
