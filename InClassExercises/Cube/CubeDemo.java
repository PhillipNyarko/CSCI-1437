public class CubeDemo { // create demo class
    public static void main(String[] args){ // main method
        Cube myCube = new Cube(); // use the no-args constructor to create a cube

        System.out.println("The side of the cube is " +  myCube.getSide());  // access private side variable
        System.out.println("The Volume of the cube is " + myCube.getVolume()); // call volume method
        System.out.println("The Surface Area of the cube is " + myCube.getSurfaceArea()); // call get surface area method
        myCube.setSide(12); // change side variable
        System.out.println("\nThe side of the cube is " +  myCube.getSide());  // access private side variable
        System.out.println("The Volume of the cube is " + myCube.getVolume()); // call volume method
        System.out.println("The Surface Area of the cube is " + myCube.getSurfaceArea()); // call get surface area method
    }
}
