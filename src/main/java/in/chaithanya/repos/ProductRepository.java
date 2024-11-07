package in.chaithanya.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import in.chaithanya.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
