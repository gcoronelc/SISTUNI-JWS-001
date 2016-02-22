package com.gestorvisitas.criteria;

import com.gestorvisitas.model.Mtipo;
import com.gestorvisitas.model.MtipoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MtipoMapper {
    int countByExample(MtipoExample example);

    int deleteByExample(MtipoExample example);

    int deleteByPrimaryKey(Integer mtiCodigo);

    int insert(Mtipo record);

    int insertSelective(Mtipo record);

    List<Mtipo> selectByExample(MtipoExample example);

    Mtipo selectByPrimaryKey(Integer mtiCodigo);

    int updateByExampleSelective(@Param("record") Mtipo record, @Param("example") MtipoExample example);

    int updateByExample(@Param("record") Mtipo record, @Param("example") MtipoExample example);

    int updateByPrimaryKeySelective(Mtipo record);

    int updateByPrimaryKey(Mtipo record);
}