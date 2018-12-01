package com.irena.robertkaczmarek.exchangecurrency;

import java.util.ArrayList;
import java.util.List;

public class CurrencyExchange {
    /**
     * success : true
     * timestamp : 1542822547
     * base : EUR
     * date : 2018-11-21
     * rates : {"AED":4.185722,"AFN":86.547632,"ALL":124.547482,"AMD":551.862898,"ANG":2.022608,"AOA":353.711733,"ARS":41.317641,"AUD":1.568033,"AWG":2.051723,"AZN":1.940052,"BAM":1.95452,"BBD":2.274672,"BDT":95.219335,"BGN":1.955489,"BHD":0.429557,"BIF":2069.385964,"BMD":1.13953,"BND":1.607022,"BOB":7.873751,"BRL":4.313076,"BSD":1.139473,"BTC":2.55E-4,"BTN":81.031854,"BWP":12.05846,"BYN":2.400476,"BYR":22334.782435,"BZD":2.296779,"CAD":1.511837,"CDF":1835.78238,"CHF":1.133262,"CLF":0.028542,"CLP":759.948667,"CNY":7.893638,"COP":3648.774151,"CRC":683.677964,"CUC":1.13953,"CUP":30.197537,"CVE":110.67056,"CZK":26.002912,"DJF":202.517116,"DKK":7.461925,"DOP":57.26107,"DZD":135.136737,"EGP":20.463447,"ERN":17.093146,"ETB":32.04376,"EUR":1,"FJD":2.411197,"FKP":0.888993,"GBP":0.891654,"GEL":3.025447,"GGP":0.891612,"GHS":5.498348,"GIP":0.888993,"GMD":56.435254,"GNF":10426.696963,"GTQ":8.791016,"GYD":237.729252,"HKD":8.925674,"HNL":27.758867,"HRK":7.43144,"HTG":83.483057,"HUF":321.794083,"IDR":16668.18604,"ILS":4.249364,"IMP":0.891612,"INR":81.01483,"IQD":1356.040362,"IRR":47979.898265,"ISK":141.222052,"JEP":0.891612,"JMD":143.523473,"JOD":0.808495,"JPY":128.794773,"KES":116.682138,"KGS":79.566639,"KHR":4604.839364,"KMF":492.322263,"KPW":1025.621675,"KRW":1284.817378,"KWD":0.346437,"KYD":0.949587,"KZT":419.871066,"LAK":9737.281681,"LBP":1721.374729,"LKR":203.657083,"LRD":180.046207,"LSL":15.970507,"LTL":3.364735,"LVL":0.68929,"LYD":1.601076,"MAD":10.810707,"MDL":19.553192,"MGA":4113.702142,"MKD":61.476987,"MMK":1820.291637,"MNT":2936.486386,"MOP":9.192471,"MRO":406.811889,"MUR":39.428499,"MVR":17.617085,"MWK":820.461681,"MXN":22.998105,"MYR":4.779755,"MZN":69.767721,"NAD":15.970468,"NGN":414.215075,"NIO":36.806891,"NOK":9.710594,"NPR":129.986479,"NZD":1.666055,"OMR":0.438656,"PAB":1.139473,"PEN":3.848158,"PGK":3.818546,"PHP":59.45269,"PKR":153.010342,"PLN":4.302272,"PYG":6707.498514,"QAR":4.149026,"RON":4.662384,"RSD":118.35178,"RUB":74.719419,"RWF":1005.634974,"SAR":4.275528,"SBD":9.332329,"SCR":15.576802,"SDG":54.259803,"SEK":10.291959,"SGD":1.563999,"SHP":1.505208,"SLL":9572.050017,"SOS":662.066392,"SRD":8.498599,"STD":23987.783797,"SVC":9.970541,"SYP":586.85765,"SZL":15.970502,"THB":37.493922,"TJS":10.739038,"TMT":3.988354,"TND":3.311188,"TOP":2.572032,"TRY":6.038864,"TTD":7.679918,"TWD":35.156201,"TZS":2633.910002,"UAH":31.636744,"UGX":4238.879179,"USD":1.13953,"UYU":37.023686,"UZS":9448.980276,"VEF":283250.337633,"VND":26611.43746,"VUV":128.792656,"WST":2.962284,"XAF":655.537189,"XAG":0.078483,"XAU":9.28E-4,"XCD":3.079636,"XDR":0.822647,"XOF":663.206474,"XPF":119.912479,"YER":285.280999,"ZAR":15.811602,"ZMK":10257.137271,"ZMW":13.559311,"ZWL":367.333114}
     */

