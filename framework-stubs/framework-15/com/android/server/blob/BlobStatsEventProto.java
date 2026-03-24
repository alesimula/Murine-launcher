package com.android.server.blob;

public final class BlobStatsEventProto {
    public BlobStatsEventProto() {}

    public final class BlobCommitterListProto {
        public static final long COMMITTER = 2246267895809L;
        public BlobCommitterListProto(com.android.server.blob.BlobStatsEventProto p0) {}
    }

    public final class BlobCommitterProto {
        public static final long UID = 1120986464257L;
        public static final long COMMIT_TIMESTAMP_MILLIS = 1112396529666L;
        public static final long ACCESS_MODE = 1120986464259L;
        public static final long NUM_WHITELISTED_PACKAGE = 1120986464260L;
        public BlobCommitterProto(com.android.server.blob.BlobStatsEventProto p0) {}
    }

    public final class BlobLeaseeListProto {
        public static final long LEASEE = 2246267895809L;
        public BlobLeaseeListProto(com.android.server.blob.BlobStatsEventProto p0) {}
    }

    public final class BlobLeaseeProto {
        public static final long UID = 1120986464257L;
        public static final long LEASE_EXPIRY_TIMESTAMP_MILLIS = 1112396529666L;
        public BlobLeaseeProto(com.android.server.blob.BlobStatsEventProto p0) {}
    }
}
