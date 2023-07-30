package com.dotudy.dotudy_be.language.entity;


import java.util.List;

import com.dotudy.dotudy_be.common.model.CommonVo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class LanguageCodeVo extends CommonVo{
    String id;
    String code;
    List<String> codeList;
}