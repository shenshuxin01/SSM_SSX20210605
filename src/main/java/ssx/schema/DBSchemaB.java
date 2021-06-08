package ssx.schema;

import java.io.Serializable;

public class DBSchemaB implements Serializable {
    private int id;
    private String name;

    public DBSchemaB(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public DBSchemaB() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
