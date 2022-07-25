package Classes;
import Interfaces.Playable;
import Interfaces.Viewable;

public class Video extends Media implements Viewable, Playable{

	//Video class variables
	private int volume;
	private int brightness;
	private int duration;
	

	//constructor 
	public Video(String title, int duration, int brightness, int volume) {
		
		super(title);
		this.duration = duration;
		this.brightness = brightness;
		this.volume = volume;
	
	}
	
	//Overriding of the methods of the two interfaces, Viewable and Playable
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
		//the show method is empty because we do everything in play()
		
	}


	@Override
	public void play() {
		// TODO Auto-generated method stub
		
		String volumeCount = "";
	
		for ( int i = 0; i < this.volume; i++ ) {
			
			volumeCount += "!";
			
			}
		
		String brightnessCount = "";
		
		for ( int i = 0; i < this.brightness; i++ ) {
			
			brightnessCount += "*";
			
			}
		
		for ( int i = 0; i < this.duration; i++ ) {
			
			System.out.println(title + volumeCount + brightnessCount);
			
			}	
	}


	@Override
	public void upVolume(int val) {
		for(int i = 0; i < val; i++) {
			volume++;
		}	
	}


	@Override
	public void downVolume(int val) {
		for(int i = 0; i < val; i++) {
			volume--;
		}	
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

