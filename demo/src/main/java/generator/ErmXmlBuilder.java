package generator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author 苏博
 * @version V1.2.0
 * @company lhfinance.com
 * @className: ErmXmlBuilder.java
 * @package com.lihfinance.fdp.generator
 * @description: erm文件xml拼装类
 * @date 2019/3/11 15:56
 */
public class ErmXmlBuilder {

    //拼装xml头
    public void appendDiagramBegin(StringBuilder erm) {

        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

        erm.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        erm.append(FdpConsts.NEWLINE+"<diagram>");
        erm.append(FdpConsts.BEGINLINE+"<page_setting>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<direction_horizontal>true</direction_horizontal>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<scale>100</scale>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<paper_size>A4 210 x 297 mm</paper_size>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<top_margin>30</top_margin>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<left_margin>30</left_margin>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<bottom_margin>30</bottom_margin>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<right_margin>30</right_margin>");
        erm.append(FdpConsts.BEGINLINE+"</page_setting>");
        erm.append(FdpConsts.BEGINLINE+"<category_index>0</category_index>");
        erm.append(FdpConsts.BEGINLINE+"<zoom>1.0</zoom>");
        erm.append(FdpConsts.BEGINLINE+"<x>0</x>");
        erm.append(FdpConsts.BEGINLINE+"<y>0</y>");
        erm.append(FdpConsts.BEGINLINE+"<default_color>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<r>128</r>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<g>128</g>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<b>192</b>");
        erm.append(FdpConsts.BEGINLINE+"</default_color>");
        erm.append(FdpConsts.BEGINLINE+"<color>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<r>255</r>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<g>255</g>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<b>255</b>");
        erm.append(FdpConsts.BEGINLINE+"</color>");
        erm.append(FdpConsts.BEGINLINE+"<font_name>Microsoft YaHei UI</font_name>");
        erm.append(FdpConsts.BEGINLINE+"<font_size>9</font_size>");
        erm.append(FdpConsts.BEGINLINE+"<settings>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<database>MySQL</database>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<capital>true</capital>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<table_style></table_style>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<notation></notation>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<notation_level>0</notation_level>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<notation_expand_group>true</notation_expand_group>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<view_mode>2</view_mode>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<outline_view_mode>1</outline_view_mode>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<view_order_by>1</view_order_by>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<auto_ime_change>false</auto_ime_change>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<validate_physical_name>true</validate_physical_name>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<use_bezier_curve>false</use_bezier_curve>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<suspend_validator>false</suspend_validator>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<export_setting>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<export_ddl_setting>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<output_path></output_path>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<encoding>UTF-8</encoding>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<line_feed>CR+LF</line_feed>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<is_open_after_saved>true</is_open_after_saved>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<environment_id>0</environment_id>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<category_id>null</category_id>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<ddl_target>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<create_comment>false</create_comment>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<create_foreignKey>false</create_foreignKey>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<create_index>true</create_index>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<create_sequence>false</create_sequence>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<create_table>true</create_table>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<create_tablespace>false</create_tablespace>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<create_trigger>false</create_trigger>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<create_view>true</create_view>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<drop_index>true</drop_index>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<drop_sequence>false</drop_sequence>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<drop_table>true</drop_table>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<drop_tablespace>false</drop_tablespace>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<drop_trigger>false</drop_trigger>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<drop_view>true</drop_view>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<inline_column_comment>false</inline_column_comment>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<inline_table_comment>false</inline_table_comment>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<comment_value_description>true</comment_value_description>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<comment_value_logical_name>false</comment_value_logical_name>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<comment_value_logical_name_description>false</comment_value_logical_name_description>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<comment_replace_line_feed>false</comment_replace_line_feed>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<comment_replace_string></comment_replace_string>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"</ddl_target>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"</export_ddl_setting>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<export_excel_setting>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<category_id>null</category_id>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<output_path></output_path>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<template></template>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<template_path></template_path>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<used_default_template_lang>en</used_default_template_lang>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<image_output></image_output>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<is_open_after_saved>true</is_open_after_saved>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<is_put_diagram>true</is_put_diagram>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<is_use_logical_name>true</is_use_logical_name>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"</export_excel_setting>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<export_html_setting>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<output_dir></output_dir>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<with_category_image>true</with_category_image>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<with_image>true</with_image>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<is_open_after_saved>true</is_open_after_saved>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"</export_html_setting>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<export_image_setting>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<output_file_path></output_file_path>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<category_dir_path></category_dir_path>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<with_category_image>true</with_category_image>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<is_open_after_saved>true</is_open_after_saved>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"</export_image_setting>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<export_java_setting>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<java_output></java_output>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<package_name></package_name>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<class_name_suffix></class_name_suffix>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<src_file_encoding></src_file_encoding>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<with_hibernate>false</with_hibernate>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"</export_java_setting>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<export_testdata_setting>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<file_encoding></file_encoding>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<file_path></file_path>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<format>0</format>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"</export_testdata_setting>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"</export_setting>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<category_settings>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<free_layout>false</free_layout>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<show_referred_tables>true</show_referred_tables>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<categories></categories>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"</category_settings>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<translation_settings>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<use>true</use>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<translations></translations>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"</translation_settings>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<model_properties>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<id></id>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<height>-1</height>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<width>-1</width>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<font_name>Microsoft YaHei UI</font_name>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<font_size>9</font_size>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<x>50</x>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<y>50</y>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<color>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<r>255</r>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<g>255</g>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<b>255</b>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"</color>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<connections></connections>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<display>false</display>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<creation_date>"+time+"</creation_date>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<updated_date>"+time+"</updated_date>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<model_property>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<name>Project Name</name>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<value></value>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"</model_property>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<model_property>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<name>Model Name</name>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<value></value>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"</model_property>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<model_property>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<name>Version</name>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<value></value>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"</model_property>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<model_property>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<name>Company</name>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<value></value>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"</model_property>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<model_property>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<name>Author</name>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<value></value>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"</model_property>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"</model_properties>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<table_properties>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<schema></schema>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<character_set></character_set>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<collation></collation>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<storage_engine></storage_engine>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<primary_key_length_of_text>null</primary_key_length_of_text>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"</table_properties>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<environment_setting>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<environment>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<id>0</id>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<name>Default</name>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"</environment>");
        erm.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"</environment_setting>");
        erm.append(FdpConsts.BEGINLINE+"</settings>");
    }

