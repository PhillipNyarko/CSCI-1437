public class Line { // create the Line class
    // create two point variables that represent the start and endpoint. Initialize them both to "null"(nothing)
    private Point startPoint = null;
    private Point endPoint = null;

    // Create Line object constructor that takes in the start point and end point (both Point objects)
    // set start and end point private variables to equal the x and y coordinate values of their respective points

    /*create a new point and assign the values of the start and end points to the new point. This prevents
    unwanted references to the same object. This is essentially what I understand a deep copy to be. Copy
    the values from the old object to a new object so that the new object stands alone from the previous instance.
     */
    public Line(Point startPoint, Point endPoint){
        this.startPoint =  new Point(startPoint.getXCoordinate(), startPoint.getYCoordinate());
        this.endPoint =  new Point(endPoint.getXCoordinate(), endPoint.getYCoordinate());
    }
// create set Start point and set end point methods to modify the start and end points of the line
    public void setStartPoint(Point startPoint){
        this.startPoint =  new Point(startPoint.getXCoordinate(), startPoint.getYCoordinate());
    }

    public void setEndPoint(Point endPoint){
        this.endPoint =  new Point(endPoint.getXCoordinate(), endPoint.getYCoordinate());
    }
// create get Start point and get end point methods to return the start and end points of the line
    public Point getStartPoint(){
        return new Point(this.startPoint.getXCoordinate(), this.startPoint.getYCoordinate());
    }

    public Point getEndPoint(){
        return new Point(this.endPoint.getXCoordinate(), this.endPoint.getYCoordinate());
    }
    // Use the methods created above to define parts of the distance formula
    // Implement and return the distance formula using Math.sqrt and Math.pow as well as the previously created variables
    public double getLength(){
        double x2SubtractedByX1 = getEndPoint().getXCoordinate() - getStartPoint().getXCoordinate();
        double y2SubtractedByY1 = getEndPoint().getYCoordinate() - getStartPoint().getYCoordinate();
        return Math.sqrt(Math.pow(x2SubtractedByX1,2) + Math.pow(y2SubtractedByY1,2));
    }

}
