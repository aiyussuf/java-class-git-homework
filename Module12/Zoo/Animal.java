/*
2. It's a Zoo!
Consider the Sheep and Cow subclasses that inherit from base class Animal. All of these classes print two simple properties of the animals: their name and sound. Do the following:

A)	Compile and rub both the Sheep and Cow classes. The sheep class does not properly override the default sound, make it so it does. (notice how the sheep effectively accesses two different variable titled sound, this works as they are on different class levela).

2. It's a Zoo! (cont.)
B) add a new datamember to the Animal class (weight, color, height, whatever) with it's own getter method. Initialize the new datamember, when the constructor is called of the Animal class. Adjust the constructors of all the subclasses to reflect that change (as well as where those Constructors for A and
 B)Constructors are called in their individual main methods)

Finally, call the getter method of the animal class on the subclass object so that it prints to the console.

2. It's a Zoo (expected output)

A)	Make the sheep class output: (must be called with the overridden method)
Name: Shelly
Sound Baahahaa
B)	One of your animals displays your new datamember when the it's main method is run

        //A cow
          Name:beefy
          Sound: Moo…
          Weight: 1400 pounds
C)	Test that all 3 of the subclasses from part C work. They should be able to print 4 different datamembers now, below is an example:
         // The parrot class inherits from some bird class
Public static void main(String args[])
{
//the constructor takes 2 arguments now, name and color
//Color is declared in the parent Animal class
Parrot greeny = new Parrot ("greeny", "green");
System.out.println("Name:  " + greeny.getName());
System.out.println("Sound:  " + greeny.getSound());
System.out.println("Color:  " + greeny.getColor());
System.out.println("Type:  " + greeny.getType());
}

*/





public class Animal{
  private String name;
  private String sound = "I'm a generic animal!!";
  private String color;
  private double weight;
  Animal(String name, String color, double weight){
    this.name = name;
    this.color = color;
    this.weight = weight;
  }

  public String getName(){
    return name;
  }

  public String getSound(){

    return sound;
  }
  public String getColor(){

    return color;
  }
  public double getWeight(){

    return weight;
  }


  public static void main(String args[]){
    Animal generic = new Animal("no name","no color",1400.0);
    System.out.println("Name: " + generic.getName());
    System.out.println("Sound: " + generic.getSound());
    System.out.println("Color: " + generic.getColor());
    System.out.println("Weight: " + generic.getWeight());
  }
}