    //拼接通用字典(id,org,macValue,create_file_flag,create_date,update_date,jpa_version)
    public void appendDictionary(StringBuilder erm, Map<String, List<WordModel>> map) {
        erm.append(FdpConsts.BEGINLINE+"<dictionary>");
        erm.append(getWord(0,"ID","ID","bigint","null","null",""));
        erm.append(getWord(1,"机构号","ORG","varchar(n)","12","null",""));
        erm.append(getWord(2,"创建用户","CREATE_BY","varchar(n)","40","null",""));
        erm.append(getWord(3,"更新用户","UPDATE_BY","varchar(n)","40","null",""));
        erm.append(getWord(4,"创建时间","CREATE_DATE","timestamp","null","null",""));
        erm.append(getWord(5,"更新时间","UPDATE_DATE","timestamp","null","null",""));
        erm.append(getWord(6,"乐观锁版本号","JPA_VERSION","bigint","null","null",""));
        int count = 1;
        for (String s : map.keySet()) {
            List<WordModel> wordList = map.get(s);
            for (int i = 0; i < wordList.size(); i++) {
                erm.append(parseWord(count,i,wordList.get(i)));
            }
            count++;
        }
        erm.append(FdpConsts.BEGINLINE+"</dictionary>");
    }

    //拼接word (字典中)
    private StringBuilder getWord(int id,String logicalName,String physicalName,String type,String length,String decimal,String desc){
        StringBuilder sb = new StringBuilder();
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<word>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<id>"+id+"</id>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<length>"+length+"</length>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<decimal>"+decimal+"</decimal>");
        //static begin
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<array>false</array>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<array_dimension>null</array_dimension>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<unsigned>false</unsigned>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<zerofill>false</zerofill>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<binary>false</binary>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<args></args>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<char_semantics>false</char_semantics>");
        //static end
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<description>"+desc+"</description>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<logical_name>"+logicalName+"</logical_name>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<physical_name>"+physicalName+"</physical_name>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<type>"+type+"</type>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"</word>");
        return sb;
    }

    public void appendTableSpaceSet(StringBuilder erm) {
        erm.append(FdpConsts.BEGINLINE+"<tablespace_set>");
        erm.append(FdpConsts.BEGINLINE+"</tablespace_set>");
    }

    //拼接content
    public void appendContent(StringBuilder erm, Map<String, List<WordModel>> map) {
        erm.append(FdpConsts.BEGINLINE + "<contents>");
        int count = 1 ;
        for (String s : map.keySet()) {
            String[] names = s.split(":");
            String cname = names[0];
            String ename = GeneratorConfig.ERM_RIEFIX + names[1];
            List<WordModel> wordList = map.get(s);
            erm.append(getTable(count++,ename,cname,wordList));
        }
        erm.append(FdpConsts.BEGINLINE + "</contents>");
    }

    //拼接table(content中)
    private StringBuilder getTable(int count, String physicalName, String logicalName, List<WordModel> wordList) {
        StringBuilder sb = new StringBuilder();
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"<table>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<id>"+(count-1)+"</id>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<height>"+574+"</height>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<width>"+467+"</width>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<font_name>"+"Microsoft YaHei UI"+"</font_name>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<font_size>"+9+"</font_size>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<x>"+(count-1)*5+24+"</x>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<y>"+39+"</y>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<color>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<r>"+128+"</r>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<g>"+128+"</g>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<b>"+192+"</b>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"</color>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<connections>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"</connections>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<physical_name>"+physicalName+"</physical_name>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<logical_name>"+logicalName+"</logical_name>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<description></description>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<constraint>"+"</constraint>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<primary_key_name>"+"</primary_key_name>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<option>"+"</option>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<columns>");

        sb.append(getColumn(count*1000,0,"bigint","true","true","true","",""));
        sb.append(getColumn(count*1000+1,1, "varchar(n)","true","false","false","",""));

        for(int i=0;i<wordList.size();i++){
            sb.append(parseColumn(count,i,wordList.get(i)));
        }
        sb.append(getColumn(count*1000+2,2, "varchar(n)","false","false","false","",""));
        sb.append(getColumn(count*1000+3,3, "varchar(n)","false","false","false","",""));
        sb.append(getColumn(count*1000+4,4, "timestamp","true","false","false","CURRENT_TIMESTAMP",""));
        sb.append(getColumn(count*1000+5,5, "timestamp","true","false","false","CURRENT_TIMESTAMP","ON UPDATE CURRENT_TIMESTAMP"));
        sb.append(getColumn(count*1000+6,6, "bigint","true","false","false","",""));

        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"</columns>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<indexes>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"</indexes>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<complex_unique_key_list>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"</complex_unique_key_list>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"<table_properties>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<schema></schema>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<character_set></character_set>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<collation></collation>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<storage_engine></storage_engine>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<primary_key_length_of_text>null</primary_key_length_of_text>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB2+"</table_properties>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+"</table>");
        return sb;
    }

    //拼接column (table中)
    private StringBuilder getColumn(int id,int wordId,String type ,String notNull,String autoIncre,String key,String default_value,String constraint){
        StringBuilder sb = new StringBuilder();
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"<normal_column>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<word_id>"+wordId+"</word_id>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<id>"+id+"</id>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<description></description>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<unique_key_name></unique_key_name>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<logical_name></logical_name>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<physical_name></physical_name>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<type>"+type+"</type>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<constraint>"+constraint+"</constraint>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<default_value>"+default_value+"</default_value>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<auto_increment>"+autoIncre+"</auto_increment>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<foreign_key>false</foreign_key>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<not_null>"+notNull+"</not_null>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<primary_key>"+key+"</primary_key>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<unique_key>false</unique_key>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<character_set></character_set>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<collation></collation>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"<sequence>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+ FdpConsts.TAB4+"<name></name>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+ FdpConsts.TAB4+"<schema></schema>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+ FdpConsts.TAB4+"<increment></increment>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+ FdpConsts.TAB4+"<min_value></min_value>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+ FdpConsts.TAB4+"<max_value></max_value>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+ FdpConsts.TAB4+"<start></start>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+ FdpConsts.TAB4+"<cache></cache>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+ FdpConsts.TAB4+"<nocache>false</nocache>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+ FdpConsts.TAB4+"<cycle>false</cycle>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+ FdpConsts.TAB4+"<order>false</order>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+ FdpConsts.TAB4+"<description></description>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+ FdpConsts.TAB4+"<data_type></data_type>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB+ FdpConsts.TAB4+"<decimal_size>"+"0"+"</decimal_size>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB4+"</sequence>");
        sb.append(FdpConsts.BEGINLINE+ FdpConsts.TAB3+"</normal_column>");
        return sb;
    }

    //拼接xml尾部
    public void appendDiagramEnd(StringBuilder erm) {
        erm.append(FdpConsts.BEGINLINE+"<column_groups>");
        erm.append(FdpConsts.BEGINLINE+"</column_groups>");
        erm.append(FdpConsts.BEGINLINE+"<test_data_list>");
        erm.append(FdpConsts.BEGINLINE+"</test_data_list>");
        erm.append(FdpConsts.BEGINLINE+"<sequence_set>");
        erm.append(FdpConsts.BEGINLINE+"</sequence_set>");
        erm.append(FdpConsts.BEGINLINE+"<trigger_set>");
        erm.append(FdpConsts.BEGINLINE+"</trigger_set>");
        erm.append(FdpConsts.BEGINLINE+"<change_tracking_list>");
        erm.append(FdpConsts.BEGINLINE+"</change_tracking_list>");
        erm.append(FdpConsts.NEWLINE+"</diagram>");
    }


    //解析wordModel到<word>
    private StringBuilder parseWord(int count,int i, WordModel wordModel) {
        /**
         * 0~6为固定的字段
         * 第一个文件 id从1007开始 第二个文件从2007开始
         */
        int id = (count)*1000+7+i;
        String logicalName = wordModel.getLogicalName();
        String physicalName = wordModel.getPhysicalName();
        String type = wordModel.getType();
        String length = wordModel.getLength();
        String decimal = wordModel.getDecimal();
        String desc = wordModel.getDescription();
        return getWord(id,logicalName,physicalName,type,length,decimal,desc);
    }

    //解析wordModel到<column>
    private StringBuilder parseColumn(int count, int i, WordModel wordModel) {
        //解析出的字段均不带自动增长,主键,默认值等属性
        int id = (count)*1000+7+i;
        int wordId= id;
        String type= wordModel.getType();
        String notNull= wordModel.getNotNull();
        return getColumn(id,wordId,type,notNull,"false","false","","");
    }

}
