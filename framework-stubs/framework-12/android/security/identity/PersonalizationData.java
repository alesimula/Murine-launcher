package android.security.identity;

public class PersonalizationData {
    private java.util.LinkedList<android.security.identity.AccessControlProfile> mProfiles;
    private java.util.LinkedHashMap<java.lang.String, android.security.identity.PersonalizationData.NamespaceData> mNamespaces;
    private PersonalizationData() {}
    java.util.Collection<android.security.identity.AccessControlProfile> getAccessControlProfiles() { return null; }
    java.util.Collection<java.lang.String> getNamespaces() { return null; }
    android.security.identity.PersonalizationData.NamespaceData getNamespaceData(java.lang.String p0) { return null; }

    public static final class Builder {
        private android.security.identity.PersonalizationData mData;
        public Builder() {}
        public android.security.identity.PersonalizationData.Builder putEntry(java.lang.String p0, java.lang.String p1, java.util.Collection<android.security.identity.AccessControlProfileId> p2, byte[] p3) { return null; }
        public android.security.identity.PersonalizationData.Builder addAccessControlProfile(android.security.identity.AccessControlProfile p0) { return null; }
        public android.security.identity.PersonalizationData build() { return null; }
    }

    private static class EntryData {
        byte[] mValue;
        java.util.Collection<android.security.identity.AccessControlProfileId> mAccessControlProfileIds;
        EntryData(byte[] p0, java.util.Collection<android.security.identity.AccessControlProfileId> p1) {}
    }

    static class NamespaceData {
        private java.lang.String mNamespace;
        private java.util.LinkedHashMap<java.lang.String, android.security.identity.PersonalizationData.EntryData> mEntries;
        private NamespaceData(java.lang.String p0) {}
        java.lang.String getNamespaceName() { return null; }
        java.util.Collection<java.lang.String> getEntryNames() { return null; }
        java.util.Collection<android.security.identity.AccessControlProfileId> getAccessControlProfileIds(java.lang.String p0) { return null; }
        byte[] getEntryValue(java.lang.String p0) { return null; }
    }
}
