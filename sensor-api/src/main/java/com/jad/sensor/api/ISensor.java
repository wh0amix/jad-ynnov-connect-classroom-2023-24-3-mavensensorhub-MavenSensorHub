package com.jad.sensor.api;
import com.jad.shared.model.SensorData;
import com.jad.shared.model.SensorType;
public interface ISensor {
    SensorType getSensorType();
    SensorData getSensorData();
}
