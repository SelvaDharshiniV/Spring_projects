package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "sd_users")
public class User {
	
	@Id
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "user_name")
	private String userName;

}
