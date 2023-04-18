package in.ashokit.binding;

import java.time.LocalDate;

import lombok.Data;

@Data
public class CreateApp {
	
private String fullname;
	
	private String email;
	
	private Long phno;
	
	private LocalDate dob;
	
	private Character gender;
	
	private Long ssn;

}
