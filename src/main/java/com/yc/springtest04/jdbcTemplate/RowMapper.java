package com.yc.springtest04.jdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface RowMapper<T> {
    /**
     * 对第i行的ResultSet  转换成  T对象  这个具体的实现由用户完成
     * @param rs
     * @param i
     * @return
     */
    public T mapper(ResultSet rs, int i  )throws SQLException;
}
