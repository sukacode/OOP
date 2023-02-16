public class Rectangle extends Shape{
    int getCorner(){
        return 4;
    }

    // super keyword
    int getParentCorner(){
        return super.getCorner();
    }
}
