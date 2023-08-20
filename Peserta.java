/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

import polymorphism.sepeda.Sepeda;

/**
 *
 * @author Apipz
 */
public class Peserta {
    private String namapeserta;
    private Sepeda sepedapeserta;

    public Peserta(String namapeserta, Sepeda sepedapeserta) {
        this.namapeserta = namapeserta;
        this.sepedapeserta = sepedapeserta;
    }

    public String getNamapeserta() {
        return namapeserta;
    }

    public void setNamapeserta(String namapeserta) {
        this.namapeserta = namapeserta;
    }

    public Sepeda getSepedapeserta() {
        return sepedapeserta;
    }

    public void setSepedapeserta(Sepeda sepedapeserta) {
        this.sepedapeserta = sepedapeserta;
    }
    
}
