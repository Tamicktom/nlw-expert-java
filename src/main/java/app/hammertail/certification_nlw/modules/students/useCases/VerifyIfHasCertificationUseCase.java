package app.hammertail.certification_nlw.modules.students.useCases;

import org.springframework.stereotype.Service;

import app.hammertail.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;

@Service
public class VerifyIfHasCertificationUseCase {

  public boolean execute(VerifyHasCertificationDTO dto) {
    if (dto.getEmail().equals("daniele@gmail.com") && dto.getTechnology().equals("Java")) {
      return true;
    } else {
      return false;
    }
  }
}
