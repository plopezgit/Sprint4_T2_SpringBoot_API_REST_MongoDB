package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.domain.Fruit;

public interface FruitRepository extends MongoRepository<Fruit, Integer> {

}
