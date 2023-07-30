package com.dotudy.dotudy_be.language.dto;

import lombok.Data;

@Data
public final class SelectLanguageDto{
    String code;
    String countryCode;
    String value;
}