package com.company.abstractex;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DropBoxFileSystem implements CloudFileSystem {

    private DropBoxClient dbClient = new DropBoxClient();

    @Override
    public List<CloudFile> getFiles() {
        List<DbFile> dbFiles = dbClient.getFiles();
        List<CloudFile> results = new ArrayList<>(dbFiles.size());
        for (DbFile file : dbFiles) {
            DropBoxCloudFile cf = new DropBoxCloudFile(file, dbClient);
            results.add(cf);
        }
        return results;
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
