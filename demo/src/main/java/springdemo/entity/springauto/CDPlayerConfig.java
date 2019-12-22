//package springdemo.entity.springauto;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import springdemo.entity.springauto.impl.*;
//import springdemo.entity.springauto.inter.CompactDisc;
//
//@Configuration
//@ComponentScan(basePackages = "springdemo.entity")
//public class CDPlayerConfig {
////    @Bean
////    public CompactDisc qlxPeppers() {
////        return new QlxPeppers();
////    }
//
//    @Bean
//    public CompactDisc randomBeatlesCD() {
//        int choice = (int) Math.floor(Math.random() * 4);
//        if (choice == 0) {
//            return new QlxPeppers();
//        } else if (choice == 1) {
//            return new HsmyPeppers();
//        } else if (choice == 2) {
//            return new GgxPeppers();
//        } else {
//            return new GbqqPeppers();
//        }
//    }
//
//    @Bean
//    public CDPlayer cdPlayer() {
//        return new CDPlayer(randomBeatlesCD());
//    }
//
////    @Bean(name = "xxx")
////    public CompactDisc qlxPeppers() {
////        return new QlxPeppers();
////    }
//}
//
