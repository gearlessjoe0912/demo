package generator;

import generator.GenERM;
import generator.Generator;

public class GeneratorBoot {
    public static void main(String[] args) {
        //生成erm
        Generator genERM = new GenERM();
        genERM.genertator();
    }
}
