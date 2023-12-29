package cat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n03.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n03.domain.Fruit;

public interface FruitRepository extends MongoRepository<Fruit, Integer> {

}
