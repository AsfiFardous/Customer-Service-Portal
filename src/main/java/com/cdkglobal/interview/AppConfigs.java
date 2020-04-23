package com.cdkglobal.interview;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigs {
    @Value("${casedata.file.path}")
    private String caseDataPath;

    public String getCaseDataPath() {
        return caseDataPath;
    }

    public void setCaseDataPath(String caseDataPath) {
        this.caseDataPath = caseDataPath;
    }
}
