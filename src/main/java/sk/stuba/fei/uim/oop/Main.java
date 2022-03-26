package sk.stuba.fei.uim.oop;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> auta = new ArrayList<>();
        auta.add("Volvo");
        auta.add("Audi");
        auta.add("BMW");
        auta.add("Fiat");

        auta.forEach(s -> System.out.println(s)); //ctrl+space doplnenie lambdy

        auta.forEach(s -> {
            if(Objects.equals(s, "BMW")){
                System.out.println("Auto ktore nema smerovky (:");
            }
        });

    }
}