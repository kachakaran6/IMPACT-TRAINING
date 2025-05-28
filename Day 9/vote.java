public class vote {
    public static void main(String[] args) {
        int age = 18;
        boolean hasid = true;

        if (age >= 18) {
            if (hasid) {
                System.out.println("can vote");
            } else {
                System.out.println("bring your id");
            }
        } else {
            System.out.println("You are Under age");
        }
    }
}
