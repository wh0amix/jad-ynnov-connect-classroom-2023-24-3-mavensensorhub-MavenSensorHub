package com.jad.data.api;
import com.jad.sensor.api.ISensor;
import com.jad.shared.model.SensorData;
import java.util.List;
public interface IDataManager extends IDataProcessor {
    void addDataCollector(ISensor sensor);
    void collectAndStoreData();
    List<SensorData> getAllData();
}
