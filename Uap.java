
package com.mycompany.uap;
import java.util.Scanner;
public class Uap {
    static int kamar, pelanggan;
    static String[][] hotel;
static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
      System.out.println("HOTEL SMILE"); 
      System.out.println("ISI DATA DAN TAMPILKAN DATA PENANGGUNG JAWAB KAMAR");
      isiData();
      tampilData();

           
       }
    public static String[][] isiData() {
        System.out.println("Masukkan Jumlah Kamar : ");
        kamar = input.nextInt(); 
        System.out.println("Masukkan Jumlah Pelanggan : ");
        pelanggan = input.nextInt(); 
        input.nextLine();
           hotel = new String[kamar][kamar];
           int i=kamar;
           int j=pelanggan;
           for ( i = 0; i < kamar; i++) {
                   System.out.print("Masukkan Nomor Kamar : "+(i+1)+ "\nMasukkan Nama Pelanggan : ");
                   hotel[0][i] = input.nextLine();
                   System.out.println("Masukkan Nomor Identitas : ");
                   hotel[1][i] = input.nextLine();
           }
           return hotel; 
           
    }
    
    public static String[][] tampilData() {
           System.out.println("\nData Pelanggan");
           for ( int i = 0; i < kamar; i++) {
               System.out.println("Kamar "+(i+1));
               System.out.print("Nama Pelanggan : ");
                   System.out.println(hotel[0][i]);
                   System.out.print("Nomor Identitas : ");
                   System.out.println(hotel[1][i]);
           }
           return  hotel;
           }
}
        
    

