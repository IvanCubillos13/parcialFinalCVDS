package CVDS.parcialFinal.repository;

import CVDS.parcialFinal.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface MongoAppointmentRepository extends MongoRepository<Appointment, String> {
    Appointment findByAppointmentId(int appointmentId);
}
