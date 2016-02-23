/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisData1;

import analisisdatalanjut.Statistics;

/**
 *
 * @author yuitaarumsari
 */
public class MainAnalisisDataI {
    static double[] input_T = new double[]{65,83,88,81,82,60,75,100,93,81,38,90,92,85,
        76,88,78,74,70,48,80,63,76,49,84,79,80,70,68,92,61,83,89,81,82,72,83,
        87,81,82,81,91,56,65,63,74,89,73,90,97,48,90,92,85,76,74,88,61,90,97,
        75,83,67,60,74,51,71,72,82,70,95,72,85,67,88,80,63,76,49,84};
    
    static double[] input_U = new double[]{65,83,88,81,82,60,75,98,93,81,38,90,92,85,
        76,88,78,74,70,48,80,63,76,49,84,79,80,70,68,92,61,83,88,81,82,72,83,87,81,82,
        81,91,56,65,63,74,89,73,90,97,48,90,92,85,76,74,88,61,90,97,75,83,67,86,80,51,
        71,72,82,70,93,72,91,67,88,80,63,76,49,84
    };
    
    static AnalisisDataI ad1 = new AnalisisDataI();
    static Statistics st = new Statistics();
    public static void main(String[] args) {
        ad1.dataTunggalToKelompok(input_T);
        System.out.println("Mean Data Tunggal = "+st.mean(input_T));
        double[] fr = ad1.getFrekuensiRelatif(input_T);
        System.out.println("Data berkelompok dan frekuensinya");
        for (int i = 0; i < fr.length; i++) {
            System.out.println(ad1.bb[i]+" - "+ad1.ba[i]+" --> "+fr[i]);
        }
        System.out.println("Mean Data Berkelompok = "+ad1.getMeanDataKelompok());
        
    }
}

/**
 * OUTPUT
 * Nilai minimum = 38.0
Nilai maximum = 100.0
Range = 62.0
Banyak kelas = 7
Panjang kelas = 9
-----Data berkelompok----
38.0 - 46.0
47.0 - 55.0
56.0 - 64.0
65.0 - 73.0
74.0 - 82.0
83.0 - 91.0
92.0 - 100.0
Mean Data Tunggal = 76.66
Data berkelompok dan frekuensinya
38.0 - 46.0 --> 1.0
47.0 - 55.0 --> 5.0
56.0 - 64.0 --> 8.0
65.0 - 73.0 --> 13.0
74.0 - 82.0 --> 24.0
83.0 - 91.0 --> 21.0
92.0 - 100.0 --> 8.0
Mean Data Berkelompok = 76.7625
 */