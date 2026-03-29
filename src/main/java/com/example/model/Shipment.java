package com.example.model;

public class Shipment extends BaseEntity {
    private Order order;
    private String trackingNumber;
    private String carrier;
    private ShipmentStatus status;
    private Address destination;

    public Shipment() {
        this.status = ShipmentStatus.PREPARING;
    }

    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }
    public String getTrackingNumber() { return trackingNumber; }
    public void setTrackingNumber(String trackingNumber) { this.trackingNumber = trackingNumber; }
    public String getCarrier() { return carrier; }
    public void setCarrier(String carrier) { this.carrier = carrier; }
    public ShipmentStatus getStatus() { return status; }
    public void setStatus(ShipmentStatus status) { this.status = status; }
    public Address getDestination() { return destination; }
    public void setDestination(Address destination) { this.destination = destination; }
}
