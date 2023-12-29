package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="fruit")
public class Fruit {
	
	private int id;
	private String name;
	private int kilograms;
	
	public Fruit() {
		
	}

	public Fruit(String name, int kilos) {
		this.name = name;
		this.kilograms = kilos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKilos() {
		return kilograms;
	}

	public void setKilos(int kilos) {
		this.kilograms = kilos;
	}

	@Override
	public String toString() {
		return "Fruit [id=" + id + ", name=" + name + ", kilos=" + kilograms + "]";
	}

}
