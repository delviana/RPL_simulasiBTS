/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulasi_bts;

/**
 *
 * @author Hp
 */
public class Lokasi {

    double lokasiKampung;
    double luasKampung;

    public Lokasi(double lokasiKampung, double luasKampung) {
        this.lokasiKampung = lokasiKampung;
        this.luasKampung = luasKampung;
    }

    public double getLokasiKampung() {
        return lokasiKampung;
    }

    public void setLokasiKampung(double lokasiKampung) {
        this.lokasiKampung = lokasiKampung;
    }

    public double getLuasKampung() {
        return luasKampung;
    }

    public void setLuasKampung(double luasKampung) {
        this.luasKampung = luasKampung;
    }

}
