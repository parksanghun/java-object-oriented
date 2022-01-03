package com.company.abstractex;

import java.io.InputStream;
import java.io.OutputStream;

public class DropBoxCloudFile implements CloudFile {
    private DropBoxClient dbClient;
    private DbFile dbFile;

    public DropBoxCloudFile(DropBoxClient dbClient, DbFile dbFile) {
        this.dbClient = dbClient;
        this.dbFile = dbFile;
    }

    @Override
    public String getId() {
        return dbFile.geId();
    }

    @Override
    public String getName() {
        return dbFile.getFileName();
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
        return dbFile.getFileUrl();
    }

    @Override
    public InputStream getInputStream() {
        return dbClient.createStreamOfFile(dbFile);
    }

    @Override
    public void write(OutputStream out) {

    }

    @Override
    public void delete() {
        dbClient.deleteFile(dbFile.getId())
    }
}
