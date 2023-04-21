package versioning.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import versioning.Model.Rating;
import versioning.Model.Shoe;

@Service
public class ShoeService {

	private List<Shoe> shoeDetails;
	private List<Rating> ratingDetails;

	public List<Shoe> allShoes() {
		shoeDetails = new ArrayList<Shoe>(List.of(new Shoe("Flops", "Adidas"), new Shoe("Sandals", "Puma"),
				new Shoe("Loafers", "Jack&Jones"), new Shoe("Sneakers", "Nike")));
		return shoeDetails;
	}

	public List<Rating> allratings() {
		ratingDetails = new ArrayList<Rating>(
				List.of(new Rating(5, "Good"), new Rating(10, "Excellent"), new Rating(6, "Nice")));
		return ratingDetails;
	}
}
