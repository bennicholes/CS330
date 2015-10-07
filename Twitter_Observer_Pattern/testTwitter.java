//Implemented by Benjamin Nicholes
public class testTwitter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				// Tests for simple user, follower, and Superuser who can tweet and follow.
				// Through testing in proved that a Tweeter can only tweet. A simple follower can only follow.
				// A SuperUser can follow and tweet, they can follow other superUsers and simple tweeters. And be followed
				// by simple tweeters and other SuperUsers
				Tweeter Ben = new Tweeter("Ben");
				FollowerSimple John = new FollowerSimple(Ben, "John");
				FollowerSimple Hannah = new FollowerSimple(Ben, "Hannah");
				
				Ben.tweet("Hello dudes");
				
				Tweeter Sally = new Tweeter("Sally");
				Hannah.follow(Sally);
				Sally.tweet("Hi everyone");
				
				John.follow(Sally);
				Sally.tweet("I need more followers");
				John.unfollow(Sally);
				Sally.tweet("Follow me please");
				
				SuperUser Scott = new SuperUser("Scott");
				SuperUser Daryl = new SuperUser("Daryl");
				Hannah.follow(Scott);
				Scott.follow(Ben);
				Daryl.follow(Scott);
				Scott.follow(Daryl);
				Scott.tweet("I tweet provocative things");
				Ben.tweet("I need to tweet things because im really important");
				Scott.tweet("Im so important. Listen to me. Pay attention to me");
				Daryl.tweet("I hope people think my online persona is a reflection of my real self, its a lot cooler");
			}

}
