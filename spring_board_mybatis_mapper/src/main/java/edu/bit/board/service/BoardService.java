package edu.bit.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bit.board.BoardVO.BoardVO;
import edu.bit.board.vo.BoardVO.BoardMapper;

@Service
public class BoardService {

	@Autowired
	BoardMapper boardMapper;
	
	public List<BoardVO> selectBoardList() {
		return boardMapper.selectBoardList();
	}
	
	public void writeReply(BoardVO boardVO) {
		boardMapper.updateShape(boardVO);
		boardMapper.insertReply(boardVO);
	}

	public void insertBoard(BoardVO boardVO) {
		boardMapper.insertBoard(boardVO);
		
	}

	public BoardVO selectBoardOne(String bId) {
		
		// TODO Auto-generated method stub
		return boardMapper.selectBoardOne(bId);
	}

	public void updateBoard(BoardVO boardVO) {
		// TODO Auto-generated method stub
		boardMapper.updateBoard(boardVO);
	}
	
}
