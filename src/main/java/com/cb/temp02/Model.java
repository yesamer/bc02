package com.cb.temp02;

import java.util.Map;
import java.util.List;

public class Model implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private Map<String, String> mapField;
    private String stringField;
    private List<String> listField;
    
    public Model(){}
    
    public Model(Map<String, String> mapField, String stringField, List<String> listField) {
        this.mapField = mapField;
        this.stringField = stringField;
        this.listField = listField;
    }
    
    public void setMapField(Map<String, String> mapField) {
        this.mapField = mapField;
    }
    
    public Map<String, String> getMapField() {
        return mapField;
    }
    
    public Model mapField(Map<String, String> mapField) {
        this.mapField = mapField;
        return this;
    } 
    
    public void setStringField(String stringField) {
        this.stringField = stringField;
    }
    
    public String getStringField() {
        return stringField;
    }
    
    public Model stringField(String stringField) {
        this.stringField = stringField;
        return this;
    } 

    public void setListField(List<String> listField) {
        this.listField = listField;
    }
    
    public List<String> getListField() {
        return listField;
    }
    
    public Model listField(List<String> listField) {
        this.listField = listField;
        return this;
    }


}