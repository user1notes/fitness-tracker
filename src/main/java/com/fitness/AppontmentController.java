package com.fitness;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fitnesstracker/appointments")
public class AppontmentController {

	@Autowired
	AppointmentService service;
	
	@PostMapping
	public void postAppointment(@RequestBody Appointment appointment) {
		System.out.println(appointment.getType());
		System.out.println(appointment.getPreference());
		service.createAppointment(appointment);
	}
	
	@GetMapping()
	List<Appointment> getAppointments(){
		return service.getAllAppointments();
	}
	
	@GetMapping("/{email}")
	List<Appointment> getAppointment(@PathVariable String email){
		return service.getAppointmentsByEmail(email);
	}
	
	@DeleteMapping("/{id}")
	public void deleteAppointment(@PathVariable int id) {
		service.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public void updateAppointment(@PathVariable int id, @RequestBody Appointment appointment) {
		service.updateAppointmentById(id,appointment);
	}
	
	@ExceptionHandler(IndexOutOfBoundsException.class)
	public String errorMessage(IndexOutOfBoundsException ex) {
		return ex.getMessage();
	}
}
