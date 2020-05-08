package changdao.common;

import com.fasterxml.jackson.annotation.JsonValue;
import changdao.utils.Assert;
import changdao.utils.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther:maofukai
 * @date:2019-07-09 系统指标定义
 */
public enum Index {

    Ua("01010001", "ua", "A相电压", "0101"),
    Ub("01010002", "ub", "B相电压", "0101"),
    Uc("01010003", "uc", "C相电压", "0101"),
    Uapc("01010004", "Uapc", "A相电压偏差", "0101"),
    Ubpc("01010005", "Ubpc", "B相电压偏差", "0101"),
    Ucpc("01010006", "Ucpc", "C相电压偏差", "0101"),
    AB("01010007", "AB", "AB线电压", "0101"),
    BC("01010008", "BC", "BC线电压", "0101"),
    CA("01010009", "CA", "CA线电压", "0101"),
    Uab("01010010", "Uab", "Uab线电压偏差", "0101"),
    Ubc("01010011", "Ubc", "Ubc线电压偏差", "0101"),
    Uca("01010012", "Uca", "Uca线电压偏差", "0101"),
    Ubph("01010013", "Ubph", "电压不平衡度", "0101"),
    UaUb("01010014", "UaUb", "Ua、Ub相位角", "0101"),
    UbUc("01010015", "UbUc", "Ub、Uc相位角", "0101"),
    UcUa("01010016", "UcUa", "Uc、Ua相位角", "0101"),

    Ia("01020001", "ia", "A相电流", "0102"),
    Ib("01020002", "ib", "B相电流", "0102"),
    Ic("01020003", "ic", "C相电流", "0102"),
    Ibph("01020004", "Ibph", "电流不平衡度", "0102"),
    IaIb("01020005", "IaIb", "Ia、Ib相位角", "0102"),
    IbIc("01020006", "IbIc", "IbIc相位角", "0102"),
    IcIa("01020007", "IcIa", "Ic、Ia相位角", "0102"),
    Ilx("01020008", "ic", "零序电流", "0102"),
    Ild("01020009", "ic", "漏电电流", "0102"),

    Pa("01030001", "pa", "A相有功功率", "0103"),
    Pb("01030002", "pb", "B相有功功率", "0103"),
    Pc("01030003", "pc", "C相有功功率", "0103"),
    P("01030004", "p", "总有功功率 ", "0103"),
    Pasz("01030005", "Pasz", "A相视在功率 ", "0103"),
    Pbsz("01030006", "Pbsz", "B相视在功率 ", "0103"),
    Pcsz("01030007", "pcsz", "C相视在功率 ", "0103"),
    Psz("01030008", "Psz", "总视在功率 ", "0103"),
    Pawg("01030009", "Pawg", "A相无功功率 ", "0103"),
    Pbwg("01030010", "Pbwg", "B相无功功率 ", "0103"),
    Pcwg("01030011", "Pcwg", "C相无功功率 ", "0103"),
    Pwg("01030012", "Pwg", "总无功功率 ", "0103"),
    Pagl("01030013", "Pagl", "A相功率因数 ", "0103"),
    Pbgl("01030014", "Pbgl", "B相功率因数 ", "0103"),
    Pcgl("01030015", "Pcgl", "C相功率因数 ", "0103"),
    Pgl("01030016", "Pgl", "总功率因数 ", "0103"),

    SPZW("01040001", "spzw", "正向有功电能示值 ", "0104"),
    fxyg("01040002", "fxyg", "反向有功电能示值 ", "0104"),
    zxwg("01040003", "zxwg", "正向无功电能示值 ", "0104"),
    fxwg("01040004", "fxwg", "反向无功电能示值 ", "0104"),
    zxygz("01040005", "zxygz", "正向有功总电量 ", "0104"),
    zxygj("01040006", "zxygj", "正向有功尖电量 ", "0104"),
    zxygf("01040007", "zxygf", "正向有功峰电量 ", "0104"),
    zxygg("01040008", "zxygg", "正向有功谷电量 ", "0104"),
    zxygp("01040009", "zxygp", "正向有功平电量 ", "0104"),
    zxwgz("01040010", "zxwgz", "正向无功总电量 ", "0104"),
    zxwgj("01040011", "zxwgj", "正向无功尖电量 ", "0104"),
    zxwgf("01040012", "zxwgf", "正向无功峰电量 ", "0104"),
    zxwgg("01040013", "zxwgg", "正向无功谷电量 ", "0104"),
    zxwgp("01040014", "zxwgp", "正向无功平电量 ", "0104"),
    fxygz("01040015", "fxygz", "反向有功总电量 ", "0104"),
    fxygj("01040016", "fxygj", "反向有功尖电量 ", "0104"),
    fxygf("01040017", "fxygf", "反向有功峰电量 ", "0104"),
    fxygg("01040018", "fxygg", "反向有功谷电量 ", "0104"),
    fxygp("01040019", "fxygp", "反向有功平电量 ", "0104"),
    fxwgz("01040020", "fxwgz", "反向无功总电量 ", "0104"),
    fxwgj("01040021", "fxwgj", "反向无功尖电量 ", "0104"),
    fxwgf("01040022", "fxwgf", "反向无功峰电量 ", "0104"),
    fxwgg("01040023", "fxwgg", "反向无功谷电量 ", "0104"),
    fxwgp("01040024", "fxwgp", "反向无功平电量 ", "0104");


    /**
     * 获取指标编码
     */
    private String indBNo;

    /**
     * 获取指标符号
     */
    private String symbol;

    /**
     * 获取指标名称
     */
    private String name;
    /**
     * 获取指标分类
     */
    private String classify;

    Index(String indBNo, String symbol, String name, String classify) {
        this.indBNo = indBNo;
        this.symbol = symbol;
        this.name = name;
        this.classify = classify;
    }

    /**
     * 获取指标编码
     *
     * @return
     */
    @JsonValue
    public String getIndBNo() {
        return indBNo;
    }

    /**
     * 获取指标符号
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * 获取指标名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 获取指标分类
     *
     * @return
     */
    public String getClassify() {
        return classify;
    }


    /**
     * 通过编号获取 Index
     *
     * @param value
     * @return
     */
    public static Index parse(String value) {
        Index find = null;
        Index[] indexes = values();
        for (Index index : indexes) {
            if (index.getIndBNo().equals(value)) {
                find = index;
                break;
            }
        }
        return find;
    }

    /**
     * 判断指标编号是否存在，并转化成 Index[]数组形式
     *
     * @param values
     * @return
     */
    public static Index[] parseOf(String values) {
        if (StringUtils.isEmpty(values)) return null;
        List<Index> newIndexes = new ArrayList();
        Index[] indexes = values();
        String[] valueses = values.split(",");
        boolean isExist = false; //判断指标编号是否存在，不存在则抛异常
        for (String value : valueses) {
            for (Index index : indexes) {
                if (index.getIndBNo().equals(value)) {
                    newIndexes.add(index);
                    isExist = true;
                    break;
                }
            }
            Assert.isFalse(isExist, "该指标编号不存在");
//            if (!isExist) {
//                throw new VenusResponseException(value + ":该指标编号不存在");
//            }
            isExist = false;
        }
        return newIndexes.toArray(new Index[0]);
    }


}
