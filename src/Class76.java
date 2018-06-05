import net.runelite.mapping.ObfuscatedSignature;
import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("bt")
public class Class76
{
    @ObfuscatedName("z")
    static final BigInteger field1071;
    @ObfuscatedName("w")
    static final BigInteger field1069;
    @ObfuscatedName("g")
    @ObfuscatedSignature(signature = "[Ldy;")
    public static Class109[] field1068;
    @ObfuscatedName("ak")
    static int[] field1073;
    
    static {
        field1071 = new BigInteger("10001", 16);
        field1069 = new BigInteger("97e13ef453eef11c2e2b108891d256c90098b9da343c760762cdc2ccb5b9cc01552ee1f17fef7e9ad45cce00f378db17ae8f17c43fa4bdab098e5022b17175b147560d10c86658c7a471514e0bdce6c95f1b0ba8ceb5322e09b64b6bb30b1f88d2a879f88b871b4519717800df32d7f3e55f492af08025ab7ccd747491e82fe5", 16);
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "([Lgt;IB)Lgt;", garbageValue = "0")
    public static Class188 method1803(final Class188[] array, final int n) {
        for (int i = 0; i < array.length; ++i) {
            final Class188 class188 = array[i];
            if (n == class188.vmethod5815()) {
                return class188;
            }
        }
        return null;
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(IIIZII)J", garbageValue = "1782575928")
    public static long method1804(final int n, final int n2, final int n3, final boolean b, final int n4) {
        long n5 = (n & 0x7F) << 0 | (n2 & 0x7F) << 7 | (n3 & 0x3) << 14 | (n4 & 0xFFFFFFFFL) << 17;
        if (b) {
            n5 |= 0x10000L;
        }
        return n5;
    }
}
