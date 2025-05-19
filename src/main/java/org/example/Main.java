package org.example;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        port(8080);

        get("/hello", (req, res) -> {

            return "hello world";
        });

        System.out.println("Spark Java server started on http://localhost:8080");
        System.out.println("Try visiting http://localhost:8080/hello");
    }
}