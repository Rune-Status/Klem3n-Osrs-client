import net.runelite.mapping.ObfuscatedSignature;
import java.io.InputStream;
import java.net.URLConnection;
import java.net.MalformedURLException;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.io.IOException;
import java.util.Random;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ih")
public class Class234
{
    @ObfuscatedName("w")
    public static final boolean[] field2780;
    @ObfuscatedName("s")
    public static int[] field2779;
    
    static {
        field2780 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };
        Class234.field2779 = new int[99];
        int n = 0;
        for (int i = 0; i < 99; ++i) {
            final int n2 = i + 1;
            n += (int)(n2 + 300.0 * Math.pow(2.0, n2 / 7.0));
            Class234.field2779[i] = n / 4;
        }
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "1543629382")
    static void method4590() {
        Class78.field1106 = Class78.field1106.trim();
        if (Class78.field1106.length() == 0) {
            Class2.method22("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
            return;
        }
        final long method1535 = Client.method1535();
        int n;
        if (0L == method1535) {
            n = 5;
        }
        else {
            final String field1106 = Class78.field1106;
            final Random random = new Random();
            final Class182 class182 = new Class182(128);
            final Class182 class183 = new Class182(128);
            final int[] array = { random.nextInt(), random.nextInt(), (int)(method1535 >> 32), (int)method1535 };
            class182.method3532(10);
            for (int i = 0; i < 4; ++i) {
                class182.method3707(random.nextInt());
            }
            class182.method3707(array[0]);
            class182.method3707(array[1]);
            class182.method3659(method1535);
            class182.method3659(0L);
            for (int j = 0; j < 4; ++j) {
                class182.method3707(random.nextInt());
            }
            class182.method3571(Class73.field1039, Class73.field1044);
            class183.method3532(10);
            for (int k = 0; k < 3; ++k) {
                class183.method3707(random.nextInt());
            }
            class183.method3659(random.nextLong());
            class183.method3584(random.nextLong());
            if (Client.field620 != null) {
                class183.method3542(Client.field620, 0, Client.field620.length);
            }
            else {
                final byte[] array2 = new byte[24];
                try {
                    Class155.field1968.method2476(0L);
                    Class155.field1968.method2478(array2);
                    int n2;
                    for (n2 = 0; n2 < 24 && array2[n2] == 0; ++n2) {}
                    if (n2 >= 24) {
                        throw new IOException();
                    }
                }
                catch (Exception ex) {
                    for (int l = 0; l < 24; ++l) {
                        array2[l] = -1;
                    }
                }
                final byte[] array3 = array2;
                class183.method3542(array3, 0, array3.length);
            }
            class183.method3659(random.nextLong());
            class183.method3571(Class73.field1039, Class73.field1044);
            int method1536 = Class316.method5820(field1106);
            if (method1536 % 8 != 0) {
                method1536 += 8 - method1536 % 8;
            }
            final Class182 class184 = new Class182(method1536);
            class184.method3699(field1106);
            class184.field2339 = method1536;
            class184.method3567(array);
            final Class182 class185 = new Class182(class183.field2339 + class182.field2339 + class184.field2339 + 5);
            class185.method3532(2);
            class185.method3532(class182.field2339);
            class185.method3542(class182.payload, 0, class182.field2339);
            class185.method3532(class183.field2339);
            class185.method3542(class183.payload, 0, class183.field2339);
            class185.method3755(class184.field2339);
            class185.method3542(class184.payload, 0, class184.field2339);
            final byte[] field1107 = class185.payload;
            final int length = field1107.length;
            final StringBuilder sb = new StringBuilder();
            for (int n3 = 0; n3 < length + 0; n3 += 3) {
                final int n4 = field1107[n3] & 0xFF;
                sb.append(Class304.field3722[n4 >>> 2]);
                if (n3 < length - 1) {
                    final int n5 = field1107[n3 + 1] & 0xFF;
                    sb.append(Class304.field3722[(n4 & 0x3) << 4 | n5 >>> 4]);
                    if (n3 < length - 2) {
                        final int n6 = field1107[n3 + 2] & 0xFF;
                        sb.append(Class304.field3722[(n5 & 0xF) << 2 | n6 >>> 6]).append(Class304.field3722[n6 & 0x3F]);
                    }
                    else {
                        sb.append(Class304.field3722[(n5 & 0xF) << 2]).append("=");
                    }
                }
                else {
                    sb.append(Class304.field3722[(n4 & 0x3) << 4]).append("==");
                }
            }
            final String string = sb.toString();
            int n7;
            try {
                final URLConnection openConnection = new URL(Class142.method3161("services", false) + "m=accountappeal/login.ws").openConnection();
                openConnection.setDoInput(true);
                openConnection.setDoOutput(true);
                openConnection.setConnectTimeout(5000);
                final OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openConnection.getOutputStream());
                outputStreamWriter.write("data2=" + Class304.method5634(string) + "&dest=" + Class304.method5634("passwordchoice.ws"));
                outputStreamWriter.flush();
                final InputStream inputStream = openConnection.getInputStream();
                final Class182 class186 = new Class182(new byte[1000]);
                while (true) {
                    final int read = inputStream.read(class186.payload, class186.field2339, 1000 - class186.field2339);
                    if (read == -1) {
                        outputStreamWriter.close();
                        inputStream.close();
                        final String s = new String(class186.payload);
                        if (s.startsWith("OFFLINE")) {
                            n7 = 4;
                            break;
                        }
                        if (s.startsWith("WRONG")) {
                            n7 = 7;
                            break;
                        }
                        if (s.startsWith("RELOAD")) {
                            n7 = 3;
                            break;
                        }
                        if (s.startsWith("Not permitted for social network accounts.")) {
                            n7 = 6;
                            break;
                        }
                        class186.method3553(array);
                        while (class186.field2339 > 0 && class186.payload[class186.field2339 - 1] == 0) {
                            final Class182 class187 = class186;
                            --class187.field2339;
                        }
                        final String s2 = new String(class186.payload, 0, class186.field2339);
                        boolean b = false;
                        Label_1266: {
                            if (s2 == null) {
                                b = false;
                            }
                            else {
                                try {
                                    new URL(s2);
                                }
                                catch (MalformedURLException ex2) {
                                    b = false;
                                    break Label_1266;
                                }
                                b = true;
                            }
                        }
                        if (b) {
                            Class270.method5156(s2, true, false);
                            n7 = 2;
                        }
                        else {
                            n7 = 5;
                        }
                        break;
                    }
                    else {
                        final Class182 class188 = class186;
                        class188.field2339 += read;
                        if (class186.field2339 >= 1000) {
                            n7 = 5;
                            break;
                        }
                        continue;
                    }
                }
            }
            catch (Throwable t) {
                t.printStackTrace();
                n7 = 5;
            }
            n = n7;
        }
        switch (n) {
            case 7: {
                Class2.method22("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
                break;
            }
            case 3: {
                Class2.method22("", "Error connecting to server.", "");
                break;
            }
            case 2: {
                Class2.method22(Class237.field3049, Class237.field3050, Class237.field3072);
                Class78.field1081 = 6;
                break;
            }
            case 6: {
                Class2.method22("", "Error connecting to server.", "");
                break;
            }
            case 4: {
                Class2.method22("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
                break;
            }
            case 5: {
                Class2.method22("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
                break;
            }
        }
    }
}
