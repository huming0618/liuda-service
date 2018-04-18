package org.liuda.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import org.liuda.repository.*;

import java.util.List;
import java.util.Optional;

import org.liuda.domain.Thirdparty;
import org.liuda.domain.dto.*;
import org.liuda.domain.service.*;

@Controller
@EnableAutoConfiguration
public class HomeController {

    @Autowired
    private IThirdpartyService thirdpartyService;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping(value="/auth/thirdparty", method = RequestMethod.POST)
    @ResponseBody
    String authThirdParty(@RequestBody ThirdPartyAuthDto request) {
        thirdpartyService.validAuthCode(request);
        return "OK";
    }
//    public static void main(String[] args) throws Exception {
//        SpringApplication.run(HomeController.class, args);
//    }
}