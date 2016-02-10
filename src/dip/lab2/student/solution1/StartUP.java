/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author Dell
 */
public class StartUP {
    public static void main(String[] args) {
        TipCalculator calc = new BaggageServiceTipCalculator(ServiceQuality.GOOD, 100);
        TipService mgr = new TipService(calc);
        double amt = mgr.getTip();
        System.out.println(amt);
    }
    
}
