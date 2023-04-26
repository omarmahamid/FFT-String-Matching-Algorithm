package org.string.matching;


/**
 * Given a text of length n and pattern of length m, count the number of mismatches in each alignment of the pattern with the text.
 * */
public class StringMatch{

    private StringMatch(){
        throw new IllegalStateException("UTILITY CLASS");
    }

    public static int naiveApproach(String text, String pattern){
        int cnt = 0;
        for (int i=0;i<text.length();i++) {
            cnt += mismatch(text, pattern, i);
        }
        return cnt;
    }

    private static int mismatch(String text, String pattern, int index){
        int cnt = 0;
        for (int j = index; j < pattern.length(); j++){
            if (pattern.charAt(j) != text.charAt(j)){
                cnt++;
            }
        }
        return cnt;
    }

    public static int numberOfMismatchFFT(String text, String pattern){

        Sigma sigma = new Sigma(text, pattern);

        sigma.initializeChars();

        return sigma.correlation();
    }

}
