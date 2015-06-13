package com.azouz.goeuro.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author azouz
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CityLocation {

    private int _id;
    private String name;
    private String type;
    private GEOPosition geoPosition;

    public CityLocation() {
    }

    /**
     * @return the _id
     */
    @JsonProperty("_id")
    public int getId() {
        return _id;
    }

    /**
     * @param id the _id to set
     */
    public void setId(int id) {
        this._id = id;
    }

    /**
     * @return the name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the geoPosition
     */
    @JsonProperty("geo_position")
    public GEOPosition getGeoPosition() {
        return geoPosition;
    }

    /**
     * @param geoPosition the geoPosition to set
     */
    public void setGeoPosition(GEOPosition geoPosition) {
        this.geoPosition = geoPosition;
    }

    private class GEOPosition {

        private double latitude;
        private double longitude;

        public GEOPosition() {
        }

        /**
         * @return the latitude
         */
        @JsonProperty("latitude")
        public double getLatitude() {
            return latitude;
        }

        /**
         * @param latitude the latitude to set
         */
        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        /**
         * @return the longitude
         */
        @JsonProperty("longitude")
        public double getLongitude() {
            return longitude;
        }

        /**
         * @param longitude the longitude to set
         */
        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

    }

    @Override
    public String toString() {
        return _id + "," + name + "," + type + "," + geoPosition.getLatitude() + "," + geoPosition.getLongitude();
    }

}
