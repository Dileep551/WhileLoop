public class EvenorOdd {
    public static void main(String[] args) {

        int countEven = 0;
        int countOdd = 0;
        int number = 4;
        int finishNumber = 20;
        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                countOdd++;
                continue;
            }
            countEven++;
            System.out.println("Even Number " + number);
            if(countEven >= 5)
                break;
        }

        System.out.println("Total Even Numbers "+ countEven);
        System.out.println("Total odd Numbers "+ countOdd);


    }
    public static boolean isEvenNumber(int number){

        return number % 2 == 0;
    }



}