    private boolean success;
    private int timestamp;
    private String base;
    private String date;
    private RatesBean rates;

    public List<Currency1> getCurrencyList (){
        List<Currency1> currency1List = new ArrayList<>();
        currency1List.add(new Currency1("AED", rates.getAED()));
        currency1List.add(new Currency1("AFN", rates.getAFN()));
        currency1List.add(new Currency1("ALL", rates.getALL()));
        currency1List.add(new Currency1("AMD", rates.getAMD()));
        currency1List.add(new Currency1("ANG", rates.getANG()));
        currency1List.add(new Currency1("AOA", rates.getAOA()));
        currency1List.add(new Currency1("ARS", rates.getARS()));
        currency1List.add(new Currency1("AUD", rates.getAUD()));
        currency1List.add(new Currency1("AWG", rates.getAWG()));
        currency1List.add(new Currency1("AZN", rates.getAZN()));
        currency1List.add(new Currency1("BAM", rates.getBAM()));
        currency1List.add(new Currency1("BBD", rates.getBBD()));
        currency1List.add(new Currency1("BDT", rates.getBDT()));
        currency1List.add(new Currency1("PLN", rates.getPLN()));
        currency1List.add(new Currency1("BGN", rates.getBGN()));
        currency1List.add(new Currency1("USD", rates.getUSD()));
        currency1List.add(new Currency1("GBP", rates.getGBP()));
        return currency1List;
    }
   /* public List<Double> getCurrencyList (){
        List<Double> currency1List = new ArrayList<>();
        currency1List.add(rates.getAED());
        currency1List.add(rates.getAFN());
        currency1List.add(rates.getALL());
        currency1List.add(rates.getAMD());
        currency1List.add(rates.getANG());
        currency1List.add(rates.getAOA());
        currency1List.add(rates.getARS());
        currency1List.add(rates.getAUD());
        currency1List.add(rates.getAWG());
        currency1List.add(rates.getAZN());
        currency1List.add(rates.getBAM());
        currency1List.add(rates.getBBD());
        currency1List.add(rates.getBDT());
        currency1List.add(rates.getBGN());
        return currency1List;
    }*/
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public RatesBean getRates() {
        return rates;
    }

    public void setRates(RatesBean rates) {
        this.rates = rates;
    }

    public static class RatesBean {


