package org.string.matching;

public class Character{

    private int[] P;
    private int[] T;

    public Character(String text, String pattern){
        P = new int[pattern.length()];
        T = new int[text.length()];
    }

    public void addToPattern(int bit, int index){
        P[index] = bit;
    }

    public void addToText(int bit, int index){
        T[index] = bit;
    }


    public int correlation() {

        int correlation = 0;

        Complex[] x = new Complex[T.length];
        Complex[] y = new Complex[P.length];

        for (int i=0;i<x.length;i++){
            x[i] = new Complex(T[i], 0);
        }
        for (int i=0;i<x.length;i++){
            x[i] = new Complex(T[i], 0);
        }

        Complex[] result = FFT.cconvolve(x, y);

        for (int i=0;i<result.length;i++){
            correlation += (int)result[i].re();
        }

        return correlation;
    }
}
