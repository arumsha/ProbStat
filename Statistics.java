/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisdatalanjut;

import java.text.DecimalFormat;

/**
 *
 * @author yuitaarumsari
 */
public class Statistics {
    double max = 0;
    double min = 9999;
    
    // menemukan nilai maksimum dari array
    public double findMax(double[] input){
        for (int i = 0; i < input.length; i++) {
            if(input[i] > max){
                max = input[i];
            }
        }
        return max;
    }
    
    // menemukan nilai minimum dari array
    public double findMin(double[] input){
        for (int i = 0; i < input.length; i++) {
            if(input[i] < min){
                min = input[i];
            }
        }
        return min;
    }
    
    // mencari nilai range dari array
    public double range(double[] input){
        double range_ = 0;
        range_ = findMax(input)-findMin(input); 
        return range_;
    }
    
    // mencari nilai mean dari array
    public double mean(double[] input){
        double mean_ =0;
        double jumlah = 0;
        for (int i = 0; i < input.length; i++) {
            jumlah += input[i];
        } 
        mean_ = jumlah / input.length;
        // menuliskan 2 digit di belakang koma
        mean_ =Double.parseDouble(new DecimalFormat("##.##").format(mean_));
        return mean_;
    }
    
    // mencari nilai variance dari array
    public double variance(double[] input){
        // menjumlahkan nilai abs(xi - mean)
        double sigma = 0;
        for (int i = 0; i < input.length; i++) {
            sigma += Math.abs(input[i]-mean(input));
        }        
        // menghitung variance
        double variance_ =0;
        variance_ = sigma /(input.length-1);
        // menuliskan 2 digit di belakang koma
        variance_ =Double.parseDouble(new DecimalFormat("##.##").format(variance_));
        return variance_; 
    }
}
