package org.liuda.domain.service;

import org.liuda.domain.dto.*;

public interface IThirdpartyService{
    ResponseDto validAuthCode(AuthThirdPartyDto request);
    ResponseDto create(CreateThirdpartyDto request);
}