// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String str = "((()())))";
        char[] a = str.toCharArray();
        boolean correct = true;
        int currentСapacity = 0;
        int maxCapacity = 0;
        for (char c : a) {
            if ( c !='(' & c !=')' ) {
                correct = false;
            }
            if ( c == '(') {
                currentСapacity++;
            }
            if ( c == ')') {
                currentСapacity--;
            }
            if (currentСapacity < 0) {
                correct = false;
            }
            maxCapacity = Math.max(currentСapacity,maxCapacity);
        }
        if (!correct || currentСapacity != 0) {
            System.out.println("Строка некорректа");
        } else {
            System.out.println("Строка корректна и максимум глубыны равняется = " + maxCapacity);
        }

    }
}