package Quest;

public class TestStatic {

    public String getMsg() {
        return "hello world";
    }

    public static void showMsg() {
        TestStatic testStatic = new TestStatic();
        String msg = testStatic.getMsg();

        System.out.println(msg);
    }

    public static void main(String[] args) {
        TestStatic.showMsg();
    }
}
