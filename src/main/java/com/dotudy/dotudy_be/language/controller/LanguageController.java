package com.dotudy.dotudy_be.language.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dotudy.dotudy_be.language.dto.SelectLanguageDto;
import com.dotudy.dotudy_be.language.entity.LanguageCodeVo;
import com.dotudy.dotudy_be.language.service.LanguageService;

@RestController
public class LanguageController {
    @Autowired
    LanguageService languageService;

    @PostMapping("/postlanguage")
    public ResponseEntity<List<SelectLanguageDto>> selectLanguage(
        @RequestBody LanguageCodeVo languageCodeVo
    ) {
        System.out.println("languageCodeVo: " + languageCodeVo);

        return ResponseEntity.ok().body(languageService.selectLanguage(languageCodeVo));
    }

    @GetMapping("/language")
    public ResponseEntity<List<SelectLanguageDto>> selectLanguage(
        @RequestParam List<String> codeList
    ) {
        System.out.println("codeList: " + codeList);
        LanguageCodeVo languageCodeVo = LanguageCodeVo
                                       .builder()
                                       .codeList(codeList)
                                       .build();

        return ResponseEntity.ok().body(languageService.selectLanguage(languageCodeVo));
    }
}