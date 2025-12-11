package com.jad.data.api;
import com.jad.shared.model.SensorData;
import com.jad.shared.model.SensorType;
import java.util.List;
public interface IDataStorage {
    List<SensorData> getAllStoredData();
    List<SensorData> getAllDataBySensorType(SensorType sensorType);
}
