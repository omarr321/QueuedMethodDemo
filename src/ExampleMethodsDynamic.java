public class ExampleMethodsDynamic {
    private String name = "";
    private String favAnimal = "";
    private int favNum = 0;

    public ExampleMethodsDynamic() {}

    public void run() {
        System.out.println("Hello, my name is " + this.name + "!");
        System.out.println("Hello, my favorite animal is " + this.favAnimal + ".");
        System.out.println("Hello, my favorite number is " + this.favNum + "!");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFavAnimal(String animal) {
        this.favAnimal = animal;
    }

    public void setFavNum(int num) {
        this.favNum = num;
    }
}
