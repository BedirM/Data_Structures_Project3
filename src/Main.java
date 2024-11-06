public class Main {
    public static void main(String[] args) {
        System.out.println();

        BagliListeYigin yigin = new BagliListeYigin();
        yigin.push("Bedir", "Müjde", 123456, 1990);
        yigin.push("Kamil", "Kara", 654321, 1995);
        yigin.yazdir();
        yigin.pop();

        System.out.println("---------------------");

        yigin.yazdir();

        System.out.println("Yığın eleman sayısı: " + yigin.elemanSayisi());

        System.out.println("\n##########################\n");

        BagliListeKuyruk kuyruk = new BagliListeKuyruk();
        kuyruk.enQueue("Bedir", "Müjde", 123456, 1990);
        kuyruk.enQueue("Kamil", "Kara", 654321, 1995);
        kuyruk.yazdir();
        kuyruk.deQueue();

        System.out.println("---------------------");

        kuyruk.yazdir();

        System.out.println("Kuyruk eleman sayısı: " + kuyruk.elemanSayisi());

    }
}




