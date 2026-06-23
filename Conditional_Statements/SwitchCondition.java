public class SwitchCondition {
    public static void main(String[] args) {
      int week = 123456789;
      switch (week) {
        case 1:
        System.out.println("Sunday");
        break;
        case 2:
        System.out.println("Tuesday");
        break;
        case 3:
        System.out.println("Wednesday");
        break;
        case 4:
        System.out.println("Thursday");
        break;
        case 5:
        System.out.println("Friday");
        break;
        case 6:
        System.out.println("Saturday");
        break;
        case 7:
        System.out.println("Sunday");
        break;
        default:
            System.out.println("Invalid days");
            break;
      } 
    }
}



// switch(expression) {
//   case x:
//     // code block
//     break;
//   case y:
//     // code block
//     break;                           break me semicolon lagega aur case me double dot use hoga 
//   default:                                 aur agar koi condition nahi chalani hai ti uske liye default key word ka use karenge
//     // code block
// }