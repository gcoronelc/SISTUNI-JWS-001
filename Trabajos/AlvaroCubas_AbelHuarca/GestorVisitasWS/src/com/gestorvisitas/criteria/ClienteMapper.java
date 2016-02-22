package com.gestorvisitas.criteria;

import com.gestorvisitas.model.Cliente;
import com.gestorvisitas.model.ClienteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClienteMapper {
    int countByExample(ClienteExample example);

    int deleteByExample(ClienteExample example);

    int deleteByPrimaryKey(String cliRuc);

    int insert(Cliente record);

    int insertSelective(Cliente record);

    List<Cliente> selectByExample(ClienteExample example);

    Cliente selectByPrimaryKey(String cliRuc);

    int updateByExampleSelective(@Param("record") Cliente record, @Param("example") ClienteExample example);

    int updateByExample(@Param("record") Cliente record, @Param("example") ClienteExample example);

    int updateByPrimaryKeySelective(Cliente record);

    int updateByPrimaryKey(Cliente record);
}