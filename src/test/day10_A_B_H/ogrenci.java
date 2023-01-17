package test.day10_A_B_H;

public class ogrenci extends Kisi  {

    private  int numara;
    private String sinif;

    public ogrenci(int numara, String sinif) {
        this.numara = numara;
        this.sinif = sinif;
    }

    public ogrenci(String ad, String sad, String tcNo, int yas, int numara, String sinif) {
        super(ad, sad, tcNo, yas);
        this.numara = numara;
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return super.toString() +
                "numara=" + numara +
                ", sinif='" + sinif + '\'' +
                '}';
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }
}
