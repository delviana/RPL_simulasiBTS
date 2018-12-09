/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.google.gson.Gson;
import helper.jaringanEksHelper;
import java.util.List;
import pojos.JaringanEks;


/**
 *
 * @author Gandhi Nugroho
 */
public class TestJaringanEks {
      public static void main(String[] args) {
         jaringanEksHelper test = new jaringanEksHelper();      
        List<JaringanEks> list = test.bacaSemuaDataJaringanEks();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        System.out.println(json);
    } 
}

