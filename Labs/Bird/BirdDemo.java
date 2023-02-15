public class BirdDemo {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Duck duck = new Duck();

        // The bird can fly and cannot swim.
        System.out.println(bird.toString());

        // The duck can fly and can swim.
        System.out.println(duck.toString());
        // The duck swims in the everglades.
        System.out.println(duck.swim());
        // Quack quack!
        System.out.println(duck.makeSound());
    }
}
