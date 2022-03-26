package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.zvierata.Macka;
import sk.stuba.fei.uim.oop.zvierata.Pes;
import sk.stuba.fei.uim.oop.zvierata.Zviera;
import sk.stuba.fei.uim.oop.zvierata.ZvieraComparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Zviera> zvierata = new ArrayList<>(List.of(new Pes("ducno"),new Macka("murko"),
                new Pes("luna"),new Macka("garfield")));

        zvierata.sort(new ZvieraComparator());
        System.out.println(zvierata);

        zvierata.sort((o1, o2) -> -o1.getMeno().compareTo(o2.getMeno()));  //- pred o1 je zoradenie zozadu
        System.out.println(zvierata);
        zvierata.sort(Comparator.comparing(Zviera::getMeno));
        System.out.println(zvierata);
    }
}