public class Eleman {
    String isim;
    String soyisim;
    int telno;
    int dt;
    Eleman next;
    int id;
    public Eleman(int id,String isim, String soyisim, int telno, int dt) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.telno = telno;
        this.dt = dt;
        this.next = null;
        this.id = id;
    }
}
