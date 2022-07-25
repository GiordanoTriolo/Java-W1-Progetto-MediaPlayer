package Classes;
import Interfaces.Viewable;

public class Image extends Media implements Viewable{

	//Image class variables
	private int brightness;
	
	//constructor
	public Image(String title, int brightness) {
		
		super(title);
		this.brightness = brightness;

	}
	
	//Viewable methods override
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		String brightnessCount = "";
		
		for ( int i = 0; i < this.brightness; i++ ) {
			
			brightnessCount += "*";
			
			}
		
		//I print the title followed by as much * as the brightness's value
		System.out.println(title + brightnessCount);
		
	}
	
	@Override
	public void upBrightness(int val) {
		for(int i = 0; i < val; i++) {
			brightness++;
		}	
		
	}

	@Override
	public void downBrightness(int val) {
		for(int i = 0; i < val; i++) {
			brightness--;
		}	
	}
}
