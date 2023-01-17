package test.day10_A_B_H;

public class Kisi {
    private  String ad;
    private  String Sad;
    private  String tcNo;
    private int yas;

    public Kisi() {
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", Sad='" + Sad + '\'' +
                ", tcNo='" + tcNo + '\'' +
                ", yas=" + yas +
                '}';
    }

    public Kisi(String ad, String sad, String tcNo, int yas) {
        this.ad = ad;
        Sad = sad;
        this.tcNo = tcNo;
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSad() {
        return Sad;
    }

    public void setSad(String sad) {
        Sad = sad;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
