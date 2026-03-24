package android.print;

public final class PrintDocumentInfo implements android.os.Parcelable {
    public static final int PAGE_COUNT_UNKNOWN = -1;
    public static final int CONTENT_TYPE_UNKNOWN = -1;
    public static final int CONTENT_TYPE_DOCUMENT = 0;
    public static final int CONTENT_TYPE_PHOTO = 1;
    public static final android.os.Parcelable.Creator<android.print.PrintDocumentInfo> CREATOR = null;
    public java.lang.String getName() { return null; }
    public int getPageCount() { return 0; }
    public int getContentType() { return 0; }
    public long getDataSize() { return 0L; }
    public void setDataSize(long p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder(java.lang.String p0) {}
        public android.print.PrintDocumentInfo.Builder setPageCount(int p0) { return null; }
        public android.print.PrintDocumentInfo.Builder setContentType(int p0) { return null; }
        public android.print.PrintDocumentInfo build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ContentType {
    }
}
