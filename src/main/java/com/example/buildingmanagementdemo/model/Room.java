package com.example.buildingmanagementdemo.model;

import java.math.BigDecimal;

public class Room {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rooms.id
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rooms.building_id
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    private Integer buildingId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rooms.floor
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    private Integer floor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rooms.room_no
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    private String roomNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rooms.name
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rooms.area
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    private BigDecimal area;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rooms.usable_area
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    private BigDecimal usableArea;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rooms.orientation
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    private String orientation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rooms.department
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    private String department;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rooms.purpose
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    private String purpose;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rooms.bed_count
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    private Integer bedCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rooms.thumbnail
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    private String thumbnail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rooms.structure_image
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    private String structureImage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rooms.notes
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    private String notes;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rooms.id
     *
     * @return the value of rooms.id
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rooms.id
     *
     * @param id the value for rooms.id
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rooms.building_id
     *
     * @return the value of rooms.building_id
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    public Integer getBuildingId() {
        return buildingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rooms.building_id
     *
     * @param buildingId the value for rooms.building_id
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rooms.floor
     *
     * @return the value of rooms.floor
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    public Integer getFloor() {
        return floor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rooms.floor
     *
     * @param floor the value for rooms.floor
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rooms.room_no
     *
     * @return the value of rooms.room_no
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    public String getRoomNo() {
        return roomNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rooms.room_no
     *
     * @param roomNo the value for rooms.room_no
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo == null ? null : roomNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rooms.name
     *
     * @return the value of rooms.name
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rooms.name
     *
     * @param name the value for rooms.name
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rooms.area
     *
     * @return the value of rooms.area
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    public BigDecimal getArea() {
        return area;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rooms.area
     *
     * @param area the value for rooms.area
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    public void setArea(BigDecimal area) {
        this.area = area;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rooms.usable_area
     *
     * @return the value of rooms.usable_area
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    public BigDecimal getUsableArea() {
        return usableArea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rooms.usable_area
     *
     * @param usableArea the value for rooms.usable_area
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    public void setUsableArea(BigDecimal usableArea) {
        this.usableArea = usableArea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rooms.orientation
     *
     * @return the value of rooms.orientation
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rooms.orientation
     *
     * @param orientation the value for rooms.orientation
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    public void setOrientation(String orientation) {
        this.orientation = orientation == null ? null : orientation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rooms.department
     *
     * @return the value of rooms.department
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    public String getDepartment() {
        return department;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rooms.department
     *
     * @param department the value for rooms.department
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rooms.purpose
     *
     * @return the value of rooms.purpose
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rooms.purpose
     *
     * @param purpose the value for rooms.purpose
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose == null ? null : purpose.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rooms.bed_count
     *
     * @return the value of rooms.bed_count
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    public Integer getBedCount() {
        return bedCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rooms.bed_count
     *
     * @param bedCount the value for rooms.bed_count
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    public void setBedCount(Integer bedCount) {
        this.bedCount = bedCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rooms.thumbnail
     *
     * @return the value of rooms.thumbnail
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rooms.thumbnail
     *
     * @param thumbnail the value for rooms.thumbnail
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail == null ? null : thumbnail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rooms.structure_image
     *
     * @return the value of rooms.structure_image
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    public String getStructureImage() {
        return structureImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rooms.structure_image
     *
     * @param structureImage the value for rooms.structure_image
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    public void setStructureImage(String structureImage) {
        this.structureImage = structureImage == null ? null : structureImage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rooms.notes
     *
     * @return the value of rooms.notes
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    public String getNotes() {
        return notes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rooms.notes
     *
     * @param notes the value for rooms.notes
     *
     * @mbg.generated Sat Jul 13 14:41:29 CST 2024
     */
    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }
}