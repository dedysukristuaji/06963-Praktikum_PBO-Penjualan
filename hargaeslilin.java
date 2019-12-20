
package hargaeslilin;

import eslilin.Tanggalbeli;

public class hargaeslilin extends Tanggalbeli{
    String nama;
    int Total = 0;
    private int jambuBiji = 2000 ;
    private int alpukat = 2000 ;
    private int mangga = 2000;
    private int buahNaga = 2000;
    private int susuVanila = 2000;
    private int susuCoklat = 2000;
    private int jeruk = 2000;

    public hargaeslilin(String nama,int Total,int jambuBiji, int alpukat, int mangga,
            int buahNaga, int susuVanila, int susuCoklat, int jeruk){
        this.jambuBiji = jambuBiji;
        this.alpukat = alpukat;
        this.mangga = mangga;
        this.buahNaga = buahNaga;
        this.susuVanila = susuVanila;
        this.susuCoklat = susuCoklat;
        this.jeruk = jeruk;
    }

    public hargaeslilin() {
        
    }
    
    public int gettot(){
        return Total;
    }
    
    public int getJambuBiji(){
        return jambuBiji;
    }
    
    public int getAlpukat(){
        return alpukat;
    }
    
    public int getMangga(){
        return mangga;
    }
    
    public int getBuahNaga(){
        return buahNaga;
    }
    
    public int getSusuVanila(){
        return susuVanila;
    }
    
    public int getSusuCoklat(){
        return susuCoklat;
    }   
    
    public int getJeruk(){
        return jeruk;
    }    
}
