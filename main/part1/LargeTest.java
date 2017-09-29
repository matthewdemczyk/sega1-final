import java.util.Random;

public class LargeTest{
//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
//test creation methods
	public static long testCreationOfPolarDesign1(int amountToCreate){
		long timeBeforeOperation,timeAfterOperation;
		timeBeforeOperation=System.currentTimeMillis();
		PointCPDesign1 arrayPoints[] = new PointCPDesign1[amountToCreate];
		for (int i=0; i<amountToCreate; i++){
			arrayPoints[i] = new PointCPDesign1('P',i,i);
		}
		timeAfterOperation=System.currentTimeMillis();

		return timeAfterOperation - timeBeforeOperation;
	}
	public static long testCreationOfCartesianDesign1(int amountToCreate){
		long timeBeforeOperation,timeAfterOperation;
		timeBeforeOperation=System.currentTimeMillis();
		PointCPDesign1 arrayPoints[] = new PointCPDesign1[amountToCreate];
		for (int i=0; i<amountToCreate; i++){
			arrayPoints[i] = new PointCPDesign1('C',i,i);
		}
		timeAfterOperation=System.currentTimeMillis();

		return timeAfterOperation - timeBeforeOperation;
	}
	public static long testCreationOfPolarDesign5(int amountToCreate){
		long timeBeforeOperation,timeAfterOperation;
		timeBeforeOperation=System.currentTimeMillis();
		PointCPDesign5 arrayPoints[] = new PointCPDesign5[amountToCreate];
		for (int i=0; i<amountToCreate; i++){
			arrayPoints[i] = new PointCPPolarDesign5(i,i);
		}
		timeAfterOperation=System.currentTimeMillis();

		return timeAfterOperation - timeBeforeOperation;
	}
	public static long testCreationOfCartesianDesign5(int amountToCreate){
		long timeBeforeOperation,timeAfterOperation;
		timeBeforeOperation=System.currentTimeMillis();
		PointCPDesign5 arrayPoints[] = new PointCPDesign5[amountToCreate];
		for (int i=0; i<amountToCreate; i++){
			arrayPoints[i] = new PointCPCartesianDesign5(i,i);
		}
		timeAfterOperation=System.currentTimeMillis();

		return timeAfterOperation - timeBeforeOperation;
	}

	public static long testCreationOfPolarDesign2(int amountToCreate){
		long timeBeforeOperation,timeAfterOperation;
		timeBeforeOperation=System.currentTimeMillis();
		PointCPDesign2 arrayPoints[] = new PointCPDesign2[amountToCreate];
		for (int i=0; i<amountToCreate; i++){
			arrayPoints[i] = new PointCPDesign2('P',i,i);
		}
		timeAfterOperation=System.currentTimeMillis();

		return timeAfterOperation - timeBeforeOperation;
	}
	public static long testCreationOfCartesianDesign2(int amountToCreate){
		long timeBeforeOperation,timeAfterOperation;
		timeBeforeOperation=System.currentTimeMillis();
		PointCPDesign2 arrayPoints[] = new PointCPDesign2[amountToCreate];
		for (int i=0; i<amountToCreate; i++){
			arrayPoints[i] = new PointCPDesign2('C',i,i);
		}
		timeAfterOperation=System.currentTimeMillis();

		return timeAfterOperation - timeBeforeOperation;
	}
	public static long testCreationOfPolarDesign3(int amountToCreate){
		long timeBeforeOperation,timeAfterOperation;
		timeBeforeOperation=System.currentTimeMillis();
		PointCPDesign3 arrayPoints[] = new PointCPDesign3[amountToCreate];
		for (int i=0; i<amountToCreate; i++){
			arrayPoints[i] = new PointCPDesign3('P',i,i);
		}
		timeAfterOperation=System.currentTimeMillis();

		return timeAfterOperation - timeBeforeOperation;
	}
	public static long testCreationOfCartesianDesign3(int amountToCreate){
		long timeBeforeOperation,timeAfterOperation;
		timeBeforeOperation=System.currentTimeMillis();
		PointCPDesign3 arrayPoints[] = new PointCPDesign3[amountToCreate];
		for (int i=0; i<amountToCreate; i++){
			arrayPoints[i] = new PointCPDesign3('C',i,i);
		}
		timeAfterOperation=System.currentTimeMillis();

		return timeAfterOperation - timeBeforeOperation;
	}
//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
//test getX() test getY() test getRho() and test getTheta() methods
	public static long testRetreivingXYFromPolarDesign1(int amountToCreate){
		long timeBeforeOperation,timeAfterOperation;
		timeBeforeOperation=System.currentTimeMillis();
		PointCPDesign1 arrayPoints[] = new PointCPDesign1[amountToCreate];
		double arrayPointsGetX[] = new double[amountToCreate];
		double arrayPointsGetY[] = new double[amountToCreate];
		for (int i=0; i<amountToCreate; i++){
			arrayPoints[i] = new PointCPDesign1('P',i,i);
			arrayPointsGetX[i] = arrayPoints[i].getX(); 
			arrayPointsGetY[i] = arrayPoints[i].getY();
		}
		timeAfterOperation=System.currentTimeMillis();
		return timeAfterOperation - timeBeforeOperation;
	}

