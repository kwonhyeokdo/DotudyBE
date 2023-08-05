package com.dotudy.dotudy_be.board.service;

import java.util.List;

import com.dotudy.dotudy_be.board.model.BoardVO;

public interface BoardService {
    public int insertBoard (BoardVO boardVO);

    public List<BoardVO> selectBoard();
}
