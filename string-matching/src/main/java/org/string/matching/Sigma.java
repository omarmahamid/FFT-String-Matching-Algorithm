package org.string.matching;

public class Sigma{

    Character[] characters;
    String text;
    String pattern;

    public Sigma(String text, String pattern) {
        characters = new Character[26];
        for (int i = 0; i < characters.length; i++) {
            characters[i] = new Character(text, pattern);
        }
        this.text = text;
        this.pattern = pattern;
    }

    public void initializeChars() {
        for (int i = 0; i < characters.length; i++) {
            for (int j = 0; j< pattern.length();j++){
                if (pattern.charAt(j) - i == 'a') {
                    characters[i].addToPattern(1, j);
                }
            }
        }
    }

    public int correlation() {

        int correlation = 0;
        for (Character character : characters){
            correlation += character.correlation();
        }

        return correlation;
    }
}
