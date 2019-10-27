package com.andychylde.schoolsmanager.utils;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import java.util.ArrayList;
import java.util.List;

@XmlEnum
enum Region {

    NORTH_EAST("North East"),
    NORTH_WEST("North West"),
    CENTRAL("Middle Belt"),
    SOUTH_EAST("South East"),
    SOUTH_WEST("South West"),
    SOUTH_SOUTH("South South");


    @XmlAttribute
    final String regionName;
    @XmlElement
    final List<State> states = new ArrayList<>();


    Region(String regionName) {
        this.regionName = regionName;

    }

    public String getRegionName() {
        return regionName;
    }

    public List<State> getStates() {
        return states;
    }
}

