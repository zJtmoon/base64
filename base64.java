package org;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class base64 {
    public static void main(String[] args) throws IOException {
        String s="我们=";//3个字节变4个字节
        String s1=new BASE64Encoder().encode(s.getBytes());
        System.out.println(s1);


        String t=new String(new BASE64Decoder().decodeBuffer("PQ=="));
        System.out.println(t);



        String str=URLEncoder.encode("我们");
        System.out.println(str);
        String SS=URLDecoder.decode("%E6%88%91%E4%BB%AC");
        System.out.println(SS);
    }
}
