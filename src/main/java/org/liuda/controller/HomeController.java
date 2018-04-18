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

    @RequestMapping("/hello")
    @ResponseBody
    String hello() {
        return "hello !";
    }

    @RequestMapping(value="/auth/thirdparty", method = RequestMethod.POST)
    @ResponseBody
    ResponseDto authThirdParty(@RequestBody ThirdPartyAuthDto request) {
        return thirdpartyService.validAuthCode(request);
    }
}