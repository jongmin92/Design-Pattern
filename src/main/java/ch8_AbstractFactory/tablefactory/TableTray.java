package ch8_AbstractFactory.tablefactory;

import java.util.Iterator;

import ch8_AbstractFactory.factory.Item;
import ch8_AbstractFactory.factory.Tray;

public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<td>");
        sb.append("<table width=\"100%\" border= \"1\"><tr>");
        sb.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\"" + tray.size() + "\"><b>" + caption + "</b></td>");
        sb.append("</tr>\n");
        sb.append("<tr>\n");
        for (Object aTray : tray) {
            Item item = (Item) aTray;
            sb.append(item.makeHTML());
        }
        sb.append("</tr></table>");
        sb.append("</td>");
        return sb.toString();
    }
}
