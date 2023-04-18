package in.ashokit.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="AR_APP")
@Data
public class ArApp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer appId;
	
	private String fullname;
	
	private String email;
	
	private Long phno;
	
	private LocalDate dob;
	
	private Character gender;
	
	private Long ssn;
	
	private String statename;
	
	private String createdBy;
	
	private String updatedBy;
	
	@CreationTimestamp 
	@Column (name="CREATED_DATE" ,updatable = false)
	private LocalDate createdDate;
	
	@UpdateTimestamp 
	@Column (name="UPDATED_DATE" ,insertable  = false)
	private LocalDate updatedDate;
	
	
	
	

}
