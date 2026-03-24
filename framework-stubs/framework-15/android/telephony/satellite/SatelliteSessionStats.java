package android.telephony.satellite;

public class SatelliteSessionStats implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.satellite.SatelliteSessionStats> CREATOR = null;
    public SatelliteSessionStats(android.telephony.satellite.SatelliteSessionStats.Builder p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int getCountOfSuccessfulUserMessages() { return 0; }
    public int getCountOfUnsuccessfulUserMessages() { return 0; }
    public int getCountOfTimedOutUserMessagesWaitingForConnection() { return 0; }
    public int getCountOfTimedOutUserMessagesWaitingForAck() { return 0; }
    public int getCountOfUserMessagesInQueueToBeSent() { return 0; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.telephony.satellite.SatelliteSessionStats.Builder setCountOfSuccessfulUserMessages(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.satellite.SatelliteSessionStats.Builder setCountOfUnsuccessfulUserMessages(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.satellite.SatelliteSessionStats.Builder setCountOfTimedOutUserMessagesWaitingForConnection(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.satellite.SatelliteSessionStats.Builder setCountOfTimedOutUserMessagesWaitingForAck(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.satellite.SatelliteSessionStats.Builder setCountOfUserMessagesInQueueToBeSent(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.satellite.SatelliteSessionStats build() { return null; }
    }
}
