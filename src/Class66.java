import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import net.runelite.mapping.ObfuscatedSignature;
import java.util.LinkedHashMap;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("bx")
public class Class66
{
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = -344414119)
    static int field964;
    @ObfuscatedName("bk")
    @ObfuscatedGetter(intValue = 1850992515)
    static int field966;
    @ObfuscatedName("s")
    boolean field960;
    @ObfuscatedName("l")
    boolean field958;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -514581919)
    int field957;
    @ObfuscatedName("q")
    String field959;
    @ObfuscatedName("k")
    boolean field962;
    @ObfuscatedName("i")
    LinkedHashMap field963;
    
    static {
        Class66.field964 = 6;
    }
    
    Class66() {
        this.field957 = 1;
        this.field959 = null;
        this.field962 = false;
        this.field963 = new LinkedHashMap();
        this.method1613(true);
    }
    
    Class66(final Class182 class182) {
        this.field957 = 1;
        this.field959 = null;
        this.field962 = false;
        this.field963 = new LinkedHashMap();
        if (class182 == null || class182.payload == null) {
            this.method1613(true);
        }
        else {
            final int method3544 = class182.method3544();
            if (method3544 >= 0 && method3544 <= Class66.field964) {
                if (class182.method3544() == 1) {
                    this.field960 = true;
                }
                if (method3544 > 1) {
                    this.field958 = (class182.method3544() == 1);
                }
                if (method3544 > 3) {
                    this.field957 = class182.method3544();
                }
                if (method3544 > 2) {
                    for (int method3545 = class182.method3544(), i = 0; i < method3545; ++i) {
                        this.field963.put(class182.method3671(), class182.method3671());
                    }
                }
                if (method3544 > 4) {
                    this.field959 = class182.method3752();
                }
                if (method3544 > 5) {
                    this.field962 = class182.method3555();
                }
            }
            else {
                this.method1613(true);
            }
        }
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(ZI)V", garbageValue = "1739738727")
    void method1613(final boolean b) {
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(I)Lgk;", garbageValue = "1661970638")
    Class182 method1609() {
        final Class182 class182 = new Class182(100);
        class182.method3532(Class66.field964);
        class182.method3532(this.field960 ? 1 : 0);
        class182.method3532(this.field958 ? 1 : 0);
        class182.method3532(this.field957);
        class182.method3532(this.field963.size());
        
        Set<Map.Entry> entries = field963.entrySet();
        for (final Map.Entry<Integer, Integer> entry : entries) {
            class182.method3707(entry.getKey());
            class182.method3707((int)entry.getValue());
        }
        
        class182.method3699((this.field959 != null) ? this.field959 : "");
        class182.method3766(this.field962);
        return class182;
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "-179570605")
    public static void method1622(final int n) {
        if (n == -1) {
            return;
        }
        if (!Class175.field2271[n]) {
            return;
        }
        Class230.field2729.method4639(n);
        if (Class42.field366[n] == null) {
            return;
        }
        boolean b = true;
        for (int i = 0; i < Class42.field366[n].length; ++i) {
            if (Class42.field366[n][i] != null) {
                if (Class42.field366[n][i].field2721 != 2) {
                    Class42.field366[n][i] = null;
                }
                else {
                    b = false;
                }
            }
        }
        if (b) {
            Class42.field366[n] = null;
        }
        Class175.field2271[n] = false;
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(II)I", garbageValue = "1297107509")
    static int method1621(final int n) {
        final Class58 class58 = (Class58)Class83.field1181.method3945(n);
        if (class58 == null) {
            return -1;
        }
        if (class58.field2426 == Class83.field1184.field2445) {
            return -1;
        }
        return ((Class58)class58.field2426).field540;
    }
}
