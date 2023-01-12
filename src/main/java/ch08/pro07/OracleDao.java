package ch08.pro07;

public class OracleDao implements DataAccessObject {
    private final static String DB_NAME = "Oracle DB";
    @Override
    public void select() {
        System.out.println(DB_NAME + "에서 검색");
    }

    @Override
    public void insert() {
        System.out.println(DB_NAME + "에서 삽입");
    }

    @Override
    public void update() {
        System.out.println(DB_NAME +  "에서 수정");
    }

    public void delete() {
        System.out.println(DB_NAME + "에서 삭제");
    }
}
