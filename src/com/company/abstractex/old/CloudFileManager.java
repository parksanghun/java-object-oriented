package com.company.abstractex.old;

import com.company.abstractex.DbFile;
import com.company.abstractex.DropBoxClient;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class CloudFileManager {
    public List<FileInfo> getFileInfos(CloudId cloudId) {
        if (cloudId == CloudId.DROPBOX) {
            DropBoxClient dc = ...;
            List<DbFile> dbFiles = db.getFiles();
            List<FileInfo> result = new ArrayList<>();
            for (DbFile dbFile : dbFiles) {
                FileInfo fi = new FileInfo();
                fi.setCloudId(CloudId.DROPBOX);
                fi.setFileId(fi.getFileId());

                result.add(fi);
            }
        } else if (cloudId == CloudId.BOX) {
            BoxService boxSvc = ...;
            ... //
        }
        return result;
    }

    public void download(FileInfo file, File localTarget) {
        if (file.getCloudId() == CloudId.DROPBOX) {
            DropboxClient dc = ...;
            FileOutputStream out = new FileOutputStream(localTarget);
            dc.copy(file.getFileId(), out);
            out.close();
        } else if (file.getCloudId() == CloudId.BOX) {
            BoxService boxSvc = ...;
            InputStream is = boxSvc.getInputStream(file.getId());
            FileOutputStream out = new FileOutputStream(localTarget);
            CopyUtil.copy(is, out);
        }
    }
}
