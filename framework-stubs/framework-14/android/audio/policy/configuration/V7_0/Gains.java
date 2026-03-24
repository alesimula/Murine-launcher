package android.audio.policy.configuration.V7_0;

public class Gains {
    public Gains() {}
    public java.util.List<android.audio.policy.configuration.V7_0.Gains.Gain> getGain() { return null; }
    static android.audio.policy.configuration.V7_0.Gains read(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, javax.xml.datatype.DatatypeConfigurationException { return null; }

    public static class Gain {
        public Gain() {}
        public java.lang.String getName() { return null; }
        boolean hasName() { return false; }
        public void setName(java.lang.String p0) {}
        public java.util.List<android.audio.policy.configuration.V7_0.AudioGainMode> getMode() { return null; }
        boolean hasMode() { return false; }
        public void setMode(java.util.List<android.audio.policy.configuration.V7_0.AudioGainMode> p0) {}
        public android.audio.policy.configuration.V7_0.AudioChannelMask getChannel_mask() { return null; }
        boolean hasChannel_mask() { return false; }
        public void setChannel_mask(android.audio.policy.configuration.V7_0.AudioChannelMask p0) {}
        public int getMinValueMB() { return 0; }
        boolean hasMinValueMB() { return false; }
        public void setMinValueMB(int p0) {}
        public int getMaxValueMB() { return 0; }
        boolean hasMaxValueMB() { return false; }
        public void setMaxValueMB(int p0) {}
        public int getDefaultValueMB() { return 0; }
        boolean hasDefaultValueMB() { return false; }
        public void setDefaultValueMB(int p0) {}
        public int getStepValueMB() { return 0; }
        boolean hasStepValueMB() { return false; }
        public void setStepValueMB(int p0) {}
        public int getMinRampMs() { return 0; }
        boolean hasMinRampMs() { return false; }
        public void setMinRampMs(int p0) {}
        public int getMaxRampMs() { return 0; }
        boolean hasMaxRampMs() { return false; }
        public void setMaxRampMs(int p0) {}
        public boolean getUseForVolume() { return false; }
        boolean hasUseForVolume() { return false; }
        public void setUseForVolume(boolean p0) {}
        static android.audio.policy.configuration.V7_0.Gains.Gain read(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, javax.xml.datatype.DatatypeConfigurationException { return null; }
    }
}
