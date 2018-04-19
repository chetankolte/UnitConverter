package com.uc.chetan.unitconverter;
public class UnitConverter {
    public static double farenheit2celsius (double f){
        return(f-32)*5/9;
    }
    public static double  celsius2farenheit (double c){
        return 32+c*9/5;
    }
}