package org.apache.nifi.device.registry.resource.c2.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p>
 * Created on 7/13/17.
 */


public class CreateOperationRequest {

    @JsonProperty("operation")
    private String operation;

    @JsonProperty("name")
    private String name;

    @JsonProperty("deviceId")
    private String deviceId;

    @JsonProperty("content")
    private Map<String,String> content;

    public CreateOperationRequest() {}

    public String getOperation() {
        return operation;
    }

    public void setContent(Map<String,String> content) {
        this.content = content;
    }

    public Map<String,String> getContent() {
        return content;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}
