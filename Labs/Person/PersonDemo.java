public class PersonDemo { // create main class
    public static void main(String[] args){ // main method
        Person myPerson = new Person("Phillip Nyarko"); // create person object and pass in name
        System.out.println( "Name: " + myPerson.getName()); // get and print name of object
        System.out.println( myPerson.getName() + "'s ssn: " + myPerson.getSsn()); // print social security #
        myPerson.setName("Lionel Messi"); // change name
        System.out.println( "New Name: " + myPerson.getName()); // print new name
    }
}
