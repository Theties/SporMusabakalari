/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author Theties
 */
public class Takım extends Oyuncu{
    private String TakımAdı;
    private int OyuncuSayısı;
   
    ArrayList<Oyuncu> Oyuncular = new ArrayList<>();

    public Takım(String TakımAdı) {
        this.TakımAdı = TakımAdı;
    }

    public String getTakımAdı() {
        return TakımAdı;
    }

    public void setTakımAdı(String TakımAdı) {
        this.TakımAdı = TakımAdı;
    }

    public int getOyuncuSayısı() {
        return OyuncuSayısı;
    }

    public void setOyuncuSayısı(int OyuncuSayısı) {
        this.OyuncuSayısı = OyuncuSayısı;
    }



}
