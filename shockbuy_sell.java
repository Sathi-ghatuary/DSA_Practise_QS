public class shockbuy_sell {
    public static int price(int arr[]) {
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int i = 0; i < arr.length; i++) {

            if (buy_price < arr[i]) {
                int profit = arr[i] - buy_price;// Today's profit
                max_profit = Math.max(max_profit, profit);

            } else {
                buy_price = arr[i];
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        System.out.print("Maximum Profit is:" + price(arr));
    }
}
