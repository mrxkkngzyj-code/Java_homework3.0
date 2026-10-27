public class TextArea3 {
    public static void main(String [] args){
        //判断下列字符串是否符合“6 至 12 位，只能由字母、数字、下划线组成”的用户名规则。正则表达式应怎样写？
        String regex = "^[a-zA-Z0-9_]{6,12}$";

        String[] names = {
            "stdent_01",
            "123abc",
            "a-b",
            "abc",
            "very_long_username"
        };

        for(String name : names){
            if(name.matches(regex)){
                System.out.println(name + " 符合用户名规则");
            }else{
                System.out.println(name + " 不符合用户名规则");
            }
        }
        // 写正则表达式判断手机号是否为中国大陆常见的 11 位手机号。- 第一位必须是 1；
        // - 第二位是 3 到 9；
        // - 后面是 9 位数字。
        String phone = "13812345678";
        String phoneRegex = "^1[3-9]\\d{9}$";
        if (phone.matches(phoneRegex)) {
            System.out.println("手机号格式正确");
        } else {
            System.out.println("手机号格式不正确");
        }

        // 15. 下列邮箱地址哪些符合常见格式？你会怎样设计一个入门版的邮箱正则表达式？
        // tom@example.com
        // lily_01@school.edu.cn
        // abc@com
        // @example.com
        // jack#mail.com
        String emailRegex = "^\\w+@\\w+(\\.\\w+)+$";
        String[] emails = {
            "tom@example.com",
            "lily_01@school.edu.cn",
            "abc@com",
            "@example.com",
            "jack#mail.com"
        };

        for(String email : emails){
            if(email.matches(emailRegex)){
                System.out.println(email + " 符合邮箱格式");
            }else{
                System.out.println(email + " 不符合邮箱格式");
            }
        }

        // 17. 阅读并解释下面代码：
        // String s = "Java 2026";
        // System.out.println(s.matches("[A-Za-z ]+"));
        // System.out.println(s.matches(".*\\d+.*"));
        // - 两次输出各是什么？
        // - matches() 与 contains() 有什么区别？
        // - 为什么第二个表达式前后要加 .*？

        // 18. 用 split() 把下面字符串按“一个或多个空格”切分：
        String line = "Tom   Alice  Bob    Mike";

        String[] namesSplit = line.split("\\s+");
        for(String name : namesSplit){
            System.out.println(name);
        }

        



    }
}
