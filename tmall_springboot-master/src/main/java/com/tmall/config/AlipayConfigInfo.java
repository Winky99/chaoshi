package com.tmall.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfigInfo {
    public static String app_id = "2016101900720666";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCs+Z2Gxp3TSus16Gl0QdjshGTwD5dtRKPHrO7MkkMX/cVGC0QeL8Tl6RPKaE+9SS74IocZUobE24OBkVYtoDFzYwwVRh2OUlHZbmz9tGPjUJO+DKV1U4l7BjI6s0slWxvgdJwtGIEcunjju/+KYQIRn/G05eiZn/QDJZxS0YqGW6wd9ouSPrnlPTMu+jEkmXt1lLDEHVv5qw+kcBekooC7nUNoBIcPfF7TP8TD/gx/e3x3z0aZSRTcI3m8pAb0Bs9EFjo/8l/LpNYroBGVxd18eygs+px21fRSIntV2R5QydQGsaTj/IWsgpOYiyYzmgAnkV4cYBEQ2V+rjNCt7l0nAgMBAAECggEBAIIN0AX0sdea3cyTaS5zD+GNDcN9RZJvaGEKQiXn1rBkKn4mnFnB+t4OZ8XotgOQ0dLZSxCb/x5mGbNCjjQR3PxvvTcFl9VZSZccsq/ygKP6AouDQKg9XgH0v7Fo+xgkL4qMwpwZb4IlJh28TT9C/uY3hulHb6KKJFJ1ZdrTF786Ucs5SkDwDy2xbz4afvkwao8tPbk3lxSSU5crtNO6V++Cq/pVonTJg4ydm/SzWKq4FX2WIm+k8xWgh4UmESqRLtdsMe2fOx0e3psOL2xXbI7/yILrOyI19rNOy2iVBQaZdsdfaAOCEMt/HBJ8Mi3dgdb/lS5GqAUyiM59VLKkZ7kCgYEA6Tf9Sgdi2CtqqA0+nNSNw/0BVCGRT237nR9J+JiyEZN9eJ8h7LepGY6gKFVuo/N/5RvNgtCHrjnzDybTA4k18YF9ikZP+pY6yx2+VFjcZiS7sVwqDtmDb4rOeigRESs87NrvbBd676af0Ynj28pHXj7FYC46m8+2y2LOaIqam6UCgYEAvd8i25aJUSFzVt/Te5BSBW8sUXJvyOwfylWQNcDQVYDA3vFL5dWRbFYW4JklDtqwK2WcHN/6ArrBMaQPGzgOQI5/WRLiAiRo9XJ9kMYHKcjeijocG875P2tmPIs/mmo5lrTbesUGRfMZliyjuST4LEDUXakB95h/NPB1cqCkq9sCgYEA3KgrzzoTzIGvpRb68bmt9AxSkH4+FQ/za6LqAvq+KCELKvAtUeInbVXjtKW4TAkcLfJTTHzukuqjTOen6QWOc1TYKdcC3w36zKj0pqt4xG/m4hVYebpVQFjtqOh11W+6ckNnGjdRCqP1PHUhkJffVI1BhBHZRAiQY/i1YHYbeD0CgYBTJJTFB2RWDInPLvASmZ3xFz+W4r+kghFhrpoZj7cq2dibR5puqFin0gLukuExYf3m4vW7hzCZZWIX9LlQt/k1t7B4NtaVDZCQenQVo0GbwIQCj3Ojkbx/Uu5P8MIHQiC5p7S8S+51TwCTTDTdbBzoc/MKmGluHG8HpYwoh8PUJQKBgF8wVXWtscxiQ5XNbSDHaFFpbBN1l3SJI+aC3+9GM8S/3mEEbThdJ1B4mV17UeImYbTPexqteUkGHx86N7yAH3tdc59wWGFCva4Z4V9rDD6g78i3BuHQyBURJPXlkpUfR0gr301fIstguKD6vzdRbbpvP9hsgFWC8cEJ23jTU3TK";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAs1c03pV7jwfdS3VwX1r0uEIbVC/fBc/Wqbdq3mSHYd++xHweusSggdgE3uXuhfWjuFZqXVYVWtg7+3TM0NGEebFXbz0/DbFcwn5p3G+LAvuYIaWF2PTus5qdW/PwkIle26ZArkmFiYkCmjQyb5+6+WU5n5QRqRZSgr6nfIYPDfFnlPQhOWD7IQBAP+3ZgZtYhNZbrEdCcvxZxiIlKZ2rM38BzLEczul1RLujE7MVMMGclIXg4So37Dz6jBNtOEvW9p9vfIg4Ah2mlBSKp3wDz/xNx5dH2g6blhEhRTPiKhJNiAbIxMRpUd5EXEF5RhhPydI5HZrtdK/OyXvuG44aQwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://2z52427e22.zicp.vip/notify_url.html";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://2z52427e22.zicp.vip/return_url.html";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "D:/360/14/logs";
    // ↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     *
     * @param sWord
     *            要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_"
                    + System.currentTimeMillis() + ".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}