package pojos;
// Generated Nov 28, 2018 5:37:22 PM by Hibernate Tools 4.3.1



/**
 * DaftarLokasi generated by hbm2java
 */
public class DaftarLokasi  implements java.io.Serializable {


     private String idLokasi;
     private String namaLokasi;
     private String luasLokasi;

    public DaftarLokasi() {
    }

	
    public DaftarLokasi(String idLokasi) {
        this.idLokasi = idLokasi;
    }
    public DaftarLokasi(String idLokasi, String namaLokasi, String luasLokasi) {
       this.idLokasi = idLokasi;
       this.namaLokasi = namaLokasi;
       this.luasLokasi = luasLokasi;
    }
   
    public String getIdLokasi() {
        return this.idLokasi;
    }
    
    public void setIdLokasi(String idLokasi) {
        this.idLokasi = idLokasi;
    }
    public String getNamaLokasi() {
        return this.namaLokasi;
    }
    
    public void setNamaLokasi(String namaLokasi) {
        this.namaLokasi = namaLokasi;
    }
    public String getLuasLokasi() {
        return this.luasLokasi;
    }
    
    public void setLuasLokasi(String luasLokasi) {
        this.luasLokasi = luasLokasi;
    }




}

