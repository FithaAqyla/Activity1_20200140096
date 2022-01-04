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

   
    public String Namasayur (String namasayur){
       return "Nama Sayur : "+ namasayur;
    }
    public String gethargaperkilo (Double hargaperkilo){
       return "Masukan Harga barang disini : " + hargaperkilo;
    }
    public String getBelisayur( Double jumlah,Double hargaperkilo,Double discount){
        
        Double total = jumlah * hargaperkilo;
       
        
        if(total>=25000){
            discount= total*25/100;
            total = total - discount;

        }
        
        else if((total>=16000 ) && (total< 25000)){
            discount=total*10/100;
            total=total-discount;

        }
        else if (total<16000){
            discount=total*0/100;
            total=total-discount;
           
             
        }
        return "jadi totalnya : " + total; 
        
    }
    
    public String kasir (Double BAYAR, Double hargaAkhir){
        Double kembalian = hargaAkhir - BAYAR ;
        Double selisih = BAYAR - hargaAkhir;
        if(BAYAR >= hargaAkhir){
            return "Kembalian Anda : Rp."+kembalian;
        }else{
            return "Uang Anda Kurang Rp."+selisih;
        }
    }

    String getParameter(String var_nama) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
