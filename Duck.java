public class Duck extends Animal implements Flyable{

    String name;

    public Duck(String name){
        this.name = name;
    }

    public Duck(){
        this.name = "none";
    }

    @Override
    public void sound() {
        System.out.println("quack quack");
    }

    void swim(){
        System.out.println("Swimming");
    }

    @Override
    public void fly() {
        System.out.println("prbbb prbbb");
    }

    @Override
    public void glide() {
        System.out.println("hiyahhhhh");
    }

    void clean(Animal animal){

//        if(animal instanceof Cow){
//            System.out.println("Clean Cow");
//        }

        System.out.println(this.name + " is cleaning " + animal);
    }

}
