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
    public String HASIL (HttpServietRequest data, Model cek){
        String namasayur = data.getParameter("var_nama");
        Double harga = Double.valueof(data.getParameter("var_harga"));
        Double Jumlah =  Double.valueof(data.getParameter("var_jumlah"));
        
        cek beli = new cek();
        cek.addAttribute("nama",namasayur);
        cek.addAttribute("harga",harga);
        cek.addAttribute("jumlah",Jumlah);
        cek.addAttribute("hargaawal",beli.total(harga, Jumlah) + "%");
        cek.addAttribute("hitungdiskon",beli.diskon(beli.totaldiscount(harga, Jumlah)) + "%");
        cek.addAttribute("diskon",beli.diskonn(harga, Jumlah));
        cek.addAttribute("hargaakhir",beli.hargaakhir(harga, Jumlah));
        
        
        
        return "table";
     
    }

}

