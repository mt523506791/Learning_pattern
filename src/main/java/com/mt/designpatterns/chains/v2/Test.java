package com.mt.designpatterns.chains.v2;

import com.mt.designpatterns.chains.v2.object.A;
import com.mt.designpatterns.chains.v2.object.B;
import com.mt.designpatterns.chains.v2.object.C;

/**
 * @ClassName Test
 * @Description
 * @Author maTao
 * @Date 2019/9/10 0010 下午 16:49
 **/
public class Test {

    public static void main(String[] args) {
        Chains chains = new Chains();
        chains.add(new A());
        chains.add(new B());
        chains.add(new C());
        chains.process("ABCD");

    }

}
