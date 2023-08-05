package com.dotudy.dotudy_be.language.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StopWatch;
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

    @GetMapping("/aaaa")
    public String aaaa() {
        return languageService.aaaa();
    }

    @GetMapping("/language")
    public ResponseEntity<Map<String, Map<String, String>>> selectLanguage() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        var result = languageService.selectLanguage();
        System.out.println("==================");
        stopWatch.stop();
        System.out.println("selectLanguage: " + stopWatch.prettyPrint());
        System.out.println("==================");
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/language2")
    public ResponseEntity<Map<String, Map<String, String>>> selectLanguage2() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        var result = languageService.selectLanguage2();
        System.out.println("==================");
        stopWatch.stop();
        System.out.println("selectLanguage2: " + stopWatch.prettyPrint());
        System.out.println("==================");
        return ResponseEntity.ok().body(result);
    }
}