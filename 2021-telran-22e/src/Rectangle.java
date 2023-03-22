public class Rectangle {

    public static void main(String[] args) {
        /* Для вычисления площади прямоугольника нужно умножить его длину на ширину. S = a · b*/
        /* Формула нахождения периметра прямоугольника: P = a + b + c + d, где a, b, c, d — стороны. P = 2 * (a + b)*/
        System.out.println(findRectangleArea(10, 15)); //-> 150
        System.out.println(findPerimeterRectangle(10,15,10,15)); //-> 50
    }

    public static int findRectangleArea(int length, int width) {
        return length * width;
    }

    public static int findPerimeterRectangle(int a, int b, int c, int d) {
        return 2 * (a + b);
    }
}
