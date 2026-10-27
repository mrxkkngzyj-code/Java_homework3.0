import java.util.Arrays;

public class TextArea2 {
    public static void main(String [] args){
        //分别说出下面方法的作用，并写出结果：
        //String s = " Java Programming ";
        //- s.length()
        //- s.charAt(1) 
        //- s.indexOf("Pro")
        //- s.substring(1, 5)
        //- s.toUpperCase()
        //- s.trim()
        //- s.replace("a", "@")
        String s = "Java Programming";
        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.indexOf("Pro"));
        System.out.println(s.substring(1,5));
        System.out.println(s.toUpperCase());
        System.out.println(s.trim());
        System.out.println(s.replace("a","@"));

        //下面代码输出什么？为什么？
        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");//会使用 new 创建一个新的字符串对象。虽然它的内容也是 "java"，但对象地址与 s1 不同
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));//比较的是字符串的实际内容。两者内容都是 "java"

        //写程序完成下面任务：
        String text = "Java,Python,C++,Java  ";
        //- 去掉首尾空格；
        //- 把 Java 改成 JAVA；
        //- 判断是否包含 Python；
        //- 按逗号拆分为字符串数组；
        //- 输出每个元素及其长度。
        text = text.replace("Java","JAVA");
        boolean hasPython = text.contains("Python");
        System.out.println("是否包含 python:" + hasPython);

        String[] items = text.split(",");

        for(String item : items){
            System.out.println(item + ",长度：" + item.length());
        }
        //11. 为什么下面代码不能真正修改数组中的每个字符串？
        //String[] names = new String[3];
        //for (String name : names) {
        //    name = "Tom";
        //}
        //应怎样修改，才能让数组中的三个元素都变成 "Tom"？

        //因为增强 for 循环中的 name 只是数组元素的一个副本：
        // name = "Tom" 只改变了局部变量 name，没有改变数组中的 names[0]、names[1]、names[2]。
        //真正修改数组元素，要使用下标：
        //String[] names = new String[3];
        //for (int i = 0; i < names.length; i++) {
        //names[i] = "Tom";
        //}
        //import java.util.Arrays;
        //String[] names = new String[3];
        //Arrays.fill(names, "Tom");

        
        

    }
    //12. 写一个方法：
        //public static boolean isPalindrome(String s)
        //用来判断一个字符串是否为回文，例如 "level" 是回文，"java" 不是。
    // public static boolen is Palindrome(String s){
    //         int left = 0;
    //         int right = s.length() - 1;

    //         while(left < right){
    //             if(s.charAt(left) != s.charAt(right)){
    //                 return false;
    //             }
    //             left++;
    //             right--;
    //         }
    //         return true;
    //     }
        //该代码需要新开一个文件复制运行，并且修改文件名，为了直接展示，写在这个地方
}
