public class Tripleton {
    private static int i = 0;
    private static Tripleton [] tripleton = {
        new Tripleton(),
        new Tripleton(),
        new Tripleton(),
    };
    private Tripleton() {
        System.out.println("インスタンスを作成しました。");
    }
    public static Tripleton getInstance() {
        i = i % 3;
        return tripleton[i++];
    }
    static void p() {
        System.out.println("インスタンス =>" + tripleton);
    }
}
