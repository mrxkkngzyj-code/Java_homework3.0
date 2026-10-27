public class RectangeDome {
    public static void main(String[] args) {
        Rectange rec = new Rectange();

        rec.setHeight(100);
        rec.setWeight(200);

        int area = rec.getArea();

        System.out.println("面积：" + area);
        System.out.println(rec.getHeight());
        System.out.println(rec.getArea_v2(10,20));
        System.out.println(rec.getHeight());
        System.out.println(rec.getArea_v3(30,40));
        System.out.println(rec.getHeight());

        Rectange2 rec2 = new Rectange2()
        
    }
}