        private double AED;
        private double AFN;
        private double ALL;
        private double AMD;
        private double ANG;
        private double AOA;
        private double ARS;
        private double AUD;
        private double AWG;
        private double AZN;
        private double BAM;
        private double BBD;
        private double BDT;
        private double BGN;
        private double BHD;
        private double BIF;
        private double BMD;
        private double BND;
        private double BOB;
        private double BRL;
        private double BSD;
        private double BTC;
        private double BTN;
        private double BWP;
        private double BYN;
        private double BYR;
        private double BZD;
        private double CAD;
        private double CDF;
        private double CHF;
        private double CLF;
        private double CLP;
        private double CNY;
        private double COP;
        private double CRC;
        private double CUC;
        private double CUP;
        private double CVE;
        private double CZK;
        private double DJF;
        private double DKK;
        private double DOP;
        private double DZD;
        private double EGP;
        private double ERN;
        private double ETB;
        private int EUR;
        private double FJD;
        private double FKP;
        private double GBP;
        private double GEL;
        private double GGP;
        private double GHS;
        private double GIP;
        private double GMD;
        private double GNF;
        private double GTQ;
        private double GYD;
        private double HKD;
        private double HNL;
        private double HRK;
        private double HTG;
        private double HUF;
        private double IDR;
        private double ILS;
        private double IMP;
        private double INR;
        private double IQD;
        private double IRR;
        private double ISK;
        private double JEP;
        private double JMD;
        private double JOD;
        private double JPY;
        private double KES;
        private double KGS;
        private double KHR;
        private double KMF;
        private double KPW;
        private double KRW;
        private double KWD;
        private double KYD;
        private double KZT;
        private double LAK;
        private double LBP;
        private double LKR;
        private double LRD;
        private double LSL;
        private double LTL;
        private double LVL;
        private double LYD;
        private double MAD;
        private double MDL;
        private double MGA;
        private double MKD;
        private double MMK;
        private double MNT;
        private double MOP;
        private double MRO;
        private double MUR;
        private double MVR;
        private double MWK;
        private double MXN;
        private double MYR;
        private double MZN;
        private double NAD;
        private double NGN;
        private double NIO;
        private double NOK;
        private double NPR;
        private double NZD;
        private double OMR;
        private double PAB;
        private double PEN;
        private double PGK;
        private double PHP;
        private double PKR;
        private double PLN;
        private double PYG;
        private double QAR;
        private double RON;
        private double RSD;
        private double RUB;
        private double RWF;
        private double SAR;
        private double SBD;
        private double SCR;
        private double SDG;
        private double SEK;
        private double SGD;
        private double SHP;
        private double SLL;
        private double SOS;
        private double SRD;
        private double STD;
        private double SVC;
        private double SYP;
        private double SZL;
        private double THB;
        private double TJS;
        private double TMT;
        private double TND;
        private double TOP;
        private double TRY;
        private double TTD;
        private double TWD;
        private double TZS;
        private double UAH;
        private double UGX;
        private double USD;
        private double UYU;
        private double UZS;
        private double VEF;
        private double VND;
        private double VUV;
        private double WST;
        private double XAF;
        private double XAG;
        private double XAU;
        private double XCD;
        private double XDR;
        private double XOF;
        private double XPF;
        private double YER;
        private double ZAR;
        private double ZMK;
        private double ZMW;
        private double ZWL;

        public RatesBean (Double waluta){

        }

        public double getAED() {
            return AED;
        }

        public void setAED(double AED) {
            this.AED = AED;
        }

        public double getAFN() {
            return AFN;
        }

        public void setAFN(double AFN) {
            this.AFN = AFN;
        }

        public double getALL() {
            return ALL;
        }

        public void setALL(double ALL) {
            this.ALL = ALL;
        }

        public double getAMD() {
            return AMD;
        }

        public void setAMD(double AMD) {
            this.AMD = AMD;
        }

        public double getANG() {
            return ANG;
        }

        public void setANG(double ANG) {
            this.ANG = ANG;
        }

        public double getAOA() {
            return AOA;
        }

        public void setAOA(double AOA) {
            this.AOA = AOA;
        }

        public double getARS() {
            return ARS;
        }

        public void setARS(double ARS) {
            this.ARS = ARS;
        }

        public double getAUD() {
            return AUD;
        }

        public void setAUD(double AUD) {
            this.AUD = AUD;
        }

        public double getAWG() {
            return AWG;
        }

        public void setAWG(double AWG) {
            this.AWG = AWG;
        }

        public double getAZN() {
            return AZN;
        }

        public void setAZN(double AZN) {
            this.AZN = AZN;
        }

        public double getBAM() {
            return BAM;
        }

        public void setBAM(double BAM) {
            this.BAM = BAM;
        }

        public double getBBD() {
            return BBD;
        }

        public void setBBD(double BBD) {
            this.BBD = BBD;
        }

