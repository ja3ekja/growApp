package com.epam.app.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

/**
 * Jacek Feliksiak
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) throws SQLException {

        SpringApplication.run(App.class, args);

    }
}