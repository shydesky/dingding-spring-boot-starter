package cn.chendahai.dingding.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("dingding.service")
public class DingdingServiceProperties {
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    //    private String suffix;

//    public String getSuffix() {
//        return suffix;
//    }
//
//    public void setSuffix(String suffix) {
//        this.suffix = suffix;
//    }
}
