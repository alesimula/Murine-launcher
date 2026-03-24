package android.app.compat;

final class ChangeIdStateQuery {
    static final int QUERY_BY_PACKAGE_NAME = 0;
    static final int QUERY_BY_UID = 1;
    public int type;
    public long changeId;
    public java.lang.String packageName;
    public int uid;
    public int userId;
    private ChangeIdStateQuery(int p0, long p1, java.lang.String p2, int p3, int p4) {}
    static android.app.compat.ChangeIdStateQuery byPackageName(long p0, java.lang.String p1, int p2) { return null; }
    static android.app.compat.ChangeIdStateQuery byUid(long p0, int p1) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface QueryType {
    }
}
