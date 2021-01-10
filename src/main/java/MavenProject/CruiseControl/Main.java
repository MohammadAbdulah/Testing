package MavenProject.CruiseControl;

public class Main {
	public static void main(String args[]) throws InterruptedException {

		System.out.println("Start Main ...");

		CruiseControl firstCombo = new CruiseControl.Builder().setEngine(new GMEngine()).setBrake(new GMBrake()).setShaft(new ChevyShaft()).build();
		CruiseControl secondCombo = new CruiseControl.Builder().setEngine(new GMEngine()).setBrake(new GMBrake()).setShaft(new GMShaft()).build();
		
		firstCombo.printInfo();
		secondCombo.printInfo();
	}
}
