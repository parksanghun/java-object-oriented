package com.company.abstractex;

import java.io.InputStream;
import java.io.OutputStream;

public class BoxCloudFile implements CloudFile {
    @Override
    public String getId() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public boolean hasUrl() {
        return false;
    }

    @Override
    public String getUrl() {
        return null;
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }

    @Override
    public void write(OutputStream out) {

    }

    @Override
    public void delete() {

    }
}
