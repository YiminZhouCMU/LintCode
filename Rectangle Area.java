public class Rectangle {
    /*
     * Define two public attributes width and height of type int.
     */
    // write your code here
    private int width;
    private int height;
    /*
     * Define a constructor which expects two parameters width and height here.
     */
    // write your code here
    public Rectangle(int newWidth, int newHeight){
        width = newWidth;
        height = newHeight;
    }
    /*
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    // write your code here
    public int getArea(){
        int area = width * height;
        return area;
    }
}