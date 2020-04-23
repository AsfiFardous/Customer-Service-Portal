package com.cdkglobal.interview.service;

import com.cdkglobal.interview.entity.CaseEntity;
import com.cdkglobal.interview.entity.CommentEntity;
import com.cdkglobal.interview.repository.CaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Component
public class CaseService {
    @Autowired
    private CaseRepository caseRepository;

    public List<CaseEntity> getAllCases() throws IOException {
        return caseRepository.findAllCases();
    }

    public  CaseEntity getCase(String caseNumber) throws IOException {
        List<CaseEntity> cases = caseRepository.findAllCases();
        for (CaseEntity caseEntity : cases) {
            if (caseEntity.getCaseNumber().equals(caseNumber)) {
                return caseEntity;
            }
        }
        return null;
    }

    public void addCommentToCase(String caseId, String comment, String createdBy) throws IOException {
        List<CaseEntity> cases = caseRepository.findAllCases();

        for (CaseEntity caseEntity : cases) {
            if (caseEntity.getCaseNumber().equals(caseId)) {
                CommentEntity commentEntity = new CommentEntity();
                commentEntity.setCreatedBy(createdBy);
                commentEntity.setCommentBody(comment);
                commentEntity.setCommentDate(new Date());
                commentEntity.setId("C-" + (caseEntity.getComments().size() + 1));
                caseEntity.getComments().add(commentEntity);

                caseEntity.setLastModifiedDate(commentEntity.getCommentDate());

                caseRepository.saveAllCases(cases);
                break;
            }
        }

    }

    public void addCase(String subject, String description) throws IOException {
        List<CaseEntity> cases=  caseRepository.findAllCases();
        Random rand = new Random();

        int number = rand.nextInt(1000);
        String caseNumber = String.valueOf(number);

        CaseEntity caseEntity = new CaseEntity();

        caseEntity.setCaseNumber(caseNumber);
        caseEntity.setSubject(subject);
        caseEntity.setDescription(description);
        caseEntity.setComments(new ArrayList<>());

        cases.add(caseEntity);


        caseRepository.saveAllCases(cases);

    }
}

