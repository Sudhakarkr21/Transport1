package com.example.transport;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.File;

public class FunctionsCall {

    public String filepath(String value) {
        File dir = new File(android.os.Environment.getExternalStorageDirectory(), AppFolderName()
                + File.separator + value);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return dir.toString();
    }

    public String AppFolderName() {
        return "TRANSPORT_FILES" + File.separator + "data" + File.separator + "files";
    }
}
