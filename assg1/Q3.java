'''
program to convert integers (single digit) in an array to its word format and print.
'''

package assg1;

public class Q3 {
    enum DigitWord {
        zero, one, two, three, four, five, six, seven, eight, nine
    }

    public static void main(String[] args) {
        int[] array = { 2, 5, 6, 1, 9, 8 };

        for (int num : array) {
            switch (num) {
                case 0:
                    System.out.println(DigitWord.zero);
                    break;
                case 1:
                    System.out.println(DigitWord.one);
                    break;
                case 2:
                    System.out.println(DigitWord.two);
                    break;
                case 3:
                    System.out.println(DigitWord.three);
                    break;
                case 4:
                    System.out.println(DigitWord.four);
                    break;
                case 5:
                    System.out.println(DigitWord.five);
                    break;
                case 6:
                    System.out.println(DigitWord.six);
                    break;
                case 7:
                    System.out.println(DigitWord.seven);
                    break;
                case 8:
                    System.out.println(DigitWord.eight);
                    break;
                case 9:
                    System.out.println(DigitWord.nine);
                    break;
                default:
                    System.out.println("Invalid digit: " + num);
            }
        }
    }
}
