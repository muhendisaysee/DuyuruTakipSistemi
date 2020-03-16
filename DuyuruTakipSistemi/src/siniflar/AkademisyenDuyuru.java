package siniflar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hp
 */
public class AkademisyenDuyuru extends TumDuyurular {

    private String fakulte;
    private String bolum;

    public AkademisyenDuyuru(String yayinlanmaTarihi, String gecerlilikTarihi, String duyuran, String duyuru, String duyuruOnem, String duyuruIsmi) {
        super(yayinlanmaTarihi, gecerlilikTarihi, duyuran, duyuru, duyuruOnem, duyuruIsmi);
    }

    
    public AkademisyenDuyuru(String fakulte, String bolum, String yayinlanmaTarihi, String gecerlilikTarihi, String duyuran, String duyuru, String duyuruOnem, String duyuruIsmi) {
        super(yayinlanmaTarihi, gecerlilikTarihi, duyuran, duyuru, duyuruOnem, duyuruIsmi);
        this.fakulte = fakulte;
        this.bolum = bolum;
    }


    public String getFakulte() {
        return fakulte;
    }

    public void setFakulte(String fakulte) {
        this.fakulte = fakulte;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

}
