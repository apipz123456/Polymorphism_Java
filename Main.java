/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphism;

import polymorphism.sepeda.SepedaFixie;
import polymorphism.sepeda.SepedaGunung;

public class Main {

    public static void main(String[] args) {
        Peserta[] daftarpeserta = new Peserta[10];
        Peserta peserta1 = new Peserta("Fauzan", new SepedaGunung("Polygon","Rantaigon",2,"Roda","tuas","Polu"));
        Peserta peserta2 = new Peserta("Rudi", new SepedaFixie("wimcycle","shadow",2,"shadowban","tuas","wicicler"));
        
        daftarpeserta[0]= peserta1;
        daftarpeserta[1]= peserta2;
        
        for(int i =0; i< daftarpeserta.length; i++) {
            if (daftarpeserta[i] != null) {
                System.out.println(daftarpeserta[i].getNamapeserta());
                daftarpeserta[i].getSepedapeserta().mengerem();
            }
        }
                
        
    }
}
