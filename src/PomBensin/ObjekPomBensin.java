/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PomBensin;
package import java.util.Scanner;

/**
 *
 * @author DIAN
 */
public class ObjekPomBensin {
    public void isiBensin(){
        Scanner input = new Scanner(System.in);
        
        double hargaPertamax = 9000, hargaPertalite = 7650, hargaDexlite = 9500;
        double beliBensin, literBensin, bayarBensin, uangKembali;
        
        System.out.println("Silahkan pilih Bensin : ");
        System.out.println("1. Pertamax\n2. Pertalite\n3. Dexlite");
        System.out.print("Pilih Bensin Anda : ");
        int pilih = input.nextInt();
        
        switch(pilih) {
            case 1: System.out.println("Isi Pertamax");
                    
                    System.out.println("Beli Bensin berapa : ");
                    beliBensin = input.nextDouble();
                    
                    System.out.println("Bayar Bensin :");
                    bayarBensin = input.nextDouble();
                    
                    if(bayarBensin < beliBensin){
                        System.out.println("Maaf uang yang anda masukan kurang!");
                        break;
                    }
                    
                    literBensin = beliBensin / hargaPertamax;
                    uangKembali = bayarBensin - beliBensin;
                                             
                    System.out.println("=== STRUK PEMBAYARAN ===");
                    System.out.println("========================");
                    System.out.println("Harga Pertamax = Rp. 9000/Liter");
                    System.out.println("Pembelian Pertamax : Rp " + beliBensin);
                    System.out.println("Liter Pertamax : " + literBensin + "Liter");
                    System.out.println("Pembayaran : Rp " + bayarBensin);
                    System.out.println("Kembalian : Rp " + uangKembali);
                    break;
                    
            case 2: System.out.println("Isi Pertalite");
                    
                    System.out.println("Beli Bensin berapa : ");
                    beliBensin = input.nextDouble();
                    
                    System.out.println("Bayar Bensin :");
                    bayarBensin = input.nextDouble();
                    
                    if(bayarBensin < beliBensin){
                        System.out.println("Maaf uang yang anda masukan kurang!");
                        break;
                    }
                    
                    literBensin = beliBensin / hargaPertalite;
                    uangKembali = bayarBensin - beliBensin;
                                             
                    System.out.println("=== STRUK PEMBAYARAN ===");
                    System.out.println("========================");
                    System.out.println("Harga Pertamax = Rp. 7650/Liter");
                    System.out.println("Pembelian Pertalite : Rp " + beliBensin);
                    System.out.println("Liter Pertalite : " + literBensin + "Liter");
                    System.out.println("Pembayaran : Rp " + bayarBensin);
                    System.out.println("Kembalian : Rp " + uangKembali);
                    break;
                    
            case 3: System.out.println("Isi Dexlite");
                    
                    System.out.println("Beli Bensin berapa : ");
                    beliBensin = input.nextDouble();
                    
                    System.out.println("Bayar Bensin :");
                    bayarBensin = input.nextDouble();
                    
                    if(bayarBensin < beliBensin){
                        System.out.println("Maaf uang yang anda masukan kurang!");
                        break;
                    }
                    
                    literBensin = beliBensin / hargaDexlite;
                    uangKembali = bayarBensin - beliBensin;
                                             
                    System.out.println("=== STRUK PEMBAYARAN ===");
                    System.out.println("========================");
                    System.out.println("Harga Dexlite = Rp. 9500/Liter");
                    System.out.println("Pembelian Dexlite : " + beliBensin);
                    System.out.println("Liter Dexlite : " + literBensin + "Liter");
                    System.out.println("Pembayaran : Rp " + bayarBensin);
                    System.out.println("Kembalian : Rp " + uangKembali);
                    break;
                    
            default: System.out.println("Maaf pilihan anda tidak terdaftar");
        }   
    }
}
