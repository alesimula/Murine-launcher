package android.telephony.satellite;

public final class SatelliteSessionStats implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.satellite.SatelliteSessionStats> CREATOR = null;
    public SatelliteSessionStats() {}
    public SatelliteSessionStats(android.telephony.satellite.SatelliteSessionStats.Builder p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int getCountOfSuccessfulUserMessages() { return 0; }
    public void incrementSuccessfulUserMessageCount() {}
    public int getCountOfUnsuccessfulUserMessages() { return 0; }
    public void incrementUnsuccessfulUserMessageCount() {}
    public int getCountOfTimedOutUserMessagesWaitingForConnection() { return 0; }
    public void incrementTimedOutUserMessagesWaitingForConnection() {}
    public int getCountOfTimedOutUserMessagesWaitingForAck() { return 0; }
    public void incrementTimedOutUserMessagesWaitingForAck() {}
    public int getCountOfUserMessagesInQueueToBeSent() { return 0; }
    public void incrementUserMessagesInQueueToBeSent() {}
    public long getLatencyOfAllSuccessfulUserMessages() { return 0L; }
    public void updateLatencyOfAllSuccessfulUserMessages(long p0) {}
    public void recordSuccessfulOutgoingDatagramStats(int p0, long p1) {}
    public void resetCountOfUserMessagesInQueueToBeSent() {}
    public int getCountOfSuccessfulOutgoingDatagram(int p0) { return 0; }
    public long getMaxLatency() { return 0L; }
    public java.lang.Long getLatencyOfAllSuccessfulUserMessages(int p0) { return null; }
    public long getLastMessageLatency() { return 0L; }
    public void addCountOfUnsuccessfulUserMessages(int p0, int p1) {}
    public void updateCountOfUserMessagesInQueueToBeSent(int p0) {}
    public int getCountOfUnsuccessfulUserMessages(int p0) { return 0; }
    public int getCountOfTimedOutUserMessagesWaitingForConnection(int p0) { return 0; }
    public int getCountOfTimedOutUserMessagesWaitingForAck(int p0) { return 0; }
    public int getCountOfUserMessagesInQueueToBeSent(int p0) { return 0; }
    public void clear() {}
    public java.util.Map<java.lang.Integer, android.telephony.satellite.SatelliteSessionStats> getSatelliteSessionStats() { return null; }
    public void setSatelliteSessionStats(java.util.Map<java.lang.Integer, android.telephony.satellite.SatelliteSessionStats> p0) {}

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
        public android.telephony.satellite.SatelliteSessionStats.Builder setLatencyOfSuccessfulUserMessages(long p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.satellite.SatelliteSessionStats.Builder setMaxLatency(long p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.satellite.SatelliteSessionStats.Builder setLastLatency(long p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.satellite.SatelliteSessionStats build() { return null; }
    }
}
