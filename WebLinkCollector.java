/**
 * WebLinkCollector.java
 */
package com.bdisys.survey.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Nimish
 *
 */
@Entity
@Table(name="weblink_collector")
public class WebLinkCollector extends Collector {
	private String url;

	@Column(name="URL")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
