package com.jad.sensor.api;
import com.jad.shared.model.SensorType;
public interface ISensorFactory {
    ISensor make(SensorType sensorType);
}
