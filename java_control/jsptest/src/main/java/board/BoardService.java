package board;

import jakarta.servlet.http.HttpServletRequest;

// 게시판 관련 여러가지 일을 할 클래스 
public class BoardService {
	
	private BoardDao boardDao = new BoardDao();
	
	// 사용자가 입력한 값은 request내장객체에 파라미터로 저장되어있다
	// 서블릿(BoardController)로부터 request객체 받아와야 입력값 꺼낼수 있다 
	public void boardSave(HttpServletRequest request) {
		Board board = new Board(request);
		
		boardDao.save(board);
		
	}

}
