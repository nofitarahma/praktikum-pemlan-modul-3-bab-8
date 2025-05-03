import java.util.Scanner; //import kelas scanner
public class MainNVMeneer { //deklarasi kelas
    public static void main(String[] args) { //main method
        //deklarasi object untuk membaca input dari user
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nomor registrasi: "); //menampilkan perintah input
        int registrationNumber = input.nextInt(); //input dari user disimpan di variable registrationNumber
        input.nextLine(); //membersihkan newline
        System.out.println("Masukkan nama: "); //menampilkan perintah input
        String nama = input.nextLine(); //input dari user disimpan di varible nama
        System.out.println("Masukkan nominal gaji perbulan: "); //menampilkan perintah input
        int salaryPerMonth = input.nextInt(); //input dari user disimpan di variable salaryPerMonth
        System.out.println("Masukkan banyaknya jenis produk yang akan dibeli:"); //menampilkan perintah input
        int banyaknya = input.nextInt(); //input dari user disimpan di variable banyaknya
        input.nextLine(); //membersihkan newline
        Invoice[] invoices = new Invoice[banyaknya]; //array invoice sebanyak jenis produk yang dibeli
        //loop untuk menampilkan input dibawah sejumlah banyaknya jenis produk
        for (int i = 0; i < banyaknya; i++) {
            Employee employee = new Employee(0, null, 0, null); //deklarasi object dummy untuk memanggil border
            employee.border1(); //menampilkan border yang ====
            System.out.println("Produk ke - " + (i+1)); //menampilkan keterangan inputan produk ke berapa
            employee.border2(); //menampilkan border yang ----
            System.out.println("Masukkan nama barang: "); //menampilkan perintah input
            String productName = input.nextLine(); //input dari user disimpan di variable productName
            System.out.println("Masukkan jumlah barang: "); //menampilkan perintah input
            int quantity = input.nextInt(); //input dari user disimpan di variable quantity
            System.out.println("Masukkan harga per item: "); //menampilkan perintah input
            int pricePerItem = input.nextInt(); //input dari user disimpan di variable pricePerItem
            input.nextLine(); //membersihkan newline
            invoices[i] = new Invoice(productName, quantity, pricePerItem); //object untuk menyimpan inputan ke array invoice
        }
        //deklarasi object yang di isi inputan yang telah disimpan dalam variable
        Employee employee0 = new Employee(registrationNumber, nama, salaryPerMonth, invoices);
        employee0.displayInfo(); //menampilkan rinciannya
        input.close(); // menutup scanner
    }
}
