package com.android.internal.location.nano;

public interface GnssLogsProto {

    public static final class PowerMetrics extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.internal.location.nano.GnssLogsProto.PowerMetrics[] _emptyArray;
        public long loggingDurationMs;
        public double energyConsumedMah;
        public long[] timeInSignalQualityLevelMs;
        public static com.android.internal.location.nano.GnssLogsProto.PowerMetrics[] emptyArray() { return null; }
        public PowerMetrics() { super(); }
        public com.android.internal.location.nano.GnssLogsProto.PowerMetrics clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.location.nano.GnssLogsProto.PowerMetrics mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.location.nano.GnssLogsProto.PowerMetrics parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.location.nano.GnssLogsProto.PowerMetrics parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class GnssLog extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.internal.location.nano.GnssLogsProto.GnssLog[] _emptyArray;
        public int numLocationReportProcessed;
        public int percentageLocationFailure;
        public int numTimeToFirstFixProcessed;
        public int meanTimeToFirstFixSecs;
        public int standardDeviationTimeToFirstFixSecs;
        public int numPositionAccuracyProcessed;
        public int meanPositionAccuracyMeters;
        public int standardDeviationPositionAccuracyMeters;
        public int numTopFourAverageCn0Processed;
        public double meanTopFourAverageCn0DbHz;
        public double standardDeviationTopFourAverageCn0DbHz;
        public com.android.internal.location.nano.GnssLogsProto.PowerMetrics powerMetrics;
        public java.lang.String hardwareRevision;
        public static com.android.internal.location.nano.GnssLogsProto.GnssLog[] emptyArray() { return null; }
        public GnssLog() { super(); }
        public com.android.internal.location.nano.GnssLogsProto.GnssLog clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.location.nano.GnssLogsProto.GnssLog mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.location.nano.GnssLogsProto.GnssLog parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.location.nano.GnssLogsProto.GnssLog parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }
}
