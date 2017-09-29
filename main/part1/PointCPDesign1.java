// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

/**
 * This class contains instances of coordinates in either polar or
 * cartesian format.  It also provides the utilities to convert
 * them into the other type. It is not an optimal design, it is used
 * only to illustrate some design issues.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @version July 2000
 */
public class PointCPDesign1
{
  private char typeCoord;
  private double xOrRho;
  private double yOrTheta;

  public PointCPDesign1(char type, double xOrRho, double yOrTheta){
    if(type != 'C' && type != 'P')
      throw new IllegalArgumentException();
    this.xOrRho = xOrRho;
    this.yOrTheta = yOrTheta;
    typeCoord = type;
  }

  public double getX(){
    if(typeCoord == 'C') 
      return xOrRho;
    else 
      return (Math.cos(Math.toRadians(yOrTheta)) * xOrRho);
  }

  public double getY(){
    if(typeCoord == 'C') 
      return yOrTheta;
    else 
      return (Math.sin(Math.toRadians(yOrTheta)) * xOrRho);
  }

  public double getRho(){
    if(typeCoord == 'P') 
      return xOrRho;
    else 
      return (Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2)));
  }

  public double getTheta(){
    if(typeCoord == 'P')
      return yOrTheta;
    else 
      return Math.toDegrees(Math.atan2(yOrTheta, xOrRho));
  }
  
  public void convertStorageToPolar(){
    if(typeCoord != 'P')
    {
      //Calculate RHO and THETA
      double temp = getRho();
      yOrTheta = getTheta();
      xOrRho = temp;
      
      typeCoord = 'P';  //Change coord type identifier
    }
  }

  public void convertStorageToCartesian(){
    if(typeCoord != 'C')
    {
      //Calculate X and Y
      double temp = getX();
      yOrTheta = getY();
      xOrRho = temp;
   
      typeCoord = 'C';	//Change coord type identifier
    }
  }
  public double getDistance(PointCPDesign1 pointB){
    // Obtain differences in X and Y, sign is not important as these values
    // will be squared later.
    double deltaX = getX() - pointB.getX();
    double deltaY = getY() - pointB.getY();
    
    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
  }

  public PointCPDesign1 rotatePoint(double rotation){
    double radRotation = Math.toRadians(rotation);
    double X = getX();
    double Y = getY();
        
    return new PointCPDesign1('C',
      (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
      (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
  }
  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString(){
    return "Stored as " + (typeCoord == 'C' 
       ? "Cartesian  (" + getX() + "," + getY() + ")"
       : "Polar [" + getRho() + "," + getTheta() + "]") + "\n";
  }

}
