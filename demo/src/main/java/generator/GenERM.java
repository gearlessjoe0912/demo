package generator;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.List;
import java.util.Map;

/**
 * @author 苏博
 * @version V1.2.0
 * @company lhfinance.com
 * @className: GenERM.java
 * @package com.lihfinance.fdp.generator
 * @description: ERM文件生成类
 * @date 2019/3/8 17:19
 */
public class GenERM extends GenCommonInfo implements Generator{

    private final static String OUT_FLODER = "erm";

    @Override
    public String genFileName(String name) {
        return GeneratorConfig.ERM_NAME;
    }

    public void genertator() {
        try {
            //读取 excel Map<表名,字段集合>
            TESTExcelReader.readExcel(GeneratorConfig.EXCEL_NAME);
//            System.out.println("开始生成erm文件结构体");
//            StringBuilder erm = new StringBuilder();
//            this.genERM(erm,map);
//            String filePath = "src/main/resources/outPut/erm/cps_mysql_new.erm";
//            File f = new File(filePath);
//            Writer out =new FileWriter(f);
//            out.write(erm.toString());
//            out.close();
            System.out.println("生成erm文件结构体结束");
        } catch (Exception ex) {
            System.out.println("生成erm文件失败");
            ex.printStackTrace();
        }
    }

    //生成erm
    private void genERM(StringBuilder erm, Map<String, List<WordModel>> map) {
        ErmXmlBuilder ermXmlBuilder = new ErmXmlBuilder();
        //erm开始
        ermXmlBuilder.appendDiagramBegin(erm);
        //erm字段
        ermXmlBuilder.appendDictionary(erm,map);
        ermXmlBuilder.appendTableSpaceSet(erm);
        //erm表
        ermXmlBuilder.appendContent(erm,map);
        //erm结尾
        ermXmlBuilder.appendDiagramEnd(erm);
    }


}
