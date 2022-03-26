package sk.stuba.fei.uim.oop;


import sk.stuba.fei.uim.oop.zvierata.Macka;
import sk.stuba.fei.uim.oop.zvierata.Pes;
import sk.stuba.fei.uim.oop.zvierata.Zviera;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Zviera> zvierata = new ArrayList<>(); //mali by sme vytvarat List nie ArrayList
        List<Zviera> zvierata2 = new ArrayList<>(List.of(new Pes("dunco"), new Macka("garfield")));
    }
}