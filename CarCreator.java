import java.util.Scanner;
public class CarCreator{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Car myCar = new Car("Wayne", "Batmobile", 101, 505, 0);
    final double FIRST_DRIVE = 56.7;

    System.out.println("Bought off the shelf");
    System.out.println("What's the make? - "+myCar.getMake());
    System.out.println("What's the model? - "+myCar.getModel());
    System.out.println("What's the fuel efficiency? - "+myCar.getMPG());
    System.out.println("Is it loaded? - "+myCar.getGallons()+"\n");

    myCar.setGallons(4);
    System.out.println("Fill'er up:\n"+myCar);

    myCar.drive(FIRST_DRIVE);
    System.out.println("Took'er fer a spin ("+FIRST_DRIVE+" miles):\n"+myCar);

    while (!myCar.getOutOfGas()){
      System.out.println("How many more miles shall I go? ("+myCar.getMilesLeft()+" miles left. Type \"fill'er up\" to fill'er up)");
      String input = scan.nextLine();
      if (input.equals("fill'er up")){
        System.out.println("How much?");
        myCar.addGallons(scan.nextDouble());
      }
      myCar.drive(scan.nextDouble());
      if (myCar.getOutOfGas()){
        System.out.println("OUT OF GAS");
      } else {
        System.out.println(myCar);
      }
    }
  }
}
