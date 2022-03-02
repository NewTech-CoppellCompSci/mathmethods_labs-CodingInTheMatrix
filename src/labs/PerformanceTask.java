package labs;

import java.util.Scanner;

public class PerformanceTask {

	public static void main(String[] args) {

		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter launch velocity: ");
		int velocity = inKey.nextInt();
		System.out.print("Enter launch angle: ");
		int angle = inKey.nextInt();
		
		int x = velocity;
		int y = angle;
		
		double angle2 = Math.sqrt(angle);
		Math.cos(Math.toRadians(angle));
		Math.sin(Math.toRadians(angle));
		
		
		
		System.out.println("Time: 0s");
		System.out.println("pos x: " + Math.cos(angle) * 3 * velocity);
		System.out.println("pos y: " + Math.sin(angle) * 3 * velocity + 0.5 * 9.8 * angle2);
		
		
		
	}
	
	
}
