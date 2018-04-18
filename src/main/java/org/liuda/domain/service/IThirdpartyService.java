package org.liuda.domain.service;

import org.liuda.domain.dto.*;

public interface IThirdpartyService{
    Boolean validAuthCode(ThirdPartyAuthDto request);
}