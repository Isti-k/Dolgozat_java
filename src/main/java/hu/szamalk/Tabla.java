package hu.szamalk;

public class Tabla {
    private char[][] t;
    private char uresCella;



    public Tabla(char uresCella) {
        this.t[8][8] = uresCella;
        this.uresCella = uresCella;
    }

    public void megjelenit(){
        Tabla tabla = new Tabla('#');
        for (int sor = 0; sor < t.length; sor++) {
            for (int oszlop = 0; oszlop < t.length; oszlop++) {
                System.out.println(t[sor][oszlop]);
            }
        }
    }

    

}
