/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.LokasiDesa;
import util.NewHibernateUtil;

/**
 *
 * @author Acer
 */
public class lokasiKampungHelper {

    public lokasiKampungHelper() {
    }
 
     

  public void addNewLokasiKampung(
     long idDesa,
     Double lat,
     Double log,
     Double jumPenduduk
         
          
  ){
         Session session = NewHibernateUtil.getSessionFactory().openSession();
           Transaction tx = session.beginTransaction();
           LokasiDesa lokasi=new LokasiDesa(idDesa, lat, log, jumPenduduk);
           session.saveOrUpdate(lokasi);
           tx.commit();
           session.close();
  }
  public List<LokasiDesa> bacaSemuaLokasi() {
        List<LokasiDesa> list = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from LokasiDesa");
        list = q.list();
        tx.commit();
        session.close();
        return list;

        
    }
  public void updateDataDarah(){
      
  }   
}
