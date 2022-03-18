package com.example.demo.repos;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.BloodDonor;

public interface BloodDonorRepository extends JpaRepository<BloodDonor, Long> {
public List<BloodDonor> findByBloodGroup(String sechGroup);
public List<BloodDonor> findByFirstName(String sechName);

//here sd_blood_donor refers the table and java class
// blood group and date last donated refer to the column and not the fields in java class
@Query(value="select * from sd_blood_donor where bloodgroup=:group and datelastdonated=:date ",nativeQuery=true)
public List<BloodDonor> srcByGroupAndDate(@Param("group")String bloodGroup,@Param("date") LocalDate date);
//using JPQL

@Query(value="update BloodDonor set dateLastDonated=:date where mobileNumber=:phoneNumber",nativeQuery=false)
@Modifying
@Transactional
public int updateLastDonated(@Param("date")LocalDate date,@Param("phoneNumber") long phoneNumber);
}
