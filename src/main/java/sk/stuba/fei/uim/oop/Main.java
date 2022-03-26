package sk.stuba.fei.uim.oop;


import sk.stuba.fei.uim.oop.zvierata.Macka;
import sk.stuba.fei.uim.oop.zvierata.Pes;
import sk.stuba.fei.uim.oop.zvierata.Zviera;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Zviera> zvierata2 = new ArrayList<>(List.of(new Pes("dunco"), new Macka("garfield")));

        Map<String, String> hlavneMesta = new HashMap<>();
        hlavneMesta.put("Slovensko","Bratislava");
        hlavneMesta.put("Česko","Praha");
        hlavneMesta.put("Maďarsko","Budapešť");
        hlavneMesta.put("Poľsko","Varšava");

        System.out.println(hlavneMesta.size());
        System.out.println(hlavneMesta);
        System.out.println(hlavneMesta.get("Slovensko"));
        System.out.println("--------------------------");

        if(hlavneMesta.containsKey("Česko")){
            System.out.println(hlavneMesta.get("Česko"));
        }
        System.out.println("--------------------------");

        for(String kluc : hlavneMesta.keySet()){  //tak isto ako viem prechadzat keySet viem prechadzat hodnoty=.values();
            System.out.println(kluc);
            System.out.println(hlavneMesta.get(kluc));
        }
        System.out.println("--------------------------");

        if(hlavneMesta.containsKey("Česko")){
            hlavneMesta.remove("Česko");
        }

        System.out.println(hlavneMesta);
        hlavneMesta.clear();
        System.out.println(hlavneMesta);
        System.out.println("--------------------------");

    }
}