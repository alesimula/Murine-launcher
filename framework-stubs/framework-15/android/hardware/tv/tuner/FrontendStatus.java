package android.hardware.tv.tuner;

public final class FrontendStatus implements android.os.Parcelable {
    public static final int isDemodLocked = 0;
    public static final int snr = 1;
    public static final int ber = 2;
    public static final int per = 3;
    public static final int preBer = 4;
    public static final int signalQuality = 5;
    public static final int signalStrength = 6;
    public static final int symbolRate = 7;
    public static final int innerFec = 8;
    public static final int modulationStatus = 9;
    public static final int inversion = 10;
    public static final int lnbVoltage = 11;
    public static final int plpId = 12;
    public static final int isEWBS = 13;
    public static final int agc = 14;
    public static final int isLnaOn = 15;
    public static final int isLayerError = 16;
    public static final int mer = 17;
    public static final int freqOffset = 18;
    public static final int hierarchy = 19;
    public static final int isRfLocked = 20;
    public static final int plpInfo = 21;
    public static final int modulations = 22;
    public static final int bers = 23;
    public static final int codeRates = 24;
    public static final int bandwidth = 25;
    public static final int interval = 26;
    public static final int transmissionMode = 27;
    public static final int uec = 28;
    public static final int systemId = 29;
    public static final int interleaving = 30;
    public static final int isdbtSegment = 31;
    public static final int tsDataRate = 32;
    public static final int rollOff = 33;
    public static final int isMiso = 34;
    public static final int isLinear = 35;
    public static final int isShortFrames = 36;
    public static final int isdbtMode = 37;
    public static final int partialReceptionFlag = 38;
    public static final int streamIdList = 39;
    public static final int dvbtCellIds = 40;
    public static final int allPlpInfo = 41;
    public static final int iptvContentUrl = 42;
    public static final int iptvPacketsReceived = 43;
    public static final int iptvPacketsLost = 44;
    public static final int iptvWorstJitterMs = 45;
    public static final int iptvAverageJitterMs = 46;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendStatus> CREATOR = null;
    public FrontendStatus() {}
    public int getTag() { return 0; }
    public static android.hardware.tv.tuner.FrontendStatus isDemodLocked(boolean p0) { return null; }
    public boolean getIsDemodLocked() { return false; }
    public void setIsDemodLocked(boolean p0) {}
    public static android.hardware.tv.tuner.FrontendStatus snr(int p0) { return null; }
    public int getSnr() { return 0; }
    public void setSnr(int p0) {}
    public static android.hardware.tv.tuner.FrontendStatus ber(int p0) { return null; }
    public int getBer() { return 0; }
    public void setBer(int p0) {}
    public static android.hardware.tv.tuner.FrontendStatus per(int p0) { return null; }
    public int getPer() { return 0; }
    public void setPer(int p0) {}
    public static android.hardware.tv.tuner.FrontendStatus preBer(int p0) { return null; }
    public int getPreBer() { return 0; }
    public void setPreBer(int p0) {}
    public static android.hardware.tv.tuner.FrontendStatus signalQuality(int p0) { return null; }
    public int getSignalQuality() { return 0; }
    public void setSignalQuality(int p0) {}
    public static android.hardware.tv.tuner.FrontendStatus signalStrength(int p0) { return null; }
    public int getSignalStrength() { return 0; }
    public void setSignalStrength(int p0) {}
    public static android.hardware.tv.tuner.FrontendStatus symbolRate(int p0) { return null; }
    public int getSymbolRate() { return 0; }
    public void setSymbolRate(int p0) {}
    public static android.hardware.tv.tuner.FrontendStatus innerFec(long p0) { return null; }
    public long getInnerFec() { return 0L; }
    public void setInnerFec(long p0) {}
    public static android.hardware.tv.tuner.FrontendStatus modulationStatus(android.hardware.tv.tuner.FrontendModulationStatus p0) { return null; }
    public android.hardware.tv.tuner.FrontendModulationStatus getModulationStatus() { return null; }
    public void setModulationStatus(android.hardware.tv.tuner.FrontendModulationStatus p0) {}
    public static android.hardware.tv.tuner.FrontendStatus inversion(int p0) { return null; }
    public int getInversion() { return 0; }
    public void setInversion(int p0) {}
    public static android.hardware.tv.tuner.FrontendStatus lnbVoltage(int p0) { return null; }
    public int getLnbVoltage() { return 0; }
    public void setLnbVoltage(int p0) {}
    public static android.hardware.tv.tuner.FrontendStatus plpId(int p0) { return null; }
    public int getPlpId() { return 0; }
    public void setPlpId(int p0) {}
    public static android.hardware.tv.tuner.FrontendStatus isEWBS(boolean p0) { return null; }
    public boolean getIsEWBS() { return false; }
    public void setIsEWBS(boolean p0) {}
    public static android.hardware.tv.tuner.FrontendStatus agc(int p0) { return null; }
    public int getAgc() { return 0; }
    public void setAgc(int p0) {}
    public static android.hardware.tv.tuner.FrontendStatus isLnaOn(boolean p0) { return null; }
    public boolean getIsLnaOn() { return false; }
    public void setIsLnaOn(boolean p0) {}
    public static android.hardware.tv.tuner.FrontendStatus isLayerError(boolean[] p0) { return null; }
    public boolean[] getIsLayerError() { return null; }
    public void setIsLayerError(boolean[] p0) {}
    public static android.hardware.tv.tuner.FrontendStatus mer(int p0) { return null; }
    public int getMer() { return 0; }
    public void setMer(int p0) {}
    public static android.hardware.tv.tuner.FrontendStatus freqOffset(long p0) { return null; }
    public long getFreqOffset() { return 0L; }
    public void setFreqOffset(long p0) {}
    public static android.hardware.tv.tuner.FrontendStatus hierarchy(int p0) { return null; }
    public int getHierarchy() { return 0; }
    public void setHierarchy(int p0) {}
    public static android.hardware.tv.tuner.FrontendStatus isRfLocked(boolean p0) { return null; }
    public boolean getIsRfLocked() { return false; }
    public void setIsRfLocked(boolean p0) {}
    public static android.hardware.tv.tuner.FrontendStatus plpInfo(android.hardware.tv.tuner.FrontendStatusAtsc3PlpInfo[] p0) { return null; }
    public android.hardware.tv.tuner.FrontendStatusAtsc3PlpInfo[] getPlpInfo() { return null; }
    public void setPlpInfo(android.hardware.tv.tuner.FrontendStatusAtsc3PlpInfo[] p0) {}
    public static android.hardware.tv.tuner.FrontendStatus modulations(android.hardware.tv.tuner.FrontendModulation[] p0) { return null; }
    public android.hardware.tv.tuner.FrontendModulation[] getModulations() { return null; }
    public void setModulations(android.hardware.tv.tuner.FrontendModulation[] p0) {}
    public static android.hardware.tv.tuner.FrontendStatus bers(int[] p0) { return null; }
    public int[] getBers() { return null; }
    public void setBers(int[] p0) {}
    public static android.hardware.tv.tuner.FrontendStatus codeRates(long[] p0) { return null; }
    public long[] getCodeRates() { return null; }
    public void setCodeRates(long[] p0) {}
    public static android.hardware.tv.tuner.FrontendStatus bandwidth(android.hardware.tv.tuner.FrontendBandwidth p0) { return null; }
    public android.hardware.tv.tuner.FrontendBandwidth getBandwidth() { return null; }
    public void setBandwidth(android.hardware.tv.tuner.FrontendBandwidth p0) {}
    public static android.hardware.tv.tuner.FrontendStatus interval(android.hardware.tv.tuner.FrontendGuardInterval p0) { return null; }
    public android.hardware.tv.tuner.FrontendGuardInterval getInterval() { return null; }
    public void setInterval(android.hardware.tv.tuner.FrontendGuardInterval p0) {}
    public static android.hardware.tv.tuner.FrontendStatus transmissionMode(android.hardware.tv.tuner.FrontendTransmissionMode p0) { return null; }
    public android.hardware.tv.tuner.FrontendTransmissionMode getTransmissionMode() { return null; }
    public void setTransmissionMode(android.hardware.tv.tuner.FrontendTransmissionMode p0) {}
    public static android.hardware.tv.tuner.FrontendStatus uec(int p0) { return null; }
    public int getUec() { return 0; }
    public void setUec(int p0) {}
    public static android.hardware.tv.tuner.FrontendStatus systemId(int p0) { return null; }
    public int getSystemId() { return 0; }
    public void setSystemId(int p0) {}
    public static android.hardware.tv.tuner.FrontendStatus interleaving(android.hardware.tv.tuner.FrontendInterleaveMode[] p0) { return null; }
    public android.hardware.tv.tuner.FrontendInterleaveMode[] getInterleaving() { return null; }
    public void setInterleaving(android.hardware.tv.tuner.FrontendInterleaveMode[] p0) {}
    public static android.hardware.tv.tuner.FrontendStatus isdbtSegment(int[] p0) { return null; }
    public int[] getIsdbtSegment() { return null; }
    public void setIsdbtSegment(int[] p0) {}
    public static android.hardware.tv.tuner.FrontendStatus tsDataRate(int[] p0) { return null; }
    public int[] getTsDataRate() { return null; }
    public void setTsDataRate(int[] p0) {}
    public static android.hardware.tv.tuner.FrontendStatus rollOff(android.hardware.tv.tuner.FrontendRollOff p0) { return null; }
    public android.hardware.tv.tuner.FrontendRollOff getRollOff() { return null; }
    public void setRollOff(android.hardware.tv.tuner.FrontendRollOff p0) {}
    public static android.hardware.tv.tuner.FrontendStatus isMiso(boolean p0) { return null; }
    public boolean getIsMiso() { return false; }
    public void setIsMiso(boolean p0) {}
    public static android.hardware.tv.tuner.FrontendStatus isLinear(boolean p0) { return null; }
    public boolean getIsLinear() { return false; }
    public void setIsLinear(boolean p0) {}
    public static android.hardware.tv.tuner.FrontendStatus isShortFrames(boolean p0) { return null; }
    public boolean getIsShortFrames() { return false; }
    public void setIsShortFrames(boolean p0) {}
    public static android.hardware.tv.tuner.FrontendStatus isdbtMode(int p0) { return null; }
    public int getIsdbtMode() { return 0; }
    public void setIsdbtMode(int p0) {}
    public static android.hardware.tv.tuner.FrontendStatus partialReceptionFlag(int p0) { return null; }
    public int getPartialReceptionFlag() { return 0; }
    public void setPartialReceptionFlag(int p0) {}
    public static android.hardware.tv.tuner.FrontendStatus streamIdList(int[] p0) { return null; }
    public int[] getStreamIdList() { return null; }
    public void setStreamIdList(int[] p0) {}
    public static android.hardware.tv.tuner.FrontendStatus dvbtCellIds(int[] p0) { return null; }
    public int[] getDvbtCellIds() { return null; }
    public void setDvbtCellIds(int[] p0) {}
    public static android.hardware.tv.tuner.FrontendStatus allPlpInfo(android.hardware.tv.tuner.FrontendScanAtsc3PlpInfo[] p0) { return null; }
    public android.hardware.tv.tuner.FrontendScanAtsc3PlpInfo[] getAllPlpInfo() { return null; }
    public void setAllPlpInfo(android.hardware.tv.tuner.FrontendScanAtsc3PlpInfo[] p0) {}
    public static android.hardware.tv.tuner.FrontendStatus iptvContentUrl(java.lang.String p0) { return null; }
    public java.lang.String getIptvContentUrl() { return null; }
    public void setIptvContentUrl(java.lang.String p0) {}
    public static android.hardware.tv.tuner.FrontendStatus iptvPacketsReceived(long p0) { return null; }
    public long getIptvPacketsReceived() { return 0L; }
    public void setIptvPacketsReceived(long p0) {}
    public static android.hardware.tv.tuner.FrontendStatus iptvPacketsLost(long p0) { return null; }
    public long getIptvPacketsLost() { return 0L; }
    public void setIptvPacketsLost(long p0) {}
    public static android.hardware.tv.tuner.FrontendStatus iptvWorstJitterMs(int p0) { return null; }
    public int getIptvWorstJitterMs() { return 0; }
    public void setIptvWorstJitterMs(int p0) {}
    public static android.hardware.tv.tuner.FrontendStatus iptvAverageJitterMs(int p0) { return null; }
    public int getIptvAverageJitterMs() { return 0; }
    public void setIptvAverageJitterMs(int p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Tag {
        public static final int isDemodLocked = 0;
        public static final int snr = 1;
        public static final int ber = 2;
        public static final int per = 3;
        public static final int preBer = 4;
        public static final int signalQuality = 5;
        public static final int signalStrength = 6;
        public static final int symbolRate = 7;
        public static final int innerFec = 8;
        public static final int modulationStatus = 9;
        public static final int inversion = 10;
        public static final int lnbVoltage = 11;
        public static final int plpId = 12;
        public static final int isEWBS = 13;
        public static final int agc = 14;
        public static final int isLnaOn = 15;
        public static final int isLayerError = 16;
        public static final int mer = 17;
        public static final int freqOffset = 18;
        public static final int hierarchy = 19;
        public static final int isRfLocked = 20;
        public static final int plpInfo = 21;
        public static final int modulations = 22;
        public static final int bers = 23;
        public static final int codeRates = 24;
        public static final int bandwidth = 25;
        public static final int interval = 26;
        public static final int transmissionMode = 27;
        public static final int uec = 28;
        public static final int systemId = 29;
        public static final int interleaving = 30;
        public static final int isdbtSegment = 31;
        public static final int tsDataRate = 32;
        public static final int rollOff = 33;
        public static final int isMiso = 34;
        public static final int isLinear = 35;
        public static final int isShortFrames = 36;
        public static final int isdbtMode = 37;
        public static final int partialReceptionFlag = 38;
        public static final int streamIdList = 39;
        public static final int dvbtCellIds = 40;
        public static final int allPlpInfo = 41;
        public static final int iptvContentUrl = 42;
        public static final int iptvPacketsReceived = 43;
        public static final int iptvPacketsLost = 44;
        public static final int iptvWorstJitterMs = 45;
        public static final int iptvAverageJitterMs = 46;
    }
}
