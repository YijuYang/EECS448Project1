package wubbalubbadubdub.eecs448project1.data;


import android.provider.BaseColumns;

/**
 * DBContract.java
 * @author Damian
 * @version 1.0
 * This class contains the contract work that will help our database class
 */
public final class DBContract {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "database.db";


    /**
     * Constructor is private so the contract can never be initialized
     */
    private DBContract() {}

    /**
     * {Class} Users
     * This defines the columns for our Users table
     * @since 1.0
     */
    public static class UserTable implements BaseColumns {
        public static final String TABLE_NAME = "users";
        public static final String COLUMN_NAME_NAME = "name";

        public static final String CREATE_TABLE = "CREATE TABLE " +
                TABLE_NAME + " (" +
                _ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                COLUMN_NAME_NAME + " TEXT COLLATE NOCASE UNIQUE);";
        public static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;
    }

    /**
     * {Class} Events
     * This defines the columns for our Events table.
     * @since 1.0
     */
    public static class EventTable implements BaseColumns { // If we implement BaseColumns, we can utilize _ID as a default column
        public static final String TABLE_NAME = "events";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_TIMESLOTS = "timeslots";
        public static final String COLUMN_NAME_CREATOR = "creator";
    }

    /**
     * {Class} Signups
     * This defines the columns for our Signups table
     * @since 1.0
     */
    public static class SignupTable implements BaseColumns {
        public static final String TABLE_NAME = "signups";
        public static final String COLUMN_NAME_EVENT = "eid";
        public static final String COLUMN_NAME_USER = "user";
        public static final String COLUMN_NAME_AVAIL = "availability";
    }
}
