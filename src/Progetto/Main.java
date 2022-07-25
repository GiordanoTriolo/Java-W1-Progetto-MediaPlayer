package Progetto;

import java.util.Scanner;

import Classes.Audio;
import Classes.Image;
import Classes.Media;
import Classes.Video;


//prof le lascio questo commento per dirle che chiaramente si nota che il mio progetto è 
//molto simile a quello di altri, questo perchè non avendo precedentemente capito benissimo
//l'argomento (e sopratutto la traccia) mi sono fatto un po' aiutare in fase di scrittura.
//Il fatto che le lezioni del pomeriggio non fossero disponibili per un rewatch non ha sicuramente
//aiutato, ma dopo aver finito questo progetto mi sento di aver capito molto meglio le relazioni tra
//classi e interfacce. Avrei voluto svolgere l'esercizio seguendo la linea guida data dal prof della mattina
//ma non mi era molto chiara. Scusate e grazie.

public class Main {

	static Scanner scanner = new Scanner(System.in);
	
	//we want to choose what media to open
	public static void openMedia(Media[] media) {
		//we print the list of medias and their corresponding number
		System.out.println("Select the Media File you want to open:");
		for (int i = 0; i < media.length; i++) {
			System.out.println( i + " - " + media[i].title);
		}
		System.out.println("(0) - Exit");
		
		//we insert a value using the scanner
		int selected = Integer.parseInt(scanner.nextLine());
		
		//we use a switch to select the corresponding media
		switch(selected) {
		  case 1:
			    media[0].show();
			  break;
		  case 2:
			  	media[1].show();		    
			    break;
		  case 3:
			  	media[2].play();		    
				break;
		  case 4:
			    media[3].downVolume(20);
			    media[3].upBrightness(30);
			  	media[3].play();			    
				break;
		  case 5:
			  	media[4].play();			    
				break;
		  case 6:
			  	media[5].play();			    
				break;
		  case 0:
			    System.out.println("Exiting...");			    
				break;
		  default:
			    // code block
		}
	}
	
	
	public static void main(String[] args) {
		//we create an array of medias
		Media[] media = new Media[] { 
					new Image("image1.jpg", 5), 
					new Image("image2.jpg", 12), 
					new Video("video1.mp4", 30, 7, 100), 
					new Video("video2.mp4", 10, 10, 30), 
					new Audio("audio1.mp3", 60, 14), 
					new Audio("audio2.mp3", 15, 100)
				};

		openMedia(media);
	
	}

}
