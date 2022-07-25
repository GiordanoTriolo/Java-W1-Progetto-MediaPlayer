package Classes;

public abstract class Media {

	//every media has a title so we define it in the abstract class
	public String title;
	
	//constructor
	public Media(String title) {
		this.title = title;
	}

	//media methods, we then divide them using interfaces
	
	public void show() {
	}

	public void play() {
	}
	
	public void upVolume(int val) {
	}

	public void downVolume(int val) {
	}

	public void upBrightness(int val) {
	}

	public void downBrightness(int val) {
	}
	
}
