package hello;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Order {
	@NotNull
    private Long id;

    @NotNull
    //@Min(18)
    private String destination;
    
    @NotNull
    private String email;
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
    
}
