package com.zhku.mh;

/**
 * @ClassName:NiukeProgram
 * @description TDOO
 * @author: mh
 * @create: 2019-08-27 12:22
 */
public class NiukeProgram {

    /**
     * 1、
     * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     * @Param [target, array]
     * @return boolean
     * @Author mh
     * @Date 2019/8/27
     */
    public boolean Find(int target, int [][] array) {
        if(array.length == 0)
            return false;
        int rowCount=array[0].length-1;
        int i = rowCount-1;
        int j = 0;
        while(i >= 0 && j < array.length){
            int temp = array[i][j];
            if(target > temp) j++;
            if(target < temp) i--;
            if(temp == target) return true;
        }
        return false;
    }
}
