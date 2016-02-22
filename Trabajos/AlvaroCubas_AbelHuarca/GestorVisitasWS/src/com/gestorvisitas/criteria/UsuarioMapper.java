package com.gestorvisitas.criteria;

import com.gestorvisitas.model.Usuario;
import com.gestorvisitas.model.UsuarioExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsuarioMapper {
    int countByExample(UsuarioExample example);

    int deleteByExample(UsuarioExample example);

    int deleteByPrimaryKey(Integer usuCodigo);

    int insert(Usuario record);

    int insertSelective(Usuario record);

    List<Usuario> selectByExample(UsuarioExample example);

    Usuario selectByPrimaryKey(Integer usuCodigo);

    int updateByExampleSelective(@Param("record") Usuario record, @Param("example") UsuarioExample example);

    int updateByExample(@Param("record") Usuario record, @Param("example") UsuarioExample example);

    int updateByPrimaryKeySelective(Usuario record);

    int updateByPrimaryKey(Usuario record);
}