package com.android.internal.org.bouncycastle.math.ec;

class ValidityPrecompInfo implements com.android.internal.org.bouncycastle.math.ec.PreCompInfo {
    static final java.lang.String PRECOMP_NAME = "bc_validity";
    ValidityPrecompInfo() {}
    boolean hasFailed() { return false; }
    void reportFailed() {}
    boolean hasCurveEquationPassed() { return false; }
    void reportCurveEquationPassed() {}
    boolean hasOrderPassed() { return false; }
    void reportOrderPassed() {}
}
