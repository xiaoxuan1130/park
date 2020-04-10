package com.epipe.common.base;

import com.epipe.service.sys.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import java.util.List;

/**
 * @author liyuexuan
 * @date 2019-04-09 9:43
 **/
public abstract class CurdServiceImpl<T> implements BaseService<T> {

    @Lazy
    @Autowired
    private BaseMapper<T> baseMapper;


    @Override
    public int save(T t) {
        return baseMapper.save(t);
    }

    public int update(T t){
        return baseMapper.update(t);
    }

    @Override
    public int updateByPrimaryKey(T t) {
        return baseMapper.updateByPrimaryKey(t);
    }

    @Override
    public int updateByPrimaryKeySelective(T t) {
        return baseMapper.updateByPrimaryKeySelective(t);
    }

    @Override
    public int delete(T t) {
        return baseMapper.delete(t);
    }

    @Override
    public int delete(String id) {
        return baseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public T findOne(T t) {
        return baseMapper.selectOne(t);
    }

    @Override
    public List<T> findList(T t) {
        return baseMapper.findList(t);
    }

    @Override
    public T get(T t) {
        return baseMapper.findOne(t);
    }

    @Override
    public T get(String id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    public BaseMapper<T> getBaseMapper() {
        return baseMapper;
    }
}
