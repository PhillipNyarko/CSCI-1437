public class LineTester {
    public static void main(String[] args) { // main method
        // create two points to be used for the line
        Point startPoint = new Point(0, 0);
        Point endPoint = new Point(3, 4);
        Line line = new Line(startPoint, endPoint); // create line object

        endPoint.setXCoordinate(10); //set endpoint x coordinate to 10

        // Length of the line should be 5
        System.out.println("The length of the line is " + line.getLength()); // output length using getLength method

        Point endPoint2 = line.getEndPoint(); // create another point, possibly to test if the deep copies are preventing unwanted referneces?
        endPoint2.setXCoordinate(10); //set endpoint x coordinate to 10

        // Length of the line should be 5
        System.out.println("The length of the line is " + line.getLength()); // output length using getLength method
    }
}
