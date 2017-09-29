

public class PointCPDesign3 {  // stores only as cartesian 
  
  private char typeCoord;
 
  private double xOrRho;
 
  private double yOrTheta;
	
  
  public PointCPDesign3(char type, double xOrRho, double yOrTheta) {
    
    if(type != 'C' && type != 'P'){
      throw new IllegalArgumentException();
    }
    this.xOrRho = xOrRho;
    this.yOrTheta = yOrTheta;
    typeCoord = type;

    if(type=='P'){
      double temp = Math.cos(Math.toRadians(this.yOrTheta)) * this.xOrRho;
      this.yOrTheta = Math.sin(Math.toRadians(this.yOrTheta)) * this.xOrRho;
      this.xOrRho = temp;
   
      typeCoord = 'C';  //Change coord type identifier
    }
    //forces to to store cartestian only^
  }
 
 
  public double getX(){
    if(typeCoord == 'C') {
      return xOrRho;
    } else {
      return (Math.cos(Math.toRadians(yOrTheta)) * xOrRho);
    }
  }
  
  public double getY(){
    if(typeCoord == 'C'){
      return yOrTheta;
    } else{ 
      return (Math.sin(Math.toRadians(yOrTheta)) * xOrRho);
    }
  }
  
  public double getRho(){
    if(typeCoord == 'P'){
      return xOrRho;
    } else {
      return (Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2)));
    }
  }
  
  public double getTheta(){
    if(typeCoord == 'P'){
      return yOrTheta;
    } else {
      return Math.toDegrees(Math.atan2(yOrTheta, xOrRho));
    }
  }
  
	
  public void convertStorageToPolar(){
    System.out.println("only storing as Cartesion. Not doing anything.");
    System.out.println("The rho coordinate (computed on during runtime, not stored) is: " + getRho());
    System.out.println("The theta coordinate (computed on during runtime, not stored) is: " + getTheta());
  }
	
  
  public void convertStorageToCartesian(){

    if(typeCoord != 'C'){
      double temp = getX();
      yOrTheta = getY();
      xOrRho = temp;
   
      typeCoord = 'C';	
    }
  }

  public double getDistance(PointCPDesign3 pointB){
    
    double deltaX = getX() - pointB.getX();
    double deltaY = getY() - pointB.getY();
    
    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
  }


  public PointCPDesign3 rotatePoint(double rotation){
    double radRotation = Math.toRadians(rotation);
    double X = getX();
    double Y = getY();
        
    return new PointCPDesign3('C',
      (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
      (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
  }


  public String toString(){
    return "Stored as " + (typeCoord == 'C' 
       ? "Cartesian  (" + getX() + "," + getY() + ")"
       : "Polar [" + getRho() + "," + getTheta() + "]") + "\n";
  }
}
