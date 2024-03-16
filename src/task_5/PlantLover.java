package src.task_5;

    import java.util.Scanner;
    public class PlantLover {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a plant name:");
            String input = scanner.nextLine();

            if ("Cactus".equals(input)) {
                System.out.println("Yes - Cactus is the best plant ever!");
            } else if ("cactus".equals(input)) {
                System.out.println("No, I want a big Cactus!");
            } else {
                System.out.println("Cactus! Not " + input + "!");
            }
        }
}
