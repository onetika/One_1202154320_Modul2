package android.example.com.one_1202154320_modul2;

/**
 * Created by One Tika Suryati on 2/18/2018.
 */

public class list {
    private int foto, komposisi;
    private String jenis, nominal;
    public list(int foto, String jenis, String nominal, int komposisi) {
        this.foto = foto;
        this.jenis = jenis;
        this.nominal = nominal;
        this.komposisi = komposisi;
    }

    public String getNominal() {
        return nominal;
    }

    public String getJenis() {
        return jenis;
    }

    public int getFoto() {
        return foto;
    }
    public int getKomposisi() {
        return komposisi;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public void setNominal(String nominal) {
        this.nominal = nominal;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
