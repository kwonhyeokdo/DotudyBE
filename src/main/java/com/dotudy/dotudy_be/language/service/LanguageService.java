package com.dotudy.dotudy_be.language.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dotudy.dotudy_be.language.dto.SelectLanguageDto;
import com.dotudy.dotudy_be.language.entity.LanguageCodeVo;
import com.dotudy.dotudy_be.language.repository.LanguageRepository;

@Service
public class LanguageService {
    @Autowired
    LanguageRepository languageRepository;

    public String aaaa(){
        return languageRepository.aaaa();
    }

    public Map<String, Map<String, String>> selectLanguage(){
        Map<String, Map<String, String>> result = new HashMap<>();
        List<SelectLanguageDto> sqlResult = languageRepository.selectLanguage();
        for(SelectLanguageDto selectLanguageDto : sqlResult){
            String countryCode = selectLanguageDto.getCountryCode();
            String code = selectLanguageDto.getCode();
            String value = selectLanguageDto.getValue();
            Map<String, String> codeValue = result.getOrDefault(countryCode, new HashMap<>());
            codeValue.put(code,  value);
            result.put(countryCode, codeValue);
        }

        return result;
    }

    public Map<String, Map<String, String>> selectLanguage2(){
        Map<String, Map<String, String>> result = new HashMap<>();
        var countryCodeList = List.of("ko", "en", "jp", "ch", "sp", "fn");
        for(var countryCode : countryCodeList){
            result.put(countryCode, languageRepository.selectLanguage2(countryCode));
        }

        return result;
    }
}