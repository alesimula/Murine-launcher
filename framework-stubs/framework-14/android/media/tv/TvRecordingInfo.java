package android.media.tv;

public final class TvRecordingInfo implements android.os.Parcelable {
    public static final int RECORDING_SCHEDULED = 1;
    public static final int RECORDING_IN_PROGRESS = 2;
    public static final int RECORDING_ALL = 3;
    public static final int SUNDAY = 1;
    public static final int MONDAY = 2;
    public static final int TUESDAY = 4;
    public static final int WEDNESDAY = 8;
    public static final int THURSDAY = 16;
    public static final int FRIDAY = 32;
    public static final int SATURDAY = 64;
    public static final android.os.Parcelable.Creator<android.media.tv.TvRecordingInfo> CREATOR = null;
    public TvRecordingInfo(java.lang.String p0, long p1, long p2, int p3, java.lang.String p4, java.lang.String p5, long p6, long p7, android.net.Uri p8, android.net.Uri p9, java.util.List<android.media.tv.TvContentRating> p10, android.net.Uri p11, long p12, long p13) {}
    public java.lang.String getRecordingId() { return null; }
    public long getStartPaddingMillis() { return 0L; }
    public long getEndPaddingMillis() { return 0L; }
    public int getRepeatDays() { return 0; }
    public java.lang.String getName() { return null; }
    public void setName(java.lang.String p0) {}
    public java.lang.String getDescription() { return null; }
    public void setDescription(java.lang.String p0) {}
    public long getScheduledStartTimeMillis() { return 0L; }
    public long getScheduledDurationMillis() { return 0L; }
    public android.net.Uri getChannelUri() { return null; }
    public android.net.Uri getProgramUri() { return null; }
    public java.util.List<android.media.tv.TvContentRating> getContentRatings() { return null; }
    public android.net.Uri getRecordingUri() { return null; }
    public long getRecordingStartTimeMillis() { return 0L; }
    public long getRecordingDurationMillis() { return 0L; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DaysOfWeek {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TvRecordingListType {
    }
}
