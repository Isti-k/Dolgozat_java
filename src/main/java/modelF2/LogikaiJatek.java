package modelF2;

import java.util.Arrays;

public class LogikaiJatek extends Jatek {
    private Babu[][] tabla = new Babu[4][5];
    private int sorrend[] = new int[10];
    private int babuDb;

    public LogikaiJatek(){
        if (babuDb >= 2 && babuDb <= 15) {
            this.babuDb = babuDb;
        }


    }

    public LogikaiJatek(int babuDb) {

        this.babuDb = babuDb;

    }

    public boolean van8FelettEro(){
        return true;
    }

    public void kezd(LogikaiJatek j1){

    }

    public void ment(){

    }

    public void vege(LogikaiJatek j2){

    }

    @Override
    public String toString() {
        return "LogikaiJatek{" +
                "tabla=" + Arrays.toString(tabla) +
                ", sorrend=" + Arrays.toString(sorrend) +
                ", babuDb=" + babuDb +
                '}';
    }
}


