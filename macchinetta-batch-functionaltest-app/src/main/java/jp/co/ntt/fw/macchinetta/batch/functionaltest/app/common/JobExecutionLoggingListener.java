/*
 * Copyright (C) 2018 NTT Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package jp.co.ntt.fw.macchinetta.batch.functionaltest.app.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

/**
 * Job execution logging listener.
 *
 * @since 5.0.0
 */
@Component
public class JobExecutionLoggingListener implements JobExecutionListener {

    /**
     * Logger.
     */
    private static final Logger logger = LoggerFactory.getLogger(JobExecutionLoggingListener.class);

    /**
     * Logging job started messages.
     *
     * @param jobExecution Job execution information.
     */
    @Override
    public void beforeJob(JobExecution jobExecution) {
        logger.info("job started. [JobName:{}]", jobExecution.getJobInstance().getJobName());
    }

    /**
     * Logging job finished messages.
     *
     * @param jobExecution Job execution information.
     */
    @Override
    public void afterJob(JobExecution jobExecution) {
        logger.info("job finished.[JobName:{}][ExitStatus:{}]", jobExecution.getJobInstance().getJobName(),
                jobExecution.getExitStatus().getExitCode());
    }
}
