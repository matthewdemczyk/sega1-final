public class PointCPPolarDesign5 extends PointCPDesign5{

  private double Rho;
  private double Theta;
  
  public PointCPPolarDesign5(double Rho, double Theta){
    this.Rho = Rho;
    this.Theta = Theta;
  }
  public double getX(){
    return (Math.cos(Math.toRadians(Theta)) * Rho);
  }

  public double getY(){
    return (Math.sin(Math.toRadians(Theta)) * Rho);
  }

  public double getRho(){
    return Rho;
  }

  public double getTheta(){
    return Theta;
  }

  public String toString(){return  "Stored as Polar [" + getRho() + "," + getTheta() + "]" + "\n";}

}