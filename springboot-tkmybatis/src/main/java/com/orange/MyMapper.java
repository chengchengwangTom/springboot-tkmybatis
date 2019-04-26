package com.orange;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * <pre>
 *    @author : orange
 *    @e-mail : 495314527@qq.com
 *    @time   : 2019/4/26 11:36
 *    @desc   : 继承自己Mapper
 *    @version: 1.0
 * </pre>
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
