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
public class Karnivora {
    public static void main(String[] args) {
        System.out.println("====HEWAN DEFAULT===");
        Hewan h = new Hewan();
        h.setBerat();
        h.setNama();
        h.setSuara();
        
        System.out.println("===HEWAN KUCING===");
        Kucing k = new Kucing();
        k.setBerat();
        k.setNama();
        k.setSuara();
        
        System.out.println("===HEWAN SINGA===");
        Singa s = new Singa();
        s.setBerat();
        s.setNama();
        s.setSuara();
    }
}
