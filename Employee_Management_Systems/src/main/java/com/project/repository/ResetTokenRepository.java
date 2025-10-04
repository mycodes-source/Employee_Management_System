package com.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.entity.ResetToken;
import java.util.List;


@Repository
public interface ResetTokenRepository extends JpaRepository<ResetToken, Integer>{

	
	@Query("Select r from ResetToken r where r.token=?1")
	public ResetToken FindByToken(String token);
	
	public Optional<ResetToken>findByToken(String token);
	public Optional<ResetToken> findByEmail(String email);
	public void deleteByToken(String token);
}
