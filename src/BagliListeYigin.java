public class BagliListeYigin {
    private Eleman top;
    private int idcounter= 1;
    public void push(String isim, String soyisim, int telno, int dt) {
        Eleman yeni = new Eleman(idcounter,isim, soyisim, telno, dt);
        idcounter++;
        yeni.next = top;
        top = yeni;
    }

    public Eleman pop() {
        if (top == null) return null;
        Eleman temp = top;
        top = top.next;
        return temp;
    }

    public void yazdir() {
        Eleman temp = top;
        while (temp != null) {
            System.out.println(temp.isim + " " + temp.soyisim);
            temp = temp.next;
        }
    }
    public void aradansil(int id){
        Eleman temp = top;
        Eleman prev = null;

        if(top==null){
            return;
        }
        if(temp!=null && temp.id==id){
            top=temp.next;
            return;
        }
        while (temp!=null&& temp.id != id){
            prev = temp;
            temp = temp.next;

        }
        if(temp==null){
            return;
        }
        prev.next = temp.next;


    }

    public int elemanSayisi() {
        int sayac = 0;
        Eleman temp = top;
        while (temp != null) {
            sayac++;
            temp = temp.next;
        }
        return sayac;
    }
}
