package src.com.TNSIF.abstraction;

public abstract class  Shape {
    protected float area;
    abstract void calArea();
    public void show()
    {
        System.out.println("Area of shape is: " + area);
    }

}