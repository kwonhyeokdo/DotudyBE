package com.dotudy.dotudy_be.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dotudy.dotudy_be.board.model.BoardVO;
import com.dotudy.dotudy_be.board.service.BoardService;

@RestController
public class BoardController {
    @Autowired
    BoardService boardService;

    @GetMapping("/board")
    public ResponseEntity<List<BoardVO>> selectBoard() {
        return ResponseEntity.ok().body(boardService.selectBoard());
    }
    

    @PostMapping("/board")
    public ResponseEntity<Boolean> insertBoard (@RequestBody BoardVO boardVO){
        if(boardVO == null){
            return ResponseEntity.badRequest().build();
        }
        
        int result = boardService.insertBoard(boardVO);
        if(result == 0){
            throw new IllegalAccessError("insert되지 않음");
        }
        
        return ResponseEntity.ok().build();
    }
}
