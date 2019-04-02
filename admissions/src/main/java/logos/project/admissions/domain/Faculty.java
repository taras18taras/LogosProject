package logos.project.admissions.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "faculty")
public class Faculty {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column
	private String name;
	@Column
	private Integer passing_score;
	@Column
	private Integer total_number_of_places;
	@Column
	private Integer number_free;
	@Column
	private Integer number_paid;

	public Faculty() {
	}

	public Faculty(Integer id, String name,Integer passing_score,Integer total_number_of_places,Integer number_free,Integer number_paid ) {
		this.id = id;
		this.name = name;
		this.passing_score = passing_score;
		this.total_number_of_places = total_number_of_places;
		this.number_free = number_free;
		this.number_paid = number_paid;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPassing_score() {
		return passing_score;
	}

	public void setPassing_score(Integer passing_score) {
		this.passing_score = passing_score;
	}

	public Integer getTotal_number_of_places() {
		return total_number_of_places;
	}

	public void setTotal_number_of_places(Integer total_number_of_places) {
		this.total_number_of_places = total_number_of_places;
	}

	public Integer getNumber_free() {
		return number_free;
	}

	public void setNumber_free(Integer number_free) {
		this.number_free = number_free;
	}

	public Integer getNumber_paid() {
		return number_paid;
	}

	public void setNumber_paid(Integer number_paid) {
		this.number_paid = number_paid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number_free == null) ? 0 : number_free.hashCode());
		result = prime * result + ((number_paid == null) ? 0 : number_paid.hashCode());
		result = prime * result + ((passing_score == null) ? 0 : passing_score.hashCode());
		result = prime * result + ((total_number_of_places == null) ? 0 : total_number_of_places.hashCode());
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
		Faculty other = (Faculty) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number_free == null) {
			if (other.number_free != null)
				return false;
		} else if (!number_free.equals(other.number_free))
			return false;
		if (number_paid == null) {
			if (other.number_paid != null)
				return false;
		} else if (!number_paid.equals(other.number_paid))
			return false;
		if (passing_score == null) {
			if (other.passing_score != null)
				return false;
		} else if (!passing_score.equals(other.passing_score))
			return false;
		if (total_number_of_places == null) {
			if (other.total_number_of_places != null)
				return false;
		} else if (!total_number_of_places.equals(other.total_number_of_places))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + ", passing_score=" + passing_score + ", total_number_of_places="
				+ total_number_of_places + ", number_free=" + number_free + ", number_paid=" + number_paid + "]";
	}

	
	
}

