package generator;

/**
 * @author 苏博
 * @version V1.2.0
 * @company lhfinance.com
 * @className: WordModel.java
 * @package com.lihfinance.fdp.model
 * @description: TODO 接收Excel文件中的字段
 * @date 2019/3/12 15:40
 */
public class WordModel {

    public WordModel(String logicalName, String physicalName, String type, String length, String notNull, String description, String decimal) {
        this.logicalName = logicalName;
        this.physicalName = physicalName;
        this.type = type;
        this.length = length;
        this.notNull = notNull;
        this.description = description;
        this.decimal = decimal;
    }

    //中文名
    private String logicalName;

    //字段名
    private String physicalName;

    //字段类型
    private String type;

    //长度
    private String length;

    //是否可空 false可空 true不可空
    private String notNull;

    //描述注释
    private String description;

    //精确度
    private String decimal;

    public String getLogicalName() {
        return logicalName;
    }

    public void setLogicalName(String logicalName) {
        this.logicalName = logicalName;
    }

    public String getPhysicalName() {
        return physicalName;
    }

    public void setPhysicalName(String physicalName) {
        this.physicalName = physicalName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getNotNull() {
        return notNull;
    }

    public void setNotNull(String notNull) {
        this.notNull = notNull;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDecimal() {
        return decimal;
    }

    public void setDecimal(String decimal) {
        this.decimal = decimal;
    }

    @Override
    public String toString() {
        return "WordModel{" +
                "logicalName='" + logicalName + '\'' +
                ", physicalName='" + physicalName + '\'' +
                ", type='" + type + '\'' +
                ", length='" + length + '\'' +
                ", notNull='" + notNull + '\'' +
                ", description='" + description + '\'' +
                ", decimal='" + decimal + '\'' +
                '}';
    }
}
