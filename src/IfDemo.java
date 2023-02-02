public class IfDemo {
    public static void main(String args[]) {
        int a, b, c;
        a = 2;
        b = 3;
        if (a < b) System.out.println("а меньше б");
        if (a == b) System.out.println("Данное сообщение не выводится");
        System.out.println();
        c = a - b;
        System.out.println("c = " + c);
        if (c >= 0) System.out.println("с - не отрицательное число");
        if (c < 0) System.out.println("с - отрицательное число");
        System.out.println();
        c = b - a;
        System.out.println("c = " + c);
        if (c >= 0) System.out.println("с - не отрицательное чилсло");
        if (c < 0) System.out.println("с - отрицательное число");
    }
}
