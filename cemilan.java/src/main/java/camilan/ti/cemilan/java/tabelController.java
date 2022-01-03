/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camilan.ti.cemilan.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *
 * @author Aqyla-PC
 */
@Controller
public class tabelController {
    @RequestMapping("/cek")
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

}

