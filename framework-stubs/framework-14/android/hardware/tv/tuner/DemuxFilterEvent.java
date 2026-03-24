package android.hardware.tv.tuner;

public final class DemuxFilterEvent implements android.os.Parcelable {
    public static final int section = 0;
    public static final int media = 1;
    public static final int pes = 2;
    public static final int tsRecord = 3;
    public static final int mmtpRecord = 4;
    public static final int download = 5;
    public static final int ipPayload = 6;
    public static final int temi = 7;
    public static final int monitorEvent = 8;
    public static final int startId = 9;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxFilterEvent> CREATOR = null;
    public DemuxFilterEvent() {}
    public int getTag() { return 0; }
    public static android.hardware.tv.tuner.DemuxFilterEvent section(android.hardware.tv.tuner.DemuxFilterSectionEvent p0) { return null; }
    public android.hardware.tv.tuner.DemuxFilterSectionEvent getSection() { return null; }
    public void setSection(android.hardware.tv.tuner.DemuxFilterSectionEvent p0) {}
    public static android.hardware.tv.tuner.DemuxFilterEvent media(android.hardware.tv.tuner.DemuxFilterMediaEvent p0) { return null; }
    public android.hardware.tv.tuner.DemuxFilterMediaEvent getMedia() { return null; }
    public void setMedia(android.hardware.tv.tuner.DemuxFilterMediaEvent p0) {}
    public static android.hardware.tv.tuner.DemuxFilterEvent pes(android.hardware.tv.tuner.DemuxFilterPesEvent p0) { return null; }
    public android.hardware.tv.tuner.DemuxFilterPesEvent getPes() { return null; }
    public void setPes(android.hardware.tv.tuner.DemuxFilterPesEvent p0) {}
    public static android.hardware.tv.tuner.DemuxFilterEvent tsRecord(android.hardware.tv.tuner.DemuxFilterTsRecordEvent p0) { return null; }
    public android.hardware.tv.tuner.DemuxFilterTsRecordEvent getTsRecord() { return null; }
    public void setTsRecord(android.hardware.tv.tuner.DemuxFilterTsRecordEvent p0) {}
    public static android.hardware.tv.tuner.DemuxFilterEvent mmtpRecord(android.hardware.tv.tuner.DemuxFilterMmtpRecordEvent p0) { return null; }
    public android.hardware.tv.tuner.DemuxFilterMmtpRecordEvent getMmtpRecord() { return null; }
    public void setMmtpRecord(android.hardware.tv.tuner.DemuxFilterMmtpRecordEvent p0) {}
    public static android.hardware.tv.tuner.DemuxFilterEvent download(android.hardware.tv.tuner.DemuxFilterDownloadEvent p0) { return null; }
    public android.hardware.tv.tuner.DemuxFilterDownloadEvent getDownload() { return null; }
    public void setDownload(android.hardware.tv.tuner.DemuxFilterDownloadEvent p0) {}
    public static android.hardware.tv.tuner.DemuxFilterEvent ipPayload(android.hardware.tv.tuner.DemuxFilterIpPayloadEvent p0) { return null; }
    public android.hardware.tv.tuner.DemuxFilterIpPayloadEvent getIpPayload() { return null; }
    public void setIpPayload(android.hardware.tv.tuner.DemuxFilterIpPayloadEvent p0) {}
    public static android.hardware.tv.tuner.DemuxFilterEvent temi(android.hardware.tv.tuner.DemuxFilterTemiEvent p0) { return null; }
    public android.hardware.tv.tuner.DemuxFilterTemiEvent getTemi() { return null; }
    public void setTemi(android.hardware.tv.tuner.DemuxFilterTemiEvent p0) {}
    public static android.hardware.tv.tuner.DemuxFilterEvent monitorEvent(android.hardware.tv.tuner.DemuxFilterMonitorEvent p0) { return null; }
    public android.hardware.tv.tuner.DemuxFilterMonitorEvent getMonitorEvent() { return null; }
    public void setMonitorEvent(android.hardware.tv.tuner.DemuxFilterMonitorEvent p0) {}
    public static android.hardware.tv.tuner.DemuxFilterEvent startId(int p0) { return null; }
    public int getStartId() { return 0; }
    public void setStartId(int p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Tag {
        public static final int section = 0;
        public static final int media = 1;
        public static final int pes = 2;
        public static final int tsRecord = 3;
        public static final int mmtpRecord = 4;
        public static final int download = 5;
        public static final int ipPayload = 6;
        public static final int temi = 7;
        public static final int monitorEvent = 8;
        public static final int startId = 9;
    }
}
