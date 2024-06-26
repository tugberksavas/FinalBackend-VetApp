package simsek.ali.VeterinaryManagementProject.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import simsek.ali.VeterinaryManagementProject.entity.Customer;
import simsek.ali.VeterinaryManagementProject.entity.Doctor;

import java.util.Optional;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    Optional<Doctor> findByNameAndEmail(String name, String email);

    Page<Doctor> findByNameContaining(String name, Pageable pageable);
}
