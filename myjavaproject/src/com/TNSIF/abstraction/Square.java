package src.com.TNSIF.abstraction;

public class Square extends Shape {
    private float side;

    public Square(float side) {
        this.side = side;
    }
    void calArea(){
        area = side * side;
    }
}