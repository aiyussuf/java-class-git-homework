public class Sheep extends Animal{

  private String name;
  private String sound = "Baahahaa...";


  Sheep(String name, String color, double weight){
    super(name, color, weight);
  }
@Override
public String getSound(){
  return sound;
}
  public static void main(String args[]){
    Sheep shelly = new Sheep("Shelly","White", 50.0);
    System.out.println("Name: " + shelly.getName());
    System.out.println("Sound: " +shelly.getSound());
    System.out.println("Sound: " +shelly.getColor());
    System.out.println("Sound: " +shelly.getWeight());
  }
}
