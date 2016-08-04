/*
 * This program is part of Autonomiccs "autonomic-platform",
 * an open source autonomic cloud computing management platform.
 * Copyright (C) 2016 Autonomiccs, Inc.
 *
 * Licensed to the Autonomiccs, Inc. under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The Autonomiccs, Inc. licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package br.com.autonomiccs.autonomic.plugin.common.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.autonomiccs.autonomic.plugin.common.daos.GuestOsJdbcDao;

@RunWith(MockitoJUnitRunner.class)
public class GuestOsServiceTest {

    @Spy
    @InjectMocks
    private GuestOsService spy;
    @Mock
    private GuestOsJdbcDao guestOsJdbcDao;

    @Test
    public void getGuestOsUuidTest() {
        Mockito.doReturn(0l).when(guestOsJdbcDao).getGuestOsUuid(Mockito.anyString());

        long result = spy.getGuestOsUuid("guestOsName");

        Mockito.verify(guestOsJdbcDao).getGuestOsUuid(Mockito.anyString());
        Assert.assertEquals(0l, result);

    }

}
