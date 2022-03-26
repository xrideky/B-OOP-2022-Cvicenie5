package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.zvierata.Macka;
import sk.stuba.fei.uim.oop.zvierata.Pes;
import sk.stuba.fei.uim.oop.zvierata.Zviera;
import sk.stuba.fei.uim.oop.zvierata.ZvieraComparator;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Zviera> zvierata = new ArrayList<>(List.of(new Pes("ducno"),new Macka("murko"),
                new Pes("luna"),new Macka("garfield")));

        //streamy su kolekcie na ktore sa vieme ako keby pripojit a vieme na nich pocuvat
        // a v priebehu casu tam vedia bezat nejake udaje toho typu ktoreho typu je ten stream

        zvierata.stream().forEach(System.out::println); //list zvierat sa mi zmenil na stream ktory obsahuje zvierata

        List<Zviera> zvierata2 = zvierata.stream().collect(Collectors.toList());

        zvierata2 = zvierata2.stream()
                .sorted((o1, o2) -> o1.getMeno().compareTo(o2.getMeno()))
                .collect(Collectors.toList());

        System.out.println("-----");
        zvierata2.stream().forEach(System.out::println);

        String[] mena = zvierata2.stream()
                .map(zviera -> zviera.getMeno())
                .toArray(size ->new String[size]);

        System.out.println("-----");
        Stream.of(mena).forEach(System.out::println);

        List<Pes> psi = zvierata.stream()
                .filter(zviera -> zviera instanceof Pes)
                .map(pes -> (Pes) pes)
                .collect(Collectors.toList());

        System.out.println("-----");
        psi.forEach(System.out::println);

    }
}