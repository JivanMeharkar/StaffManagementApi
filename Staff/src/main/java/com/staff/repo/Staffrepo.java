package com.staff.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.staff.model.Staff;

public interface Staffrepo extends JpaRepository<Staff,Integer> {

	List<Staff> list();

}

