package com.msa.prac.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @PostMapping("/nanoTimeTest")
    public void nanoTimeTest() {

        int cnt = 0;// 횟수
        long start = System.nanoTime();


        //TODO: 로직

        for(int i = 0; i < 500000; i++){

            cnt++;
        }




        //TODO: 로직 끝


        long end = System.nanoTime();
        long result = end - start;
        System.out.println("속도 : " + result / cnt);
    }







}




//
//    public static long testFor(Map<Integer, Integer> map1, long runTime){
//        int size = map1.size();
//        long result = 0;
//        long runTimeTmp = runTime;
//
//        while(0 < runTimeTmp--){
//            long start = System.nanoTime();
//            for(int i=0; i<size; i++){
//                Integer integer = map1.get(i);
//                integer = 1;
//            }
//            long end = System.nanoTime();
//            result += (end-start);
//        }
//        return result / runTime;
//    }
//    public static long testForEach(Map<Integer, Integer> map1, long runTime){
//        int size = map1.size();
//        long result = 0;
//        long runTimeTmp = runTime;
//        while(0 < runTimeTmp--){
//            long start = System.nanoTime();
//            for(Integer integer : map1){
//                integer = 1;
//            }
//            long end = System.nanoTime();
//            result += (end-start);
//        }
//        return result / runTime;
//    }

