package com.xx.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;


public class CustomBlockHandler {
    public static String handlerException(BlockException exception) {
        return "handlerException";
    }

    public static String handlerException2(BlockException exception) {
        return "handlerException2";
    }
}
