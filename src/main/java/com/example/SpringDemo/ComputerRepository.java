package com.example.SpringDemo;


import org.springframework.data.repository.CrudRepository;

public interface ComputerRepository extends CrudRepository<Computer, Long> {

    Computer findComputerByName(String name);
}
