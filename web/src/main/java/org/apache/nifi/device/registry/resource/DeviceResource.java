package org.apache.nifi.device.registry.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.nifi.device.registry.NiFiDeviceRegistryConfiguration;
import org.apache.nifi.device.registry.api.NiFiDevice;
import org.apache.nifi.device.registry.service.DeviceService;
import org.apache.nifi.device.registry.service.impl.DeviceServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codahale.metrics.annotation.Timed;

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
 * Created on 3/10/17.
 */

@Path("/device")
@Produces(MediaType.APPLICATION_JSON)
public class DeviceResource {

    private static final Logger logger = LoggerFactory.getLogger(DeviceResource.class);

    private NiFiDeviceRegistryConfiguration configuration;
    private DeviceService deviceService = null;

    public DeviceResource(NiFiDeviceRegistryConfiguration conf) {
        this.configuration = conf;
        this.deviceService = new DeviceServiceImpl();
    }

    @POST
    @Timed
    public Response announceAvailability(NiFiDevice device) {
        logger.info("MiNiFiDevice available message received!!!");
        logger.info("Message: " + device.toString());
        return Response.ok().build();
    }

    @GET
    @Timed
    public String[] getSearchCache() {
        return new String[]{"dummy", "resource"};
    }
}
