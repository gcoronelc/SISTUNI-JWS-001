package com.gestorvisitas.criteria;

import com.gestorvisitas.model.Tipo;
import com.gestorvisitas.model.TipoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TipoMapper {
    int countByExample(TipoExample example);

    int deleteByExample(TipoExample example);

    int deleteByPrimaryKey(Integer tipCodigo);

    int insert(Tipo record);

    int insertSelective(Tipo record);

    List<Tipo> selectByExample(TipoExample example);

    Tipo selectByPrimaryKey(Integer tipCodigo);

    int updateByExampleSelective(@Param("record") Tipo record, @Param("example") TipoExample example);

    int updateByExample(@Param("record") Tipo record, @Param("example") TipoExample example);

    int updateByPrimaryKeySelective(Tipo record);

    int updateByPrimaryKey(Tipo record);
}