	public static long testRetreivingRTFromPolarDesign1(int amountToCreate){
		long timeBeforeOperation,timeAfterOperation;
		timeBeforeOperation=System.currentTimeMillis();
		PointCPDesign1 arrayPoints[] = new PointCPDesign1[amountToCreate];
		double arrayPointsGetRho[] = new double[amountToCreate];
		double arrayPointsGetTheta[] = new double[amountToCreate];
		for (int i=0; i<amountToCreate; i++){
			arrayPoints[i] = new PointCPDesign1('P',i,i);
			arrayPointsGetRho[i] = arrayPoints[i].getRho(); 
			arrayPointsGetTheta[i] = arrayPoints[i].getTheta();
		}
		timeAfterOperation=System.currentTimeMillis();
		return timeAfterOperation - timeBeforeOperation;
	}
	public static long testRetreivingXYFromCartesianDesign1(int amountToCreate){
		long timeBeforeOperation,timeAfterOperation;
		timeBeforeOperation=System.currentTimeMillis();
		PointCPDesign1 arrayPoints[] = new PointCPDesign1[amountToCreate];
		double arrayPointsGetX[] = new double[amountToCreate];
		double arrayPointsGetY[] = new double[amountToCreate];
		for (int i=0; i<amountToCreate; i++){
			arrayPoints[i] = new PointCPDesign1('C',i,i);
			arrayPointsGetX[i] = arrayPoints[i].getX(); 
			arrayPointsGetY[i] = arrayPoints[i].getY();
		}
		timeAfterOperation=System.currentTimeMillis();
		return timeAfterOperation - timeBeforeOperation;
	}

	public static long testRetreivingRTFromCartesianDesign1(int amountToCreate){
		long timeBeforeOperation,timeAfterOperation;
		timeBeforeOperation=System.currentTimeMillis();
		PointCPDesign1 arrayPoints[] = new PointCPDesign1[amountToCreate];
		double arrayPointsGetRho[] = new double[amountToCreate];
		double arrayPointsGetTheta[] = new double[amountToCreate];
		for (int i=0; i<amountToCreate; i++){
			arrayPoints[i] = new PointCPDesign1('C',i,i);
			arrayPointsGetRho[i] = arrayPoints[i].getRho(); 
			arrayPointsGetTheta[i] = arrayPoints[i].getTheta();
		}
		timeAfterOperation=System.currentTimeMillis();
		return timeAfterOperation - timeBeforeOperation;
	}
	//design 5 below
	public static long testRetreivingXYFromPolarDesign5(int amountToCreate){
		long timeBeforeOperation,timeAfterOperation;
		timeBeforeOperation=System.currentTimeMillis();
		PointCPDesign5 arrayPoints[] = new PointCPDesign5[amountToCreate];
		double arrayPointsGetX[] = new double[amountToCreate];
		double arrayPointsGetY[] = new double[amountToCreate];
		for (int i=0; i<amountToCreate; i++){
			arrayPoints[i] = new PointCPPolarDesign5(i,i);
			arrayPointsGetX[i] = arrayPoints[i].getX(); 
			arrayPointsGetY[i] = arrayPoints[i].getY();
		}
		timeAfterOperation=System.currentTimeMillis();
		return timeAfterOperation - timeBeforeOperation;
	}

