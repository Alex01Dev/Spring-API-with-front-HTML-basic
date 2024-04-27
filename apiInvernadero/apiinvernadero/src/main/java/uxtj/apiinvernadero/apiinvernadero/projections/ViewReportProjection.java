package uxtj.apiinvernadero.apiinvernadero.projections;

import java.util.Date;

public interface ViewReportProjection {
    Long getId_report();
    String getDate();
    String getTime();
    String getReportations();
}