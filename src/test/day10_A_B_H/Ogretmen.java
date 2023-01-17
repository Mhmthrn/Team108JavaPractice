package test.day10_A_B_H;

public class Ogretmen extends Kisi{

    private String  bolum;
    private  int sicilNo;

    Ogretmen(){

    }


    @Override
    public String toString() {
        return super.toString()+
                "bolum='" + bolum + '\'' +
                ", sicilNo=" + sicilNo +
                '}';
    }

    public Ogretmen(String ad, String sad, String tcNo, int yas, String bolum, int sicilNo) {
        super(ad, sad, tcNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }
}
