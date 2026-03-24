package android.net;

public abstract class Uri implements android.os.Parcelable, java.lang.Comparable<android.net.Uri> {
    public static final android.net.Uri EMPTY = null;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.Uri> CREATOR = null;
    public abstract boolean isHierarchical();
    public boolean isOpaque() { return false; }
    public abstract boolean isRelative();
    public boolean isAbsolute() { return false; }
    @android.annotation.Nullable
    public abstract java.lang.String getScheme();
    public abstract java.lang.String getSchemeSpecificPart();
    public abstract java.lang.String getEncodedSchemeSpecificPart();
    @android.annotation.Nullable
    public abstract java.lang.String getAuthority();
    @android.annotation.Nullable
    public abstract java.lang.String getEncodedAuthority();
    @android.annotation.Nullable
    public abstract java.lang.String getUserInfo();
    @android.annotation.Nullable
    public abstract java.lang.String getEncodedUserInfo();
    @android.annotation.Nullable
    public abstract java.lang.String getHost();
    public abstract int getPort();
    @android.annotation.Nullable
    public abstract java.lang.String getPath();
    @android.annotation.Nullable
    public abstract java.lang.String getEncodedPath();
    @android.annotation.Nullable
    public abstract java.lang.String getQuery();
    @android.annotation.Nullable
    public abstract java.lang.String getEncodedQuery();
    @android.annotation.Nullable
    public abstract java.lang.String getFragment();
    @android.annotation.Nullable
    public abstract java.lang.String getEncodedFragment();
    public abstract java.util.List<java.lang.String> getPathSegments();
    @android.annotation.Nullable
    public abstract java.lang.String getLastPathSegment();
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int compareTo(android.net.Uri p0) { return 0; }
    public abstract java.lang.String toString();
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public java.lang.String toSafeString() { return null; }
    public abstract android.net.Uri.Builder buildUpon();
    public static android.net.Uri parse(java.lang.String p0) { return null; }
    public static android.net.Uri fromFile(java.io.File p0) { return null; }
    public static android.net.Uri fromParts(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    public java.util.Set<java.lang.String> getQueryParameterNames() { return null; }
    public java.util.List<java.lang.String> getQueryParameters(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    public java.lang.String getQueryParameter(java.lang.String p0) { return null; }
    public boolean getBooleanQueryParameter(java.lang.String p0, boolean p1) { return false; }
    public android.net.Uri normalizeScheme() { return null; }
    public static void writeToParcel(android.os.Parcel p0, android.net.Uri p1) {}
    public static java.lang.String encode(java.lang.String p0) { return null; }
    public static java.lang.String encode(java.lang.String p0, java.lang.String p1) { return null; }
    public static java.lang.String encodeIfNotEncoded(java.lang.String p0, java.lang.String p1) { return null; }
    public static java.lang.String decode(java.lang.String p0) { return null; }
    public static java.lang.String decodeIfNeeded(java.lang.String p0) { return null; }
    public static android.net.Uri withAppendedPath(android.net.Uri p0, java.lang.String p1) { return null; }
    public android.net.Uri getCanonicalUri() { return null; }
    public void checkFileUriExposed(java.lang.String p0) {}
    public void checkContentUriWithoutPermission(java.lang.String p0, int p1) {}
    public boolean isPathPrefixMatch(android.net.Uri p0) { return false; }

    private static abstract class AbstractHierarchicalUri extends android.net.Uri {
        public java.lang.String getLastPathSegment() { return null; }
        public final java.lang.String getEncodedUserInfo() { return null; }
        public java.lang.String getUserInfo() { return null; }
        public java.lang.String getHost() { return null; }
        public int getPort() { return 0; }
    }

    static abstract class AbstractPart {
        volatile java.lang.String encoded;
        volatile java.lang.String decoded;
        AbstractPart(java.lang.String p0, java.lang.String p1) {}
        abstract java.lang.String getEncoded();
        final java.lang.String getDecoded() { return null; }
    }

    public static final class Builder {
        public Builder() {}
        public android.net.Uri.Builder scheme(java.lang.String p0) { return null; }
        android.net.Uri.Builder opaquePart(android.net.Uri.Part p0) { return null; }
        public android.net.Uri.Builder opaquePart(java.lang.String p0) { return null; }
        public android.net.Uri.Builder encodedOpaquePart(java.lang.String p0) { return null; }
        android.net.Uri.Builder authority(android.net.Uri.Part p0) { return null; }
        public android.net.Uri.Builder authority(java.lang.String p0) { return null; }
        public android.net.Uri.Builder encodedAuthority(java.lang.String p0) { return null; }
        android.net.Uri.Builder path(android.net.Uri.PathPart p0) { return null; }
        public android.net.Uri.Builder path(java.lang.String p0) { return null; }
        public android.net.Uri.Builder encodedPath(java.lang.String p0) { return null; }
        public android.net.Uri.Builder appendPath(java.lang.String p0) { return null; }
        public android.net.Uri.Builder appendEncodedPath(java.lang.String p0) { return null; }
        android.net.Uri.Builder query(android.net.Uri.Part p0) { return null; }
        public android.net.Uri.Builder query(java.lang.String p0) { return null; }
        public android.net.Uri.Builder encodedQuery(java.lang.String p0) { return null; }
        android.net.Uri.Builder fragment(android.net.Uri.Part p0) { return null; }
        public android.net.Uri.Builder fragment(java.lang.String p0) { return null; }
        public android.net.Uri.Builder encodedFragment(java.lang.String p0) { return null; }
        public android.net.Uri.Builder appendQueryParameter(java.lang.String p0, java.lang.String p1) { return null; }
        public android.net.Uri.Builder clearQuery() { return null; }
        public android.net.Uri build() { return null; }
        public java.lang.String toString() { return null; }
    }

    private static class HierarchicalUri extends android.net.Uri.AbstractHierarchicalUri {
        static final int TYPE_ID = 3;
        static android.net.Uri readFrom(android.os.Parcel p0) { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean isHierarchical() { return false; }
        public boolean isRelative() { return false; }
        public java.lang.String getScheme() { return null; }
        public java.lang.String getEncodedSchemeSpecificPart() { return null; }
        public java.lang.String getSchemeSpecificPart() { return null; }
        public java.lang.String getAuthority() { return null; }
        public java.lang.String getEncodedAuthority() { return null; }
        public java.lang.String getEncodedPath() { return null; }
        public java.lang.String getPath() { return null; }
        public java.lang.String getQuery() { return null; }
        public java.lang.String getEncodedQuery() { return null; }
        public java.lang.String getFragment() { return null; }
        public java.lang.String getEncodedFragment() { return null; }
        public java.util.List<java.lang.String> getPathSegments() { return null; }
        public java.lang.String toString() { return null; }
        public android.net.Uri.Builder buildUpon() { return null; }
    }

    static class NotCachedHolder {
        static final java.lang.String NOT_CACHED = null;
    }

    private static class OpaqueUri extends android.net.Uri {
        static final int TYPE_ID = 2;
        static android.net.Uri readFrom(android.os.Parcel p0) { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean isHierarchical() { return false; }
        public boolean isRelative() { return false; }
        public java.lang.String getScheme() { return null; }
        public java.lang.String getEncodedSchemeSpecificPart() { return null; }
        public java.lang.String getSchemeSpecificPart() { return null; }
        public java.lang.String getAuthority() { return null; }
        public java.lang.String getEncodedAuthority() { return null; }
        public java.lang.String getPath() { return null; }
        public java.lang.String getEncodedPath() { return null; }
        public java.lang.String getQuery() { return null; }
        public java.lang.String getEncodedQuery() { return null; }
        public java.lang.String getFragment() { return null; }
        public java.lang.String getEncodedFragment() { return null; }
        public java.util.List<java.lang.String> getPathSegments() { return null; }
        public java.lang.String getLastPathSegment() { return null; }
        public java.lang.String getUserInfo() { return null; }
        public java.lang.String getEncodedUserInfo() { return null; }
        public java.lang.String getHost() { return null; }
        public int getPort() { return 0; }
        public java.lang.String toString() { return null; }
        public android.net.Uri.Builder buildUpon() { return null; }
    }

    static class Part extends android.net.Uri.AbstractPart {
        static final android.net.Uri.Part NULL = null;
        static final android.net.Uri.Part EMPTY = null;
        Part() { super(null, null); }
        boolean isEmpty() { return false; }
        java.lang.String getEncoded() { return null; }
        static android.net.Uri.Part nonNull(android.net.Uri.Part p0) { return null; }
        static android.net.Uri.Part fromEncoded(java.lang.String p0) { return null; }
        static android.net.Uri.Part fromDecoded(java.lang.String p0) { return null; }
        static android.net.Uri.Part from(java.lang.String p0, java.lang.String p1) { return null; }

        private static class EmptyPart extends android.net.Uri.Part {
            public EmptyPart(java.lang.String p0) { super(); }
            boolean isEmpty() { return false; }
        }
    }

    static class PathPart extends android.net.Uri.AbstractPart {
        static final android.net.Uri.PathPart NULL = null;
        static final android.net.Uri.PathPart EMPTY = null;
        PathPart() { super(null, null); }
        java.lang.String getEncoded() { return null; }
        android.net.Uri.PathSegments getPathSegments() { return null; }
        static android.net.Uri.PathPart appendEncodedSegment(android.net.Uri.PathPart p0, java.lang.String p1) { return null; }
        static android.net.Uri.PathPart appendDecodedSegment(android.net.Uri.PathPart p0, java.lang.String p1) { return null; }
        static android.net.Uri.PathPart fromEncoded(java.lang.String p0) { return null; }
        static android.net.Uri.PathPart fromDecoded(java.lang.String p0) { return null; }
        static android.net.Uri.PathPart from(java.lang.String p0, java.lang.String p1) { return null; }
        static android.net.Uri.PathPart makeAbsolute(android.net.Uri.PathPart p0) { return null; }
    }

    static class PathSegments extends java.util.AbstractList<java.lang.String> implements java.util.RandomAccess {
        static final android.net.Uri.PathSegments EMPTY = null;
        final java.lang.String[] segments = null;
        final int size = 0;
        PathSegments(java.lang.String[] p0, int p1) { super(); }
        public java.lang.String get(int p0) { return null; }
        public int size() { return 0; }
    }

    static class PathSegmentsBuilder {
        java.lang.String[] segments;
        int size;
        PathSegmentsBuilder() {}
        void add(java.lang.String p0) {}
        android.net.Uri.PathSegments build() { return null; }
    }

    private static class StringUri extends android.net.Uri.AbstractHierarchicalUri {
        static final int TYPE_ID = 1;
        static android.net.Uri readFrom(android.os.Parcel p0) { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean isHierarchical() { return false; }
        public boolean isRelative() { return false; }
        public java.lang.String getScheme() { return null; }
        public java.lang.String getEncodedSchemeSpecificPart() { return null; }
        public java.lang.String getSchemeSpecificPart() { return null; }
        public java.lang.String getEncodedAuthority() { return null; }
        public java.lang.String getAuthority() { return null; }
        public java.lang.String getPath() { return null; }
        public java.lang.String getEncodedPath() { return null; }
        public java.util.List<java.lang.String> getPathSegments() { return null; }
        public java.lang.String getEncodedQuery() { return null; }
        public java.lang.String getQuery() { return null; }
        public java.lang.String getEncodedFragment() { return null; }
        public java.lang.String getFragment() { return null; }
        public java.lang.String toString() { return null; }
        static java.lang.String parseAuthority(java.lang.String p0, int p1) { return null; }
        static java.lang.String parsePath(java.lang.String p0, int p1) { return null; }
        public android.net.Uri.Builder buildUpon() { return null; }
    }
}
