package com.huai.designpattern.decorate;

import com.huai.designpattern.decorate.part.Bed;
import com.huai.designpattern.decorate.part.Sofa;
import com.huai.designpattern.decorate.part.Television;

/**
 * com.huai.designpattern.decorate.Test
 *
 * @author 阎佳琪
 * @date 16/11/24 上午11:59
 * @desc 文件描述
 */

public class Test {

    public static void main(String[] args) {
        House tHouse = new MyHouse();
        tHouse = new Bed(tHouse);
        tHouse = new Bed(tHouse);
        tHouse = new Sofa(tHouse);
        tHouse = new Television(tHouse);

        System.out.println(tHouse.getName());
        System.out.println("total cost : " + tHouse.cost());
    }
}
