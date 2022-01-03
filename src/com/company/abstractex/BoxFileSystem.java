package com.company.abstractex;

import java.io.File;
import java.util.List;

public class BoxFileSystem implements CloudFileSystem {
    private BoxClient boxClient = new BoxClient();

    @Override
    public List<CloudFile> getFiles() {
        return null;
    }

    @Override
    public List<CloudFile> search(String query) {
        return null;
    }

    @Override
    public CloudFile getFile(String fileId) {
        return null;
    }

    @Override
    public void addFile(String name, File file) {

    }

    @Override
    public void copyFrom(CloudFile file) {

    }
}
