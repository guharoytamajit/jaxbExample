package com;



import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

public class AdaptedString {
    @XmlAttribute(namespace="http://www.w3.org/2001/XMLSchema-instance")
    public Boolean nil;

    @XmlValue
    @XmlJavaTypeAdapter(VoidStringAdapter.class)
    public String value;
}
