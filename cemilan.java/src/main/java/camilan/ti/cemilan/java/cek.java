/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camilan.ti.cemilan.java;

/**
 *
 * @author Aqyla-PC
 */
public class cek {
//    public Double bayar(String inputHarga, String inputJumlahBeli){
//        Integer hargaBuah = Integer.valueOf(inputHarga);
//        Double jumlahBeli = Double.valueOf(inputJumlahBeli);
//        Double jumlahBayar = hargaBuah * jumlahBeli;
//        return jumlahBayar;
//    }

    public  int diskon(int harga, int jumlah){ 
        int discount = 0; 
        int total = harga * jumlah; 
        
        if(total>=25000){
            discount= total*25/100;
           // total = total - discount;

        }
        
        else if((total>=16000 ) && (total< 25000)){
            discount=total*10/100;
            //total=total-discount;

        }
        else if (total<16000){
            discount=total*0/100;
            //total=total-discount;
           
             
        }
        return discount; 
        
    }
}
