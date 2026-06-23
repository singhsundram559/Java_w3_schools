public class CalculateSum {
    public static void main(String[] args) {
        int[] numbers = {1,5,10,25};
        int sum = 0;

        for(int i = 0; i<numbers.length; i++)
            sum += numbers[i];  // Array ke her element me add hoga ye 
        System.out.println("THe sum number of the array: " + sum);
    }
}
