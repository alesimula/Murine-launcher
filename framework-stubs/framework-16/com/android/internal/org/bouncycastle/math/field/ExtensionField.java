package com.android.internal.org.bouncycastle.math.field;

public interface ExtensionField extends com.android.internal.org.bouncycastle.math.field.FiniteField {
    public com.android.internal.org.bouncycastle.math.field.FiniteField getSubfield();
    public int getDegree();
}
