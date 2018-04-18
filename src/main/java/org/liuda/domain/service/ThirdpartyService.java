package org.liuda.domain.service;

import org.liuda.domain.*;
import org.liuda.domain.dto.*;
import org.liuda.repository.ThirdpartyRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ThirdpartyService implements IThirdpartyService{

    @Autowired
    ThirdpartyRepository thirdpartyRepo;

    public Boolean validAuthCode(ThirdPartyAuthDto request){
        String code = request.getCode();
        Thirdparty item = thirdpartyRepo.findByCode(code);
        return item != null;
    }
}