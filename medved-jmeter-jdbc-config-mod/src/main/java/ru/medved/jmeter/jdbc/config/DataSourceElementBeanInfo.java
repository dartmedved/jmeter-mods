/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 */

/*
 * Created on May 15, 2004
 */
package ru.medved.jmeter.jdbc.config;

import java.beans.PropertyDescriptor;

import org.apache.jmeter.testbeans.BeanInfoSupport;

public class DataSourceElementBeanInfo extends BeanInfoSupport {
    public DataSourceElementBeanInfo() {
        super(DataSourceElement.class);
        createPropertyGroup("varName", new String[] { "dataSource" });

        createPropertyGroup("pool", new String[] { "poolMax", "timeout", "trimInterval", "autocommit" });

        createPropertyGroup("keep-alive", new String[] { "keepAlive", "connectionAge", "checkQuery" });

        //createPropertyGroup("database", new String[] { "dbUrl", "driver", "username", "password" });
        
        //createPropertyGroup("database", new String[] { "dbUrl", "driver", "username", "password" });
        
        createPropertyGroup("json-config", new String[] {"section","configFile"});

        PropertyDescriptor p = property("dataSource");
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, "");
        p = property("poolMax");
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, "10");
        p = property("timeout");
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, "10000");
        p = property("trimInterval");
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, "60000");
        p = property("autocommit");
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, Boolean.TRUE);
        p = property("keepAlive");
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, Boolean.TRUE);
        p = property("connectionAge");
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, "5000");
        p = property("checkQuery");
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, "Select 1");
        
        
        p = property("section");
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, "perf.env");
        p = property("configFile");
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, "../config/jdbc.json");
        
        /*p = property("dbUrl");
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, "");
        p = property("driver");
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, "");
        p = property("username");
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, "");
        p = property("password");
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, "");*/
        
        getBeanDescriptor().setDisplayName("MEDVED-JDBC Connection Configuration/JSON");


        //hide bean from menu, but hidden flag is taken in account in JMeter >2.5.1 only
        getBeanDescriptor().setHidden(false);
                
    }
}
