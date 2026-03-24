package android.hardware.tv.tuner;

public final class FrontendScanMessage implements android.os.Parcelable {
    public static final int isLocked = 0;
    public static final int isEnd = 1;
    public static final int progressPercent = 2;
    public static final int frequencies = 3;
    public static final int symbolRates = 4;
    public static final int hierarchy = 5;
    public static final int analogType = 6;
    public static final int plpIds = 7;
    public static final int groupIds = 8;
    public static final int inputStreamIds = 9;
    public static final int std = 10;
    public static final int atsc3PlpInfos = 11;
    public static final int modulation = 12;
    public static final int annex = 13;
    public static final int isHighPriority = 14;
    public static final int dvbtCellIds = 15;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendScanMessage> CREATOR = null;
    public FrontendScanMessage() {}
    public int getTag() { return 0; }
    public static android.hardware.tv.tuner.FrontendScanMessage isLocked(boolean p0) { return null; }
    public boolean getIsLocked() { return false; }
    public void setIsLocked(boolean p0) {}
    public static android.hardware.tv.tuner.FrontendScanMessage isEnd(boolean p0) { return null; }
    public boolean getIsEnd() { return false; }
    public void setIsEnd(boolean p0) {}
    public static android.hardware.tv.tuner.FrontendScanMessage progressPercent(int p0) { return null; }
    public int getProgressPercent() { return 0; }
    public void setProgressPercent(int p0) {}
    public static android.hardware.tv.tuner.FrontendScanMessage frequencies(long[] p0) { return null; }
    public long[] getFrequencies() { return null; }
    public void setFrequencies(long[] p0) {}
    public static android.hardware.tv.tuner.FrontendScanMessage symbolRates(int[] p0) { return null; }
    public int[] getSymbolRates() { return null; }
    public void setSymbolRates(int[] p0) {}
    public static android.hardware.tv.tuner.FrontendScanMessage hierarchy(int p0) { return null; }
    public int getHierarchy() { return 0; }
    public void setHierarchy(int p0) {}
    public static android.hardware.tv.tuner.FrontendScanMessage analogType(int p0) { return null; }
    public int getAnalogType() { return 0; }
    public void setAnalogType(int p0) {}
    public static android.hardware.tv.tuner.FrontendScanMessage plpIds(int[] p0) { return null; }
    public int[] getPlpIds() { return null; }
    public void setPlpIds(int[] p0) {}
    public static android.hardware.tv.tuner.FrontendScanMessage groupIds(int[] p0) { return null; }
    public int[] getGroupIds() { return null; }
    public void setGroupIds(int[] p0) {}
    public static android.hardware.tv.tuner.FrontendScanMessage inputStreamIds(int[] p0) { return null; }
    public int[] getInputStreamIds() { return null; }
    public void setInputStreamIds(int[] p0) {}
    public static android.hardware.tv.tuner.FrontendScanMessage std(android.hardware.tv.tuner.FrontendScanMessageStandard p0) { return null; }
    public android.hardware.tv.tuner.FrontendScanMessageStandard getStd() { return null; }
    public void setStd(android.hardware.tv.tuner.FrontendScanMessageStandard p0) {}
    public static android.hardware.tv.tuner.FrontendScanMessage atsc3PlpInfos(android.hardware.tv.tuner.FrontendScanAtsc3PlpInfo[] p0) { return null; }
    public android.hardware.tv.tuner.FrontendScanAtsc3PlpInfo[] getAtsc3PlpInfos() { return null; }
    public void setAtsc3PlpInfos(android.hardware.tv.tuner.FrontendScanAtsc3PlpInfo[] p0) {}
    public static android.hardware.tv.tuner.FrontendScanMessage modulation(android.hardware.tv.tuner.FrontendModulation p0) { return null; }
    public android.hardware.tv.tuner.FrontendModulation getModulation() { return null; }
    public void setModulation(android.hardware.tv.tuner.FrontendModulation p0) {}
    public static android.hardware.tv.tuner.FrontendScanMessage annex(byte p0) { return null; }
    public byte getAnnex() { return 0; }
    public void setAnnex(byte p0) {}
    public static android.hardware.tv.tuner.FrontendScanMessage isHighPriority(boolean p0) { return null; }
    public boolean getIsHighPriority() { return false; }
    public void setIsHighPriority(boolean p0) {}
    public static android.hardware.tv.tuner.FrontendScanMessage dvbtCellIds(int[] p0) { return null; }
    public int[] getDvbtCellIds() { return null; }
    public void setDvbtCellIds(int[] p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Tag {
        public static final int isLocked = 0;
        public static final int isEnd = 1;
        public static final int progressPercent = 2;
        public static final int frequencies = 3;
        public static final int symbolRates = 4;
        public static final int hierarchy = 5;
        public static final int analogType = 6;
        public static final int plpIds = 7;
        public static final int groupIds = 8;
        public static final int inputStreamIds = 9;
        public static final int std = 10;
        public static final int atsc3PlpInfos = 11;
        public static final int modulation = 12;
        public static final int annex = 13;
        public static final int isHighPriority = 14;
        public static final int dvbtCellIds = 15;
    }
}