        public double getBDT() {
            return BDT;
        }

        public void setBDT(double BDT) {
            this.BDT = BDT;
        }

        public double getBGN() {
            return BGN;
        }

        public void setBGN(double BGN) {
            this.BGN = BGN;
        }

        public double getBHD() {
            return BHD;
        }

        public void setBHD(double BHD) {
            this.BHD = BHD;
        }

        public double getBIF() {
            return BIF;
        }

        public void setBIF(double BIF) {
            this.BIF = BIF;
        }

        public double getBMD() {
            return BMD;
        }

        public void setBMD(double BMD) {
            this.BMD = BMD;
        }

        public double getBND() {
            return BND;
        }

        public void setBND(double BND) {
            this.BND = BND;
        }

        public double getBOB() {
            return BOB;
        }

        public void setBOB(double BOB) {
            this.BOB = BOB;
        }

        public double getBRL() {
            return BRL;
        }

        public void setBRL(double BRL) {
            this.BRL = BRL;
        }

        public double getBSD() {
            return BSD;
        }

        public void setBSD(double BSD) {
            this.BSD = BSD;
        }

        public double getBTC() {
            return BTC;
        }

        public void setBTC(double BTC) {
            this.BTC = BTC;
        }

        public double getBTN() {
            return BTN;
        }

        public void setBTN(double BTN) {
            this.BTN = BTN;
        }

        public double getBWP() {
            return BWP;
        }

        public void setBWP(double BWP) {
            this.BWP = BWP;
        }

        public double getBYN() {
            return BYN;
        }

        public void setBYN(double BYN) {
            this.BYN = BYN;
        }

        public double getBYR() {
            return BYR;
        }

        public void setBYR(double BYR) {
            this.BYR = BYR;
        }

        public double getBZD() {
            return BZD;
        }

        public void setBZD(double BZD) {
            this.BZD = BZD;
        }

        public double getCAD() {
            return CAD;
        }

        public void setCAD(double CAD) {
            this.CAD = CAD;
        }

        public double getCDF() {
            return CDF;
        }

        public void setCDF(double CDF) {
            this.CDF = CDF;
        }

        public double getCHF() {
            return CHF;
        }

        public void setCHF(double CHF) {
            this.CHF = CHF;
        }

        public double getCLF() {
            return CLF;
        }

        public void setCLF(double CLF) {
            this.CLF = CLF;
        }

        public double getCLP() {
            return CLP;
        }

        public void setCLP(double CLP) {
            this.CLP = CLP;
        }

        public double getCNY() {
            return CNY;
        }

        public void setCNY(double CNY) {
            this.CNY = CNY;
        }

        public double getCOP() {
            return COP;
        }

        public void setCOP(double COP) {
            this.COP = COP;
        }

        public double getCRC() {
            return CRC;
        }

        public void setCRC(double CRC) {
            this.CRC = CRC;
        }

        public double getCUC() {
            return CUC;
        }

        public void setCUC(double CUC) {
            this.CUC = CUC;
        }

        public double getCUP() {
            return CUP;
        }

        public void setCUP(double CUP) {
            this.CUP = CUP;
        }

        public double getCVE() {
            return CVE;
        }

        public void setCVE(double CVE) {
            this.CVE = CVE;
        }

        public double getCZK() {
            return CZK;
        }

        public void setCZK(double CZK) {
            this.CZK = CZK;
        }

        public double getDJF() {
            return DJF;
        }

        public void setDJF(double DJF) {
            this.DJF = DJF;
        }

        public double getDKK() {
            return DKK;
        }

        public void setDKK(double DKK) {
            this.DKK = DKK;
        }

        public double getDOP() {
            return DOP;
        }

        public void setDOP(double DOP) {
            this.DOP = DOP;
        }

        public double getDZD() {
            return DZD;
        }

        public void setDZD(double DZD) {
            this.DZD = DZD;
        }

        public double getEGP() {
            return EGP;
        }

