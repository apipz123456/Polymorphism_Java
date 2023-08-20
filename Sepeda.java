/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism.sepeda;

/**
 *
 * @author Apipz
 */
public class Sepeda {
    public String merksepeda;
    public String merkrantai;
    public int jumlahroda;
    public String merkroda;
    public String jenisrem;
    public String merkrem;
    
    public Sepeda(String merksepeda, String merkrantai,int jumlahroda,String merkroda,String jenisrem,String merkrem){
        this.merkrem = merksepeda;
        this.merkrantai = merkrantai;
        this.jumlahroda = jumlahroda;
        this.merkroda = merkroda;
        this.jenisrem = jenisrem;
        this.merkrem = merkrem;
    }
    
    
    public void berjalan(){
        System.out.println(merksepeda+"Sepeda ini berjalan");
    
    }
    
    public void mengerem(){
        System.out.println("tuas rem tangan di tarik"+ merksepeda+"berhenti");
    }
    
    public void berbelok(){
        System.out.println(merksepeda+"ini berbelok");
    }
}