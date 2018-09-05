/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumpolimorphism;

/**
 *
 * @author SMK TELKOM
 */
public class Kucing extends Hewan{
    //Override
    void setNama(){
        String Kucing = "Cerberus";
        System.out.println("Nama Kucing = "+Kucing);
    }
    void setSuara(){
        String suara = "Minta";
        System.out.println("Suara Kucing = "+suara);
    }
    void setBerat(){
        double berat = 2.0;
        System.out.println("Berat Kucing = "+berat);
    }
}
