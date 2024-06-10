package ra.static_demo;
import java.sql.Connection;

import static ra.static_demo.AppConfig.*;
public class ConnectionDB {

    public static void main(String[] args) {
        System.out.println("DRIVER: "+DRIVER);
        System.out.println("URL: "+URL);
        System.out.println("USERNAME: "+USER_NAME);
        System.out.println("PASSWORD: "+PASSWORD);
    }
}
