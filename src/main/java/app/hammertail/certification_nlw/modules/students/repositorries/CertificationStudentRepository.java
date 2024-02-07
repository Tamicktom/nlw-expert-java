package app.hammertail.certification_nlw.modules.students.repositorries;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import app.hammertail.certification_nlw.modules.students.entities.CertificationStudentEntity;

@Repository
public interface CertificationStudentRepository extends JpaRepository<CertificationStudentEntity, UUID> {

  @Query("SELECT c FROM certifications c INNER JOIN  c.studentEntity std where std.email = :email AND c.technology = :technology")
  List<CertificationStudentEntity> findByStudentEmailAndTechnology(String email, String technology);


}
