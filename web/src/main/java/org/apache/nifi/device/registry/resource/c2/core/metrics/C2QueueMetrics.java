package org.apache.nifi.device.registry.resource.c2.core.metrics;


import org.codehaus.jackson.annotate.JsonProperty;

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
 * Created on 7/7/17.
 */


public class C2QueueMetrics {

    @JsonProperty("name")
    private String name;

    @JsonProperty("datasize")
    private long dataSize;

    @JsonProperty("dataSizeMax")
    private long dataSizeMax;

    @JsonProperty("queued")
    private long queued;

    @JsonProperty("queueMax")
    private long queueMax;

    public C2QueueMetrics() {
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("datasize")
    public long getDataSize() {
        return dataSize;
    }

    @JsonProperty("datasize")
    public void setDataSize(long dataSize) {
        this.dataSize = dataSize;
    }

    @JsonProperty("dataSizeMax")
    public long getDataSizeMax() {
        return dataSizeMax;
    }

    @JsonProperty("dataSizeMax")
    public void setDataSizeMax(long dataSizeMax) {
        this.dataSizeMax = dataSizeMax;
    }

    @JsonProperty("queued")
    public long getQueued() {
        return queued;
    }

    @JsonProperty("queued")
    public void setQueued(long queued) {
        this.queued = queued;
    }

    @JsonProperty("queueMax")
    public long getQueueMax() {
        return queueMax;
    }

    @JsonProperty("queueMax")
    public void setQueueMax(long queueMax) {
        this.queueMax = queueMax;
    }
}