package com.dotudy.dotudy_be.language.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dotudy.dotudy_be.language.dto.SelectLanguageDto;
import com.dotudy.dotudy_be.language.entity.LanguageCodeVo;
import com.dotudy.dotudy_be.language.repository.LanguageRepository;

@Service
public class LanguageService {
    @Autowired
    LanguageRepository languageRepository;

    public List<SelectLanguageDto> selectLanguage(LanguageCodeVo languageCodeVo){
        return languageRepository.selectLanguage(languageCodeVo);
    }
}