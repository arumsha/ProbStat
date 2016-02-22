/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisdatalanjut;

/**
 *
 * @author yuitaarumsari
 */
public class AnalisisDataLanjut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Statistics st = new Statistics(); 
        double[] tokoAbabil = new double[]{100,150,50,200,130,120,90,145,110};
        System.out.println("====== TOKO ABABIL ======");
        System.out.println("Nilai Maksimum = "+st.findMax(tokoAbabil));
        System.out.println("Nilai Minimum = "+st.findMin(tokoAbabil));
        System.out.println("Nilai range = " +st.range(tokoAbabil));
        System.out.println("Mean = "+st.mean(tokoAbabil));
        System.out.println("Variansi = "+st.variance(tokoAbabil));
        
        Statistics st2 = new Statistics(); 
        double[] tokoBaper = new double[]{100,150,150,100,120,125,140,145,130,150,149,110};
        System.out.println("====== TOKO BAPER ======");
        System.out.println("Nilai Maksimum = "+st2.findMax(tokoBaper));
        System.out.println("Nilai Minimum = "+st2.findMin(tokoBaper));
        System.out.println("Nilai range = " +st2.range(tokoBaper));
        System.out.println("Mean = "+st2.mean(tokoBaper));
        System.out.println("Variansi = "+st2.variance(tokoBaper));
    }
}

/**
 * OUTPUT
 * 
 * ===== TOKO ABABIL ======
Nilai Maksimum = 200.0
Nilai Minimum = 50.0
Nilai range = 150.0
Mean = 121.67
Variansi = 34.58
====== TOKO BAPER ======
Nilai Maksimum = 150.0
Nilai Minimum = 100.0
Nilai range = 50.0
Mean = 130.75
Variansi = 18.09
 */
