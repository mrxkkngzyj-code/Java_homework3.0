public class TestArea {
    public static void main(String[] args) {
        int[][] a = {
            {80, 90, 100},
            {76, 88, 95},
            {92, 85, 87}
        };

        //上面的数组共有多少行？每一行分别有多少个元素？
        System.out.println("行数：" + a.length);
        System.out.println("第0行的列数：" + a[0].length);
        //写一个双重 for 循环，输出上面二维数组的全部元素：
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }

        //在上题基础上，求：
        //每位学生的总分；
        //每门课的平均分；
        //全班最高分及其行、列下标。
        System.out.println("\n每位学生的总分：");
        for(int row = 0 ; row < a.length ; row++){
            int sum = 0 ;
            for(int col = 0 ; col < a[row].length ; col++){
                sum += a[row][col];
            }
            System.out.println("第" +(row + 1) + "位学生：" + sum);
        }
        System.out.println("\n每位学生的平均分：");
        for(int row = 0 ; row < a.length ; row ++){
            int sum = 0 ;
            for(int col = 0 ; col < a[row].length ; col ++){
                sum += a[row][col];
            }
            double average = (double) sum / a.length;
            System.out.println("第" + (row + 1) + "位学生：" + average );
        }
        int max = a[0][0];
        int maxRow = 0;
        int maxCol = 0;
        for(int row = 0 ; row < a.length ; row++){
            for(int col = 0 ; col < a[row].length ; col ++){
                if(a[row][col] > max){
                    max = a[row][col];
                    maxRow = row;
                    maxCol = col;
                }
            }
        }
        System.out.println("\n 全班最高分："+max);
        System.out.println("数组下标：第" + maxRow +"行，第" + maxCol + "列");
        System.out.println("实际位置：第" + (maxRow + 1) + "位学生，第" + (maxCol +1) + "门课");
        
        //for-each 能否遍历二维数组？下面两个 for-each 分别遍历到的是什么？
        for(int[] row : a){
            for(int value :row){
                System.out.println(value);
            }
        }
    }
}