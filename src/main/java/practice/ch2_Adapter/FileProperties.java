package practice.ch2_Adapter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties implements FileIO {
    Properties p = new Properties();

    @Override
    public void readFromFile(String filename) throws IOException {
        p.load(FileProperties.class.getClassLoader().getResourceAsStream(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        p.store(new FileOutputStream(filename), "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        p.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return p.getProperty(key, " ");
    }
}
