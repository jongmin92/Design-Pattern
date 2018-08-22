package practice.ch7_Builder.ex2;

public class Main {
    public static void main(String[] args) {
        String docType = "plain"; // plain or html

        if (docType == "plain") {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        } else if (docType == "html") {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String filename = htmlBuilder.getResult();
            System.out.println(filename + "가 작성되었습니다.");
        } else {
            System.exit(0);
        }
    }
}
