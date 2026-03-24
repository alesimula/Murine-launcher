package android.audio.policy.configuration.V7_0;

public class Modules {
    private java.util.List<android.audio.policy.configuration.V7_0.Modules.Module> module;
    public Modules() {}
    public java.util.List<android.audio.policy.configuration.V7_0.Modules.Module> getModule() { return null; }
    static android.audio.policy.configuration.V7_0.Modules read(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, javax.xml.datatype.DatatypeConfigurationException { return null; }

    public static class Module {
        private android.audio.policy.configuration.V7_0.AttachedDevices attachedDevices;
        private java.lang.String defaultOutputDevice;
        private android.audio.policy.configuration.V7_0.MixPorts mixPorts;
        private android.audio.policy.configuration.V7_0.DevicePorts devicePorts;
        private android.audio.policy.configuration.V7_0.Routes routes;
        private java.lang.String name;
        private android.audio.policy.configuration.V7_0.HalVersion halVersion;
        public Module() {}
        public android.audio.policy.configuration.V7_0.AttachedDevices getAttachedDevices() { return null; }
        boolean hasAttachedDevices() { return false; }
        public void setAttachedDevices(android.audio.policy.configuration.V7_0.AttachedDevices p0) {}
        public java.lang.String getDefaultOutputDevice() { return null; }
        boolean hasDefaultOutputDevice() { return false; }
        public void setDefaultOutputDevice(java.lang.String p0) {}
        public android.audio.policy.configuration.V7_0.MixPorts getMixPorts() { return null; }
        boolean hasMixPorts() { return false; }
        public void setMixPorts(android.audio.policy.configuration.V7_0.MixPorts p0) {}
        public android.audio.policy.configuration.V7_0.DevicePorts getDevicePorts() { return null; }
        boolean hasDevicePorts() { return false; }
        public void setDevicePorts(android.audio.policy.configuration.V7_0.DevicePorts p0) {}
        public android.audio.policy.configuration.V7_0.Routes getRoutes() { return null; }
        boolean hasRoutes() { return false; }
        public void setRoutes(android.audio.policy.configuration.V7_0.Routes p0) {}
        public java.lang.String getName() { return null; }
        boolean hasName() { return false; }
        public void setName(java.lang.String p0) {}
        public android.audio.policy.configuration.V7_0.HalVersion getHalVersion() { return null; }
        boolean hasHalVersion() { return false; }
        public void setHalVersion(android.audio.policy.configuration.V7_0.HalVersion p0) {}
        static android.audio.policy.configuration.V7_0.Modules.Module read(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, javax.xml.datatype.DatatypeConfigurationException { return null; }
    }
}
