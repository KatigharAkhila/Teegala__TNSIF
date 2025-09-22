package src.com.TNSIF.abstraction;

public Rect extends Shape {
    private float length;
    private float breadth;
    public Rect(float lenght, float width){
        this.lenght = length;
        this.breadth = breadth;

    }
    void calArea(){
        area = length * breadth;
    }
    
}