public class Owl extends Animal implements Flyable{

    @Override
    public void sound() {
        System.out.println("hoot hoot");
    }

    void tumrai() {
        System.out.println("Bining");
    }

    @Override
    public void fly() {
        System.out.println("Flap Flap");
    }

    @Override
    public void glide() {
        System.out.println("Fewwww Fewwww");
    }
}
