package Homework;

public class CountChars {
    public static void main(String[] args) {
        System.out.println(countChars("Title is the debut major-label studio album by American singer-songwriter Meghan Trainor (pictured), released on January 9, 2015. Initially a songwriter for other artists in 2013, Trainor signed with Epic Records the following year and began recording material she co-wrote with Kevin Kadish. They drew influence from retro-styled music as they were tired of chasing radio trends. Title includes \"All About That Bass\", which reached number one in 58 countries, and two other US Billboard Hot 100 top-10 singles: \"Lips Are Movin\" and \"Like I'm Gonna Lose You\".",
                'i'));
    }

    public static int countChars(String inputString, char inputChar) {
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == inputChar) {
                count++;
            }
        }
        return count;
    }
}
