/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author SMK TELKOM
 */
public class kalkulator implements Ioperasi
{
    private double bil1;
    private double bil2;
    
    
public kalkulator(double bil1, double bil2)
{
    this.bil1 = bil1;
    this.bil2 = bil2;
}

    public double getBil1(){
        return bil1;
    }
    
    public double getBil2(){
        return bil2;
    }
    
    
    
    
    public double penjumlahan() {
        
        return bil1+bil2;
        }

    
    public double pengurangan() {
        return bil1-bil2;
          }

   
    public double perkalian() {
        return bil1 * bil2;
        }

   
    public double pembagian() {
        return bil1 / bil2;
    }
    
}
