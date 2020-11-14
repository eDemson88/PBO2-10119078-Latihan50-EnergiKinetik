/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan50.energikinetik;

/**
 *
 * @author ryzen
 */
public class Energi {
    private double massa,kecepatan;
    
    public double getMassa(){
        return massa;
    }
    
    public void setMassa(double massa){
        this.massa=massa;
    }
    
    public double getKecepatan(){
        return kecepatan;
    }
    
    public void setKecepatan(double kecepatan){
        this.kecepatan=kecepatan;
    }
    
    public double energiKinetik(double massa, double kecepatan){
        double eKinetik;
        
        eKinetik = ((massa / 2)/1000) * (Math.pow(kecepatan, 2));
        System.out.println("Energi Kinetiknya: " + eKinetik + " Joule");
        return eKinetik;
    }
    
    public double usaha(double massa, double kecepatan){
        double usaha;
        
        usaha = (((massa / 2)/1000) * (Math.pow(kecepatan, 2))) - (((massa/2)/1000) * 0 * 0);
        System.out.println("Usaha yang dilakukan: " + usaha + "Joule");
        return usaha;
    }
}
