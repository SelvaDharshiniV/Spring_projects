package com.example.demo.model;

import java.time.LocalDate;
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
@Table(name="sd_auditlog")
public class EmpAuditLog {

	@Id
	@Column(name="target_id")
	private int target_idId;
	
	@OneToMany(targetEntity = EmpAuditLog.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "log_ref", referencedColumnName = "empid")
	List<Employee> empList;
}
