package com.ashokslsk.maptrouptracker;

/**
 * Created by Ashu on 02/08/15.
 */
import android.content.Context;
import android.database.Cursor;

/**
 * Created by matthewparker on 4/3/15.
 */
public class MemoriesLoader extends DbCursorLoader {

    private MemoriesDataSource mDataSource;

    public MemoriesLoader(Context context, MemoriesDataSource memoriesDataSource){
        super(context);
        mDataSource = memoriesDataSource;
    }

    @Override
    protected Cursor loadCursor() {
        return mDataSource.allMemoriesCursor();
    }
}