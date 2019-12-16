package generator;

/**
 * @author 苏博
 * @version V1.2.0
 * @company lhfinance.com
 * @className: GeneratorConfig.java
 * @package com.lihfinance.fdp.config
 * @description:
 * @date 2019/3/7 14:02
 */
public class GeneratorConfig {

    public final static String FIILE_PATH = "/Users/joe/Downloads/erm";

    //Excel文件  (resources/info目录下)
    public final static String EXCEL_NAME = "cps_instra.xlsx";

    //文件结构体前缀
    public final static String ITEM_PREFIX = "Ant2";

    //dao和实现类前缀
    public final static String DAO_PREFIX = "TmFdpAnt2";

    //emr表名
    public final static String ERM_RIEFIX = "";

    //生成的erm文件名
    public final static String ERM_NAME = "cps_mysql_new.erm";

}
