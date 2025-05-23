package CVDS.parcialFinal.repository;

import CVDS.parcialFinal.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AppointmentRepository extends MongoRepository<Appointment, String> {
}
