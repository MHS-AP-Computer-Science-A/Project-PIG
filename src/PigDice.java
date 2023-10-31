public class PigDice {
    //Your code here







	
    // POST: returns a String formatted to display two dice visually side by side
    public String toString() {
        if (isValidDieNumber(first) && isValidDieNumber(second)) {
            // Define the ASCII art for each side of a die
            String[] dice = {
                    " -------\n|       |\n|   *   |\n|       |\n -------",
                    " -------\n|     * |\n|       |\n| *     |\n -------",
                    " -------\n| *     |\n|   *   |\n|     * |\n -------",
                    " -------\n| *   * |\n|       |\n| *   * |\n -------",
                    " -------\n| *   * |\n|   *   |\n| *   * |\n -------",
                    " -------\n| *   * |\n| *   * |\n| *   * |\n -------"
            };

            // Display the dice side by side
            String[] lines1 = dice[first - 1].split("\n");
            String[] lines2 = dice[second - 1].split("\n");

            String result = "";
            for (int i = 0; i < 5; i++) {
                if (i == 0 || i == 4) {
                    result += lines1[i] + "     " + lines2[i] + "\n";
                } else {
                    result += lines1[i] + "    " + lines2[i] + "\n";
                }
            }
            return result;
        } else {
            return "Invalid die numbers. Please use numbers between 1 and 6.";
        }
    }

    // POST: returns true if num is a valid dice value, false otherwise
    private boolean isValidDieNumber(int num) {
        return num >= 1 && num <= 6;
    }
}
