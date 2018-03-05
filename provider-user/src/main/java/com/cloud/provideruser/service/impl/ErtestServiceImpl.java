package com.cloud.provideruser.service.impl;

import com.cloud.provideruser.service.ErtestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ErtestServiceImpl implements ErtestService {

    @Override
    public void nullPointTest() throws NullPointerException {
	throw new NullPointerException();
    }
}
