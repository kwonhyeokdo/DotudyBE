package com.dotudy.dotudy_be.board.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.dotudy.dotudy_be.board.model.BoardVO;

@Mapper
public interface BoardRepository {
    @Select("""
        SELECT board_id AS boardId
             , name     AS boardName
          FROM board
            """)
    public List<BoardVO> selectBoard();

    @Insert("""
        INSERT INTO board(
            name
        )values(
            #{boardName}
        )
            """)
    public int insertBoard(BoardVO boardVO);
}
