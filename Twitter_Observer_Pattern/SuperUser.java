//Implemented by Benjamin Nicholes
import java.util.Observable;
import java.util.Observer;

public class SuperUser extends Observable implements Observer{

	Tweeter tweeter;
	FollowerSimple simple;
	private String tweet = "";
	private String username = "";
	Observable observable;
	
	public SuperUser( String username ){
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
	
	public void readTweet( String userTweet, String username) {
		System.out.println(this.username + " follows " + username + " and they tweeted " + userTweet );	
	}
	
	public void follow( Observable user ){
		this.observable = user;
		observable.addObserver(this);
	}
	
	public void unfollow(Observable user){
		observable.deleteObserver(this);
	}
	
	public String getUsername(){
		return username;
	}
	
	public String getTweet(){
		return tweet;
	}
	
	
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof SuperUser ) {
			SuperUser tweeter = (SuperUser) o;
			this.readTweet(tweeter.getTweet(),	tweeter.getUsername() );	
		}
		
		if (o instanceof Tweeter ) {
			Tweeter tweeter = (Tweeter) o;
			this.readTweet(tweeter.getTweet(),	tweeter.getUsername() );	
		}
	}
	

}