	public static long testRetreivingRTFromPolarDesign5(int amountToCreate){
		long timeBeforeOperation,timeAfterOperation;
		timeBeforeOperation=System.currentTimeMillis();
		PointCPDesign5 arrayPoints[] = new PointCPDesign5[amountToCreate];
		double arrayPointsGetRho[] = new double[amountToCreate];
		double arrayPointsGetTheta[] = new double[amountToCreate];
		for (int i=0; i<amountToCreate; i++){
			arrayPoints[i] = new PointCPPolarDesign5(i,i);
			arrayPointsGetRho[i] = arrayPoints[i].getRho(); 
			arrayPointsGetTheta[i] = arrayPoints[i].getTheta();
		}
		timeAfterOperation=System.currentTimeMillis();
		return timeAfterOperation - timeBeforeOperation;
	}
	public static long testRetreivingXYFromCartesianDesign5(int amountToCreate){
		long timeBeforeOperation,timeAfterOperation;
		timeBeforeOperation=System.currentTimeMillis();
		PointCPDesign5 arrayPoints[] = new PointCPDesign5[amountToCreate];
		double arrayPointsGetX[] = new double[amountToCreate];
		double arrayPointsGetY[] = new double[amountToCreate];
		for (int i=0; i<amountToCreate; i++){
			arrayPoints[i] = new PointCPCartesianDesign5(i,i);
			arrayPointsGetX[i] = arrayPoints[i].getX(); 
			arrayPointsGetY[i] = arrayPoints[i].getY();
		}
		timeAfterOperation=System.currentTimeMillis();
		return timeAfterOperation - timeBeforeOperation;
	}

	public static long testRetreivingRTFromCartesianDesign5(int amountToCreate){
		long timeBeforeOperation,timeAfterOperation;
		timeBeforeOperation=System.currentTimeMillis();
		PointCPDesign5 arrayPoints[] = new PointCPDesign5[amountToCreate];
		double arrayPointsGetRho[] = new double[amountToCreate];
		double arrayPointsGetTheta[] = new double[amountToCreate];
		for (int i=0; i<amountToCreate; i++){
			arrayPoints[i] = new PointCPCartesianDesign5(i,i);
			arrayPointsGetRho[i] = arrayPoints[i].getRho(); 
			arrayPointsGetTheta[i] = arrayPoints[i].getTheta();
		}
		timeAfterOperation=System.currentTimeMillis();
		return timeAfterOperation - timeBeforeOperation;
	}
	//designs 2 and 3
	public static long testRetreivingXYFromDesign2(int amountToCreate){
		long timeBeforeOperation,timeAfterOperation;
		timeBeforeOperation=System.currentTimeMillis();
		PointCPDesign2 arrayPoints[] = new PointCPDesign2[amountToCreate];
		double arrayPointsGetX[] = new double[amountToCreate];
		double arrayPointsGetY[] = new double[amountToCreate];
		for (int i=0; i<amountToCreate; i++){
			arrayPoints[i] = new PointCPDesign2('P',i,i);
			arrayPointsGetX[i] = arrayPoints[i].getX(); 
			arrayPointsGetY[i] = arrayPoints[i].getY();
		}
		timeAfterOperation=System.currentTimeMillis();
		return timeAfterOperation - timeBeforeOperation;
	}
	public static long testRetreivingRTFromDesign2(int amountToCreate){
		long timeBeforeOperation,timeAfterOperation;
		timeBeforeOperation=System.currentTimeMillis();
		PointCPDesign2 arrayPoints[] = new PointCPDesign2[amountToCreate];
		double arrayPointsGetX[] = new double[amountToCreate];
		double arrayPointsGetY[] = new double[amountToCreate];
		for (int i=0; i<amountToCreate; i++){
			arrayPoints[i] = new PointCPDesign2('P',i,i);
			arrayPointsGetX[i] = arrayPoints[i].getRho(); 
			arrayPointsGetY[i] = arrayPoints[i].getTheta();
		}
		timeAfterOperation=System.currentTimeMillis();
		return timeAfterOperation - timeBeforeOperation;
	}
	public static long testRetreivingXYFromDesign3(int amountToCreate){
		long timeBeforeOperation,timeAfterOperation;
		timeBeforeOperation=System.currentTimeMillis();
		PointCPDesign3 arrayPoints[] = new PointCPDesign3[amountToCreate];
		double arrayPointsGetX[] = new double[amountToCreate];
		double arrayPointsGetY[] = new double[amountToCreate];
		for (int i=0; i<amountToCreate; i++){
			arrayPoints[i] = new PointCPDesign3('C',i,i);
			arrayPointsGetX[i] = arrayPoints[i].getX(); 
			arrayPointsGetY[i] = arrayPoints[i].getY();
		}
		timeAfterOperation=System.currentTimeMillis();
		return timeAfterOperation - timeBeforeOperation;
	}
	public static long testRetreivingRTFromDesign3(int amountToCreate){
		long timeBeforeOperation,timeAfterOperation;
		timeBeforeOperation=System.currentTimeMillis();
		PointCPDesign3 arrayPoints[] = new PointCPDesign3[amountToCreate];
		double arrayPointsGetX[] = new double[amountToCreate];
		double arrayPointsGetY[] = new double[amountToCreate];
		for (int i=0; i<amountToCreate; i++){
			arrayPoints[i] = new PointCPDesign3('C',i,i);
			arrayPointsGetX[i] = arrayPoints[i].getRho(); 
			arrayPointsGetY[i] = arrayPoints[i].getTheta();
		}
		timeAfterOperation=System.currentTimeMillis();
		return timeAfterOperation - timeBeforeOperation;
	}

