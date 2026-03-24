package com.android.framework.protobuf;

interface MutabilityOracle {
    public static final com.android.framework.protobuf.MutabilityOracle IMMUTABLE = null;
    public void ensureMutable();
}
