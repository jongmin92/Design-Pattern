package ch8_AbstractFactory.tablefactory;

import ch8_AbstractFactory.factory.Factory;
import ch8_AbstractFactory.factory.Link;
import ch8_AbstractFactory.factory.Page;
import ch8_AbstractFactory.factory.Tray;

public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
