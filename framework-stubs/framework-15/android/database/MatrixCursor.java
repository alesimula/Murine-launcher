package android.database;

public class MatrixCursor extends android.database.AbstractCursor {
    public MatrixCursor(java.lang.String[] p0, int p1) { super(); }
    public MatrixCursor(java.lang.String[] p0) { super(); }
    public android.database.MatrixCursor.RowBuilder newRow() { return null; }
    public void addRow(java.lang.Object[] p0) {}
    public void addRow(java.lang.Iterable<?> p0) {}
    public int getCount() { return 0; }
    public java.lang.String[] getColumnNames() { return null; }
    public java.lang.String getString(int p0) { return null; }
    public short getShort(int p0) { return 0; }
    public int getInt(int p0) { return 0; }
    public long getLong(int p0) { return 0L; }
    public float getFloat(int p0) { return 0.0f; }
    public double getDouble(int p0) { return 0.0; }
    public byte[] getBlob(int p0) { return null; }
    public int getType(int p0) { return 0; }
    public boolean isNull(int p0) { return false; }

    public class RowBuilder {
        RowBuilder(android.database.MatrixCursor p0, int p1) {}
        public android.database.MatrixCursor.RowBuilder add(java.lang.Object p0) { return null; }
        public android.database.MatrixCursor.RowBuilder add(java.lang.String p0, java.lang.Object p1) { return null; }
        public final android.database.MatrixCursor.RowBuilder add(int p0, java.lang.Object p1) { return null; }
    }
}
