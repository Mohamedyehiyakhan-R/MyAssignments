package week1Day1;

public class Browser {
	public void launchBrowser() {
		System.out.println("Browser load successfully \n");
	}
	public void loadUrl() {
		System.out.println("URL launch Successfully");
	}
	public static void main(String[] args) {
		Browser obj= new Browser();
		obj.launchBrowser();
		obj.loadUrl();
	}
}
