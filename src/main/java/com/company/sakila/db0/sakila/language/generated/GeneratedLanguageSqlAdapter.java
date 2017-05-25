package com.company.sakila.db0.sakila.language.generated;

import com.company.sakila.db0.sakila.language.Language;
import com.company.sakila.db0.sakila.language.LanguageImpl;
import com.speedment.common.injector.annotation.ExecuteBefore;
import com.speedment.common.injector.annotation.WithState;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.annotation.GeneratedCode;
import com.speedment.runtime.core.component.sql.SqlPersistenceComponent;
import com.speedment.runtime.core.component.sql.SqlStreamSupplierComponent;
import com.speedment.runtime.core.exception.SpeedmentException;
import java.sql.ResultSet;
import java.sql.SQLException;
import static com.speedment.common.injector.State.RESOLVED;

/**
 * The generated Sql Adapter for a {@link
 * com.company.sakila.db0.sakila.language.Language} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedLanguageSqlAdapter {
    
    private final TableIdentifier<Language> tableIdentifier;
    
    protected GeneratedLanguageSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("db0", "sakila", "language");
    }
    
    @ExecuteBefore(RESOLVED)
    void installMethodName(@WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent, @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }
    
    protected Language apply(ResultSet resultSet) throws SpeedmentException {
        final Language entity = createEntity();
        try {
            entity.setLanguageId( resultSet.getShort(1)     );
            entity.setName(       resultSet.getString(2)    );
            entity.setLastUpdate( resultSet.getTimestamp(3) );
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }
    
    protected LanguageImpl createEntity() {
        return new LanguageImpl();
    }
}