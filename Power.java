public class Power
{
  private String power1;
  public static int numPowers = 0;
  
  public void setPower(String inputPower)
  {
    power1 = inputPower;
  }

  public String getPower()
  {
    return power1;
  }

  public Power (String power)
  {
    power1 = power;
    numPowers++;
  }

  public static int getNumPowers()
  {
    return Power.numPowers;
  }
}