public class Squirrels {

    public static void main(String[] args) {
        System.out.println(cigarParty(30, false));
        System.out.println(cigarParty(50, false));
        System.out.println(cigarParty(70, true));
    }

    public static boolean cigarParty(int cigars, boolean weekend) {
        return weekend && (cigars > 40) || (cigars >= 40 && cigars <= 60);
    }
}
