//Implemented by Benjamin Nicholes
import java.util.Observable;
import java.util.Observer;


public class FollowerSimple implements Observer {

	private Observable observable;
	private String username;

	public FollowerSimple(Observable twitterUser, String name) {
		this.observable = twitterUser;
		this.username = name;
		observable.addObserver(this);
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

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof Tweeter) {
			Tweeter tweeter = (Tweeter) o;
			this.readTweet(tweeter.getTweet(),	tweeter.getUsername() );	
		}
		
		if (o instanceof SuperUser) {
			SuperUser tweeter = (SuperUser) o;
			this.readTweet(tweeter.getTweet(),	tweeter.getUsername() );	
		}
		
	}
	
	


}
