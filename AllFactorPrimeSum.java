//  Program 1 of SuperB's event on 22/08/2022 by VerifiedAndHacked

public class AllFactorPrimeSum {
    // Function to check if number passed as argument is prime
    public static boolean isPrime(int num){
        int i,counter = 0;
        for(i=2;i<=Math.sqrt(num);i++){
            if(num % i == 0)
                counter++;
        }
        return counter == 0;
    }
    /** The function on which the program logic is based on
    this retyrn true if all instances of d+n/d are prime else returns false */
    public static boolean numChecker(int num){
        int i;
        boolean checker = true;
        for(i=1;i<=num;i++) {
            if (num % i == 0) {
                if(isPrime(i+(num/i))){
                    continue;
                }
                else {
                    checker = false;
                }
            }
        }
        return checker;
    }
    /**Main function to print the numbers and their sum at the end
    Precaution don't run any application in the background while this executes cuz its slow as hell*/
    public static void main(String[] args) {
        int i;
        long sumOfNum = 0;
        System.out.println("The numbers are....");
        for(i=1;i<=100000000;i++){
            if(numChecker(i)) {
                sumOfNum += i;
                System.out.println(i);
            }
        }
        System.out.println("Sum of all the above numbers are => " + sumOfNum);
        System.out.println("Program has ended....");
    }
}
