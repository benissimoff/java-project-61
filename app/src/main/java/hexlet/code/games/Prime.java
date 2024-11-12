package hexlet.code.games;

import java.util.Random;

public class Prime implements Game {
    private final String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private String question;
    private String answer;

    public String getRules() {
        return rules;
    }

    public void generate() {
        int[] primes = {
                2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
                73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151,
                157, 163, 167, 173, 179, 181, 191, 193, 197, 199
        };
        int primesLength = primes.length;
        Random generator = new Random();
        int randomNumber = generator.nextInt(200);
        question = "" + randomNumber;

        int foundIndex = binarySearch(primes, randomNumber);
        answer = foundIndex >= 0 ? "yes" : "no";
    }

    private int binarySearch(int[] data, int element) {
        int foundIndex = -1;
        int dataLength = data.length;
        if (dataLength < 1) {
            return -1;
        }
        int index = dataLength / 2;
        int low = 0;
        int high = dataLength - 1;
        while (low <= high ) {
            if (data[index] == element) {
                foundIndex = index;
                break;
            } else if (high < index || low > index) {
                break;
            } else if (element > data[index]) {
                low = index + 1;
                index = (low + high) / 2;
            } else {
                high = index - 1;
                index = (low + high) / 2;
            }
        }

        return foundIndex;
    }
    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
