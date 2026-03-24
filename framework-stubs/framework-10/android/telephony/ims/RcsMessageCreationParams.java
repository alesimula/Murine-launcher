package android.telephony.ims;

public class RcsMessageCreationParams {
    private final java.lang.String mRcsMessageGlobalId = null;
    private final int mSubId = 0;
    private final int mMessageStatus = 0;
    private final long mOriginationTimestamp = 0L;
    private final java.lang.String mText = null;
    private final double mLatitude = 0.0;
    private final double mLongitude = 0.0;
    public java.lang.String getRcsMessageGlobalId() { return null; }
    public int getSubId() { return 0; }
    public int getMessageStatus() { return 0; }
    public long getOriginationTimestamp() { return 0L; }
    public java.lang.String getText() { return null; }
    public double getLatitude() { return 0.0; }
    public double getLongitude() { return 0.0; }
    protected RcsMessageCreationParams(android.telephony.ims.RcsMessageCreationParams.Builder p0) {}
    RcsMessageCreationParams(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0) {}

    public static class Builder {
        private java.lang.String mRcsMessageGlobalId;
        private int mSubId;
        private int mMessageStatus;
        private long mOriginationTimestamp;
        private java.lang.String mText;
        private double mLatitude;
        private double mLongitude;
        public Builder(long p0, int p1) {}
        public android.telephony.ims.RcsMessageCreationParams.Builder setStatus(int p0) { return null; }
        public android.telephony.ims.RcsMessageCreationParams.Builder setRcsMessageId(java.lang.String p0) { return null; }
        public android.telephony.ims.RcsMessageCreationParams.Builder setText(java.lang.String p0) { return null; }
        public android.telephony.ims.RcsMessageCreationParams.Builder setLatitude(double p0) { return null; }
        public android.telephony.ims.RcsMessageCreationParams.Builder setLongitude(double p0) { return null; }
        public android.telephony.ims.RcsMessageCreationParams build() { return null; }
    }
}
