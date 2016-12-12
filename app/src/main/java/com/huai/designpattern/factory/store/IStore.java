package com.huai.designpattern.factory.store;

import com.huai.designpattern.factory.phone.AbsPhone;

/**
 * com.huai.designpattern.factory.store.IStore
 *
 * @author 阎佳琪
 * @date 16/11/24 下午2:11
 * @desc 商店接口
 */

public interface IStore {
    void exec(AbsPhone phone);
}
