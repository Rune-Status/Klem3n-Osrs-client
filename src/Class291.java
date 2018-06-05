import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@ObfuscatedName("km")
public class Class291 implements Comparable
{
    @ObfuscatedName("z")
    String field3644;
    @ObfuscatedName("w")
    String field3642;
    
    public Class291(final String field3644, final Class322 class322) {
        this.field3644 = field3644;
        String string;
        if (field3644 == null) {
            string = null;
        }
        else {
            int i;
            int j;
            for (i = 0, j = field3644.length(); i < j; ++i) {
                final char char1 = field3644.charAt(i);
                if (char1 != ' ' && char1 != ' ' && char1 != '_' && char1 != '-') {
                    break;
                }
            }
            while (j > i) {
                final char char2 = field3644.charAt(j - 1);
                if (char2 != ' ' && char2 != ' ' && char2 != '_' && char2 != '-') {
                    break;
                }
                --j;
            }
            final int n = j - i;
            if (n < 1 || n > Class8.method84(class322)) {
                string = null;
            }
            else {
                final StringBuilder sb = new StringBuilder(n);
                for (int k = i; k < j; ++k) {
                    final char char3 = field3644.charAt(k);
                    int n2 = 0;
                    Label_0257: {
                        if (Character.isISOControl(char3)) {
                            n2 = 0;
                        }
                        else if (Class161.method3362(char3)) {
                            n2 = 1;
                        }
                        else {
                            final char[] field3645 = Class302.field3719;
                            for (int l = 0; l < field3645.length; ++l) {
                                if (field3645[l] == char3) {
                                    n2 = 1;
                                    break Label_0257;
                                }
                            }
                            final char[] field3646 = Class302.field3717;
                            for (int n3 = 0; n3 < field3646.length; ++n3) {
                                if (field3646[n3] == char3) {
                                    n2 = 1;
                                    break Label_0257;
                                }
                            }
                            n2 = 0;
                        }
                    }
                    if (n2 != 0) {
                        final char method4770 = Class250.method4770(char3);
                        if (method4770 != '\0') {
                            sb.append(method4770);
                        }
                    }
                }
                if (sb.length() == 0) {
                    string = null;
                }
                else {
                    string = sb.toString();
                }
            }
        }
        this.field3642 = string;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(B)Ljava/lang/String;", garbageValue = "-39")
    public String method5447() {
        return this.field3644;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "777472606")
    public boolean method5441() {
        return this.field3642 != null;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lkm;I)I", garbageValue = "915724174")
    public int method5435(final Class291 class291) {
        if (this.field3642 == null) {
            if (class291.field3642 == null) {
                return 0;
            }
            return 1;
        }
        else {
            if (class291.field3642 == null) {
                return -1;
            }
            return this.field3642.compareTo(class291.field3642);
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof Class291)) {
            return false;
        }
        final Class291 class291 = (Class291)o;
        if (this.field3642 == null) {
            return class291.field3642 == null;
        }
        return class291.field3642 != null && this.hashCode() == class291.hashCode() && this.field3642.equals(class291.field3642);
    }
    
    @Override
    public int hashCode() {
        if (this.field3642 == null) {
            return 0;
        }
        return this.field3642.hashCode();
    }
    
    @Override
    public String toString() {
        return this.method5447();
    }
    
    @Override
    public int compareTo(final Object o) {
        return this.method5435((Class291)o);
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(CB)C", garbageValue = "-41")
    static char method5450(final char c) {
        if (c == 'µ' || c == '\u0083') {
            return c;
        }
        return Character.toTitleCase(c);
    }
}
