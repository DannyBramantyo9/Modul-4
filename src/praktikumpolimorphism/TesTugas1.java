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
public class TesTugas1 {
    public static void main(String[] args) {
        ReratNilai rn = new ReratNilai();
        System.out.println("Rata-rata nilai 21 dan 31 adalah = "+rn.average(21, 31));
        System.out.println("Rata-rata nilai 13,5 dan 14,7 adalah = "+rn.average(13.5, 14.7));
        System.out.println("Rata-rata nilai 132,175 dan 128 adalah = "+rn.average(132,175,128));
    }
}
