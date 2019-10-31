import java.text.DecimalFormat;
public class Car{
  private DecimalFormat fmt = new DecimalFormat(".00");
  private String make;
  private String model;
  private double mpg;
  private double gallons;

  public Car(String carMake, String carModel, double carMPG, double carGallons){
    make = carMake;
    model = carModel;
    mpg = carMPG;
    gallons = carGallons;
  }

  public String getMake(){
    return make;
  }
  public String getModel(){
    return model;
  }
  public double getMPG(){
    return mpg;
  }
  public double getGallons(){
    return gallons;
  }
  public void setGallons(double newGallons){
    gallons = newGallons;
  }

  public void drive(double miles){
    gallons -= miles/mpg;
  }

  public String toString(){
    String result = "";
    result += make+"\n";
    result += model+"\n";
    result += mpg+" mpg"+"\n";
    result += fmt.format(gallons)+" gallons"+"\n";
    return result;
  }
}
