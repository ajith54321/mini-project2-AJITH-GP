package MiniProject2_MS_SportsProduct.Entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sports_product")
public class SportsProductEntity {

	@Id
	int id;
	String product_name;
	int cost;
	String decsription;

	public SportsProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SportsProductEntity(int id, String product_name, int cost, String decsription) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.cost = cost;
		this.decsription = decsription;
	}
	@Override
	public String toString() {
		return "SportsProductEntity [id=" + id + ", product_name=" + product_name + ", cost=" + cost + ", decsription="
				+ decsription + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getDecsription() {
		return decsription;
	}
	public void setDecsription(String decsription) {
		this.decsription = decsription;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cost, decsription, id, product_name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SportsProductEntity other = (SportsProductEntity) obj;
		return cost == other.cost && Objects.equals(decsription, other.decsription) && id == other.id
				&& Objects.equals(product_name, other.product_name);
	}
	
}
