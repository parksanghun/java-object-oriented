package com.company.abstractex;

import java.io.InputStream;
import java.io.OutputStream;

public interface CloudFile {

    String getId();
    String getName();
    int getLength();
    boolean hasUrl();
    String getUrl();
    InputStream getInputStream();
    void write(OutputStream out);
    void delete();
}
