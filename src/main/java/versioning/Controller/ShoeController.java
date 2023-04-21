package versioning.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import versioning.Model.Shoe;
import versioning.Model.Rating;
import versioning.Service.ShoeService;

@RestController
public class ShoeController
{
  
	@Autowired
	private ShoeService shoeService;
	
	//1.URI Versioning
	@GetMapping("/uriversioning/shoe")
	public List<Shoe> version()
	{
		return shoeService.allShoes();
	}
	@GetMapping("/uriversioning/ratings")
	public List<Rating> version1()
	{
		return shoeService.allratings();
	}
	
	//2.Request Param
	@GetMapping(path="/request/shoe" , params = "version=1")
	public List<Shoe> requestParam()
	{
		return shoeService.allShoes();
	}
	@GetMapping(path="/request/ratings" , params = "version=2")
	public List<Rating> requestRating()
	{
		return shoeService.allratings();
	}
	
	//3.Custom Request Header
	@GetMapping(path="/custom/shoe" , headers = "X-SHOE-VERSION=1")
	public List<Shoe> customHeader()
	{
		return shoeService.allShoes();
	}
	@GetMapping(path="/custom/ratings" , headers = "X-RATING-VERSION=2")
	public List<Rating> customRating()
	{
		return shoeService.allratings();
	}
	
	//4.Request Accept Header
	@GetMapping(path="/accept/shoe" , produces = "application/shoe-v1+json")
	public List<Shoe> acceptHeader()
	{
		return shoeService.allShoes();
	}
	@GetMapping(path="/accept/ratings" , produces = "application/Ratings-v2+json")
	public List<Rating> acceptRating()
	{
		return shoeService.allratings();
	}
	
}
