package woowa.baseball.util;

public class RandomNumberGenerator {

    public int generate() {
        int num = 0;
        String numStr = "";

        for(int i = 0; i < 3; i++) {
            num = pickNumber();
            if(numStr.contains(String.valueOf(num))) {
                i--;
                continue;
            }
            numStr += String.valueOf(num);
        }

        return Integer.parseInt(numStr);
    }

    private int pickNumber() {
        return (int) (Math.random() * 9) + 1;
    }
}
