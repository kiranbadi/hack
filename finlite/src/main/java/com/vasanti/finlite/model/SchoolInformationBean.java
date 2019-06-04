/**
 * 
 */
package com.vasanti.finlite.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author KIRAN
 *
 */

@Entity
@Table(name = "tbschoolinformation")
public class SchoolInformationBean {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    @ApiModelProperty(notes = "The database generated id")
    private Long id = 0L ;

    @NotEmpty(message="School Name cannot be Empty")
    @NotNull(message="School Name cannot be null")
    @Column(name="SCHOOLNAME",insertable=true, updatable=true)
    @ApiModelProperty(notes = "Valid School Name")
    private String schoolname;


    @NotEmpty(message="City cannot be Empty")
    @NotNull(message="City cannot be null")
    @Column(name="CITY",insertable=true, updatable=true)
    @ApiModelProperty(notes = "Valid City Detail")
    private String city;

    @NotEmpty(message="County cannot be Empty")
    @NotNull(message="County cannot be null")
    @Column(name="COUNTY",insertable=true, updatable=true)
    @ApiModelProperty(notes = "Valid County Details")
    private String county;


    @NotEmpty(message="State cannot be Empty")
    @NotNull(message="State cannot be null")
    @Column(name="STATE",insertable=true, updatable=true)
    @ApiModelProperty(notes = "Valid State Detail")
    private String state;
    
    
    @NotEmpty(message="Country cannot be Empty")
    @NotNull(message="Country cannot be null")
    @Column(name="COUNTRY",insertable=true, updatable=true)
    @ApiModelProperty(notes = "Valid State Detail")
    private String country;
    
    @NotEmpty(message="Zipcode cannot be Empty")
    @NotNull(message="Zipcode cannot be null")
    @Column(name="ZIPCODE",insertable=true, updatable=true)
    @ApiModelProperty(notes = "Valid Zipcode")
    private String zipcode;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the schoolname
	 */
	public String getSchoolname() {
		return schoolname;
	}

	/**
	 * @param schoolname the schoolname to set
	 */
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the county
	 */
	public String getCounty() {
		return county;
	}

	/**
	 * @param county the county to set
	 */
	public void setCounty(String county) {
		this.county = county;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(city, country, county, id, schoolname, state, zipcode);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof SchoolInformationBean)) {
			return false;
		}
		SchoolInformationBean other = (SchoolInformationBean) obj;
		return Objects.equals(city, other.city) && Objects.equals(country, other.country)
				&& Objects.equals(county, other.county) && Objects.equals(id, other.id)
				&& Objects.equals(schoolname, other.schoolname) && Objects.equals(state, other.state)
				&& Objects.equals(zipcode, other.zipcode);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SchoolInformationBean [id=" + id + ", schoolname=" + schoolname + ", city=" + city + ", county="
				+ county + ", state=" + state + ", country=" + country + ", zipcode=" + zipcode + "]";
	}

	
	

}
