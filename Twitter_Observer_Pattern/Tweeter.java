//Implemented by Benjamin Nicholes
import java.util.Observable;


public class Tweeter extends Observable{
	
	private String username = "";
	private String tweet = "";

	public Tweeter( String username ){
		this.username = username;
	}
	
	public void tweet( String tweet ){
		if( tweet.length() > 140 || tweet.length() <= 0 ){
			System.err.println("Tweet is either too long or too short");
		}
		else{
			this.tweet = tweet;
			setChanged();
			notifyObservers();
		}
	}
	
	
	
	public String getUsername(){
		return username;
	}
	
	public String getTweet(){
		return tweet;
	}
	

	

}
