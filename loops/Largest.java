public class Largest {
    public static void main(String[] args) {
        int[] arr = { 12, 34, 56, 78, 90, 23, 45 };
        int largest = arr[0]; // Assume the first element is the largest

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i]; // Update largest if current element is greater
            }
        }

        System.out.println("The largest number in the array is: " + largest);
    }
}
