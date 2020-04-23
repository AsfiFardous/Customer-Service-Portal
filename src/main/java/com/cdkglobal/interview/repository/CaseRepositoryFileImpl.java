package com.cdkglobal.interview.repository;

import com.cdkglobal.interview.AppConfigs;
import com.cdkglobal.interview.entity.CaseEntity;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@Repository
public class CaseRepositoryFileImpl implements CaseRepository {
    @Autowired
    private AppConfigs appConfigs;

    @Override
    public List<CaseEntity> findAllCases() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(appConfigs.getCaseDataPath());
        System.out.println(file.getAbsolutePath());
        List<CaseEntity> cases = objectMapper.readValue(file, new TypeReference<List<CaseEntity>>() {
        });
        return cases;
    }

    @Override
    public void saveAllCases(List<CaseEntity> cases) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(
                new FileOutputStream(appConfigs.getCaseDataPath()), cases);
    }
}
