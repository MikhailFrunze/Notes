public class HelloBoolean {
    public static void main(String[] args) {
        helloOne();

    }

    public static void helloOne() {
        int roomTemp = 21, conditionTemp = 22;

        boolean bool = (roomTemp > conditionTemp);

        System.out.println(bool);

    }

    public static void helloTwo(){
      boolean b = (7+8) * 4 != 7 + 4 * 5;

        System.out.println(b);
    }
}
