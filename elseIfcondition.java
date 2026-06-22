public class elseIfcondition {
    public static void main(String[] args) {
        int time = 19;
        if(time < 12) {
            System.out.println("bring an umbrella");
        } else if  (time == 19) {
            System.out.println("no need to bring an umbrella");
        } else {
            System.out.println("good evening");
        }
    }
    
}


// if (condition1) {
//   block of code to be executed if condition1 is true
// } else if (condition2) {
//   block of code to be executed if condition1 is false and condition2 is true
// } else {
//   block of code to be executed if both conditions are false
// }