
public class AbstractionDemo {
public static void main(String[] args)
{
    Square sq = new Square(10);
    sq.calArea();
    sq.show();

    Rect r = new Rect(7 , 10);
    r.calArea();
    r.show();
}
}