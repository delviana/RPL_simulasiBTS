/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.JaringanEks;
import util.NewHibernateUtil;

/**
 *
 * @author Acer
 */
public class jaringanEksHelper {

    public jaringanEksHelper() {

    }

    public void addNewDataJaringanEksisting(
            String idjaringan,
            String lat,
            String long_,
            String powerSinyal
    ) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        JaringanEks datajaringanEks = new JaringanEks(idjaringan, lat, long_, powerSinyal);
        session.saveOrUpdate(datajaringanEks);
        tx.commit();
        session.close();
    }

    public List<JaringanEks> bacaSemuaDataJaringanEks() {
        List<JaringanEks> list = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from JaringanEks");
        list = q.list();
        tx.commit();
        session.close();
        return list;

    }

    public void updateDataDarah() {

    }
}
