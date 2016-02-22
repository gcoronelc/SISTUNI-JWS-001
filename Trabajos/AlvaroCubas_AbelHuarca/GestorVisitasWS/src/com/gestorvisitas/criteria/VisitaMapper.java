package com.gestorvisitas.criteria;

import com.gestorvisitas.model.Visita;
import com.gestorvisitas.model.VisitaExample;
import com.gestorvisitas.model.VisitaKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitaMapper {
    int countByExample(VisitaExample example);

    int deleteByExample(VisitaExample example);

    int deleteByPrimaryKey(VisitaKey key);

    int insert(Visita record);

    int insertSelective(Visita record);

    List<Visita> selectByExample(VisitaExample example);

    Visita selectByPrimaryKey(VisitaKey key);

    int updateByExampleSelective(@Param("record") Visita record, @Param("example") VisitaExample example);

    int updateByExample(@Param("record") Visita record, @Param("example") VisitaExample example);

    int updateByPrimaryKeySelective(Visita record);

    int updateByPrimaryKey(Visita record);
}