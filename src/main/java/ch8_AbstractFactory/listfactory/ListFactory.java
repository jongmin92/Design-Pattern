package ch8_AbstractFactory.listfactory;

import ch8_AbstractFactory.factory.Factory;
import ch8_AbstractFactory.factory.Link;
import ch8_AbstractFactory.factory.Page;
import ch8_AbstractFactory.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
