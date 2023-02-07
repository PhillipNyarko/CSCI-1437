public class Cube { // create class
    private double side; // create variable for # of sides

    public Cube(){ // no args constructor
        side = 1; // cube gets initialized with a side number of 1 if the no-arg constructor is used
    }

    public Cube(double newSide){ // constructor with side parameter
        this.side = newSide; // set the side field as the passed parameter
    }

    public double getSide(){ // return the number of side of the cube
        return side;
    }

    public double getVolume(){ // return the volume of the cube
        return Math.pow(side, 3); // multiply sides by 3
    }

    public double getSurfaceArea(){ // return the surface area of the cube
        return 6 * (Math.pow(side, 2)); // square side and multiply by 6
    }

    public void setSide(double newSide){ // set or change the  # sides for the  instance of the cube
        this.side = newSide; // private side variable becomes passed parameter
    }
}
