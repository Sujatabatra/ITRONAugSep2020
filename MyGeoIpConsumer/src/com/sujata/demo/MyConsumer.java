package com.sujata.demo;

import com.lavasoft.GeoIPService;
import com.lavasoft.GeoIPServiceSoap;

public class MyConsumer {
    public static void main(String[] args) {
        GeoIPService geoIPService= new GeoIPService();

        GeoIPServiceSoap geoIPServiceSoap=geoIPService.getGeoIPServiceSoap();

        String rt= geoIPServiceSoap.getLocation();
        System.out.println(rt);

        String code=geoIPServiceSoap.getCountryISO2ByName("India");
        System.out.println("Code for india : "+code);
    }
}
