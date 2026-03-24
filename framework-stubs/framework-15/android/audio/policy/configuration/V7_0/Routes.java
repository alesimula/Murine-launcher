package android.audio.policy.configuration.V7_0;

public class Routes {
    public Routes() {}
    @android.annotation.Nullable
    public java.util.List<android.audio.policy.configuration.V7_0.Routes.Route> getRoute() { return null; }
    @android.annotation.NonNull
    static android.audio.policy.configuration.V7_0.Routes read(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, javax.xml.datatype.DatatypeConfigurationException { return null; }

    public static class Route {
        public Route() {}
        @android.annotation.Nullable
        public android.audio.policy.configuration.V7_0.MixType getType() { return null; }
        boolean hasType() { return false; }
        public void setType(android.audio.policy.configuration.V7_0.MixType p0) {}
        @android.annotation.Nullable
        public java.lang.String getSink() { return null; }
        boolean hasSink() { return false; }
        public void setSink(java.lang.String p0) {}
        @android.annotation.Nullable
        public java.lang.String getSources() { return null; }
        boolean hasSources() { return false; }
        public void setSources(java.lang.String p0) {}
        @android.annotation.NonNull
        static android.audio.policy.configuration.V7_0.Routes.Route read(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, javax.xml.datatype.DatatypeConfigurationException { return null; }
    }
}
