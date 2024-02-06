package app.hammertail.certification_nlw.modules.students.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.hammertail.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import app.hammertail.certification_nlw.modules.students.useCases.VerifyIfHasCertificationUseCase;

@RestController
@RequestMapping("/students")
public class StudentController {

  // preciso usar o useCase
  @Autowired
  private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;

  @PostMapping("/verifyIfHasCertification")
  public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO) {

    var result = this.verifyIfHasCertificationUseCase.execute(verifyHasCertificationDTO);

    if (result) {
      return "Usuário já possui certificação";
    }

    return "Usuário não possui certificação";
  }
}
