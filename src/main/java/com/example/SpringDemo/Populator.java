package com.example.SpringDemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private ComputerRepository computerRepo;

    @Override
    public void run(String... args) throws Exception {
        Computer mac = new Computer("mac");
        Computer dell = new Computer("dell");

        computerRepo.save(mac);
        computerRepo.save(dell);
    }
}
