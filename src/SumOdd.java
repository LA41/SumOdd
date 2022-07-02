public class SumOdd {
    public static void main(String[] args) {
        //check when end is less than start
        System.out.println(sumOdd(2, 1));
        //check when value is negative
        System.out.println(sumOdd(2, -1));
        //check when start and end are equal
        System.out.println(sumOdd(3, 3));
        //check when start is less than end
        System.out.println(sumOdd(1, 5));
    }
    public static boolean isOdd(int number) {
        return (number > 0 && number % 2 != 0);
    }
    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start <= end && start > 0 && end > 0) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        } else
            return -1;
    }
}
