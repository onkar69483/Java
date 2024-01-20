class User {
	private String user_id;
	private String user_name;
	private Post posts[];
	private int post_number;
	
	public String getUser_id() {
		return user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public int getPost_number() {
		return post_number;
	}
	public User(String user_id, String user_name) {
		this.posts = new Post[10];
		this.user_id = user_id;
		this.user_name = user_name;
	}
	public void newPost(String post_name, String post_description) {
		if(this.post_number<10) {
			this.posts[this.post_number] = new Post(post_name, post_description);
			this.post_number++;
		}
		else {
			System.out.println("Cannot Post over 10 posts");
		}
	}
	public void getMyPostDetails() {
		
		System.out.println("\nMy Post Details: ");
		for(int i=0; i<this.post_number; i++) {
			System.out.println("*Post "+(i+1));
			this.posts[i].getPostDetails();
		}
		
	}
	public void getPosts(User user) {
		System.out.println("\nPost Details: ");
		System.out.println("UserId: "+user.user_id+", Name: "+user.user_name);
		for(int i=0; i<user.post_number; i++) {
			System.out.println("*Post "+(i+1));
			user.posts[i].getPostDetails();
		}
	}
	public void likePost(User user, String post_name) {
		for(int i=0;i<user.getPost_number();i++) {
			if(post_name==user.posts[i].getPost_name()) {
				user.posts[i].setLikes(1);
				System.out.println("\nLiking Post!");
				user.posts[i].getPostDetails();
				System.out.println("	Post "+(i+1)+" Liked!\n");
				return;
			}
		}
		System.out.println("Post not found!\n");
	}
	
	public void commentPost(User user, String post_name, String comment_des) {
		for(int i=0;i<user.getPost_number();i++) {
			if(post_name==user.posts[i].getPost_name()) {
				user.posts[i].createComment(this, comment_des);
				System.out.println("\nCommenting on Post!");
				user.posts[i].getPostDetails();
				System.out.println("	Post "+(i+1)+" Comment published!\n");
				return;
			}
		}
		System.out.println("Post not found!\n");
	}
}

class Post {
	private String description;
	private String post_name;
	private int likes;
	private Comment comment[];
	private int comment_count;
	
	public Post(String post_name, String description) {
		this.description = description;
		this.post_name = post_name;
		this.comment = new Comment[10];
		this.comment_count=0;
	}
	
	public void createComment(User user, String comment_des) {
		this.comment[this.comment_count] = new Comment(user, comment_des);
		this.comment_count++;
	}

	public void setLikes(int likes) {
		this.likes += likes;
	}

	
	
	public String getPost_name() {
		return post_name;
	}

	public void getPostDetails() {
		System.out.println("	Post Name: "+this.post_name);
		System.out.println("	Post Description: "+this.description);
		System.out.println("	Likes: "+this.likes);
		System.out.println("	Comments: ");
		for(int i=0; i<this.comment_count; i++) {
			System.out.println("		"+this.comment[i].getDescription()+" ---by "+this.comment[i].getCommentByUser().getUser_id());
		}
	}
	
}

class Comment {
	private String description;
	private User commentByUser;

	public Comment(User user, String description) {
		this.commentByUser = user;
		this.description = description;
	}


	public String getDescription() {
		return description;
	}


	public User getCommentByUser() {
		return commentByUser;
	}

	
}

public class SocialMedia {
	public static void main(String[] args) {
		User u1 = new User("onkarm", "Onkar");
		User u2 = new User("mihirh", "Mihir");
		User u3 = new User("sachinm", "Sachin");
		
		u1.newPost("Dog Post", "Dog is running");
		u1.newPost("Cat Post", "Cat is sleeping");
		
		u2.likePost(u1, "Dog Post");
		u2.commentPost(u1, "Cat Post", "I hate Cats buddy");
		
		u1.getMyPostDetails();
		
		u3.commentPost(u1, "Dog Post", "Dogs are great");
		
		u2.getPosts(u1);
	}
}

/*
 * create user;
 * user will post ;
 * create another user;
 * another user can post, comment, like;
 */
