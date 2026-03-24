package android.database;

public class MatrixCursor extends android.database.AbstractCursor {
    private final java.lang.String[] columnNames = null;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private java.lang.Object[] data;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private int rowCount;
    private final int columnCount = 0;
    public MatrixCursor(java.lang.String[] p0, int p1) { super(); }
    public MatrixCursor(java.lang.String[] p0) { super(); }
    @android.annotation.UnsupportedAppUsage
    private java.lang.Object get(int p0) { return null; }
    public android.database.MatrixCursor.RowBuilder newRow() { return null; }
    public void addRow(java.lang.Object[] p0) {}
    public void addRow(java.lang.Iterable<?> p0) {}
    private void addRow(java.util.ArrayList<?> p0, int p1) {}
    private void ensureCapacity(int p0) {}
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
        private final int row = 0;
        private final int endIndex = 0;
        private int index;
        RowBuilder(android.database.MatrixCursor p0, int p1) {}
        public android.database.MatrixCursor.RowBuilder add(java.lang.Object p0) { return null; }
        public android.database.MatrixCursor.RowBuilder add(java.lang.String p0, java.lang.Object p1) { return null; }
        public final android.database.MatrixCursor.RowBuilder add(int p0, java.lang.Object p1) { return null; }
    }
}