	////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////
	//testing other methods below

	public static long testGetDistanceCartesianDesign5(int times){   //finds distance between two cartesian
		 
		Random r = new Random();
		long startTime, endTime;
		PointCPDesign5 newPoints[] = new PointCPDesign5[times];
		PointCPDesign5 otherPoints[] = new PointCPDesign5[times];
		double distances[] = new double[times];

		startTime = System.currentTimeMillis();

		for (int i = 0; i < times; i++){
				newPoints[i] = new PointCPCartesianDesign5(r.nextInt(times),r.nextInt(times));
				otherPoints[i] = new PointCPCartesianDesign5(r.nextInt(times), r.nextInt(times));
				distances[i] = newPoints[i].getDistance(otherPoints[i]);	
		}
		endTime = System.currentTimeMillis() - startTime;
		return endTime;
	}

		public static long testGetDistancePolarDesign5(int times){   //finds distance between two polar
		 
		Random r = new Random();
		long startTime, endTime;
		PointCPDesign5 newPoints[] = new PointCPDesign5[times];
		PointCPDesign5 otherPoints[] = new PointCPDesign5[times];
		double distances[] = new double[times];

		startTime = System.currentTimeMillis();

		for (int i = 0; i < times; i++){
				newPoints[i] = new PointCPPolarDesign5(r.nextInt(times),r.nextInt(times));
				otherPoints[i] = new PointCPPolarDesign5(r.nextInt(times), r.nextInt(times));
				distances[i] = newPoints[i].getDistance(otherPoints[i]);	
		}
		endTime = System.currentTimeMillis() - startTime;
		return endTime;
	}

		public static long testGetDistanceMixedDesign5(int times){   //finds distance between one cart, one polar
		 
		Random r = new Random();
		long startTime, endTime;
		PointCPDesign5 newPoints[] = new PointCPDesign5[times];
		PointCPDesign5 otherPoints[] = new PointCPDesign5[times];
		double distances[] = new double[times];

		startTime = System.currentTimeMillis();

		for (int i = 0; i < times; i++){
				newPoints[i] = new PointCPPolarDesign5(r.nextInt(times),r.nextInt(times));
				otherPoints[i] = new PointCPCartesianDesign5(r.nextInt(times), r.nextInt(times));
				distances[i] = newPoints[i].getDistance(otherPoints[i]);	
		}
		endTime = System.currentTimeMillis() - startTime;
		return endTime;
	}


