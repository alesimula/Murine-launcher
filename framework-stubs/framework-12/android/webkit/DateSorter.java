package android.webkit;

public class DateSorter {
    private static final java.lang.String LOGTAG = "webkit";
    public static final int DAY_COUNT = 5;
    private long[] mBins;
    private java.lang.String[] mLabels;
    private static final int NUM_DAYS_AGO = 7;
    public DateSorter(android.content.Context p0) {}
    public int getIndex(long p0) { return 0; }
    public java.lang.String getLabel(int p0) { return null; }
    public long getBoundary(int p0) { return 0L; }
    private void beginningOfDay(java.util.Calendar p0) {}
}
