public class Employee implements Payable{ //deklarasi kelas Employee yang mengimplementasikan interface Payable
    private int registrationNumber; //deklarasi variable registrationNumber
    private String name; //deklarasi variable name
    private int salaryPerMonth; //deklarasi variable salaryPerMonth
    private Invoice[] invoices; //deklarasi variable invoices
    private int maksPanjang = 50; //deklarasi variable maksPanjang untuk batas panjangnya
    //constructor untuk inisialisasi object
    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber; //isinya registrationNumber
        this.name = name; //isinya name
        this.salaryPerMonth = salaryPerMonth; //isinya salaryPerMonth
        this.invoices = invoices; //isinya invoices
    }
    //getter yang mengembalikan nilai registrationNumber
    public int getRegistrationNumber() {
        return registrationNumber;
    }
    //setter yang mengambil nilai registrationNumber
    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    //getter yang mengembalikan nilai name
    public String getName() {
        return name;
    }
    //setter yang mengambil nilai name
    public void setName(String name) {
        this.name = name;
    }
    //getter yang mengembalikan nilai salaryPerMonth
    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }
    //setter yang mengambil nilai salaryPerMonth
    public void setSalaryPerMonth(int salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }
    //getter yang mengembalikan nilai invoices
    public Invoice[] getInvoices() {
        return invoices;
    }
    //setter yang mengambil nilai invoices
    public void setInvoices(Invoice[] invoices) {
        this.invoices = invoices;
    }
    //method yang fungsinya untuk menghitung total belanjanya
    public int totalBelanja(){
        int totalBelanja = 0; //inisialisasi total belanja = 0
        //loop untuk cek setiap array invoice
        for (Invoice invoice : invoices) {
            totalBelanja += invoice.getPayableAmount(); //total belanja = penjumlahan semua nilai getPayableAmount pada invoice
        }
        return totalBelanja; //mengembalikan nilai totalBelanja
    }
    //method dari interface Payable
    @Override
    public int getPayableAmount() {
        return salaryPerMonth - totalBelanja(); //mengembalikan nilai gaji perbulan dikurangi total belanja
    }
    //method agar kalimatnya di tengah baris
    private String ditengah(String kata){
        int padding = maksPanjang - kata.length(); //buat menghitung sisa panjang baris setelah dikurangi kata
        int paddingKiri = (padding/2)-2; //ini untuk menghitung ukuran padding di sebelah kiri
        int paddingKanan = padding - paddingKiri- 4; //ini untuk menghitung ukuran padding di sebelah kanan
        return " ".repeat(paddingKiri) + kata + " ".repeat(paddingKanan); //menggabungkan antara spasi sepanjang padding kiri, kata, dan padding kanan
    }
    //method untuk membuat border ==== sepanjang maksPanjang
    public void border1(){
        System.out.println("=".repeat(maksPanjang));
    }
    //method untuk membuat border ---- sepanjang maksPanjang
    public void border2(){
        System.out.println("-".repeat(maksPanjang));
    }
    //method yang fungsinya menampilkan rincian informasi employee dan invoice belanjaannya
    public void displayInfo(){
        border1(); //menampilkan border yang ====
        System.out.println("||" + ditengah("Informasi Employee ") + "||"); //menampilkan kata di tengah
        border1(); //menampilkan border yang ====
        System.out.println("Registration Number            : " + registrationNumber); //menampilkan registration number
        System.out.println("Nama                           : " + name); //menampilkan nama
        System.out.println("Gaji Perbulan                  : " + salaryPerMonth); //menampilkan gaji perbulan
        System.out.println("Hutang Belanjaan               : " + totalBelanja()); //menampilkan total belanja
        System.out.println("Gaji Setelah Pemotongan        : " + getPayableAmount()); //menampilkan gaji setelah pemotongan
        border1(); //menampilkan border yang ====
        System.out.println("||" + ditengah("Invoice Belanjaan Employee") + "||"); //menampilkan kata ditengah
        border1(); //menampilkan border yang ====
        //loop untuk cek setiap array invoice
        for (Invoice invoice : invoices) {
            invoice.infoBarangBelanjaan(); //menampilkan informasi dari barang yang dibeli
            border2(); //menampilkan border yang ----
        }
        System.out.println("Total Belanja                  : " + totalBelanja()); //menampilkan total belanja
        border1(); //menampilkan border yang ====
    }
}
