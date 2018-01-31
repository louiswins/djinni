// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from test.djinni

package com.dropbox.djinni.test;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Helper methods used by various different tests.
 * (Second line of multi-line documentation.
 *   Indented third line of multi-line documentation.)
 */
public abstract class TestHelpers {
    /** Method with documentation */
    @Nonnull
    public static native SetRecord getSetRecord();

    /**
     * Method with long documentation & doxygen
     * (Second line of multi-line documentation.
     *   Indented third line of multi-line documentation.)
     * @param theRecord the record to check
     * @return whether the record is okay
     */
    public static native boolean checkSetRecord(@Nonnull SetRecord theRecord);

    @Nonnull
    public static native PrimitiveList getPrimitiveList();

    public static native boolean checkPrimitiveList(@Nonnull PrimitiveList pl);

    @Nonnull
    public static native NestedCollection getNestedCollection();

    public static native boolean checkNestedCollection(@Nonnull NestedCollection nc);

    @Nonnull
    public static native HashMap<String, Long> getMap();

    public static native boolean checkMap(@Nonnull HashMap<String, Long> m);

    @Nonnull
    public static native HashMap<String, Long> getEmptyMap();

    public static native boolean checkEmptyMap(@Nonnull HashMap<String, Long> m);

    @Nonnull
    public static native MapListRecord getMapListRecord();

    public static native boolean checkMapListRecord(@Nonnull MapListRecord m);

    public static native void checkClientInterfaceAscii(@CheckForNull ClientInterface i);

    public static native void checkClientInterfaceNonascii(@CheckForNull ClientInterface i);

    public static native void checkClientInterfaceArgs(@CheckForNull ClientInterface i);

    public static native void checkEnumMap(@Nonnull HashMap<Color, String> m);

    public static native void checkEnum(@Nonnull Color c);

    @CheckForNull
    public static native UserToken tokenId(@CheckForNull UserToken t);

    @CheckForNull
    public static native UserToken createCppToken();

    public static native void checkCppToken(@CheckForNull UserToken t);

    public static native long cppTokenId(@CheckForNull UserToken t);

    public static native void checkTokenType(@CheckForNull UserToken t, @Nonnull String type);

    @CheckForNull
    public static native Integer returnNone();

    /** Ensures that we generate integer translation code */
    @Nonnull
    public static native AssortedPrimitives assortedPrimitivesId(@Nonnull AssortedPrimitives i);

    @Nonnull
    public static native byte[] idBinary(@Nonnull byte[] b);

    private static final class CppProxy extends TestHelpers
    {
        private final long nativeRef;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);

        private CppProxy(long nativeRef)
        {
            if (nativeRef == 0) throw new RuntimeException("nativeRef is zero");
            this.nativeRef = nativeRef;
        }

        private native void nativeDestroy(long nativeRef);
        public void destroy()
        {
            boolean destroyed = this.destroyed.getAndSet(true);
            if (!destroyed) nativeDestroy(this.nativeRef);
        }
        protected void finalize() throws java.lang.Throwable
        {
            destroy();
            super.finalize();
        }
    }
}
