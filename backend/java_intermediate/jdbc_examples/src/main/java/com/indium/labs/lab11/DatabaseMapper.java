package com.indium.labs.lab11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseMapper {
    public List<Object> mapResultSetToObjects(ResultSet rs, Class cls) throws SQLException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        List<Object> lst = new ArrayList<>();
        // For now, the assumption is variable name and column name are same
        // For now, the assumption is the class follows a convention (private variables public getters/setters)
        Field[] fields = cls.getDeclaredFields();

        while (rs.next()) {
            Constructor constructor = cls.getConstructor();
            Object targetObject = constructor.newInstance();
            for (Field field : fields) {
                field.setAccessible(true);
                DbColumn dbColumn = field.getAnnotation(DbColumn.class);
                String fieldName = field.getName();
                if(dbColumn == null) {
                    Object columnValue = rs.getObject(fieldName);
                    if(field.getType() == double.class) {
                        BigDecimal columnValueInBigDecimal = rs.getBigDecimal(fieldName);
                        field.set(targetObject, columnValueInBigDecimal.doubleValue());
                    } else {
                        field.set(targetObject, columnValue);
                    }
                } else {
                    String columnName = dbColumn.name();
                    Object columnValue = rs.getObject(columnName);
                    if(field.getType() == double.class) {
                        BigDecimal columnValueInBigDecimal = rs.getBigDecimal(fieldName);
                        field.set(targetObject, columnValueInBigDecimal.doubleValue());
                    } else {
                        field.set(targetObject, columnValue);
                    }
                }
            }
            lst.add(targetObject);
        }
        return lst;
    }
}
