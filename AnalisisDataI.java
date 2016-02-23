/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisData1;

import analisisdatalanjut.Statistics;
import java.text.DecimalFormat;

/**
 *
 * @author yuitaarumsari
 */
public class AnalisisDataI {

    Statistics st = new Statistics();
    double[] ba, bb;
    double[] fi;
    double[] xi;
    int k_;

    // 1.mengubah data tunggal menjadi data berkelompok
    public void dataTunggalToKelompok(double[] input) {
        // mencari jangkauan
        double j = st.findMax(input) - st.findMin(input);
        System.out.println("Nilai minimum = " + st.findMin(input));
        System.out.println("Nilai maximum = " + st.findMax(input));
        System.out.println("Range = " + j);
        // mencari banyak kelas dg kaidah empiris Sturgess
        double log_ = 3.3 * (Math.log(input.length) / Math.log(10));
        double k = 1 + log_;
        k_ = (int) Math.round(k);
        System.out.println("Banyak kelas = " + k_);
        // mencari panjang kelas dengan rumus
        int c = (int) Math.round(j / k_);
        System.out.println("Panjang kelas = " + c);
        // menentukan frekuensi tiap kelas
        // batas atas 
        bb = new double[k_];
        bb[0] = st.findMin(input);
        for (int i = 1; i < k_; i++) {
            bb[i] = bb[i - 1] + c;
        }
        // batas bawah 
        ba = new double[c];
        for (int i = 0; i < bb.length; i++) {
            ba[i] = bb[i] + c - 1;
        }
        System.out.println("-----Data berkelompok----");
        for (int i = 0; i < bb.length; i++) {
            System.out.println(bb[i] + " - " + ba[i]);
        }
    }

    // 1b. Mean data tunggal dan mean data kelompok
    // mean data kelompok
    public double[] getNilaiTengah() {
        xi = new double[k_];
        for (int i = 0; i < xi.length; i++) {
            xi[i] = (ba[i] + bb[i]) / 2;
        }
        return xi;
    }

    // menghitung frekuensi relatif dari masing-masing kelas kelompok
    public double[] getFrekuensiRelatif(double[] input) {
        fi = new double[k_];
        for (int j = 0; j < fi.length; j++) {
            int count = 0;
            for (int i = 0; i < input.length; i++) {
                if (input[i] >= bb[j] && input[i] <= ba[j]) {
                    count++;
                }
                fi[j] = count;
            }
        }
        return fi;
    }

    // menghitung mean tiap kelompok
    public double getMeanDataKelompok() {
        double meanKelompok = 0;
        double sigma_fi_xi =0;
        double sigma_fi = 0;
        for (int i = 0; i < fi.length; i++) {
            double a = (fi[i]*getNilaiTengah()[i]);
            sigma_fi_xi +=a;
            sigma_fi_xi++;
            sigma_fi +=fi[i];
            sigma_fi++;
        }
        return meanKelompok = Double.parseDouble(
                new DecimalFormat("##.####").format((sigma_fi_xi-k_)/(sigma_fi-k_)));
    }
}
