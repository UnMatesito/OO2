package oo2.ej2.parteA.punto1;

import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

public class DatabaseAccessProxy implements DatabaseAccess {
    private DatabaseRealAccess db;
    private User user;
    private Logger logger;

    public DatabaseAccessProxy(User user) {
        super();
        this.user = user;
        logger = Logger.getLogger(this.getClass().getName());
        this.db = new DatabaseRealAccess();
    }

    @Override
    public Collection<String> getSearchResults(String queryString) {
        if (!this.user.isAuthenticated()) {
            logger.info("No se puede acceder a la base de datos");
        }
        return db.getSearchResults(queryString);
    }

    @Override
    public int insertNewRow(List<String> rowData) {
        if (!this.user.isAuthenticated()) {
            logger.warning("No se puede acceder a la base de datos");
        }
        return db.insertNewRow(rowData);
    }

    public boolean accessDatabase(){
        if (!this.user.isAuthenticated()) {
            logger.severe("No se puede acceder a la base de datos");
            return false;
        }
        return true;
    }
}
