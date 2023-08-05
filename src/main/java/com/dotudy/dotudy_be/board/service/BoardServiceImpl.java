package com.dotudy.dotudy_be.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dotudy.dotudy_be.board.model.BoardVO;
import com.dotudy.dotudy_be.board.repository.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {
    @Autowired
    BoardRepository boardRepository;

    @Override
    public int insertBoard(BoardVO boardVO) {
        return boardRepository.insertBoard(boardVO);
    }

    @Override
    public List<BoardVO> selectBoard() {
        return boardRepository.selectBoard();
    }
}
