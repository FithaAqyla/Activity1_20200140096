package ti.umy.praktikum.berat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class konversiController {
    @RequestMapping("/KONVERSI")
    @ResponseBody
    public String getBerat(){
        String konversi = " ";
        
        double kilogram = 100;
        double hektogram = 100;
        double gram = 100;
        
        double berat;
        
        String pilih =  "hg";
        
        if(pilih=="kg"){
            berat = hektogram / 10;
            konversi = "kilogram : " + berat;
            
        }else if (pilih == "hg"){
            berat = kilogram * 10;
            konversi = "Hektogram : " + berat;
        }else{
            konversi = "tidak ditemukan";
        }
        return konversi;
    }
    
}
    

