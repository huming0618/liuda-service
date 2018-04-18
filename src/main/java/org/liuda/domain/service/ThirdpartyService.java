package org.liuda.domain.service;

import org.liuda.domain.*;
import org.liuda.domain.dto.*;
import org.liuda.repository.ThirdpartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ThirdpartyService implements IThirdpartyService{

    @Autowired
    ThirdpartyRepository thirdpartyRepo;

    public ResponseDto validAuthCode(ThirdPartyAuthDto request){
        String code = request.getCode();
        Thirdparty item = thirdpartyRepo.findByCode(code);
        ResponseDto result = new ResponseDto();
        result.setStatusCode(200);
        result.setData(item != null);
        return result;
    }
}