package in.chaithanya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.chaithanya.entity.Product;
import in.chaithanya.repos.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		ProductRepository productRepository=context.getBean(ProductRepository.class);
		
		Product p=new Product();
		p.setpId(100);
		p.setpName("spripadam");
		p.setpPrice(1100.00);
		productRepository.save(p);
	}

}
