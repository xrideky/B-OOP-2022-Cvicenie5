package sk.stuba.fei.uim.oop.zvierata;

import java.util.Comparator;

public abstract class Zviera implements Comparable<Zviera> {
    protected final String meno;

    public Zviera(String meno) {
        this.meno = meno;
    }

    public abstract void zvukZvierata();

    public void pohladkat() {
        System.out.println(this.meno + " bol pohladkany");
        this.zvukZvierata();
    }

    public String getMeno() {
        return meno;
    }

    @Override
    public int compareTo(Zviera o) {
        return this.meno.compareTo(o.getMeno());
    }

    @Override
    public String toString() {
        return this.meno;
    }
}