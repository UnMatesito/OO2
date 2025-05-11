package ej17;

import java.util.Collection;
import java.util.List;

public class DatabaseAccessProxy implements DatabaseAccess {
    private DatabaseRealAccess db;
    private User user;

    public DatabaseAccessProxy(User user) {
        super();
        this.user = user;
        this.db = new DatabaseRealAccess();
    }

    @Override
    public Collection<String> getSearchResults(String queryString) {
        if (!this.user.isAuthenticated()) {
            throw new SecurityException("No se puede acceder a la base de datos");
        }
        return db.getSearchResults(queryString);
    }

    @Override
    public int insertNewRow(List<String> rowData) {
        if (!this.user.isAuthenticated()) {
            throw new SecurityException("No se puede acceder a la base de datos");
        }
        return db.insertNewRow(rowData);
    }
}
