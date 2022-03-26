package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.zvierata.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Zviera> zvierata = new ArrayList<>();
        zvierata.add(new Pes("ducno"));
        zvierata.add(new Macka("garfield"));


        for(var zver : zvierata){   //prechadzenie cez pole forom
            System.out.println("pred");
            try {
                System.out.println("pred try");
                kontrola(zver);
                System.out.println("po try ");
            } catch (NotPesException e) {
                System.out.println("catch pes");
                System.out.println(e.getMessage());
            } catch (NotMackaException e) {
                System.out.println("catch macka");
                System.out.println(e.getMessage());
            } finally {
                System.out.println("finally");
            }
            System.out.println("po");
            System.out.println("--------");
        }
    }

    private static void kontrola(Zviera zver) throws NotPesException, NotMackaException {
        if(zver instanceof Pes){
           throw new NotMackaException("Nie je to macka");
        } else {
            throw new NotPesException("Nie je to pes");
        }
    }
}
