public class BagliListeKuyruk {
    private Eleman front;
    private Eleman rear;
    private int idcounter =1;
    public void enQueue(String isim, String soyisim, int telno, int dt) {
        Eleman yeni = new Eleman(idcounter,isim, soyisim, telno, dt);
        if (rear == null) {
            front = rear = yeni;
        } else {
            rear.next = yeni;
            rear = yeni;
        }
        idcounter++;
    }

    public Eleman deQueue() {
        if (front == null)
            return null;
        Eleman temp = front;
        front = front.next;
        if (front == null)
            rear = null;
        return temp;
    }

    public void yazdir() {
        Eleman temp = front;
        while (temp != null) {
            System.out.println(temp.isim + " " + temp.soyisim);
            temp = temp.next;
        }
    }

    public int elemanSayisi() {
        int sayac = 0;
        Eleman temp = front;
        while (temp != null) {
            sayac++;
            temp = temp.next;
        }
        return sayac;
    }
}
