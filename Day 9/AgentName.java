import java.util.Scanner;

public class AgentName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println(name);

        System.out.println("Hi my name is " + name);

        sc.close();
    }
}
