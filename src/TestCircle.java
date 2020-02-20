
public class TestCircle {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle);
        circle=new Circle(2);
        System.out.println(circle);

        Rectangle rectangle= new Rectangle();
        System.out.println();
        System.out.println(rectangle);
        rectangle=new Rectangle(3,4);
        System.out.println(rectangle);

        Square square=new Square();
        System.out.println(square);
        square=new Square(2);
        System.out.println(square);



    }

}
