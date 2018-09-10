package ch8_AbstractFactory.listfactory;

import java.util.Iterator;

import ch8_AbstractFactory.factory.Item;
import ch8_AbstractFactory.factory.Tray;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<li>\n");
        sb.append(caption + '\n');
        sb.append("<ul>\n");
        for (Object aTray : tray) {
            Item item = (Item) aTray;
            sb.append(item.makeHTML());
        }
        sb.append("</ul>\n");
        sb.append("</li>\n");
        return sb.toString();
    }
}
