package hello;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Order {
	@NotNull
    private Long id;

    @NotNull
    //@Min(18)
    private String destination;
    
    public Order(Long id, String destination) {
		super();
		this.id = id;
		this.destination = destination;
	}
}
