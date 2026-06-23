public class NestedIfcondition {
    public static void main(String[] args) {
        int x = 23;
        int y =29;
        if (x >20) {
            System.out.println("x is greater than 20");
        }
        if (y > 28) {
            System.out.println("y is greater than a 29");
        } else {
            System.out.println("invalid error");
        }
    }
}


// if (condition1) {
//   // code to run if condition1 is true
//   if (condition2) {   condition ke annder ek condition lagta hai isme 
//     // code to run if both condition1 and condition2 are true
//   }
// }