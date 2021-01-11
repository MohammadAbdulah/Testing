package MavenProject.CruiseControl;

import static org.junit.Assert.*;

import org.junit.Test;

public class CruiseControl_Test {
	CruiseControl control1 = new CruiseControl.Builder().setEngine(new GMEngine()).setBrake(new GMBrake()).setShaft(new ChevyShaft()).build();
	CruiseControl control2 = new CruiseControl.Builder().setEngine(new ChevyEngine()).setBrake(new GMBrake()).setShaft(new ChevyShaft()).build();
	
	@Test
	public void getProductInfo_GMBrake() {		 
		 assertEquals(" [ GM Brake ] ", control1.attribute.getBrake().getProductInfo());
	}
	
	@Test
	public void getProductInfo_ChevyShaft() {		 
		 assertEquals(" [ Chevy Shaft ] ", control1.attribute.getShaft().getProductInfo());
	}
	
	@Test
	public void getProductInfo_GMEngine() {		 
		 assertEquals(" [ GM Engine ] ", control1.attribute.getEngine().getProductInfo());
	}
	
	@Test
	public void getProductInfo_ChevyEngine() {		 
		 assertEquals(" [ Chevy Engine ] ", control2.attribute.getEngine().getProductInfo());
	}
}
