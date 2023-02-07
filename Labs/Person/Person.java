public class Person { // create class
    private String name; // create private name variable
    private long ssn = (int)(Math.random() * 10_000_000_000L    ); // generate random 10 digit private social security number

    public Person(String newName){ // create constructor that takes in name as parameter
        this.name = newName; // this keyword to refer to instance variable
    }

    public String getName(){
        return name;
    } // create method to return the name of the object

    public long getSsn(){
        return ssn;
    } // create method to return the Social Security of the object

    public void setName(String newName) { // create method to change the name of the object
        this.name = newName; // this keyword to refer to instance variable
    }
}
