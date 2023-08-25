package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @create 2023-08-24 22:16
 */
@Mapper
public interface SetmealDishMapper {
    /**
     *根据菜品id来查询对应的套餐id
     */
    //select setMeal_id from setMeal_dish where dish_id in(1,2,3,4)
    List<Long> getSetMealIdsByDishIds(List<Long> dishIds);
}
