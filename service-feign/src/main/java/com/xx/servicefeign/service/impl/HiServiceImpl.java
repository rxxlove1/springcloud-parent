package com.xx.servicefeign.service.impl;

import com.xx.servicefeign.service.HiService;
import org.springframework.stereotype.Service;

@Service
public class HiServiceImpl implements HiService {
    @Override
    public String getHi(String name) {
        return "hi " + name + "system errors";
    }
}
