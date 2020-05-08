package zhny.entity;

import java.time.LocalDate;

public class SourceParam {
    private String dataSource;
    private String indBNo;
    private LocalDate dataDate;
    private boolean isLoad;

    public SourceParam() {
    }

    public SourceParam(String dataSource, String indBNo, LocalDate dataDate) {
        this.dataSource = dataSource;
        this.indBNo = indBNo;
        this.dataDate = dataDate;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getIndBNo() {
        return indBNo;
    }

    public void setIndBNo(String indBNo) {
        this.indBNo = indBNo;
    }

    public LocalDate getDataDate() {
        return dataDate;
    }

    public void setDataDate(LocalDate dataDate) {
        this.dataDate = dataDate;
    }


}
