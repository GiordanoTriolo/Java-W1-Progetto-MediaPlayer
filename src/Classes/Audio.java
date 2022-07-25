package Classes;
import Interfaces.Playable;

public class Audio extends Media implements Playable{

	//Audio class variables
	private int duration;
	private int volume;
	
	//constructor
	public Audio(String title, int duration, int volume) {
		
		super(title);
		this.duration = duration;
		this.volume = volume;
		
	}

	//Playable interface methods override
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
		String volumeCount = "";
	
		for ( int i = 0; i < this.volume; i++ ) {
			
			volumeCount += "!";
			
			}
		
		for ( int i = 0; i < this.duration; i++ ) {
			
			//I print the title followed by as much ! as the volume's value, once for each seconds of the audio's duration
			System.out.println(title + volumeCount);
			
			}	
	}

	@Override
	public void upVolume(int val) {
		// TODO Auto-generated method stub
		for(int i = 0; i < val; i++) {
			volume++;
		}	
	}

	@Override
	public void downVolume(int val) {
		// TODO Auto-generated method stub
		for(int i = 0; i < val; i++) {
			volume--;
		}	
		
	}

}
