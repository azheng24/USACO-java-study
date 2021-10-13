// Link: https://open.kattis.com/problems/basketballoneonone
// Description: Determines the winner of a basketball game
// Created: Oct 4 2021

public class Basketball {
    public static void main(String[] args) {
        // Take input
        String input = "A2B1A2B2A1A2A2A2B2B2B2B2B2";
        int a_points = 0, b_points = 0;
        for (int i = 0; i < input.length()/2; i++) {
            if (input.charAt(i*2) == 'A') {
                if (input.charAt(i*2+1) == 1) {
                    a_points++;
                }
                else {
                    a_points += 2;
                }
            } else {
                if (input.charAt(i*2+1) == 1) {
                    b_points++;
                } else {
                    b_points += 2;
                }
            }
        }
        if (a_points > (b_points + 1)) {
            System.out.println("A");
        } else if (b_points > (a_points + 1)) {
            System.out.println("B");
        } else {
            System.out.println("tie");
        }

    }

}