package com.example.firstproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.firstproject.entity.ManagedFree;

public interface ManagedFreeRepository extends JpaRepository<ManagedFree, String> {
	List<ManagedFree> FindAll();

}
