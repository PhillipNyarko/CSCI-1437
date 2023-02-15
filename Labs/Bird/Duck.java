public class Duck extends Bird{
    public Duck(){
        super("Duck", true, true);
    }

    public String swim(){
        return "The duck swims in the everglades.";
    }

    public String makeSound(){
        return "Quack quack!";
    }
}
