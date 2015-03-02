package com;


import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.AdaptedString;

public class NullStringAdapter extends XmlAdapter<AdaptedString, String> {

    @Override
    public  AdaptedString marshal(String v) throws Exception {
        AdaptedString adaptedString = new AdaptedString();
        if(null == v) {
            adaptedString.nil = true;
        }
        adaptedString.value = v;
        return adaptedString;
    }

    @Override
    public String unmarshal(AdaptedString v) throws Exception {
        return v.value;
    }

 

}