public class PekingDuck extends Duck{

    public PekingDuck(){
    super();
    }

    public PekingDuck(String name) {
        super(name);
    }

    public void beCrispy(){
        System.out.println("Grob Grob");
    }

    public void clean(Animal animal) { // overriding
        System.out.println("I cannot clean. I died already.");
    }


}
