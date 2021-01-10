package MavenProject.CruiseControl;

public interface IEngine {
	public static final String productName = "Engine";

	public void adjustThrottle();

	public String getProductInfo();
}
