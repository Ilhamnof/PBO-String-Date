import java.util.Scanner;
import java.util.*;
import java.text.*;

public class transaksi {

    public static void main(String[] args) {
         Date HariSekarang = new Date();
          
        
        Scanner scanner = new Scanner(System.in);
   
        try {
            System.out.print("Masukkan Nomor Faktur: ");
            String invoiceNumber = scanner.next();

            System.out.print("Masukkan Nama Pelanggan: ");
            String customerName = scanner.next();

            System.out.print("Masukkan No Handphone: ");
            String NoHP = scanner.next();

            System.out.print("Masukkan Alamat: ");
            String alamat = scanner.next();

            System.out.print("Masukkan Nama Barang: ");
            String itemName = scanner.next();

            System.out.print("Masukkan Harga Barang: ");
            double price = scanner.nextDouble();

            System.out.print("Masukkan Jumlah Barang: ");
            int quantity = scanner.nextInt();

          
            faktur invoice = new faktur(invoiceNumber, customerName, itemName, price, quantity,NoHP,alamat);
            SimpleDateFormat ft = new SimpleDateFormat ("dd/mm/yyyy");
            SimpleDateFormat format = new SimpleDateFormat ("hh:mm:ss");
            System.out.println();  
            System.out.println("============MINIMARKET============");
            System.out.println("Tanggal \t\t: " + ft.format (HariSekarang));
            System.out.println("Waktu\t\t\t: " + format.format (HariSekarang));
            System.out.println("Nomor Faktur\t\t: " + invoice.getInvoiceNumber());
            System.out.println("==========Data Pelanggan==========");
            System.out.println("Nama Pelanggan\t\t: " + invoice.getCustomerName());
            System.out.println("No Handphone\t\t: " + invoice.getnoHP());
            System.out.println("Alamat\t\t\t: " + invoice.getAlamat());
            System.out.println("============Data Barang============");
            System.out.println("Nama Barang\t\t: " + invoice.getItemName());
            System.out.println("Harga Barang\t\t: " + invoice.getPrice());
            System.out.println("Jumlah Barang\t\t: " + invoice.getQuantity());
            System.out.println("Total Bayar\t\t: " + invoice.calculateTotal());

        } catch (Exception e) {
            System.err.println("Input tidak valid. Pastikan input sesuai dengan tipe data yang diminta.");
        } finally {
            System.out.println("===============Kasir===============");
        String myString = "Nofaldi";
        String uppercaseString = myString.toUpperCase();
        System.out.println("Kasir\t\t\t: " + uppercaseString);
            scanner.close();
        }
    }
}