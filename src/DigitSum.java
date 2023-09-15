public class DigitSum {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(125124));
        System.out.println(sumDigits(9));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(1251234567));
    }

    public static int sumDigits(int number){
        if( number < 0 ) {
            return -1;
        }
        int sum = 0;
        while(number>9) {
            sum += (number % 10);
            number = number / 10;
        }
        sum += number;
        return sum;
    }
}
