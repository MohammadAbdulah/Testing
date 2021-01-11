package MavenProject.CruiseControl;

public class CruiseControl {

	Attribute attribute = new Attribute();
	
	private CruiseControl(Builder builder) {
		this.attribute.brake = builder.attribute.brake;
		this.attribute.engine = builder.attribute.engine;
		this.attribute.shaft = builder.attribute.shaft;
	}

	public void printInfo() {
		System.out.println(this.attribute.brake.getProductInfo() + this.attribute.engine.getProductInfo() 
		+ this.attribute.shaft.getProductInfo() + "\n");
	}
	
	public static class Builder{
		Attribute attribute = new Attribute();
		
		public Builder setEngine(IEngine engine) {
			attribute.engine = engine;
			return this;
		}
		
		public Builder setShaft(IShaft shaft) {
			attribute.shaft = shaft;
			return this;
		}
		
		public Builder setBrake(IBrake brake) {
			attribute.brake = brake;
			return this;
		}
		
		public CruiseControl build() {
			return new CruiseControl(this);
		}
	}
	
	static class Attribute{
		private IBrake brake;
		private IEngine engine;
		private IShaft shaft;
		
		public IBrake getBrake() {
			return brake;
		}
		public IEngine getEngine() {
			return engine;
		}
		public IShaft getShaft() {
			return shaft;
		}
	}
}