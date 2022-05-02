package com.fitness;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

	@Autowired
	AppointmentRepository repository;
	
	
	public void createAppointment(Appointment appointment) {
		float amount;
		if(appointment.getType().ordinal()==0) {
			amount = appointment.getWeeks()*500;
		}
		else if(appointment.getType().ordinal()==1) {
			amount = appointment.getWeeks()*1600;
		}
		else{
			amount = appointment.getWeeks()*1500;
		}
		appointment.setAmount(amount);
		repository.save(appointment);
	}

	public List<Appointment> getAllAppointments() {
		List<Appointment> appointments = repository.findAll();
		if(appointments.isEmpty()) {
			throw new IndexOutOfBoundsException("There are no appointments to display");
		}
		return appointments;
	}

	public List<Appointment> getAppointmentsByEmail(String email) {
		List<Appointment> appointments = repository.findAllByEmail(email);
		if(appointments.isEmpty()) {
			throw new IndexOutOfBoundsException("There are no appointments to display");
		}
		return appointments;
	}

	public void deleteById(int id) {
		repository.deleteById(id);
	}

	public void updateAppointmentById(int id, Appointment appointment) {
		Appointment newAppointment = repository.findById(id).get();
		if(appointment.getName()!=null) {
			newAppointment.setName(appointment.getName());		
		}		
		if(appointment.getAge()!=0) {
			newAppointment.setAge(appointment.getAge());	
		}
		if(appointment.getType()!=null) {
			newAppointment.setType(appointment.getType());			
		}

		repository.save(newAppointment);
		
		
	}

}
