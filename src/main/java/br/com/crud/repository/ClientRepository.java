package br.com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.crud.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	

}
