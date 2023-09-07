'''
program to print the sum of all elements of an array with integer elements
'''

package assg1;

public class Q1 {
    public static void main(String[] args) {
        int[] numbers = {15,25,41,23,17};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of elements: " + sum);
    }
}