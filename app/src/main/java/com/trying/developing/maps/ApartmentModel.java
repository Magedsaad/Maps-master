package com.trying.developing.maps;

/**
 * Created by developing on 4/24/2018.
 */

class ApartmentModel {

    public Double  lat  ;
    public Double lng  ;
    public  String  size  ;
    public  String phoneNumber ;
    public  String address ;
    String price;
    String desc;


    public ApartmentModel(Double lat, Double lng, String size, String phoneNumber, String address, String price, String desc) {
        this.lat = lat;
        this.lng = lng;
        this.size = size;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.price = price;
        this.desc = desc;
    }

    public ApartmentModel() {
    }

    public double getLat() { return lat;}

    public void setLat(double lat) {
        this.lat = lat;
    }
    public double getLng() { return lng;}

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLats(Double lat) {
        this.lat = lat;
    }

    public void setLngs(Double lng) {
        this.lng = lng;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "ApartmentModel{" +
                "lat=" + lat +
                ", lng=" + lng +
                ", size='" + size + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", price='" + price + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
