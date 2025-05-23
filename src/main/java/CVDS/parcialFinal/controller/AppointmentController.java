package CVDS.parcialFinal.controller;

import CVDS.parcialFinal.DTO.AppointmentDTO;
import CVDS.parcialFinal.model.Appointment;
import CVDS.parcialFinal.service.AppointmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    private AppointmentService appointmentService;
    @PostMapping()
    public ResponseEntity<Appointment> createAppointment(@RequestBody AppointmentDTO appointmentDTO){
        Appointment appointment = appointmentService.addAppointment(appointmentDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(appointment);
    }
}
