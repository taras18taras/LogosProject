package logos.project.admissions.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "applicant")
public class Applicant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column
	private String first_name;
	@Column
	private String second_name;
	@Column
	private String last_name;

	@Lob
	private String  encodedImage;

	public Applicant() {
	}

	
	public String getEncodedImage() {
		return encodedImage;
	}


	public void setEncodedImage(String string) {
		this.encodedImage = string;
	}


	public Applicant(Integer id, String first_name, String second_name,String last_name ) {
		this.id = id;
		this.first_name = first_name;
		this.second_name = second_name;
		this.last_name = last_name;
		
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getSecond_name() {
		return second_name;
	}


	public void setSecond_name(String second_name) {
		this.second_name = second_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((encodedImage == null) ? 0 : encodedImage.hashCode());
		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
		result = prime * result + ((second_name == null) ? 0 : second_name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Applicant other = (Applicant) obj;
		if (encodedImage == null) {
			if (other.encodedImage != null)
				return false;
		} else if (!encodedImage.equals(other.encodedImage))
			return false;
		if (first_name == null) {
			if (other.first_name != null)
				return false;
		} else if (!first_name.equals(other.first_name))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (last_name == null) {
			if (other.last_name != null)
				return false;
		} else if (!last_name.equals(other.last_name))
			return false;
		if (second_name == null) {
			if (other.second_name != null)
				return false;
		} else if (!second_name.equals(other.second_name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Applicant [id=" + id + ", first_name=" + first_name + ", second_name=" + second_name + ", last_name="
				+ last_name + ", encodedImage=" + encodedImage + "]";
	}





	
	
}
