package changdao.common;

public class IndBNoConstant {

    /**
     * 用量 千瓦时(kWh)
     */
    public final static String ELEC = "01040001";

    /**
     * 总有功功率（负荷） 千瓦(kW)
     */
    public final static String LOAD = "01030004";
    /**
     * A相有功功率 千瓦(kW)
     */
    public final static String POWER_A = "01030001";
    /**
     * b相有功功率 千瓦(kW)
     */
    public final static String POWER_B = "01030002";
    /**
     *c相有功功率 千瓦(kW)
     */
    public final static String POWER_C = "01030003";


    /**
     * 电流_A
     */
    public final static String I_A = "01020001";
    /**
     * 电流_B
     */
    public final static String I_B = "01020002";
    /**
     * 电流_C
     */
    public final static String I_C = "01020003";
    /**
     * 电流数组
     */
    public final static String[] I = {I_A,I_B,I_C};

    /**
     * 电压_A
     */
    public final static String U_A = "01010001";
    /**
     * 电压_B
     */
    public final static String U_B = "01010002";
    /**
     * 电压_C
     */
    public final static String U_C = "01010003";
    /**
     * 电压数组
     */
    public final static String[] U = {U_A,U_B,U_C};

    /**
     * 正向有功电能示值
     */
    public final static String DNSZ_ZXYG = "01040001";

    /**
     * 反向有功电能示值
     */
    public final static String DNSZ_FXYG = "01040002";

    /**
     * 正向无功电能示值
     */
    public final static String DNSZ_ZXWG = "01040003";

    /**
     * 反向无功电能示值
     */
    public final static String DNSZ_FXWG = "01040004";
    /**
     * 电能示数
     */
    public final static String[] DNSZ = {DNSZ_ZXYG,DNSZ_FXYG,DNSZ_ZXWG,DNSZ_FXWG};

}
