package com.epsi.payetonkawa.clients;

import com.epsi.payetonkawa.core.entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientsRepository extends JpaRepository<ClientEntity, Long> {
    List<ClientEntity> findAll();
    ClientEntity findClientByClientID(Long id);
    ClientEntity findClientEntityByFullName(String fullName);
    ClientEntity save(ClientEntity clientEntity);
    ClientEntity deleteClientEntityByClientID(Long id);
}
