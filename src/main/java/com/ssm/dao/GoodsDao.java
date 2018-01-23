package com.ssm.dao;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ssm.entity.Goods;

public interface GoodsDao {
	
	@Select("select good_id goodId, good_name goodName,good_price goodPrice from goods")
	ArrayList<Goods> selectAll();
	@Select("select good_id goodId, good_name goodName,good_price goodPrice from goods where good_id=#{goodId} ")
	Goods selectById(Goods good);
	@Insert("insert into goods values(#{goodId},#{goodName},#{goodPrice})")
	int save(Goods good);
	@Update("update goods set good_id=#{goodId}, good_name=#{goodName},good_price=#{goodPrice} where good_id=#{goodId}")
	int update(Goods good);
	@Delete("delete from goods where good_id=#{goodId}")
	int deleteById(Goods good);
}
