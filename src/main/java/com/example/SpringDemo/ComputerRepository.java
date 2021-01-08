package com.example.SpringDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ComputerRepository {

    Map<Long, Computer> computerList = new HashMap<>();

    public ComputerRepository() {

        Computer mac = new Computer(0L, "Mac");
        Computer dell = new Computer(1L, "Dell");

        computerList.put(mac.getId(), mac);
        computerList.put(dell.getId(), dell);
    }

    public Collection<Computer> getAllComputers() {
        return computerList.values();
    }

    public Computer getOneComputer(Long id) {
        return computerList.get(id);
    }

    public Computer getOneComputerByName(String name) {
        for (Computer computer : computerList.values()) {
            if (computer.getName().equalsIgnoreCase(name)) {
                return computer;
            }
        }
        return null;
    }

}
