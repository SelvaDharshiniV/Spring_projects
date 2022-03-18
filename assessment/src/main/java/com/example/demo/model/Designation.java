package com.example.demo.model;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="sd_designation")
public class Designation {
	
	@Id
	@Column(name="designation_id")
	private int desgId;
	
	@Column(name="designation_name")
	private String desgName;
	
	@Column(name="description")
	private String description;
	
}
