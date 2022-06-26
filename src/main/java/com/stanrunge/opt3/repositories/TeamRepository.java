package com.stanrunge.opt3.repositories;

import com.stanrunge.opt3.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Integer> {
}
