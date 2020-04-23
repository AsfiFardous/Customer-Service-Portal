package com.cdkglobal.interview.service;

import com.cdkglobal.interview.entity.CaseEntity;
import com.cdkglobal.interview.repository.CaseRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.BDDMockito.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CaseServiceTest {

    @MockBean
    CaseRepository caseRepository;

    @Autowired
    CaseService caseService;

    @Test
    public void testAddCommentToCase() throws IOException {
        CaseEntity caseEntity = new CaseEntity();
        caseEntity.setCaseNumber("1234");
        caseEntity.setComments(new ArrayList<>());
        List<CaseEntity> cases = Arrays.asList(caseEntity);

        given(this.caseRepository.findAllCases()).willReturn(cases);

        caseService.addCommentToCase("1234", "some comment", "mr X");

        verify(caseRepository).saveAllCases(any());

    }

    @Test
    public void testAddCommentToInvalidCase() throws IOException {
        CaseEntity caseEntity = new CaseEntity();
        caseEntity.setCaseNumber("1234");
        caseEntity.setComments(new ArrayList<>());
        List<CaseEntity> cases = Arrays.asList(caseEntity);

        given(this.caseRepository.findAllCases()).willReturn(cases);

        caseService.addCommentToCase("9876", "some comment", "mr X");

        verify(caseRepository , never()).saveAllCases(any());

    }



}
