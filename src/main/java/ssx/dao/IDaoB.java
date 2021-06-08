package ssx.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import ssx.schema.DBSchemaB;

@Repository
public interface IDaoB {
    @Insert("insert into third_ssm_tab(name)  values(#{name})")
    void add(DBSchemaB schemaB);

    @Select("select * from third_ssm_tab where id=#{id}")
    DBSchemaB query(int id);
}
