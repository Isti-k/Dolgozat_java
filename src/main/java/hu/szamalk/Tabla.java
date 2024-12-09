package hu.szamalk;

public class Tabla {
    private char[][] t;
    private char uresCella;



    public Tabla(char uresCella) {
        t = new char[8][8];
        this.uresCella = uresCella;
    }

    public void Megjelenit(){
        Tabla tabla = new Tabla('#');
        for (int sor = 0; sor < t.length; sor++) {
            for (int oszlop = 0; oszlop < t.length; oszlop++) {
                System.out.println(t[oszlop]);
            }
            System.out.println(t[sor]);
        }
        System.out.println('#');
    }

    public void Elhelyez(){
        char N = 'K';
        if (N != uresCella){
            uresCella.add(N);
        }
    }

    public boolean uresOszlop(){
        return false;
    }

    public boolean uresSor(){
        return false;
    }


}
