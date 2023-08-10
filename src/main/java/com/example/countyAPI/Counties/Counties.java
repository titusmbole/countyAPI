package com.example.countyAPI.Counties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Table(name = "counties")
public class Counties {
	public Counties(String string, long l, String string2) {
		// TODO Auto-generated constructor stub
	}
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String countyName;
    private Long countyId;
    private  String dateCreated;
    @Column(name = "isAvailable")
    private boolean isActive = true;

}
