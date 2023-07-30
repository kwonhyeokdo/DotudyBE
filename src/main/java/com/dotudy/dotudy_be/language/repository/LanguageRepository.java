package com.dotudy.dotudy_be.language.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.dotudy.dotudy_be.language.dto.SelectLanguageDto;
import com.dotudy.dotudy_be.language.entity.LanguageCodeVo;

@Mapper
public interface LanguageRepository {
    @Select(
        """
        <script>
        /* com.dotudy.dotudy_be.language.repository.LanguageRepository.selectLanguage() */
                SELECT lc.code          AS code
                     , lv.country_code  AS countryCode
                     , lv.value         AS value
                  FROM language_code lc
            INNER JOIN language_value lv
                    ON lc.id = lv.id
                   AND lv.expire_datetime = '9999-12-31 23:59:59'
                 WHERE 1=1
                   AND lc.code IN
                   <foreach item='item' collection='codeList' open='(' close=')' separator=",">
                        #{item}
                   </foreach>
                   AND lc.expire_datetime = '9999-12-31 23:59:59'
        </script>
        """
    )
    public List<SelectLanguageDto> selectLanguage(LanguageCodeVo languageCodeVo);
    public List<SelectLanguageDto> test(LanguageCodeVo languageCodeVo);
}
