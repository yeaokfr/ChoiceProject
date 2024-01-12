import java.util.Scanner;

public class DuplicateRemover {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String epic;
        String wrd = "";

        System.out.println("type out a sentence (no spaces)");
        epic = scan.nextLine();

        for (int i = 0; i < epic.length(); i++) {
            if (!wrd.contains(epic.substring(i,i+1))) {
                wrd += epic.substring(i,i+1);
            }
        }

        System.out.println(wrd);
    }
}
