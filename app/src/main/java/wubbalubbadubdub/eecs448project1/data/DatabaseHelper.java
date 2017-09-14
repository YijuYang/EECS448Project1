package wubbalubbadubdub.eecs448project1.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.Vector;

/**
 * DatabaseHelper.java
 * @author Damian
 * @version 1.0
 * This class contains helper methods that interact with the Database. This replaced the Dataclass
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    public DatabaseHelper(Context context) {
        super(context, DBContract.DATABASE_NAME, null, DBContract.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create all tables
        db.execSQL(DBContract.UserTable.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Delete all tables
        db.execSQL(DBContract.UserTable.DROP_TABLE);
    }

    /**
     *
     * @return A sorted Vector of Events from the Database
     * @since 1.0
     */
    public Vector<Event> getAllEvents() {
        Vector<Event> sortedListOfEvents = new Vector<Event>(); // Will be sorted through SQL

        return sortedListOfEvents;
    }

    /**
     *
     * @param eventID ID of event in Table
     * @return String of timeslots for a given event ID
     */
    public String getTimeslots(int eventID) {

        return "";
    }

    /**
     *
     * @param name the name of the new user to add
     * @return -1 for failure, otherwise will return the row inserted at.
     */
    public long addUser(String name) {
        SQLiteDatabase db = this.getWritableDatabase(); // is this okay?

        ContentValues values = new ContentValues();
        values.put(DBContract.UserTable.COLUMN_NAME_NAME, name);

        return db.insert(DBContract.UserTable.TABLE_NAME, null, values);
    }
}