package org.my.group.infrastructure;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import javax.enterprise.context.ApplicationScoped;
import org.my.group.domain.Product;

@ApplicationScoped
public class ProductRepository implements PanacheRepository<Product> {
}