        public void setEGP(double EGP) {
            this.EGP = EGP;
        }

        public double getERN() {
            return ERN;
        }

        public void setERN(double ERN) {
            this.ERN = ERN;
        }

        public double getETB() {
            return ETB;
        }

        public void setETB(double ETB) {
            this.ETB = ETB;
        }

        public int getEUR() {
            return EUR;
        }

        public void setEUR(int EUR) {
            this.EUR = EUR;
        }

        public double getFJD() {
            return FJD;
        }

        public void setFJD(double FJD) {
            this.FJD = FJD;
        }

        public double getFKP() {
            return FKP;
        }

        public void setFKP(double FKP) {
            this.FKP = FKP;
        }

        public double getGBP() {
            return GBP;
        }

        public void setGBP(double GBP) {
            this.GBP = GBP;
        }

        public double getGEL() {
            return GEL;
        }

        public void setGEL(double GEL) {
            this.GEL = GEL;
        }

        public double getGGP() {
            return GGP;
        }

        public void setGGP(double GGP) {
            this.GGP = GGP;
        }

        public double getGHS() {
            return GHS;
        }

        public void setGHS(double GHS) {
            this.GHS = GHS;
        }

        public double getGIP() {
            return GIP;
        }

        public void setGIP(double GIP) {
            this.GIP = GIP;
        }

        public double getGMD() {
            return GMD;
        }

        public void setGMD(double GMD) {
            this.GMD = GMD;
        }

        public double getGNF() {
            return GNF;
        }

        public void setGNF(double GNF) {
            this.GNF = GNF;
        }

        public double getGTQ() {
            return GTQ;
        }

        public void setGTQ(double GTQ) {
            this.GTQ = GTQ;
        }

        public double getGYD() {
            return GYD;
        }

        public void setGYD(double GYD) {
            this.GYD = GYD;
        }

        public double getHKD() {
            return HKD;
        }

        public void setHKD(double HKD) {
            this.HKD = HKD;
        }

        public double getHNL() {
            return HNL;
        }

        public void setHNL(double HNL) {
            this.HNL = HNL;
        }

        public double getHRK() {
            return HRK;
        }

        public void setHRK(double HRK) {
            this.HRK = HRK;
        }

        public double getHTG() {
            return HTG;
        }

        public void setHTG(double HTG) {
            this.HTG = HTG;
        }

        public double getHUF() {
            return HUF;
        }

        public void setHUF(double HUF) {
            this.HUF = HUF;
        }

        public double getIDR() {
            return IDR;
        }

        public void setIDR(double IDR) {
            this.IDR = IDR;
        }

        public double getILS() {
            return ILS;
        }

        public void setILS(double ILS) {
            this.ILS = ILS;
        }

        public double getIMP() {
            return IMP;
        }

        public void setIMP(double IMP) {
            this.IMP = IMP;
        }

        public double getINR() {
            return INR;
        }

        public void setINR(double INR) {
            this.INR = INR;
        }

        public double getIQD() {
            return IQD;
        }

        public void setIQD(double IQD) {
            this.IQD = IQD;
        }

        public double getIRR() {
            return IRR;
        }

        public void setIRR(double IRR) {
            this.IRR = IRR;
        }

        public double getISK() {
            return ISK;
        }

        public void setISK(double ISK) {
            this.ISK = ISK;
        }

        public double getJEP() {
            return JEP;
        }

        public void setJEP(double JEP) {
            this.JEP = JEP;
        }

        public double getJMD() {
            return JMD;
        }

        public void setJMD(double JMD) {
            this.JMD = JMD;
        }

        public double getJOD() {
            return JOD;
        }

        public void setJOD(double JOD) {
            this.JOD = JOD;
        }

        public double getJPY() {
            return JPY;
        }

        public void setJPY(double JPY) {
            this.JPY = JPY;
        }

        public double getKES() {
            return KES;
        }

