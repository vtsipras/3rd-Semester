import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Marks mark = new Marks();
        System.out.println("Give AEM: ");
        Scanner scanner=new Scanner(System.in);
        int aem = scanner.nextInt();
        while (aem != 0){
            System.out.println("Give mark: ");
            int mark1 = scanner.nextInt();
            mark.addMark(aem, mark1);
            System.out.println("Give AEM: ");
            aem = scanner.nextInt();
        }
        System.out.printf("%.2f",mark.meanMark());
        mark.showStatistics();
    }
}
