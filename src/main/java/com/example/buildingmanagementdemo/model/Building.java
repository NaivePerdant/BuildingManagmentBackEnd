package com.example.buildingmanagementdemo.model;

import java.math.BigDecimal;
import java.util.Date;

public class Building {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column buildings.id
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column buildings.name
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column buildings.campus
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    private String campus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column buildings.property_cert_no
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    private String propertyCertNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column buildings.room_count
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    private Integer roomCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column buildings.building_area
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    private BigDecimal buildingArea;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column buildings.usable_area
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    private BigDecimal usableArea;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column buildings.floors_above_ground
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    private Integer floorsAboveGround;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column buildings.floors_below_ground
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    private Integer floorsBelowGround;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column buildings.location
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    private String location;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column buildings.build_year
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    private Date buildYear;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column buildings.register_time
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    private Date registerTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column buildings.department
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    private String department;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column buildings.purpose
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    private String purpose;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column buildings.id
     *
     * @return the value of buildings.id
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column buildings.id
     *
     * @param id the value for buildings.id
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column buildings.name
     *
     * @return the value of buildings.name
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column buildings.name
     *
     * @param name the value for buildings.name
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column buildings.campus
     *
     * @return the value of buildings.campus
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    public String getCampus() {
        return campus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column buildings.campus
     *
     * @param campus the value for buildings.campus
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    public void setCampus(String campus) {
        this.campus = campus == null ? null : campus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column buildings.property_cert_no
     *
     * @return the value of buildings.property_cert_no
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    public String getPropertyCertNo() {
        return propertyCertNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column buildings.property_cert_no
     *
     * @param propertyCertNo the value for buildings.property_cert_no
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    public void setPropertyCertNo(String propertyCertNo) {
        this.propertyCertNo = propertyCertNo == null ? null : propertyCertNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column buildings.room_count
     *
     * @return the value of buildings.room_count
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    public Integer getRoomCount() {
        return roomCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column buildings.room_count
     *
     * @param roomCount the value for buildings.room_count
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    public void setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column buildings.building_area
     *
     * @return the value of buildings.building_area
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    public BigDecimal getBuildingArea() {
        return buildingArea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column buildings.building_area
     *
     * @param buildingArea the value for buildings.building_area
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    public void setBuildingArea(BigDecimal buildingArea) {
        this.buildingArea = buildingArea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column buildings.usable_area
     *
     * @return the value of buildings.usable_area
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    public BigDecimal getUsableArea() {
        return usableArea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column buildings.usable_area
     *
     * @param usableArea the value for buildings.usable_area
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    public void setUsableArea(BigDecimal usableArea) {
        this.usableArea = usableArea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column buildings.floors_above_ground
     *
     * @return the value of buildings.floors_above_ground
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    public Integer getFloorsAboveGround() {
        return floorsAboveGround;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column buildings.floors_above_ground
     *
     * @param floorsAboveGround the value for buildings.floors_above_ground
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    public void setFloorsAboveGround(Integer floorsAboveGround) {
        this.floorsAboveGround = floorsAboveGround;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column buildings.floors_below_ground
     *
     * @return the value of buildings.floors_below_ground
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    public Integer getFloorsBelowGround() {
        return floorsBelowGround;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column buildings.floors_below_ground
     *
     * @param floorsBelowGround the value for buildings.floors_below_ground
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    public void setFloorsBelowGround(Integer floorsBelowGround) {
        this.floorsBelowGround = floorsBelowGround;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column buildings.location
     *
     * @return the value of buildings.location
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    public String getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column buildings.location
     *
     * @param location the value for buildings.location
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column buildings.build_year
     *
     * @return the value of buildings.build_year
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    public Date getBuildYear() {
        return buildYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column buildings.build_year
     *
     * @param buildYear the value for buildings.build_year
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    public void setBuildYear(Date buildYear) {
        this.buildYear = buildYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column buildings.register_time
     *
     * @return the value of buildings.register_time
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column buildings.register_time
     *
     * @param registerTime the value for buildings.register_time
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column buildings.department
     *
     * @return the value of buildings.department
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    public String getDepartment() {
        return department;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column buildings.department
     *
     * @param department the value for buildings.department
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column buildings.purpose
     *
     * @return the value of buildings.purpose
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column buildings.purpose
     *
     * @param purpose the value for buildings.purpose
     *
     * @mbg.generated Sat Jul 13 16:34:40 CST 2024
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose == null ? null : purpose.trim();
    }
}