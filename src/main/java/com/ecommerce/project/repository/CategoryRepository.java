package com.ecommerce.project.repository;

import com.ecommerce.project.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
//<type of entity, datatype of primary key>
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
