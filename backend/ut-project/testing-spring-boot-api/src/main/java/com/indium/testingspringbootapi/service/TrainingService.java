package com.indium.testingspringbootapi.service;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class TrainingService {

    private static Logger logger = org.slf4j.LoggerFactory.getLogger(TrainingService.class);

    public boolean register(String email) {
        logger.info("****registering email {}****", email);
        // call repository to save email or an external service
        return true;
    }
}
