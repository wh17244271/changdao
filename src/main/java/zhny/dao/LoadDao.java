package zhny.dao;

import org.apache.ibatis.annotations.Param;
import zhny.entity.Load;
import zhny.entity.SourceParam;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 * 获取
 */
public interface LoadDao {

    /**
     * 获取一个区域总负荷
     *
     * @return
     */
    Load getAreaLoad(@Param("param") SourceParam param,@Param("isLoad")boolean isLoad);

    /**
     * 查询一个区域所有的用电
     *
     * @param param
     * @return
     */
    Load getAreaPower(SourceParam param);

    /**
     * 获取测点某天数据
     *
     * @param consNo
     * @param mpId
     * @param date
     * @return
     */
    Load getDayLoad(@Param( "consNo" ) String consNo,
                    @Param( "mpId" ) String mpId,
                    @Param( "date" ) LocalDate date,
                    @Param( "indBNo" ) String indBNo,
                    @Param( "isLoad" ) boolean isLoad);


    /**
     * 获取用户或者测点的日用电量
     * @param consNo
     * @param mpId
     * @param date
     * @param indBNo
     * @return
     */
    Load getDayElecData(@Param( "consNo" ) String consNo,
                        @Param( "mpId" ) String mpId,
                        @Param( "date" ) LocalDate date,
                        @Param( "indBNo" ) String indBNo);


    /**
     * 获取某天点位数据
     *
     * @param consNo
     * @param mpId
     * @param date
     * @param indBNo
     * @param isLoad
     * @return
     */
    List<Map<String, Object>> getDayLoadPoint(@Param( "consNo" ) String consNo,
                                              @Param( "mpId" ) String mpId,
                                              @Param( "date" ) LocalDate date,
                                              @Param( "indBNo" ) String indBNo,
                                              @Param( "isLoad" ) boolean isLoad);
}
