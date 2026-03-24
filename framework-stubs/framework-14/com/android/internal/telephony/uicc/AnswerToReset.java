package com.android.internal.telephony.uicc;

public class AnswerToReset {
    public static final byte DIRECT_CONVENTION = 59;
    public static final byte INVERSE_CONVENTION = 63;
    public static final int INTERFACE_BYTES_MASK = 240;
    public static final int T_MASK = 15;
    public static final int T_VALUE_FOR_GLOBAL_INTERFACE = 15;
    public static final int TA_MASK = 16;
    public static final int TB_MASK = 32;
    public static final int TC_MASK = 64;
    public static final int TD_MASK = 128;
    public static com.android.internal.telephony.uicc.AnswerToReset parseAtr(java.lang.String p0) { return null; }
    public byte getConventionByte() { return 0; }
    public byte getFormatByte() { return 0; }
    public java.util.List<com.android.internal.telephony.uicc.AnswerToReset.InterfaceByte> getInterfaceBytes() { return null; }
    public com.android.internal.telephony.uicc.AnswerToReset.HistoricalBytes getHistoricalBytes() { return null; }
    public java.lang.Byte getCheckByte() { return null; }
    public boolean isEuiccSupported() { return false; }
    public boolean isExtendedApduSupported() { return false; }
    public boolean isMultipleEnabledProfilesSupported() { return false; }
    public java.lang.String toString() { return null; }
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    public static class HistoricalBytes {
        public byte getCategory() { return 0; }
        public byte[] getRawData() { return null; }
        public byte[] getValue(int p0) { return null; }
    }

    public static class InterfaceByte {
        public java.lang.Byte getTA() { return null; }
        public java.lang.Byte getTB() { return null; }
        public java.lang.Byte getTC() { return null; }
        public java.lang.Byte getTD() { return null; }
        public void setTA(java.lang.Byte p0) {}
        public void setTB(java.lang.Byte p0) {}
        public void setTC(java.lang.Byte p0) {}
        public void setTD(java.lang.Byte p0) {}
        public InterfaceByte(java.lang.Byte p0, java.lang.Byte p1, java.lang.Byte p2, java.lang.Byte p3) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
