package org.liuda.domain.service;

import org.liuda.domain.dto.*;

public interface IThirdpartyService{
    ResponseDto validAuthCode(ThirdPartyAuthDto request);
}