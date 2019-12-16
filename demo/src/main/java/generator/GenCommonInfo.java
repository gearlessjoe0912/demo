package generator;

/**
 * @author 苏博
 * @version V1.2.0
 * @company lhfinance.com
 * @className: GenCommonInfo.java
 * @package com.lihfinance.fdp.generator
 * @description: 生成公共信息抽象类
 * @date 2019/3/7 16:08
 */
public abstract class GenCommonInfo {

    //生成文件名
    public abstract String genFileName(String name);

    //统一生成路径
    public String genFilePath(String fileName){
        //后缀名时默认java文件
        if(fileName.contains(".")){
            return GeneratorConfig.FIILE_PATH + FdpConsts.OUT_PATH +fileName;
        }
        return GeneratorConfig.FIILE_PATH + FdpConsts.OUT_PATH +fileName+".java";
    }

    //下划线转驼峰 首字母大写
    public String revertHump(String str) {
        if(!str.contains("_")){
            return str.substring(0,1).toUpperCase() + str.substring(1,str.length());
        }else {
            String[] arr = str.split("_");
            StringBuilder sb =  new StringBuilder();
            for (int i = 0; i <arr.length ; i++) {
                sb.append(arr[i].substring(0,1).toUpperCase());
                sb.append(arr[i].substring(1));
            }
            return sb.toString();
        }
    }

    //添加注释信息
    public void genNoteInfo(StringBuilder sb, String cname){
        sb.append(FdpConsts.getNoteInfo(cname));
    }

    //生成标准类名
    public void genClassName(StringBuilder sb, String fileName){
        sb.append(FdpConsts.getClassName(fileName));
    };

    //生成结尾
    public void genEnd(StringBuilder sb, String fileName){
        sb.append(FdpConsts.NEWLINE + FdpConsts.R_BRACKET);
    }

}
