package com.fitness;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer>{

	List<Appointment> findAllByEmail(String email);
}
