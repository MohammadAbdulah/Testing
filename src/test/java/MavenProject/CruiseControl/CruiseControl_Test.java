package MavenProject.CruiseControl;

import static org.junit.Assert.*;

import org.junit.Test;

public class CruiseControl_Test {
	CruiseControl control = new CruiseControl.Builder().setEngine(new GMEngine()).setBrake(new GMBrake()).setShaft(new ChevyShaft()).build();
	
	@Test
	public void getProductInfo_GMBrake() {		 
		 assertEquals(" [ GM Brake ] ", control.attribute.getBrake().getProductInfo());
	}
	
	@Test
	public void getProductInfo_ChevyShaft() {		 
		 assertEquals(" [ Chevy Shaft ] ", control.attribute.getShaft().getProductInfo());
	}
	
	@Test
	public void getProductInfo_GMEngine() {		 
		 assertEquals(" [ GM Engine ] ", control.attribute.getEngine().getProductInfo());
	}
}
