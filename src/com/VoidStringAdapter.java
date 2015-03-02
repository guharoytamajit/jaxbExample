package com;



import javax.xml.bind.annotation.adapters.XmlAdapter;

public class VoidStringAdapter  extends XmlAdapter<String, String>{
    @Override
    public String marshal(String v) throws Exception {
        return v;
    }

    @Override
    public String unmarshal(String v) throws Exception {
        return v;
    }
}
