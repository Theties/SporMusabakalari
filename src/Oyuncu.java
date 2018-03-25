/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Theties
 */
class Oyuncu {
    private String Adı,Soyadi;
    private int Numara;
    private String TakımAdı;

    public Oyuncu() {
    }

    public Oyuncu(String Adı, String Soyadi, int Numara) //,String TakımAdı) 
    {
        this.Adı = Adı;
        this.Soyadi = Soyadi;
        this.Numara = Numara;
        //this.TakımAdı = TakımAdı;
    }

    public int getNumara() {
        return Numara;
    }

    public void setNumara(int Numara) {
        this.Numara = Numara;
    }
    



    public String getAdı() {
        return Adı;
    }

    public void setAdı(String Adı) {
        this.Adı = Adı;
    }

    public String getSoyadi() {
        return Soyadi;
    }

    public void setSoyadi(String Soyadi) {
        this.Soyadi = Soyadi;
    }
}
