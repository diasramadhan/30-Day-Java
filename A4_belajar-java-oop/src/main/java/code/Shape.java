package code;

public class Shape {
    int getCorner(){
        return 0;
    }
}

class Rectangle extends Shape{
    int getCornerFromParent() {
        return super.getCorner();
    }

    @Override
    int getCorner() {
        return 4;
    }
}
