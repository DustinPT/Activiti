/*
 * Copyright 2010-2020 Alfresco Software, Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.activiti.runtime.api.impl;

import org.activiti.api.process.model.ProcessUserCandidateStarter;

import java.util.Objects;

public class ProcessUserCandidateStarterImpl extends ProcessCandidateStarterImpl implements ProcessUserCandidateStarter {

    private String userId;

    public ProcessUserCandidateStarterImpl() {
    }

    public ProcessUserCandidateStarterImpl(String processDefinitionId, String userId) {
        super(processDefinitionId);
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProcessUserCandidateStarterImpl that = (ProcessUserCandidateStarterImpl) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(getProcessDefinitionId(), that.getProcessDefinitionId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProcessDefinitionId(), userId);
    }

    @Override
    public String getUserId() {
        return this.userId;
    }
}