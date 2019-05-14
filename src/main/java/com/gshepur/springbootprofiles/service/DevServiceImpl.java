package com.gshepur.springbootprofiles.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("!prod")
public class DevServiceImpl implements IService {
    @Override
    public String getMessage() {
        return "Message from develop service";
    }
}
