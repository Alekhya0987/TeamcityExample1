package versioning.Model;

public class Rating 
{

	private int ratings;
	private String feedback;
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public Rating(int ratings, String feedback) {
		super();
		this.ratings = ratings;
		this.feedback = feedback;
	}
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Rating [ratings=" + ratings + ", feedback=" + feedback + "]";
	}
	
}
