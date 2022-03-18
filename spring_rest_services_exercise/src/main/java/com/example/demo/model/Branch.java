package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator; 
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component

@Entity
@Table(name = "sd_branch")
public class Branch {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="branchcode")
	private int branchCode;
	
	@Column(name="branchmanager")
	private String branchManager;
	
	@OneToMany(targetEntity = LoanEntity.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "branch_ref", referencedColumnName = "branchCode")
	private List<LoanEntity> loanList;

}
