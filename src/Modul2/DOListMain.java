package Modul2;

public class DOListMain {

    public static void main(String[] args) {
        DOLinkedList link = new DOLinkedList();
        link.addFirst(new Employee("adi", 34));
        link.addFirst(new Employee("budi", 89));
        link.addFirst(new Employee("cepen", 23));
        link.addLast(new Employee("doni", 67));
        link.addLast(new Employee("eko", 90));

        System.out.println("isi adalah : " + link.toString());

        Employee d = new Employee("budi", 89);
        Employee e = new Employee("titin", 95);
        Employee f = new Employee("anjar", 75);

        System.out.println("CARI DATA BUDI, CARI DATA ANJAR     cek apakah datanya ada pa tidak?");
        if (link.search(d)!=null)
        {
            System.out.println("DATA ADA");
        }
        else
        {
            System.out.println("DATA TIDAK ADA     ");
        }
        System.out.println("SISIPKAN TITIN  DISEBELAH KIRI BUDI");        
        link.addBefore(e, link.search(d));
        System.out.println(link.toString());
        System.out.println("SISIPKAN ANJAR DISEBELAH KANAN BUDI");      
        link.addAfter(f, link.search(d));
        System.out.println(link.toString());
        System.out.println("isi adalah : " + link.toString());

        System.out.println("item awal yang terhapus : "
                + link.removeFirst().getData().toString());
        System.out.println("isi kemudian : " + link.toString());

        System.out.println("item akhir yang terhapus : "
                + link.removeLast().getData().toString());
        System.out.println("hapus last : " + link.toString());
        System.out.println("Menambah data pertama :");
        link.addFirst("made");
        System.out.println(link.toString());
        System.out.println("Menambah data terakhir :");
        link.addLast("engel");
        System.out.println(link.toString());
    }
}
