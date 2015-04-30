package validator;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Order {
	@NotNull
    private Long id;

    @NotNull
    //@Min(18)
    private String destination;
    
    @NotNull
    @Pattern(regexp="\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b")
    private String email;
    
    @NotNull
    @Pattern(regexp="\\d{3}-\\d{7}")
    private String phone;

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
