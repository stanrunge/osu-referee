package com.stanrunge.opt3.repositories;

import com.stanrunge.opt3.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Integer> {

}
