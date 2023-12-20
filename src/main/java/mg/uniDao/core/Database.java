package mg.uniDao.core;

import mg.uniDao.exception.DatabaseException;

import java.util.List;

public interface Database<T> {
     void loadDriver() throws DatabaseException;
     void verifyConnectionArguments(String... arguments) throws DatabaseException;
     Service<?> connect(String... arguments) throws DatabaseException;
     void createObject(Service<?> service, Object object);
     List<T> readAllObject(Service<?> service, String tableName, Class<?> className);
     T readObject(Service<?> service, String tableName, Class<?> className);
     void updateObject(Service<?> service, Object object);
}
