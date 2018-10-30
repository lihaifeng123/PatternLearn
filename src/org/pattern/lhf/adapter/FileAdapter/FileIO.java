package org.pattern.lhf.adapter.FileAdapter;

import java.io.IOException;

public interface FileIO {
//    public abstract void writeFileLine(String header,String value);
    public void readFromFile(String filename) throws IOException;
    public void writeToFile(String filename) throws IOException;
    public void setValue(String key,String value);
    public String getValue(String key);
}