        public void setKES(double KES) {
            this.KES = KES;
        }

        public double getKGS() {
            return KGS;
        }

        public void setKGS(double KGS) {
            this.KGS = KGS;
        }

        public double getKHR() {
            return KHR;
        }

        public void setKHR(double KHR) {
            this.KHR = KHR;
        }

        public double getKMF() {
            return KMF;
        }

        public void setKMF(double KMF) {
            this.KMF = KMF;
        }

        public double getKPW() {
            return KPW;
        }

        public void setKPW(double KPW) {
            this.KPW = KPW;
        }

        public double getKRW() {
            return KRW;
        }

        public void setKRW(double KRW) {
            this.KRW = KRW;
        }

        public double getKWD() {
            return KWD;
        }

        public void setKWD(double KWD) {
            this.KWD = KWD;
        }

        public double getKYD() {
            return KYD;
        }

        public void setKYD(double KYD) {
            this.KYD = KYD;
        }

        public double getKZT() {
            return KZT;
        }

        public void setKZT(double KZT) {
            this.KZT = KZT;
        }

        public double getLAK() {
            return LAK;
        }

        public void setLAK(double LAK) {
            this.LAK = LAK;
        }

        public double getLBP() {
            return LBP;
        }

        public void setLBP(double LBP) {
            this.LBP = LBP;
        }

        public double getLKR() {
            return LKR;
        }

        public void setLKR(double LKR) {
            this.LKR = LKR;
        }

        public double getLRD() {
            return LRD;
        }

        public void setLRD(double LRD) {
            this.LRD = LRD;
        }

        public double getLSL() {
            return LSL;
        }

        public void setLSL(double LSL) {
            this.LSL = LSL;
        }

        public double getLTL() {
            return LTL;
        }

        public void setLTL(double LTL) {
            this.LTL = LTL;
        }

        public double getLVL() {
            return LVL;
        }

        public void setLVL(double LVL) {
            this.LVL = LVL;
        }

        public double getLYD() {
            return LYD;
        }

        public void setLYD(double LYD) {
            this.LYD = LYD;
        }

        public double getMAD() {
            return MAD;
        }

        public void setMAD(double MAD) {
            this.MAD = MAD;
        }

        public double getMDL() {
            return MDL;
        }

        public void setMDL(double MDL) {
            this.MDL = MDL;
        }

        public double getMGA() {
            return MGA;
        }

        public void setMGA(double MGA) {
            this.MGA = MGA;
        }

        public double getMKD() {
            return MKD;
        }

        public void setMKD(double MKD) {
            this.MKD = MKD;
        }

        public double getMMK() {
            return MMK;
        }

        public void setMMK(double MMK) {
            this.MMK = MMK;
        }

        public double getMNT() {
            return MNT;
        }

        public void setMNT(double MNT) {
            this.MNT = MNT;
        }

        public double getMOP() {
            return MOP;
        }

        public void setMOP(double MOP) {
            this.MOP = MOP;
        }

        public double getMRO() {
            return MRO;
        }

        public void setMRO(double MRO) {
            this.MRO = MRO;
        }

        public double getMUR() {
            return MUR;
        }

        public void setMUR(double MUR) {
            this.MUR = MUR;
        }

        public double getMVR() {
            return MVR;
        }

        public void setMVR(double MVR) {
            this.MVR = MVR;
        }

        public double getMWK() {
            return MWK;
        }

        public void setMWK(double MWK) {
            this.MWK = MWK;
        }

        public double getMXN() {
            return MXN;
        }

        public void setMXN(double MXN) {
            this.MXN = MXN;
        }

        public double getMYR() {
            return MYR;
        }

        public void setMYR(double MYR) {
            this.MYR = MYR;
        }

        public double getMZN() {
            return MZN;
        }

        public void setMZN(double MZN) {
            this.MZN = MZN;
        }

        public double getNAD() {
            return NAD;
        }

        public void setNAD(double NAD) {
            this.NAD = NAD;
        }

