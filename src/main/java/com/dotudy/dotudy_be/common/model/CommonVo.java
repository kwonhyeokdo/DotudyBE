package com.dotudy.dotudy_be.common.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonVo {
    Date expireDateTime;
    Date modifyDateTime;
    String modifyUser;
}