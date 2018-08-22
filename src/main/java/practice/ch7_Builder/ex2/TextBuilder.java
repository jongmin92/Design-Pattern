package practice.ch7_Builder.ex2;

public class TextBuilder extends Builder {
    private StringBuilder sb = new StringBuilder();

    @Override
    public void buildTitle(String title) {
        sb.append("==================\n");
        sb.append('[' + title + "]\n");
        sb.append('\n');
    }

    @Override
    public void buildString(String str) {
        sb.append('*' + str + '\n');
        sb.append('\n');
    }

    @Override
    public void buildItems(String[] items) {
        for (String item : items) {
            sb.append(" -" + item + '\n');
        }
        sb.append('\n');
    }

    @Override
    public void buildDone() {
        sb.append("==================\n");
    }

    public String getResult() {
        return sb.toString();
    }
}
