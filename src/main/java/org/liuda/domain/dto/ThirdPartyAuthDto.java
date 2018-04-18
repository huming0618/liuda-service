package org.liuda.domain.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
public class ThirdPartyAuthDto {
    @NotNull
    private String code;
}