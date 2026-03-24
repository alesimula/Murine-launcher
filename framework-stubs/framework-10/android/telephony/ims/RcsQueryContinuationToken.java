package android.telephony.ims;

public final class RcsQueryContinuationToken implements android.os.Parcelable {
    public static final int EVENT_QUERY_CONTINUATION_TOKEN_TYPE = 0;
    public static final int MESSAGE_QUERY_CONTINUATION_TOKEN_TYPE = 1;
    public static final int PARTICIPANT_QUERY_CONTINUATION_TOKEN_TYPE = 2;
    public static final int THREAD_QUERY_CONTINUATION_TOKEN_TYPE = 3;
    public static final java.lang.String QUERY_CONTINUATION_TOKEN = "query_continuation_token";
    private int mQueryType;
    private final java.lang.String mRawQuery = null;
    private final int mLimit = 0;
    private int mOffset;
    public static final android.os.Parcelable.Creator<android.telephony.ims.RcsQueryContinuationToken> CREATOR = null;
    public RcsQueryContinuationToken(int p0, java.lang.String p1, int p2, int p3) {}
    public java.lang.String getRawQuery() { return null; }
    public int getOffset() { return 0; }
    public void incrementOffset() {}
    public int getQueryType() { return 0; }
    private RcsQueryContinuationToken(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ContinuationTokenType {
    }
}
