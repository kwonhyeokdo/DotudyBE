package com.dotudy.dotudy_be.language.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.dotudy.dotudy_be.language.dto.SelectLanguageDto;
import com.dotudy.dotudy_be.language.entity.LanguageCodeVo;

@Mapper
public interface LanguageRepository {
    @Select(
        """
        /* aaaa */
                Select 10
        """
    )
    public String aaaa();

    @Select(
        """
        /* com.dotudy.dotudy_be.language.repository.LanguageRepository.selectLanguage() */
                SELECT lc.code          AS code
                     , lv.country_code  AS countryCode
                     , lv.value         AS value
                  FROM language_code lc
            INNER JOIN language_value lv
                    ON lc.id = lv.id
                   AND lv.expire_datetime = '9999-12-31 23:59:59'
                 WHERE 1=1
                   AND lc.expire_datetime = '9999-12-31 23:59:59'
        """
    )
    public List<SelectLanguageDto> selectLanguage();

    @Select(
        """
        /* com.dotudy.dotudy_be.language.repository.LanguageRepository.selectLanguage2() */
           SELECT lc.code AS code
                , lv.value AS value
             FROM language_code lc
       INNER JOIN language_value lv
               ON lc.id = lv.id
              AND lv.expire_datetime = '9999-12-31 23:59:59'
            WHERE 1=1
              AND lv.country_code = #{countryCode}
              AND lc.expire_datetime = '9999-12-31 23:59:59'  
        """
    )
    public Map<String, String> selectLanguage2(String countryCode);
}
