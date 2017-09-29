public abstract class PointCPDesign5{
  abstract double getX();
	abstract double getY();
	abstract double getTheta();
	abstract double getRho();
	
	public PointCPCartesianDesign5 convertStorageToCartesian(){
  	return new PointCPCartesianDesign5 (getX(), getY());
  }
  public PointCPPolarDesign5 convertStorageToPolar(){
  	return new PointCPPolarDesign5 (getRho(), getTheta());
  }
  public double getDistance(PointCPDesign5 pointB){
   	double deltaX = getX() - pointB.getX(); //doesnt matter what type, both subclasses have getX and getY
   	double deltaY = getY() - pointB.getY();
   	return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));//pythagorean thm
  }


public PointCPCartesianDesign5 rotatePoint(double rotation){
    double radRotation = Math.toRadians(rotation);
    double X = getX();
    double Y = getY();
        
    return new PointCPCartesianDesign5((Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),(Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
  }
}