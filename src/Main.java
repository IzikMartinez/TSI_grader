import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Questions> test_Questions = new ArrayList<Questions>();
    JFrame mainFrame = new JFrame("Test check");

    public static void main(String[] args) {
        test_Questions.add(new Questions("Graphing"));
        test_Questions.add(new Questions("Fractions"));
        test_Questions.add(new Questions("Algebra"));
        test_Questions.add(new Questions("Order of Operations"));
        test_Questions.add(new Questions("Factoring"));
        for(Questions question : test_Questions) {
            if (!question.isTrue())
                System.out.println(question.getSubject());
        }
    }
}


