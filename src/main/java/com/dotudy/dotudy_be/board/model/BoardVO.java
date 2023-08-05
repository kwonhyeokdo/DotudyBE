package com.dotudy.dotudy_be.board.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BoardVO { // VO : value object
    String boardId;
    String boardName;
}
