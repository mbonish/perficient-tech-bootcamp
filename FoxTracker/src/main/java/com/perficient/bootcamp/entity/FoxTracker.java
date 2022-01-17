package com.perficient.bootcamp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="fox tracker")
public class FoxTracker {
@Id
@Column(name="FOX_TRACKER_ID")
private Integer foxTrackerId;

@Column(name="tagType")
private String tagType;

@Column(name="commonName")
private String commonName;

@Column(name="genusAndSpecies")
private String genusAndSpecies;

public Integer getFoxTrackerId() {
	return foxTrackerId;
}

public void setFoxTrackerId(Integer foxTrackerId) {
	this.foxTrackerId = foxTrackerId;
}

public String getTagType() {
	return tagType;
}

public void setTagType(String tagType) {
	this.tagType = tagType;
}

public String getCommonName() {
	return commonName;
}

public void setCommonName(String commonName) {
	this.commonName = commonName;
}

public String getGenusAndSpecies() {
	return genusAndSpecies;
}

public void setGenusAndSpecies(String genusAndSpecies) {
	this.genusAndSpecies = genusAndSpecies;
}


}
