public class PointCPDesign2{
  private char typeCoord;
  private double Rho;
  private double Theta;
	
  public PointCPDesign2(char type, double Rho, double Theta)
  {
    if(type != 'C' && type != 'P')
      throw new IllegalArgumentException();
    this.Rho = Rho;
    this.Theta = Theta;
    typeCoord = type;
    if (type=='C'){
      double temp = Math.sqrt(Math.pow(Rho, 2) + Math.pow(this.Theta, 2));
      this.Theta = Math.toDegrees(Math.atan2(Theta, Rho));
      this.Rho = temp;
      
      typeCoord = 'P';
    }
  }
  public double getX(){ return (Math.cos(Math.toRadians(Theta)) * Rho);}
  public double getY() {return (Math.sin(Math.toRadians(Theta)) * Rho);} 
  public double getRho(){return Rho;}
  public double getTheta(){return Theta;}
  public void convertStorageToPolar()
  {
    if(typeCoord != 'P')
    {
      //Calculate RHO and Theta
      double temp = getRho();
      Theta = getTheta();
      Rho = temp;
      
      typeCoord = 'P';  //Change coord type identifier
    }
  }
  public void convertStorageToCartesian()
  {
    System.out.println("Only storing as polar. Not doing anything.");
    System.out.println("The x coordinate (computed on during runtime, not stored) is: " + getX());
    System.out.println("The y coordinate (computed on during runtime, not stored) is: " + getY());
  }
  public double getDistance(PointCPDesign2 pointB)
  {
    // Obtain differences in X and Y, sign is not important as these values
    // will be squared later.
    double deltaX = getX() - pointB.getX();
    double deltaY = getY() - pointB.getY();
    
    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
  }
  public PointCPDesign2 rotatePoint(double rotation)
  {
    double radRotation = Math.toRadians(rotation);
    double X = getX();
    double Y = getY();
        
    return new PointCPDesign2('C',
      (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
      (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
  }
  public String toString()
  {
    return "Stored as " + (typeCoord == 'C' 
       ? "Cartesian  (" + getX() + "," + getY() + ")"
       : "Polar [" + getRho() + "," + getTheta() + "]") + "\n";
  }
}
