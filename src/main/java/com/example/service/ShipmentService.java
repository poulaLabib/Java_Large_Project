package com.example.service;

import com.example.model.Shipment;
import com.example.model.ShipmentStatus;

public class ShipmentService {
    public Shipment createShipment(Shipment shipment) {
        shipment.setTrackingNumber("TRACK-" + System.currentTimeMillis());
        return shipment;
    }

    public Shipment updateStatus(Shipment shipment, ShipmentStatus status) {
        shipment.setStatus(status);
        shipment.markUpdated();
        return shipment;
    }
}
