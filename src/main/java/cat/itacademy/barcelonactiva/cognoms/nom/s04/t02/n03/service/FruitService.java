package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.domain.Fruit;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.exception.FruitEmptyException;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.exception.FruitNoFoundException;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.exception.FruitsIsEmptyException;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.repository.FruitRepository;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.util.ErrorMesssage;


@Service
public class FruitService implements FruitServiceInterface {
	
	@Autowired
	private FruitRepository fruits;
	
	@Override
	public Fruit createFruit (Fruit fruit) throws FruitEmptyException {
		if (fruit.getName().isEmpty() || fruit.getName().isBlank() || (fruit.getKilos() <= 0)) {
			throw new FruitEmptyException(ErrorMesssage.EMPTY_RESOURCE);
		} else {
		return fruits.save(fruit);
		}
	} 
	
	@Override
	public void deleteFruit (int id) throws FruitNoFoundException {
		Optional<Fruit> optionalFruit = fruits.findById(id);
		if (optionalFruit.isEmpty()) {
			throw new FruitNoFoundException(ErrorMesssage.NOT_FOUND);
		} else {
			fruits.deleteById(id);
		}
	}
	
	@Override
	public Fruit getOneFruitById (int id) throws FruitNoFoundException {
		Optional<Fruit> optionalFruit = fruits.findById(id);
		if (optionalFruit.isEmpty()) {
			throw new FruitNoFoundException(ErrorMesssage.NOT_FOUND);
		}
		return optionalFruit.get();
		
	}
	
	@Override
	public List<Fruit> getAllFruits () throws FruitsIsEmptyException {
		if (fruits.findAll().isEmpty()) {
			throw new FruitsIsEmptyException(ErrorMesssage.NO_CONTENT); 
		} else {
			return fruits.findAll();
		}
	}
}
