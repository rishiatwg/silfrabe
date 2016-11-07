/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.silfra.niss.exbond.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.silfra.niss.exbond.domain.IecDetail;
import com.silfra.niss.exbond.repository.IecDetailRepository;
import com.silfra.niss.exbond.services.IecDetailService;

@Component("iecDetailService")
public class IecDetailServiceImpl implements IecDetailService {

	private final IecDetailRepository iecDetailRepository;
	
	@Autowired
	public IecDetailServiceImpl(IecDetailRepository iecDetailRepository) {
		this.iecDetailRepository = iecDetailRepository;
	}

	@Override
	public IecDetail findIecDetailById(int id) throws Exception {

		IecDetail iecDetail = iecDetailRepository.findOne(id);
		
		return iecDetail;
	}
}
