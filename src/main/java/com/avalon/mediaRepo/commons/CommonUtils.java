package com.avalon.mediaRepo.commons;

import java.util.List;

public class CommonUtils {

    public static void soutEntireList(List list){
        for (Object element: list) {
            System.out.println(element.toString());
        }
    }
}
