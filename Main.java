public class Main {
    public static void main(String[] args) {


        Cow wagyu = new Cow();
        Owl nok = new Owl();
        Duck donal = new Duck("PedPro");
        Pig moo = new Pig();
        PekingDuck fourseason = new PekingDuck("Duck Eatable");

        wagyu.sound();
        nok.sound();
        donal.sound();
        moo.sound();
        fourseason.sound();

        System.out.println(" ");

        donal.fly();
        donal.glide();
        donal.clean(wagyu);
        fourseason.clean(donal);
        fourseason.beCrispy();

    }
}