package com.sixth.springboot.entity;

import java.io.Serializable;

/**
 * t_female_health_form
 * @author 
 */
public class FemaleHealthForm implements Serializable {
    private Integer id;

    private Integer empId;

    private String heart;

    private String liver;

    private String spleen;

    private String lung;

    private String kidney;

    private String uterus;

    private String note;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getHeart() {
        return heart;
    }

    public void setHeart(String heart) {
        this.heart = heart;
    }

    public String getLiver() {
        return liver;
    }

    public void setLiver(String liver) {
        this.liver = liver;
    }

    public String getSpleen() {
        return spleen;
    }

    public void setSpleen(String spleen) {
        this.spleen = spleen;
    }

    public String getLung() {
        return lung;
    }

    public void setLung(String lung) {
        this.lung = lung;
    }

    public String getKidney() {
        return kidney;
    }

    public void setKidney(String kidney) {
        this.kidney = kidney;
    }

    public String getUterus() {
        return uterus;
    }

    public void setUterus(String uterus) {
        this.uterus = uterus;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        FemaleHealthForm other = (FemaleHealthForm) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEmpId() == null ? other.getEmpId() == null : this.getEmpId().equals(other.getEmpId()))
            && (this.getHeart() == null ? other.getHeart() == null : this.getHeart().equals(other.getHeart()))
            && (this.getLiver() == null ? other.getLiver() == null : this.getLiver().equals(other.getLiver()))
            && (this.getSpleen() == null ? other.getSpleen() == null : this.getSpleen().equals(other.getSpleen()))
            && (this.getLung() == null ? other.getLung() == null : this.getLung().equals(other.getLung()))
            && (this.getKidney() == null ? other.getKidney() == null : this.getKidney().equals(other.getKidney()))
            && (this.getUterus() == null ? other.getUterus() == null : this.getUterus().equals(other.getUterus()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEmpId() == null) ? 0 : getEmpId().hashCode());
        result = prime * result + ((getHeart() == null) ? 0 : getHeart().hashCode());
        result = prime * result + ((getLiver() == null) ? 0 : getLiver().hashCode());
        result = prime * result + ((getSpleen() == null) ? 0 : getSpleen().hashCode());
        result = prime * result + ((getLung() == null) ? 0 : getLung().hashCode());
        result = prime * result + ((getKidney() == null) ? 0 : getKidney().hashCode());
        result = prime * result + ((getUterus() == null) ? 0 : getUterus().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", empId=").append(empId);
        sb.append(", heart=").append(heart);
        sb.append(", liver=").append(liver);
        sb.append(", spleen=").append(spleen);
        sb.append(", lung=").append(lung);
        sb.append(", kidney=").append(kidney);
        sb.append(", uterus=").append(uterus);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}