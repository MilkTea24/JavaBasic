package ch15.pro07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    private List<Board> boardList;

    public BoardDao() {
        this.boardList = new ArrayList<Board>();
        for (int i = 1; i <= 3; i++) {
            this.boardList.add(new Board("제목" + i, "내용" + i));
        }
    }

    public List<Board> getBoardList() {
        return this.boardList;
    }
}
