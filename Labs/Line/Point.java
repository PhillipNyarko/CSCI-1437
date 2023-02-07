public class Point { // create the point class
    /* declare two private double variables: one for the x - coordinate and one for the y - coordinate.
    Initialize them both to "0.0"
     */

    private double xCoordinate = 0.0;
    private double yCoordinate = 0.0;

    public Point(double xCoordinate, double yCoordinate){ // create constructor that takes in two coordinates
        /* the "this" keyword ensures that there is no confusion as to what we are referring to.
        the private doubles xCoordinate and yCoordinate are being set equal to whatever is passed
        to the constructor as the coordinate values (similar to self keyword in python possibly).
         */
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public void setXCoordinate(double xCoordinate){ // method to change the xCoordinate value
        this.xCoordinate = xCoordinate;
    }

    public void setYCoordinate(double yCoordinate){ // method to change the yCoordinate value
        this.yCoordinate = yCoordinate;
    }

    public double getXCoordinate(){ // method to return the xCoordinate value
        return xCoordinate;
    }

    public double getYCoordinate(){ // method to return the yCoordinate value
        return yCoordinate;
    }
}
