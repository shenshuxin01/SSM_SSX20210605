package ssx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import ssx.dao.IDaoB;
import ssx.schema.DBSchemaB;

@Service
public class ServiceB {

    @Autowired
    IDaoB iDaoB;

    public void add(DBSchemaB schemaB){
        iDaoB.add(schemaB);
    }

    public DBSchemaB query(int id){
        return iDaoB.query(id);
    }

}
