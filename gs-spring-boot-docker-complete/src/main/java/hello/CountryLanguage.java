package hello;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country_language")
public class CountryLanguage {

	private String countryCode;
	private String language;
	private boolean is_official;
	private double percentage;
	
	@Id
	@Column(name="country_code")
	public String getCountryCode() {
		return countryCode;
	}
	
	@Column(name="language")
	public String getLanguage() {
		return language;
	}
	
	@Column(name="is_official")
	public boolean isIs_official() {
		return is_official;
	}
	
	@Column(name="percentage")
	public double getPercentage() {
		return percentage;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setIs_official(boolean is_official) {
		this.is_official = is_official;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	
}
