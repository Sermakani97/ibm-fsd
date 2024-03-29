package com.example.demo.data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Image {
	
	private Long imageId;
	private String description;
	private String url;
	public Image(Long imageId, String description, String url) {
		super();
		this.setImageId(imageId);
		this.setDescription(description);
		this.setUrl(url);
	}
	public Long getImageId() {
		return imageId;
	}
	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}