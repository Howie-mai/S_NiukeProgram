package com.zhku.mh.util;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Date;

/**
 * className：
 * Date：2019/10/15
 * Time：15:09
 * Description：mh
 *
 * @author wxj
 */
public class to36String {

    public String to36String(Long categoryId){
        StringBuilder sb = new StringBuilder();

        BigInteger categoryId36 = new BigInteger(categoryId + "");
        BigInteger timestamp36 = new BigInteger(new Date().getTime() + "");

        String strCate ="000" + categoryId36.toString(36).toUpperCase();
        String strTimestamp = timestamp36.toString(36).toUpperCase();

        sb.append(strCate.substring(strCate.length()-4));
        sb.append(strTimestamp.substring(strTimestamp.length()-8));

        return sb.toString();
    }

    public static void main(String[] args) {
        to36String to = new to36String();
        System.out.println(to.to36String(35l));

    }
}
