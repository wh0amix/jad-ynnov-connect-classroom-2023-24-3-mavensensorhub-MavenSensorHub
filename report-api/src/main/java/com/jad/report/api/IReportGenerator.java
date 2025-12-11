package com.jad.report.api;
import com.jad.shared.model.SensorData;
import java.util.List;
public interface IReportGenerator {
    void generate(ReportType reportType, List<SensorData> data);
}
