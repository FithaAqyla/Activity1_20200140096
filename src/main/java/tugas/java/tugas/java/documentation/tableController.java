/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.java.tugas.java.documentation;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author Aqyla-PC
 */
@Controller
public class tableController {    
    @RequestMapping("/viewktp")
    public String getTampilan(Model data){

       ArrayList<List<String>> tabel = new ArrayList<>();
       
       tabel.add(Arrays.asList("0001","810000000","Lee Min Ho", "Yogyakarta"));
       tabel.add(Arrays.asList("0002","820000000","Dhiasti Jayanti", "Aceh"));
       tabel.add(Arrays.asList("0003","830000000","Fitha Aqyla", "Bali"));
       tabel.add(Arrays.asList("0004","840000000","Ji Chang Wook", "Banten"));
       tabel.add(Arrays.asList("0005","850000000","Hyun Bin", "Bandung"));
       tabel.add(Arrays.asList("0006","860000000","Gong Yoo", "Bekasi"));
       tabel.add(Arrays.asList("0007","870000000","Lee Jong Suk", "Magelang"));
       tabel.add(Arrays.asList("0008","880000000","Song Hye Kyo", "Semarang"));
       tabel.add(Arrays.asList("0009","890000000","Cha Eun Woo", "Surabaya"));
       tabel.add(Arrays.asList("00010","810000000","Kim Seon Ho", "Jakarta"));
       tabel.add(Arrays.asList("00011","811000000","Kim Soo Hyun", "Makassar"));
       tabel.add(Arrays.asList("00012","812000000","Song Joong Ki", "Kalimantan"));
       tabel.add(Arrays.asList("00013","813000000","Azzren Agustina", "Bengkulu"));
       tabel.add(Arrays.asList("00014","814000000","Zetira Barges", "Riau"));
       tabel.add(Arrays.asList("00015","815000000","Siti Amiya", "Lampung"));
       tabel.add(Arrays.asList("00016","816000000","Rika Liem", "Jambi"));
       tabel.add(Arrays.asList("00017","817000000","Fadila Binthallib", "Medan"));
       tabel.add(Arrays.asList("00018","818000000","Ningsi Lebang", "Padang"));
       tabel.add(Arrays.asList("00019","819000000","Dwi Handa", "Palembang"));
       tabel.add(Arrays.asList("00020","820000000","Dion Mulya", "Batam"));
               
              
       data.addAttribute("ktp", tabel);
       
        return "dataKTP";
    }
}
