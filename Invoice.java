public class Invoice implements Payable { //deklarasi kelas Invoice yang mengimplementasikan interface Payable
    private String productName; //deklarasi variable productName
    private int quantity; //deklarasi variable quantity
    private int pricePerItem; //deklarasi variable pricePerItem
    //constructor buat inisialisasi object
    public Invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName; //isinya productName
        this.quantity = quantity; //isinya quantity
        this.pricePerItem = pricePerItem; //isinya pricePerItem
    }
    //getter yang mengembalikan nilai productName
    public String getProductName() {
        return productName;
    }
    //setter yang mengambil nilai productName
    public void setProductName(String productName) {
        this.productName = productName;
    }
    //getter yang mengembalikan nilai quantity
    public int getQuantity() {
        return quantity;
    }
    //setter yang mengambil nilai quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    //getter yang mengembalikan nilai pricePerItem
    public int getPricePerItem() {
        return pricePerItem;
    }
    //setter yang mengambil nilai pricePerItem
    public void setPricePerItem(int pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
    //method dari inteerface Payable
    @Override
    public int getPayableAmount() {
        return pricePerItem * quantity; //mengembalikan nilai pricePerItem di kali quantity
    }
    //method yang fungsinya menampilkan informasi dari belanjaannya
    public void infoBarangBelanjaan(){
        System.out.println("Nama Product                   : " + productName); //menampilkan productName
        System.out.println("Jumlah Barang                  : " + quantity); //menampilkan quantity
        System.out.println("Harga Per Item                 : " + pricePerItem); //menampilkan pricePerItem
    }
}
