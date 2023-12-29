package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.service;

import java.util.List;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.domain.Fruit;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.exception.FruitEmptyException;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.exception.FruitNoFoundException;

public interface FruitServiceInterface {
	
	public Fruit createFruit (Fruit fruit) throws FruitEmptyException;
	public void deleteFruit (int id) throws FruitNoFoundException;
	public Fruit getOneFruitById (int id) throws FruitNoFoundException;
	public List<Fruit> getAllFruits ();
}