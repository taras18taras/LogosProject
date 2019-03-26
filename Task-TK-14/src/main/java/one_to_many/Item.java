package one_to_many;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;

public class Item {

	private Integer id;
	private Integer itemId;
	private Integer itemTotal;
	private Integer quantity;
	private Set<Cart> carts = new HashSet<Cart>();

	public Item() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getItemTotal() {
		return itemTotal;
	}

	public void setItemTotal(Integer itemTotal) {
		this.itemTotal = itemTotal;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Set<Cart> getCarts() {
		return carts;
	}

	public void setCarts(Set<Cart> carts) {
		this.carts = carts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carts == null) ? 0 : carts.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
		result = prime * result + ((itemTotal == null) ? 0 : itemTotal.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
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
		Item other = (Item) obj;
		if (carts == null) {
			if (other.carts != null)
				return false;
		} else if (!carts.equals(other.carts))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (itemId == null) {
			if (other.itemId != null)
				return false;
		} else if (!itemId.equals(other.itemId))
			return false;
		if (itemTotal == null) {
			if (other.itemTotal != null)
				return false;
		} else if (!itemTotal.equals(other.itemTotal))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", itemId=" + itemId + ", itemTotal=" + itemTotal + ", quantity=" + quantity
				+ ", carts=" + carts + "]";
	}

	

}
