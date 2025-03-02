package com.client_db.webapp.repositories;

import com.client_db.webapp.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    public Client findByEmail(String email);
}