	public static long testGetDistancePolarDesign1(int times){   //finds distance between polar and polar
	
		PointCPDesign1 newPoints[] = new PointCPDesign1[times];
		PointCPDesign1 otherPoints[] = new PointCPDesign1[times];
		double distances[] = new double[times]; 
		Random r = new Random();
		long startTime, endTime;

		startTime = System.currentTimeMillis();

		for (int i = 0; i < times; i++){

				newPoints[i] = new PointCPDesign1('P', r.nextInt(times),r.nextInt(times));
				otherPoints[i] = new PointCPDesign1('P', r.nextInt(times), r.nextInt(times));
				distances[i]= newPoints[i].getDistance(otherPoints[i]);
			}	
		
		endTime = System.currentTimeMillis() - startTime;
		return endTime;
	}

	public static long testGetDistanceCartesianDesign1(int times){   //finds distance between cartesian and cartesian 
	
		PointCPDesign1 newPoints[] = new PointCPDesign1[times];
		PointCPDesign1 otherPoints[] = new PointCPDesign1[times];
		double distances[] = new double[times]; 
		Random r = new Random();
		long startTime, endTime;

		startTime = System.currentTimeMillis();

		for (int i = 0; i < times; i++){

				newPoints[i] = new PointCPDesign1('C', r.nextInt(times),r.nextInt(times));
				otherPoints[i] = new PointCPDesign1('C', r.nextInt(times), r.nextInt(times));
				distances[i]= newPoints[i].getDistance(otherPoints[i]);
			}	
		
		endTime = System.currentTimeMillis() - startTime;
		return endTime;
	}

	public static long testGetDistanceMixedDesign1(int times){   //finds distance between polar and cartesian design 1
	
		PointCPDesign1 newPoints[] = new PointCPDesign1[times];
		PointCPDesign1 otherPoints[] = new PointCPDesign1[times];
		double distances[] = new double[times]; 
		Random r = new Random();
		long startTime, endTime;

		startTime = System.currentTimeMillis();

		for (int i = 0; i < times; i++){

				newPoints[i] = new PointCPDesign1('C', r.nextInt(times),r.nextInt(times));
				otherPoints[i] = new PointCPDesign1('P', r.nextInt(times), r.nextInt(times));
				distances[i]= newPoints[i].getDistance(otherPoints[i]);
			}	

		endTime = System.currentTimeMillis() - startTime;
		return endTime;
	}

	public static long testRotatePointPolarDesign5(int times){

		Random r = new Random();
		long startTime, endTime;
		startTime = System.currentTimeMillis();

		PointCPDesign5 newPoints[] = new PointCPDesign5[times];
		PointCPDesign5 rotatedPoints[] = new PointCPDesign5[times];

		for (int i = 0 ; i < times; i++){

				newPoints[i] = new PointCPPolarDesign5(r.nextInt(times),r.nextInt(times));
				rotatedPoints[i] = newPoints[i].rotatePoint((double)r.nextInt(360));		
		}
		
		endTime = System.currentTimeMillis() - startTime;

		return endTime;
	}

	public static long testRotatePointCartesianDesign5(int times){

		Random r = new Random();
		long startTime, endTime;
		startTime = System.currentTimeMillis();

		PointCPDesign5 newPoints[] = new PointCPDesign5[times];
		PointCPDesign5 rotatedPoints[] = new PointCPDesign5[times];

		for (int i = 0 ; i < times; i++){

				newPoints[i] = new PointCPCartesianDesign5(r.nextInt(times),r.nextInt(times));
				rotatedPoints[i] = newPoints[i].rotatePoint((double)r.nextInt(360));		
		}
		
		endTime = System.currentTimeMillis() - startTime;

		return endTime;
	}

