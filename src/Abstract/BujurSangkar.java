/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author SMK TELKOM
 */
public class BujurSangkar extends bangunDatar{
    private double sisi;
    
    public BujurSangkar(double sisi){
        this.sisi=sisi;
    }
    public double hitungKeliling(){
        return 4 * sisi;
    }
    public double hitungLuas(){
        return sisi*sisi;
    }
}
