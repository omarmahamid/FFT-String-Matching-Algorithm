package org.string.matching;

public class Main{
    public static void main(String[] args) {

        String text = "abraabracadabracadabraabara";
        String pattern = "abracadabra";

        int naiveApproachMisMatch = StringMatch
                .naiveApproach(text, pattern);


        int fftApproachMisMatch = StringMatch
                .numberOfMismatchFFT(text, pattern);

        System.out.println(naiveApproachMisMatch);

        System.out.println(fftApproachMisMatch);
    }
}