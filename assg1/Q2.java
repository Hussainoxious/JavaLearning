'''
a code that prints only even numbers from the given array
'''

package assg1;

public class Q2 {
    public static void main(String[] args) {
        int[] numbers = {19,23,44,28,10,31,34,61,32,42,54};
        System.out.println("Even numbers:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}