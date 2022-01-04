package ti.umy.praktikum.suhu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
    @ResponseBody
public class sistemController {
    @RequestMapping ("/CkeF")

    public String getCtoF(){
        int c = 100;
        int r = 32;
        int hasil = (c * 9/5) + r;
        return "KONVERSI C : F = " + hasil;
    }
     @RequestMapping ("/FkeC")
public String getFtoC(){
        int f = 100;
        int r = 32;
        int hasil = (f - r) * 5/9;
        return "KONVERSI F : C = " + hasil;
    }
@RequestMapping ("/CkeR")
public String getCkeR(){
        int c = 100;

        int hasil = c * 4/5;
        return "KONVERSI C : R = " + hasil;
    }
  @RequestMapping ("/RkeC")
public String getRkeC(){
        int r = 100;

        int hasil = r * 5/4;
        return "KONVERSI R : C = " + hasil;
    }
}
