package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args){
        List<Board> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new Board("제목" + (i + 1), "내용" + (i + 1), "글쓴이" + (i + 1)));
        }

        int size = list.size();
        System.out.println("총 객체 수 " + size);
        System.out.println();

        Board board = list.get(2);
        System.out.println(board.getAllInfo());

        for (int i = 0; i < 5; i++) {
            Board b = list.get(i);
            System.out.println(b.getAllInfo());
        }

        list.remove(2);
        list.remove(2);

        for (Board b : list) {
            System.out.println(b.getAllInfo());
        }
    }
}
