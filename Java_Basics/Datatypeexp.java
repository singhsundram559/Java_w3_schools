public class Datatypeexp {
    public static void main(String[] args) {
        int iteam = 50;
        float costperIteam = 9.78f;
        float totalCost = iteam * costperIteam;
        char currency = '$';
        System.out.println("number of iteam: "+iteam);
        System.out.println("cost per item: "+costperIteam+currency);
        System.out.println("total cost is: " +totalCost + currency);
    }
}