	public static long testRotatePointPolarDesign1(int times){
		Random r = new Random();
		long startTime, endTime;
		startTime = System.currentTimeMillis();

		PointCPDesign1 newPoints[] = new PointCPDesign1[times];
		PointCPDesign1 rotatedPoints[] = new PointCPDesign1[times];

		for (int i = 0 ; i < times; i++){

			newPoints[i] = new PointCPDesign1('P', r.nextInt(times),r.nextInt(times));
			rotatedPoints[i] = newPoints[i].rotatePoint((double)r.nextInt(360));
		}
		
		endTime = System.currentTimeMillis() - startTime;

		return endTime;
	}

	public static long testRotatePointCartesianDesign1(int times){
		Random r = new Random();
		long startTime, endTime;
		startTime = System.currentTimeMillis();

		PointCPDesign1 newPoints[] = new PointCPDesign1[times];
		PointCPDesign1 rotatedPoints[] = new PointCPDesign1[times];

		for (int i = 0 ; i < times; i++){
		
				newPoints[i] = new PointCPDesign1('C',r.nextInt(times),r.nextInt(times));
				rotatedPoints[i] = newPoints[i].rotatePoint((double)r.nextInt(360));
			}

		endTime = System.currentTimeMillis() - startTime;

		return endTime;
	}

	public static long testGetDistancePolarDesign2(int times){   //finds distance between polar and polar
	
		PointCPDesign2 newPoints[] = new PointCPDesign2[times];
		PointCPDesign2 otherPoints[] = new PointCPDesign2[times];
		double distances[] = new double[times]; 
		Random r = new Random();
		long startTime, endTime;

		startTime = System.currentTimeMillis();

		for (int i = 0; i < times; i++){

				newPoints[i] = new PointCPDesign2('P', r.nextInt(times),r.nextInt(times));
				otherPoints[i] = new PointCPDesign2('P', r.nextInt(times), r.nextInt(times));
				distances[i]= newPoints[i].getDistance(otherPoints[i]);
			}	
		
		endTime = System.currentTimeMillis() - startTime;
		return endTime;
	}
	public static long testGetDistanceCartesianDesign3(int times){   //finds distance between cartesian and cartesian
	
		PointCPDesign3 newPoints[] = new PointCPDesign3[times];
		PointCPDesign3 otherPoints[] = new PointCPDesign3[times];
		double distances[] = new double[times]; 
		Random r = new Random();
		long startTime, endTime;

		startTime = System.currentTimeMillis();

		for (int i = 0; i < times; i++){

				newPoints[i] = new PointCPDesign3('C', r.nextInt(times),r.nextInt(times));
				otherPoints[i] = new PointCPDesign3('C', r.nextInt(times), r.nextInt(times));
				distances[i]= newPoints[i].getDistance(otherPoints[i]);
			}	
		
		endTime = System.currentTimeMillis() - startTime;
		return endTime;
	}
	public static long testRotatePointDesign2(int times){

		Random r = new Random();
		PointCPDesign2[] newPoints = new PointCPDesign2[times];
		PointCPDesign2[] rotatedPoints = new PointCPDesign2[times];
		long startTime, endTime;
		
		startTime = System.currentTimeMillis();

		for (int i = 0; i < times; i ++){
			newPoints[i] = new PointCPDesign2('P',i,i);
			rotatedPoints[i]= newPoints[i].rotatePoint(r.nextInt(361));
		}

		endTime = System.currentTimeMillis() - startTime;

		return endTime;
	} 

	public static long testRotatePointDesign3(int times){

		Random r = new Random();
		PointCPDesign3[] newPoints = new PointCPDesign3[times];
		PointCPDesign3[] rotatedPoints = new PointCPDesign3[times];
		long startTime, endTime;
		
		startTime = System.currentTimeMillis();

		for (int i = 0; i < times; i ++){
			newPoints[i] = new PointCPDesign3('C',i,i);
			rotatedPoints[i]= newPoints[i].rotatePoint(r.nextInt(361));
		}

		endTime = System.currentTimeMillis() - startTime;

		return endTime;
	} 



	public static void main(String args[]){
		int N=10000000; //set this to a number and pass it as an argument to the method you want to test
		//add methods to test here, cleared the main method for submmision. this file is for documentation of the test methods we used
		System.out.println("Testing method get distance from 10,000,000 Design2:" + testGetDistancePolarDesign2(N) + " ms");
	}
}