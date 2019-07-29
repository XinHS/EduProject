package com.xin.edu.mapper.base;

public interface BaseMapper<T> {
    /***
     * 通过id查找用户
     * @param id
     * @return
     */
    public T findById(Integer id);
    public T findByUId(String id);
    /***
     * 通过id删除用户
     * @param id
     * @return
     */
    public void deleteById(Integer id);
    public void deleteByUId(String id);
    /***
     * 更新用户数据
     * @param
     * @return
     */
    public void update(T t);
    /***
     * 插入新的用户数据
     * @param
     * @return
     */
    public void insert(T t);
}
