package com.trainings.entity;

public enum Devices {
    STOVE("Stove", "images/cook_stove.jpg", "Electrolux", 20),
    COFFEE_MACHINE("Coffee machine", "images/coffee_machine.jpg", "Delonghi", 7),
    WASHING_MACHINE("Washing machine", "images/washing.jpg", "Zanussi", 29),
    VACUUM("Vacuum cleaner", "images/vacuum.jpg", "Philips", 10),
    COMPUTER("Computer", "images/pc.jpg", "Apple", 6),
    TV("TV", "images/tv.jpg", "LG", 9),
    BLENDER("Blender", "images/blender.jpg", "BOSCH", 2);

    private final String type;
    private final String imgUrl;
    private final String manufacturer;
    private final int energyConsuming;

    Devices(String type, String imageURL, String manufacturer, int energyConsuming) {
        this.type = type;
        this.imgUrl = imageURL;
        this.manufacturer = manufacturer;
        this.energyConsuming = energyConsuming;
    }

    public String type() {
        return type;
    }

    public String imgUrl() {
        return imgUrl;
    }

    public String manufacturer() {
        return manufacturer;
    }

    public int energyConsuming() {
        return energyConsuming;
    }

    @Override
    public String toString() {
        return "Devices{" +
                "manufacturer='" + manufacturer + '\'' +
                ", energyConsuming=" + energyConsuming +
                '}';
    }
}
