package ma.emsic.hospital;

import ma.emsic.hospital.entities.Patient;
import ma.emsic.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HospitalApplication implements CommandLineRunner {

	@Autowired
	private PatientRepository patientRepository;
	public static void main(String[] args) {

		SpringApplication.run(HospitalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		patientRepository.save(new Patient(null,"ali",new Date(),false,12));
		patientRepository.save(new Patient(null,"rawane",new Date(),false,23));
		patientRepository.save(new Patient(null,"yasser",new Date(),true,32));


	}
}
