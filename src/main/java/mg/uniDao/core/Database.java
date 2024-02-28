package mg.uniDao.core;

import mg.uniDao.exception.DaoException;
import mg.uniDao.exception.DatabaseException;

import java.util.List;

public interface Database {
     void loadDriver() throws DatabaseException;
     Service connect(boolean transaction) throws DatabaseException, DaoException;
     Service connect() throws DatabaseException, DaoException;
     void create(Service service, Object object) throws DaoException;

     boolean exists(Service service, Class<?> className, String condition) throws DaoException;
     boolean exists(Service service, Object conditionObject) throws DaoException;
     boolean existsById(Service service, Class<?> className, String id) throws DaoException;

     void createOrUpdate(Service service, Object object) throws DaoException;

     <T> List<T> findList(Service service, Class<T> className, String condition, int page, int limit,
                          String... joins) throws DaoException;
     <T> List<T> findList(Service service, Class<T> className, int page, int limit, String... joins) throws DaoException;
     <T> List<T> findList(Service service, Class<T> className, String... joins) throws DaoException;

     <T> T find(Service service, Class<?> className, Object conditionObject, String condition, String... joins)
             throws DaoException;
     <T> T find(Service service, Object condition, String... joins) throws DaoException;
     <T> T find(Service service, Class<?> className, String condition, String... joins) throws DaoException;
     <T> T findById(Service service, Class<?> className, String id, String... joins) throws DaoException;

     void update(Service service, Object object, Object conditionObject, String condition)
             throws DaoException;
     void update(Service service, Object object, String condition) throws DaoException;
     void update(Service service, Object object, Object conditionObject) throws DaoException;
     void updateById(Service service, Object object, String id) throws DaoException;

     void delete(Service service, Class<?> className, Object conditionObject, String condition) throws DaoException;
     void delete(Service service, Object conditionObject) throws DaoException;
     void delete(Service service, Class<?> className, String condition) throws DaoException;
     void deleteById(Service service, Class<?> className, String id) throws DaoException;

     String getNextSequenceValue(Service service, String sequenceName)
             throws DaoException;
     void createCollection(Service service, Class<?> objectClass) throws DaoException,
             DatabaseException;
}
