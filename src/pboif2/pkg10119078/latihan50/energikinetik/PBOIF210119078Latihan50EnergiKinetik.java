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
public class PBOIF210119078Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Energi energy = new Energi();
        
        energy.setMassa(145);
        energy.setKecepatan(25);
        
        System.out.println("Massa bola: " + energy.getMassa());
        System.out.println("Kecepatan: " + energy.getKecepatan());
        energy.energiKinetik(energy.getMassa(), energy.getKecepatan());
        energy.usaha(energy.getMassa(), energy.getKecepatan());
    }
    
}
