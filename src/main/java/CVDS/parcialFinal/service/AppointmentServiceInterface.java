package CVDS.parcialFinal.service;

import CVDS.parcialFinal.DTO.AppointmentDTO;
import CVDS.parcialFinal.model.Appointment;

public interface AppointmentServiceInterface {
    Appointment addAppointment(AppointmentDTO appointmentDTO);
}
