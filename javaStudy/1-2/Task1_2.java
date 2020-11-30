public class Task1_2 {

    public static void main(String[] args) {

        // ①「JAPAN」、「AMERICA」、「KOREA」を要素の値（初期値）とする配列 countryを作成しなさい。
        String[] country = {"JAPAN","AMERICA","KOREA"};
        // ② ①で作成した配列の要素数を出力してください。
        System.out.println(country.length);
        /* ③下記の値を保持した、要素数3のStringクラスの配列strArrayを作成しなさい。
         *   1番目（先頭）の要素に 「りんご」 を代入
         *   2番目の要素に 「もも」 を代入
         *   3番目の要素に 「ぶどう」 を代入
         */
        String[] strArry = new String[3];
        strArry[0] = "りんご";
        strArry[1] = "もも";
        strArry[2] = "ぶどう";
        // ④ ③で作成した配列の2番目の要素を出力しなさい。
        System.out.println(strArry[1]);
        /* ⑤下記の処理について、何をしているのかコメントを記入してください。
         *  [10、20、30、40、50の要素の値（初期値）とする要素数５のintArrayという名前のint型の配列を宣言]
         */
        int[] intArray = { 10, 20, 30, 40, 50 };

        // ⑥下記の処理について、何をしているのかコメントを記入してください。
        // [intArray[1]とintArray[4]の合計を出力]
        System.out.println(intArray[1] + intArray[4]);

    }
}