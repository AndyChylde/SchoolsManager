package com.andychylde.schoolsmanager.utils;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Embeddable
public enum State implements Serializable {
    //    Region.SOUTH_WEST.....................................
    EKITI("EK", Region.SOUTH_WEST,"Ado Ekiti"),
    LAGOS("LA", Region.SOUTH_WEST,"Ikeja"),
    OGUN("OG", Region.SOUTH_WEST,"Abeokuta"),
    ONDO("ON", Region.SOUTH_WEST,"Ondo"),
    OSUN("OS", Region.SOUTH_WEST,"Osogbo"),
    OYO("OY", Region.SOUTH_WEST,"Ibadan"),
    //    Region.SOUTH_SOUTH....................................
    AKWA_IBOM("AK", Region.SOUTH_SOUTH,"Uyo"),
    CROSS_RIVER("CR", Region.SOUTH_SOUTH,"Calabar"),
    BAYELSA("BY", Region.SOUTH_SOUTH,"Yenagoa"),
    RIVERS("RI", Region.SOUTH_SOUTH,"Port Harcourt"),
    Delta("DE", Region.SOUTH_SOUTH,"Asaba"),
    Edo("ED", Region.SOUTH_SOUTH,"Benin"),
    //    Region.SOUTH_EAST......................................
    ABIA("AB", Region.SOUTH_EAST, "Umuahia"),
    ANAMBRA("AN", Region.SOUTH_EAST,"Awka"),
    EBONYI("EB",Region.SOUTH_EAST, "Abakaliki"),
    ENUGU("EN",Region.SOUTH_EAST, "Enugu"),
    IMO("IM", Region.SOUTH_EAST, "Owerri"),
    //    Region.NORTH_EAST......................................
    ADAMAWA("AD",Region.NORTH_EAST, "Yola"),
    TARABA("TB",Region.NORTH_EAST, "Jalingo"),
    YOBE("YB",Region.NORTH_EAST, "Damaturu"),
    BORNO("BO",Region.NORTH_EAST, "Maiduguri"),
    BAUCHI("BA",Region.NORTH_EAST,"Bauchi"),
    GOMBE("GM",Region.NORTH_EAST,"Gombe"),
    //    Region.NORTH_WEST......................................
    JIGAWA("JG",Region.NORTH_WEST,"Dutse"),
    KADUNA("KD",Region.NORTH_WEST,"Kaduna"),
    KANO("KN",Region.NORTH_WEST,"Kano"),
    KATSINA("KT",Region.NORTH_WEST, "Katsina"),
    KEBBI("KB",Region.NORTH_WEST, "Birnin Kebbi"),
    SOKOTO("SO",Region.NORTH_WEST, "Sokoto"),
    ZAMFARA("ZM",Region.NORTH_WEST, "Gusau"),
    //    Region.CENTRAL......................................
    KOGI("KG",Region.CENTRAL,"Lokoja"),
    NIGER("NG",Region.CENTRAL,"Minna"),
    BENUE("BN",Region.CENTRAL,"Makurdi"),
    KWARA("KW",Region.CENTRAL,"Ilorin"),
    PLATEAU("PL",Region.CENTRAL,"Jos"),
    NASSARAWA("NS",Region.CENTRAL,"Lafia") ;
    //and the Federal Capital Territory.

    //Attributes.........................................................................
    private final String capital;
   @Id
   private final String stateCode;
    private final Region region;
    @ElementCollection
    List <LocalGovernment> localGovernments = new ArrayList<>();

    //    Constructor(s)...............................................................
    State(String state, Region region, String capital) {
        this.stateCode = state;
        this.region = region;
        this.capital = capital;
    }

//    Getters.....................................................................

    public String getStateCode() {
        return stateCode;
    }

    public Region getRegion() {
        return region;
    }

    public String getCapital(){ return capital;}

    public List<LocalGovernment> getLocalGovernments() {
        return localGovernments;
    }
}






