
public class Main {

  public static void main(String[] args) {

    System.out.println("Old MacDonald Had A Farm");
    System.out.println("Brought to you by Java!");
    System.out.println("");

    Animal [] animal = {new Cow(), new Dog(),
     new Cat(), new Horse(),new Duck()};

    for(int i=0; i< animal.length; i++){
    animal[i].singVerse();
    
    }

    // TODO: create an array of Animal objects and call `singVerse()` on each of them
    //Animal singVerse()

}
}
