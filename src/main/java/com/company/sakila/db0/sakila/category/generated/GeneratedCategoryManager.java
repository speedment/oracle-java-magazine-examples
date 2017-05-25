package com.company.sakila.db0.sakila.category.generated;

import com.company.sakila.db0.sakila.category.Category;
import com.speedment.runtime.core.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;

/**
 * The generated base interface for the manager of every {@link
 * com.company.sakila.db0.sakila.category.Category} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedCategoryManager extends Manager<Category> {
    
    @Override
    default Class<Category> getEntityClass() {
        return Category.class;
    }
}