        public double getNGN() {
            return NGN;
        }

        public void setNGN(double NGN) {
            this.NGN = NGN;
        }

        public double getNIO() {
            return NIO;
        }

        public void setNIO(double NIO) {
            this.NIO = NIO;
        }

        public double getNOK() {
            return NOK;
        }

        public void setNOK(double NOK) {
            this.NOK = NOK;
        }

        public double getNPR() {
            return NPR;
        }

        public void setNPR(double NPR) {
            this.NPR = NPR;
        }

        public double getNZD() {
            return NZD;
        }

        public void setNZD(double NZD) {
            this.NZD = NZD;
        }

        public double getOMR() {
            return OMR;
        }

        public void setOMR(double OMR) {
            this.OMR = OMR;
        }

        public double getPAB() {
            return PAB;
        }

        public void setPAB(double PAB) {
            this.PAB = PAB;
        }

        public double getPEN() {
            return PEN;
        }

        public void setPEN(double PEN) {
            this.PEN = PEN;
        }

        public double getPGK() {
            return PGK;
        }

        public void setPGK(double PGK) {
            this.PGK = PGK;
        }

        public double getPHP() {
            return PHP;
        }

        public void setPHP(double PHP) {
            this.PHP = PHP;
        }

        public double getPKR() {
            return PKR;
        }

        public void setPKR(double PKR) {
            this.PKR = PKR;
        }

        public double getPLN() {
            return PLN;
        }

        public void setPLN(double PLN) {
            this.PLN = PLN;
        }

        public double getPYG() {
            return PYG;
        }

        public void setPYG(double PYG) {
            this.PYG = PYG;
        }

        public double getQAR() {
            return QAR;
        }

        public void setQAR(double QAR) {
            this.QAR = QAR;
        }

        public double getRON() {
            return RON;
        }

        public void setRON(double RON) {
            this.RON = RON;
        }

        public double getRSD() {
            return RSD;
        }

        public void setRSD(double RSD) {
            this.RSD = RSD;
        }

        public double getRUB() {
            return RUB;
        }

        public void setRUB(double RUB) {
            this.RUB = RUB;
        }

        public double getRWF() {
            return RWF;
        }

        public void setRWF(double RWF) {
            this.RWF = RWF;
        }

        public double getSAR() {
            return SAR;
        }

        public void setSAR(double SAR) {
            this.SAR = SAR;
        }

        public double getSBD() {
            return SBD;
        }

        public void setSBD(double SBD) {
            this.SBD = SBD;
        }

        public double getSCR() {
            return SCR;
        }

        public void setSCR(double SCR) {
            this.SCR = SCR;
        }

        public double getSDG() {
            return SDG;
        }

        public void setSDG(double SDG) {
            this.SDG = SDG;
        }

        public double getSEK() {
            return SEK;
        }

        public void setSEK(double SEK) {
            this.SEK = SEK;
        }

        public double getSGD() {
            return SGD;
        }

        public void setSGD(double SGD) {
            this.SGD = SGD;
        }

        public double getSHP() {
            return SHP;
        }

        public void setSHP(double SHP) {
            this.SHP = SHP;
        }

        public double getSLL() {
            return SLL;
        }

        public void setSLL(double SLL) {
            this.SLL = SLL;
        }

        public double getSOS() {
            return SOS;
        }

        public void setSOS(double SOS) {
            this.SOS = SOS;
        }

        public double getSRD() {
            return SRD;
        }

        public void setSRD(double SRD) {
            this.SRD = SRD;
        }

        public double getSTD() {
            return STD;
        }

        public void setSTD(double STD) {
            this.STD = STD;
        }

        public double getSVC() {
            return SVC;
        }

        public void setSVC(double SVC) {
            this.SVC = SVC;
        }

        public double getSYP() {
            return SYP;
        }

        public void setSYP(double SYP) {
            this.SYP = SYP;
        }

