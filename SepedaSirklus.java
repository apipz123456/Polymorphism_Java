/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism.sepeda;

/**
 *
 * @author Apipz
 */
public class SepedaSirklus extends Sepeda{
    
    public SepedaSirklus(String merksepeda, String merkrantai, int jumlahroda, String merkroda, String jenisrem, String merkrem) {
        super(merksepeda, merkrantai, jumlahroda, merkroda, jenisrem, merkrem);
    }
    
    @Override
    public void mengerem(){
        System.out.println("Pedal di putar beralawan arah,"+merksepeda+" berjalan mundur");
    
    }
    
}
