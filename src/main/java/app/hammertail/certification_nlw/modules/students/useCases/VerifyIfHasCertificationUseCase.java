package app.hammertail.certification_nlw.modules.students.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.hammertail.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import app.hammertail.certification_nlw.modules.students.repositorries.CertificationStudentRepository;

@Service
public class VerifyIfHasCertificationUseCase {

  @Autowired
  private CertificationStudentRepository certificationStudentRepository;

  public boolean execute(VerifyHasCertificationDTO dto) {
    var result = this.certificationStudentRepository.findByStudentEmailAndTechnology(dto.getEmail(),
        dto.getTechnology());

    if (!result.isEmpty()) {
      return true;
    }

    return false;
  }
}
