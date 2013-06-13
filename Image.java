/**
 * Image.java
 */
package com.bdisys.survey.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * @author Nimish
 *
 */
@Entity
@Table(name="image")
public class Image extends Question {
	private String imageName;
	private String imageDescription;
	@Lob
	@Column(name="IMAGE_DESCRIPTION")
	public String getImageDescription() {
		return imageDescription;
	}

	public void setImageDescription(String imageDescription) {
		this.imageDescription = imageDescription;
	}

	@Column(name="IMAGE_NAME")
	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	 
}
