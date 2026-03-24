package android.database.sqlite;

public class DatabaseObjectNotClosedException extends java.lang.RuntimeException {
    private static final java.lang.String s = "Application did not close the cursor or database object that was opened here";
    @android.annotation.UnsupportedAppUsage
    public DatabaseObjectNotClosedException() { super(); }
}
