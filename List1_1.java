import java.util.Random;

class List1_1 {
    // データの件数
    private static final int N = 10;
    private static int[] sort = new int[N];

    private static void bubbleSort() {
        boolean flag;
        do {
            flag = false;
            for (int i = 0; i < N - 1; ++i) {
                if (sort[i] > sort[i + 1]) {
                    // 左右の並びがおかしければ入れ替える
                    flag = true;
                    int j = sort[i];
                    sort[i] = sort[i + 1];
                    sort[i + 1] = j;
                }
            }
        } while (flag);
    }

    public static void main(String args[]) {
        Random random = new Random();
        System.out.println("ソート準備");
        for (int i = 0; i < N; ++i) {
            sort[i] = random.nextInt(1000);
            System.out.print(sort[i] + " ");
        }
        System.out.println("\nソート開始");
        bubbleSort();
        System.out.println("ソート終了");

        for (int i = 0; i < N; ++i) {
            System.out.print(sort[i] + " ");
        }
    }
}
