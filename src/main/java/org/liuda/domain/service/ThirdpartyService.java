package org.liuda.domain.service;

import org.liuda.domain.*;
import org.liuda.domain.dto.*;
import org.liuda.repository.ThirdpartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

@Component
public class ThirdpartyService implements IThirdpartyService{

    private static final ModelMapper modelMapper = new ModelMapper();

    @Autowired
    ThirdpartyRepository thirdpartyRepo;

    public ResponseDto validAuthCode(AuthThirdPartyDto request){
        String code = request.getCode();
        Thirdparty item = thirdpartyRepo.findByCode(code);
        ResponseDto result = new ResponseDto();
        result.setStatusCode(200);
        result.setData(item != null);
        return result;
    }

    public ResponseDto create(CreateThirdpartyDto request){
        ResponseDto result = new ResponseDto();
        Thirdparty item = modelMapper.map(request, Thirdparty.class);
        thirdpartyRepo.save(item);
        result.setStatusCode(200);
        result.setData(item.getId());
        return result;
    }
}