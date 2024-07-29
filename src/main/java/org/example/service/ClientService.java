package org.example.service;

import org.example.model.Client;

import java.util.List;
import java.util.Scanner;

public interface ClientService {
    public Client createClient(Scanner scanner);
    public void doClientMenu(Client client, List<Client> clientList);
}
