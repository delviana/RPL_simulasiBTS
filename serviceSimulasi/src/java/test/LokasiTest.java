/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.google.gson.Gson;
import helper.lokasiKampungHelper;
import java.util.List;
import pojos.LokasiDesa;

/**
 *
 * @author Gandhi Nugroho
 */
public class LokasiTest {
   public static void main(String[] args) {
         lokasiKampungHelper test = new lokasiKampungHelper();      
        List<LokasiDesa> list = test.bacaSemuaLokasi();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        System.out.println(json);
    } 
}
