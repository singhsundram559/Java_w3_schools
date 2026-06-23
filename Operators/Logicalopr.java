public class Logicalopr {
    public static void main(String[] args) {
       int a = 233;
       int b = 476;
       int c = 235;
       
       if (a < b && c > a) {
        System.out.println("Both condition are true");
       }
       if (a < b || c > a) {
        System.out.println("At least one condition si true");
       }
       if (!(a > b )) {
        System.out.println("A is not greater than b");

       } 
    }
}


// && (AND) - all conditions must be true
// || (OR) - at least one condition must be true
// ! (NOT) - reverses a condition (true = false, false = true)