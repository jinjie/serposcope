/*
 * Serposcope - SEO rank checker https://serposcope.serphacker.com/
 * 
 * Copyright (c) 2016 SERP Hacker
 * @author Pierre Nogues <support@serphacker.com>
 * @license https://opensource.org/licenses/MIT MIT License
 */

package com.serphacker.serposcope.db.base;

import com.serphacker.serposcope.scraper.google.GoogleCountryCode;
import static com.serphacker.serposcope.scraper.google.GoogleCountryCode.*;

public class MigrationTLDtoCountry {
    public static GoogleCountryCode fromTld(String tld){
        if(tld == null || tld.isEmpty()){
            return __;
        }
        
        tld = tld.toLowerCase();
        switch(tld){
            case "ad":
                return AD;
            case "ae":
                return AE;
            case "al":
                return AL;
            case "am":
                return AM;
            case "as":
                return AS;
            case "at":
                return AT;
            case "az":
                return AZ;
            case "ba":
                return BA;
            case "be":
                return BE;
            case "bf":
                return BF;
            case "bg":
                return BG;
            case "bi":
                return BI;
            case "bj":
                return BJ;
            case "bs":
                return BS;
            case "bt":
                return BT;
            case "by":
                return BY;
            case "ca":
                return CA;
            case "cd":
                return CD;
            case "cf":
                return CF;
            case "cg":
                return CG;
            case "ch":
                return CH;
            case "ci":
                return CI;
            case "cl":
                return CL;
            case "cm":
                return CM;
            case "cn":
                return CN;
            case "co.ao":
                return AO;
            case "co.bw":
                return BW;
            case "co.ck":
                return CK;
            case "co.cr":
                return CR;
            case "co.id":
                return ID;
            case "co.il":
                return IL;
            case "co.in":
                return IN;
            case "co.jp":
                return JP;
            case "co.ke":
                return KE;
            case "co.kr":
                return KR;
            case "co.ls":
                return LS;
            case "co.ma":
                return MA;
            case "com.af":
                return AF;
            case "com.ag":
                return AG;
            case "com.ai":
                return AI;
            case "com.ar":
                return AR;
            case "com.au":
                return AU;
            case "com.bd":
                return BD;
            case "com.bh":
                return BH;
            case "com.bn":
                return BN;
            case "com.bo":
                return BO;
            case "com.br":
                return BR;
            case "com.bz":
                return BZ;
            case "com.co":
                return CO;
            case "com.cu":
                return CU;
            case "com.cy":
                return CY;
            case "com.do":
                return DO;
            case "com.ec":
                return EC;
            case "com.eg":
                return EG;
            case "com.et":
                return ET;
            case "com.fj":
                return FJ;
            case "com.gh":
                return GH;
            case "com.gi":
                return GI;
            case "com.gt":
                return GT;
            case "com.hk":
                return HK;
            case "com.jm":
                return JM;
            case "com.kh":
                return KH;
            case "com.kw":
                return KW;
            case "com.lb":
                return LB;
            case "com.ly":
                return LY;
            case "com.mm":
                return MM;
            case "com.mt":
                return MT;
            case "com.mx":
                return MX;
            case "com.my":
                return MY;
            case "com.na":
                return NA;
            case "com.nf":
                return NF;
            case "com.ng":
                return NG;
            case "com.ni":
                return NI;
            case "com.np":
                return NP;
            case "com.om":
                return OM;
            case "com.pa":
                return PA;
            case "com.pe":
                return PE;
            case "com.pg":
                return PG;
            case "com.ph":
                return PH;
            case "com.pk":
                return PK;
            case "com.pr":
                return PR;
            case "com.py":
                return PY;
            case "com.qa":
                return QA;
            case "com.sa":
                return SA;
            case "com.sb":
                return SB;
            case "com.sg":
                return SG;
            case "com.sl":
                return SL;
            case "com.sv":
                return SV;
            case "com.tj":
                return TJ;
            case "com.tr":
                return TR;
            case "com.tw":
                return TW;
            case "com.ua":
                return UA;
            case "com.uy":
                return UY;
            case "com.vc":
                return VC;
            case "com.vn":
                return VN;
            case "co.mz":
                return MZ;
            case "co.nz":
                return NZ;
            case "co.th":
                return TH;
            case "co.tz":
                return TZ;
            case "co.ug":
                return UG;
            case "co.uk":
                return UK;
            case "co.uz":
                return UZ;
            case "co.ve":
                return VE;
            case "co.vi":
                return VI;
            case "co.za":
                return ZA;
            case "co.zm":
                return ZM;
            case "co.zw":
                return ZW;
            case "cv":
                return CV;
            case "cz":
                return CZ;
            case "de":
                return DE;
            case "dj":
                return DJ;
            case "dk":
                return DK;
            case "dm":
                return DM;
            case "dz":
                return DZ;
            case "ee":
                return EE;
            case "es":
                return ES;
            case "fi":
                return FI;
            case "fm":
                return FM;
            case "fr":
                return FR;
            case "ga":
                return GA;
            case "ge":
                return GE;
            case "gl":
                return GL;
            case "gm":
                return GM;
            case "gp":
                return GP;
            case "gr":
                return GR;
            case "gy":
                return GY;
            case "hn":
                return HN;
            case "hr":
                return HR;
            case "ht":
                return HT;
            case "hu":
                return HU;
            case "ie":
                return IE;
            case "iq":
                return IQ;
            case "is":
                return IS;
            case "it":
                return IT;
            case "jo":
                return JO;
            case "kg":
                return KG;
            case "ki":
                return KI;
            case "kz":
                return KZ;
            case "la":
                return LA;
            case "li":
                return LI;
            case "lk":
                return LK;
            case "lt":
                return LT;
            case "lu":
                return LU;
            case "lv":
                return LV;
            case "md":
                return MD;
            case "mg":
                return MG;
            case "mk":
                return MK;
            case "ml":
                return ML;
            case "mn":
                return MN;
            case "ms":
                return MS;
            case "mu":
                return MU;
            case "mv":
                return MV;
            case "mw":
                return MW;
            case "ne":
                return NE;
            case "nl":
                return NL;
            case "no":
                return NO;
            case "nr":
                return NR;
            case "nu":
                return NU;
            case "pl":
                return PL;
            case "pn":
                return PN;
            case "ps":
                return PS;
            case "pt":
                return PT;
            case "ro":
                return RO;
            case "ru":
                return RU;
            case "rw":
                return RW;
            case "sc":
                return SC;
            case "se":
                return SE;
            case "sh":
                return SH;
            case "si":
                return SI;
            case "sk":
                return SK;
            case "sm":
                return SM;
            case "sn":
                return SN;
            case "so":
                return SO;
            case "sr":
                return SR;
            case "st":
                return ST;
            case "td":
                return TD;
            case "tg":
                return TG;
            case "tk":
                return TK;
            case "tl":
                return TL;
            case "tm":
                return TM;
            case "tn":
                return TN;
            case "to":
                return TO;
            case "tt":
                return TT;
            case "vg":
                return VG;
            case "vu":
                return VU;
            case "ws":
                return WS;            
        }
        return __;
    } 

}