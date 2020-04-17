package com.szxs.controller;


import com.szxs.service.impl.SmbmsUserServiceImpl;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class SmbmsUserController {

    @Resource
    private SmbmsUserServiceImpl smbmsUserService;


}
