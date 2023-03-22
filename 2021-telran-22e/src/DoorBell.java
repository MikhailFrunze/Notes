public class DoorBell {
    public static void main(String[] args) {
        System.out.println(doorBellButton(true, true)); //-> false
        System.out.println(doorBellButton(false, false)); //-> false
        System.out.println(doorBellButton(true, false)); //-> true
        System.out.println(doorBellButton(false, true)); //-> true


    }

    public static boolean doorBellButton(boolean gateButton, boolean houseButton) {
        return gateButton ^ houseButton;

    }
}
