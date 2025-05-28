public class Grade {
    public static void main(String[] args) {
        int Grade = 95;

        if (Grade > 90) {
            System.out.println("Grade A");
        } else if (Grade > 80 && Grade < 90) {
            System.out.println("Grade B");
        } else if (Grade > 70 && Grade < 80) {
            System.out.println("Grade C");
        } else if (Grade > 60 && Grade < 70) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    }
}
