/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camilan.ti.cemilan.java;


import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *
 * @author Aqyla-PC
 */

@Controller
public class tabelController {
//    public String kasirrr (Double BAYAR, Double hargaAkhir){
//        Double kembalian = hargaAkhir - BAYAR ;
//        String Bayar = "Kembalian Anda : Rp." +kembalian;
//        
//        return Bayar;
//    }
    @RequestMapping("/belanja")    
    @ResponseBody 
    public String getHasil(HttpServletRequest data ){
        
        cek bl = new cek();
        String namasayur = data.getParameter("namaSayur"); 
        int hargaperkilo = Integer.parseInt(data.getParameter("harga")); 
        int jumlahbeli = Integer.parseInt(data.getParameter("jumlah")); 
        int bayarr = Integer.parseInt(data.getParameter("bayar")); 
        
        
        //namasayur =   "Nama Sayur         : " + namasayur;
          int diskonn = bl.diskon(hargaperkilo, jumlahbeli);
        //ck.addAttribute("Nama Sayur",namasayur);
        
         
        return
                "Nama Sayur        : " + namasayur +"<br>"  + 
                "Harga             : " + String.valueOf(hargaperkilo) +"<br>" + 
                "Jumlah            : " + String.valueOf(jumlahbeli) +"<br>" + 
                "Discount          : " + String.valueOf(diskonn)+"<br>" + 
                "Total Bayar       : " + String.valueOf(bayarr-diskonn)+"<br>" + 
                "uang pembeli      : " + String.valueOf(bayarr) +"<br>" + 
                "Kembalian         : " + String.valueOf(bayarr-(bayarr-diskonn)) ; 
    } 
}

    
    
//    public String HASIL (HttpServietRequest data, Model cek){
//        
//        
//        String namasayur = data.getParameter("var_nama");
//        Double harga = Double.valueof(data.getParameter("var_harga"));
//        Double Jumlah =  Double.valueof(data.getParameter("var_jumlah"));
//        
//        cek beli = new cek();
//        cek.addAttribute("nama",namasayur);
//        cek.addAttribute("harga",harga);
//        cek.addAttribute("jumlah",Jumlah);
//        cek.addAttribute("hargaawal",beli.total(harga, Jumlah) + "%");
//        cek.addAttribute("hitungdiskon",beli.diskon(beli.totaldiscount(harga, Jumlah)) + "%");
//        cek.addAttribute("diskon",beli.diskonn(harga, Jumlah));
//        cek.addAttribute("hargaakhir",beli.hargaakhir(harga, Jumlah));
//        
//        
//        
//        return "table";
//     
//    }
//
//}
//
