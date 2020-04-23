package com.cdkglobal.interview.repository;

import com.cdkglobal.interview.entity.CaseEntity;

import java.io.IOException;
import java.util.List;

public interface CaseRepository {
    public List<CaseEntity> findAllCases() throws IOException;

    public void saveAllCases(List<CaseEntity> cases) throws IOException;
}