        public double getSZL() {
            return SZL;
        }

        public void setSZL(double SZL) {
            this.SZL = SZL;
        }

        public double getTHB() {
            return THB;
        }

        public void setTHB(double THB) {
            this.THB = THB;
        }

        public double getTJS() {
            return TJS;
        }

        public void setTJS(double TJS) {
            this.TJS = TJS;
        }

        public double getTMT() {
            return TMT;
        }

        public void setTMT(double TMT) {
            this.TMT = TMT;
        }

        public double getTND() {
            return TND;
        }

        public void setTND(double TND) {
            this.TND = TND;
        }

        public double getTOP() {
            return TOP;
        }

        public void setTOP(double TOP) {
            this.TOP = TOP;
        }

        public double getTRY() {
            return TRY;
        }

        public void setTRY(double TRY) {
            this.TRY = TRY;
        }

        public double getTTD() {
            return TTD;
        }

        public void setTTD(double TTD) {
            this.TTD = TTD;
        }

        public double getTWD() {
            return TWD;
        }

        public void setTWD(double TWD) {
            this.TWD = TWD;
        }

        public double getTZS() {
            return TZS;
        }

        public void setTZS(double TZS) {
            this.TZS = TZS;
        }

        public double getUAH() {
            return UAH;
        }

        public void setUAH(double UAH) {
            this.UAH = UAH;
        }

        public double getUGX() {
            return UGX;
        }

        public void setUGX(double UGX) {
            this.UGX = UGX;
        }

        public double getUSD() {
            return USD;
        }

        public void setUSD(double USD) {
            this.USD = USD;
        }

        public double getUYU() {
            return UYU;
        }

        public void setUYU(double UYU) {
            this.UYU = UYU;
        }

        public double getUZS() {
            return UZS;
        }

        public void setUZS(double UZS) {
            this.UZS = UZS;
        }

        public double getVEF() {
            return VEF;
        }

        public void setVEF(double VEF) {
            this.VEF = VEF;
        }

        public double getVND() {
            return VND;
        }

        public void setVND(double VND) {
            this.VND = VND;
        }

        public double getVUV() {
            return VUV;
        }

        public void setVUV(double VUV) {
            this.VUV = VUV;
        }

        public double getWST() {
            return WST;
        }

        public void setWST(double WST) {
            this.WST = WST;
        }

        public double getXAF() {
            return XAF;
        }

        public void setXAF(double XAF) {
            this.XAF = XAF;
        }

        public double getXAG() {
            return XAG;
        }

        public void setXAG(double XAG) {
            this.XAG = XAG;
        }

        public double getXAU() {
            return XAU;
        }

        public void setXAU(double XAU) {
            this.XAU = XAU;
        }

        public double getXCD() {
            return XCD;
        }

        public void setXCD(double XCD) {
            this.XCD = XCD;
        }

        public double getXDR() {
            return XDR;
        }

        public void setXDR(double XDR) {
            this.XDR = XDR;
        }

        public double getXOF() {
            return XOF;
        }

        public void setXOF(double XOF) {
            this.XOF = XOF;
        }

        public double getXPF() {
            return XPF;
        }

        public void setXPF(double XPF) {
            this.XPF = XPF;
        }

        public double getYER() {
            return YER;
        }

        public void setYER(double YER) {
            this.YER = YER;
        }

        public double getZAR() {
            return ZAR;
        }

        public void setZAR(double ZAR) {
            this.ZAR = ZAR;
        }

        public double getZMK() {
            return ZMK;
        }

        public void setZMK(double ZMK) {
            this.ZMK = ZMK;
        }

        public double getZMW() {
            return ZMW;
        }

        public void setZMW(double ZMW) {
            this.ZMW = ZMW;
        }

        public double getZWL() {
            return ZWL;
        }

        public void setZWL(double ZWL) {
            this.ZWL = ZWL;
        }
    }
    //private String base;
   // private String date;
   // private List<Currency1>rates;

}
