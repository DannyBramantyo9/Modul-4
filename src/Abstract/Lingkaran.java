/* template in the editor.
 */
package Abstract;

/**
 *
 * @author SMK TELKOM
 */
public class Lingkaran extends bangunDatar{
    private double r;
    
    public Lingkaran(double r){
        this.r=r;
    }
    public double hitungKeliling(){
        return 2 * 3.14 * r;
    }
    public double hitungLuas(){
        return 3.14*r*r;
    }
}
