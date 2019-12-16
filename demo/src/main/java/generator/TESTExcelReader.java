package generator;

import com.sun.jmx.snmp.SnmpNull;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * @author 苏博
 * @version V1.2.0
 * @company lhfinance.com
 * @className: ExcelReader.java
 * @package com.lihfinance.fdp.util
 * @description: 读excel文件
 * @date 2019/3/13 10:11
 */
public class TESTExcelReader {

    private final static String xls = "xls";
    private final static String xlsx = "xlsx";
    private final static int ROW_SIZE_6 = 6;
    private final static int ROW_SIZE_8 = 8;

    /**
     * 读入excel文件，解析后返回
     *
     * @throws IOException
     */
    public static void readExcel(String fileName) throws IOException {
        //检查文件
        checkFile(fileName);
        //获得Workbook工作薄对象
        String filePath = "/Users/joe/Downloads/持卡客户服务接口统计-综合.xlsx";
        Workbook workbook = getWorkBook(filePath);
        Map<String, List<WordModel>> map = new LinkedHashMap<String, List<WordModel>>();
        if (workbook != null) {
            for (int sheetNum = 5; sheetNum < workbook.getNumberOfSheets(); sheetNum++) {
                //获得当前sheet工作表
                Sheet sheet = workbook.getSheetAt(sheetNum);
                if (sheet == null) {
                    continue;
                }

                for (int i = 0; i <= sheet.getLastRowNum(); i++) {
                    Row row = sheet.getRow(i);
                    if (row == null) continue;
                    Cell cell = row.getCell(0);
                    if (cell != null && Cell.CELL_TYPE_STRING == cell.getCellType()) {
                        String str = cell.getStringCellValue().toLowerCase();
                        cell.setCellValue(str);
                    }
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/joe/Downloads/test.xlsx");
            workbook.write(fileOutputStream);
        }
    }

    public static WordModel revertWord(String[] cells) throws IOException {
        if (cells.length != ROW_SIZE_8) {
            List<String> list = Arrays.asList(cells);
            for (int i = 0; i < list.size(); i++) {
                System.out.println("list = " + list.get(i));
            }
            throw new IOException("不是约定的excel文件");
        }

        String type = cells[2].toLowerCase();
        String length = cells[3];
        String decimal = cells[4] == null || "".equals(cells[4]) ? "0" : cells[4];
        String notNull = "false";
        try {
            if (cells[2].toLowerCase().contains("number") || cells[2].toLowerCase().contains("decimal")) {
                type = "decimal(p,s)";
            }
            if (cells[2].toLowerCase().contains("string") || cells[2].toLowerCase().contains("varchar")) {
            }
            if (cells[2].toLowerCase().contains("int") || cells[2].toLowerCase().contains("long") || cells[2].toLowerCase().contains("bigint")) {
                type = "bigint";
                length = "null";
            }
            if (cells[2].toLowerCase().contains("timestamp")) {
                length = "null";
            }
            if ("否".equals(cells[5]) || "N".equals(cells[5]) || "n".equals(cells[5])) {
                notNull = "true";
            }
            return new WordModel(cells[0], cells[1], type, length, notNull, cells[6], decimal);
        } catch (Exception e) {
            e.printStackTrace();
            throw new IOException("字段解析错误");
        }
    }

    public static void checkFile(String fileName) throws IOException {
        //判断文件是否是excel文件
        if (!fileName.endsWith(xls) && !fileName.endsWith(xlsx)) {
            System.out.println(fileName + "不是excel文件");
            throw new IOException(fileName + "不是excel文件");
        }
    }

    public static Workbook getWorkBook(String filePath) {

        Workbook workbook = null;
        try {
            InputStream is = new FileInputStream(filePath);
            if (filePath.endsWith(xls)) {
                workbook = new HSSFWorkbook(is);
            } else if (filePath.endsWith(xlsx)) {
                workbook = new XSSFWorkbook(is);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return workbook;
    }

    public static String getCellValue(Cell cell) {
        String cellValue = "";
        if (cell == null) {
            return cellValue;
        }
        //把数字当成String来读，避免出现1读成1.0的情况
        if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
            cell.setCellType(Cell.CELL_TYPE_STRING);
        }
        //判断数据的类型
        switch (cell.getCellType()) {
            //数字
            case Cell.CELL_TYPE_NUMERIC:
                cellValue = String.valueOf(cell.getNumericCellValue());
                break;
            //字符串
            case Cell.CELL_TYPE_STRING:
                cellValue = String.valueOf(cell.getStringCellValue());
                break;
            //Boolean
            case Cell.CELL_TYPE_BOOLEAN:
                cellValue = String.valueOf(cell.getBooleanCellValue());
                break;
            //公式
            case Cell.CELL_TYPE_FORMULA:
                cellValue = String.valueOf(cell.getCellFormula());
                break;
            //空值
            case Cell.CELL_TYPE_BLANK:
                cellValue = "";
                break;
            //故障
            case Cell.CELL_TYPE_ERROR:
                cellValue = "非法字符";
                break;
            default:
                cellValue = "未知类型";
                break;
        }
        return cellValue;
    }
}
