package pe.fbet.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pe.fbet.db.AccesoDB;
import pe.fbet.model.ClienteModel;
import pe.fbet.model.EmpleadoModel;
import pe.fbet.model.MovimientoModel;

/**
 *
 * @author FRAY ESPINOZA TARAZONA
 */
public class EurekaService 
{
    //Busqueda de Clientes por las Iniciales de los Nombres o Apellidos
    public List<ClienteModel> obtenerClientes(String nombre)
    {
        List<ClienteModel> lista=new ArrayList();
        Connection cn = null;
        try 
        {
            cn = AccesoDB.getConnection();
            String sql="select chr_cliecodigo,vch_cliepaterno," +
                       "vch_cliematerno,vch_clienombre," +
                       "chr_cliedni,vch_clieciudad," +
                       "vch_cliedireccion,vch_clietelefono," +
                       "vch_clieemail from cliente "+
                       "where vch_cliepaterno like ? "+
                       "or vch_cliematerno like ? "+
                       "or vch_clienombre like ? ";
            PreparedStatement pstm = cn.prepareStatement(sql);
            nombre +="%";
            pstm.setString(1, nombre);
            pstm.setString(2, nombre);
            pstm.setString(3, nombre);
            ResultSet rs = pstm.executeQuery();
            while(rs.next())
            {
                ClienteModel model = new ClienteModel();
                model.setCODIGO(rs.getString("chr_cliecodigo"));
                model.setPATERNO(rs.getString("vch_cliepaterno"));
                model.setMATERNO(rs.getString("vch_cliematerno"));
                model.setNOMBRE(rs.getString("vch_clienombre"));
                model.setDNI(rs.getString("chr_cliedni"));
                model.setCIUDAD(rs.getString("vch_clieciudad"));
                model.setDIRECCION(rs.getString("vch_cliedireccion"));
                model.setTELEFONO(rs.getString("vch_clietelefono"));
                model.setEMAIL(rs.getString("vch_clieemail"));
                lista.add(model);
            }
            rs.close();
            pstm.close();
        } catch (Exception e) 
        {
            e.printStackTrace();
        }finally
        {
            try 
            {
                cn.close();
            } catch (Exception e) 
            {
                
            }
        }
        return lista;
    }
    
    //Busqueda de Clientes por Codigo
    public List<ClienteModel> busquedaCliente(String codigo)
    {
        List<ClienteModel> lista = new ArrayList();
        Connection cn = null;
        try 
        {
            cn = AccesoDB.getConnection();
            String sql="select chr_cliecodigo,vch_cliepaterno," +
                       "vch_cliematerno,vch_clienombre," +
                       "chr_cliedni,vch_clieciudad," +
                       "vch_cliedireccion,vch_clietelefono," +
                       "vch_clieemail from cliente "+
                       "where chr_cliecodigo = ? ";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, codigo);
            ResultSet rs = pstm.executeQuery();
            while(rs.next())
            {
                ClienteModel model = new ClienteModel();
                model.setCODIGO(rs.getString("chr_cliecodigo"));
                model.setPATERNO(rs.getString("vch_cliepaterno"));
                model.setMATERNO(rs.getString("vch_cliematerno"));
                model.setNOMBRE(rs.getString("vch_clienombre"));
                model.setDNI(rs.getString("chr_cliedni"));
                model.setCIUDAD(rs.getString("vch_clieciudad"));
                model.setDIRECCION(rs.getString("vch_cliedireccion"));
                model.setTELEFONO(rs.getString("vch_clietelefono"));
                model.setEMAIL(rs.getString("vch_clieemail"));
                lista.add(model);
            }
            rs.close();
            pstm.close();
        } catch (Exception e) 
        {
            e.printStackTrace();
        }finally
        {
            try 
            {
                cn.close();
            } catch (Exception e) 
            {
                
            }
        }
        return lista;
    }
    
    //Busqueda de Empleados por las Iniciales de los Nombres o Apellidos
    public List<EmpleadoModel> obtenerEmpleado(String nombre)
    {
        List<EmpleadoModel> lista=new ArrayList();
        Connection cn = null;
        try 
        {
            cn = AccesoDB.getConnection();
            String sql="select chr_emplcodigo, vch_emplpaterno,vch_emplmaterno, " + 
                       "vch_emplnombre,vch_emplciudad, " + 
                       "vch_empldireccion,vch_emplusuario, " + 
                       "vch_emplclave from empleado " + 
                       "where vch_emplpaterno like ? " +
                       "or vch_emplmaterno like ? " + 
                       "or vch_emplnombre like ? ";
            PreparedStatement pstm = cn.prepareStatement(sql);
            nombre +="%";
            pstm.setString(1, nombre);
            pstm.setString(2, nombre);
            pstm.setString(3, nombre);
            ResultSet rs = pstm.executeQuery();
            while(rs.next())
            {
                EmpleadoModel model = new EmpleadoModel();
                model.setCODIGO(rs.getString("chr_emplcodigo"));
                model.setPATERNO(rs.getString("vch_emplpaterno"));
                model.setMATERNO(rs.getString("vch_emplmaterno"));
                model.setNOMBRE(rs.getString("vch_emplnombre"));
                model.setCIUDAD(rs.getString("vch_emplciudad"));
                model.setDIRECCION(rs.getString("vch_empldireccion"));
                model.setUSUARIO(rs.getString("vch_emplusuario"));
                model.setCLAVE(rs.getString("vch_emplclave"));
                lista.add(model);
            }
            rs.close();
            pstm.close();
        } catch (Exception e) 
        {
            e.printStackTrace();
        }finally
        {
            try 
            {
                cn.close();
            } catch (Exception e) 
            {
                
            }
        }
        return lista;
    }
    
    //Busqueda de Empleados por Codigo
    public List<EmpleadoModel> buscarEmpleado(String codigo)
    {
        List<EmpleadoModel> lista = new ArrayList();
        Connection cn = null;
        try 
        {
            cn = AccesoDB.getConnection();
            String sql="select chr_emplcodigo, vch_emplpaterno,vch_emplmaterno, " + 
                       "vch_emplnombre,vch_emplciudad, " + 
                       "vch_empldireccion,vch_emplusuario, " + 
                       "vch_emplclave from empleado " + 
                       "where chr_emplcodigo = ? ";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, codigo);
            ResultSet rs = pstm.executeQuery();
            while(rs.next())
            {
                EmpleadoModel model = new EmpleadoModel();
                model.setCODIGO(rs.getString("chr_emplcodigo"));
                model.setPATERNO(rs.getString("vch_emplpaterno"));
                model.setMATERNO(rs.getString("vch_emplmaterno"));
                model.setNOMBRE(rs.getString("vch_emplnombre"));
                model.setCIUDAD(rs.getString("vch_emplciudad"));
                model.setDIRECCION(rs.getString("vch_empldireccion"));
                model.setUSUARIO(rs.getString("vch_emplusuario"));
                model.setCLAVE(rs.getString("vch_emplclave"));
                lista.add(model);
            }
            rs.close();
            pstm.close();
        } catch (Exception e) 
        {
            e.printStackTrace();
        }finally
        {
            try 
            {
                cn.close();
            } catch (Exception e) 
            {
                
            }
        }
        return lista;
    }
    
    //Busqueda de todos los Movimientos realizados por Codigo de Empleado
    public List<MovimientoModel> buscarMovimiento(String codigo)
    {
        List<MovimientoModel> lista = new ArrayList();
        Connection cn = null;
        try 
        {
            cn = AccesoDB.getConnection();
            String sql="select e.chr_emplcodigo, e.vch_emplpaterno, " + 
                       "e.vch_emplmaterno, e.vch_emplnombre, " + 
                       "e.vch_emplciudad, e.vch_empldireccion, " + 
                       "e.vch_emplusuario, e.vch_emplclave, " + 
                       "m.chr_cuencodigo, m.int_movinumero, " + 
                       "m.dtt_movifecha, m.chr_tipocodigo, " + 
                       "m.dec_moviimporte, m.chr_cuenreferencia " +
                       "from empleado e, movimiento m " +
                       "where e.chr_emplcodigo = m.chr_emplcodigo and e.chr_emplcodigo = ? ";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, codigo);
            ResultSet rs = pstm.executeQuery();
            while(rs.next())
            {
                MovimientoModel model=new MovimientoModel();
                model.setCODIGO(rs.getString("chr_emplcodigo"));
                model.setPATERNO(rs.getString("vch_emplpaterno"));
                model.setMATERNO(rs.getString("vch_emplmaterno"));
                model.setNOMBRE(rs.getString("vch_emplnombre"));
                model.setCIUDAD(rs.getString("vch_emplciudad"));
                model.setDIRECCION(rs.getString("vch_empldireccion"));
                model.setUSUARIO(rs.getString("vch_emplusuario"));
                model.setCLAVE(rs.getString("vch_emplclave"));
                model.setCUENCODIGO(rs.getString("chr_cuencodigo"));
                model.setMOVINUMERO(rs.getInt("int_movinumero"));
                model.setMOVIFECHA(rs.getString("dtt_movifecha"));
                model.setTIPOCODIGO(rs.getString("chr_tipocodigo"));
                model.setMOVIIMPORTE(rs.getDouble("dec_moviimporte"));
                model.setCUENREFERENCIA(rs.getString("chr_cuenreferencia"));
                lista.add(model);
                
            }
            rs.close();
            pstm.close();
        } catch (Exception e) 
        {
            e.printStackTrace();
        }finally
        {
            try 
            {
                cn.close();
            } catch (Exception e) 
            {
                
            }
        }
        return lista;
    }
    
    //Busqueda de Movimientos por Codigo
    public List<MovimientoModel> obtenerMovimiento(String codigo)
    {
        List<MovimientoModel> lista = new ArrayList();
        Connection cn = null;
        try 
        {
            cn = AccesoDB.getConnection();
            String sql="select e.chr_emplcodigo, e.vch_emplpaterno, " + 
                       "e.vch_emplmaterno, e.vch_emplnombre, " + 
                       "e.vch_emplciudad, e.vch_empldireccion, " + 
                       "e.vch_emplusuario, e.vch_emplclave, " + 
                       "m.chr_cuencodigo, m.int_movinumero, " + 
                       "m.dtt_movifecha, m.chr_tipocodigo, " + 
                       "m.dec_moviimporte, m.chr_cuenreferencia " +
                       "from empleado e, movimiento m " +
                       "where e.chr_emplcodigo = m.chr_emplcodigo and m.chr_cuencodigo = ? ";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, codigo);
            ResultSet rs = pstm.executeQuery();
            while(rs.next())
            {
                MovimientoModel model=new MovimientoModel();
                model.setCODIGO(rs.getString("chr_emplcodigo"));
                model.setPATERNO(rs.getString("vch_emplpaterno"));
                model.setMATERNO(rs.getString("vch_emplmaterno"));
                model.setNOMBRE(rs.getString("vch_emplnombre"));
                model.setCIUDAD(rs.getString("vch_emplciudad"));
                model.setDIRECCION(rs.getString("vch_empldireccion"));
                model.setUSUARIO(rs.getString("vch_emplusuario"));
                model.setCLAVE(rs.getString("vch_emplclave"));
                model.setCUENCODIGO(rs.getString("chr_cuencodigo"));
                model.setMOVINUMERO(rs.getInt("int_movinumero"));
                model.setMOVIFECHA(rs.getString("dtt_movifecha"));
                model.setTIPOCODIGO(rs.getString("chr_tipocodigo"));
                model.setMOVIIMPORTE(rs.getDouble("dec_moviimporte"));
                model.setCUENREFERENCIA(rs.getString("chr_cuenreferencia"));
                lista.add(model);
                
            }
            rs.close();
            pstm.close();
        } catch (Exception e) 
        {
            e.printStackTrace();
        }finally
        {
            try 
            {
                cn.close();
            } catch (Exception e) 
            {
                
            }
        }
        return lista;
    }
    
    //Insertar Clientes
    public List<ClienteModel> insertarCliente(String n,String n1,String n2,String n3,String n4,String n5,String n6,String n7,String n8)
    {
        List<ClienteModel> lista = new ArrayList();
        Connection cn = null;
        try 
        {
            cn = AccesoDB.getConnection();
            String sql="insert into cliente (chr_cliecodigo, vch_cliepaterno, " + 
                       "vch_cliematerno, vch_clienombre, chr_cliedni, " + 
                       "vch_clieciudad, vch_cliedireccion, " + 
                       "vch_clietelefono, vch_clieemail) values (?,?,?,?,?,?,?,?,?) ";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, n);
            pstm.setString(2, n1);
            pstm.setString(3, n2);
            pstm.setString(4, n3);
            pstm.setString(5, n4);
            pstm.setString(6, n5);
            pstm.setString(7, n6);
            pstm.setString(8, n7);
            pstm.setString(9, n8);
            
            
            pstm.executeUpdate();
            
            while(rs.next())
            {
                ClienteModel model = new ClienteModel();
                model.setCODIGO(rs.getString("chr_cliecodigo"));
                model.setPATERNO(rs.getString("vch_cliepaterno"));
                model.setMATERNO(rs.getString("vch_cliematerno"));
                model.setNOMBRE(rs.getString("vch_clienombre"));
                model.setDNI(rs.getString("chr_cliedni"));
                model.setCIUDAD(rs.getString("vch_clieciudad"));
                model.setDIRECCION(rs.getString("vch_cliedireccion"));
                model.setTELEFONO(rs.getString("vch_clietelefono"));
                model.setEMAIL(rs.getString("vch_clieemail"));
                lista.add(model);
            }
            rs.close();
            pstm.close();
        } catch (Exception e) 
        {
            e.printStackTrace();
        }finally
        {
            try 
            {
                cn.close();
            } catch (Exception e) 
            {
                
            }
        }
        return lista;
    }
    
    //Eliminar Cliente
    public List<ClienteModel> eliminarCliente(String codigo)
    {
        List<ClienteModel> lista = new ArrayList();
        Connection cn = null;
        try 
        {
            cn = AccesoDB.getConnection();
            String sql="delete from cliente where chr_cliecodigo = ? ";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, codigo);
            ResultSet rs = pstm.executeQuery();
            while(rs.next())
            {
                ClienteModel model = new ClienteModel();
                model.setCODIGO(rs.getString("chr_cliecodigo"));
                model.setPATERNO(rs.getString("vch_cliepaterno"));
                model.setMATERNO(rs.getString("vch_cliematerno"));
                model.setNOMBRE(rs.getString("vch_clienombre"));
                model.setDNI(rs.getString("chr_cliedni"));
                model.setCIUDAD(rs.getString("vch_clieciudad"));
                model.setDIRECCION(rs.getString("vch_cliedireccion"));
                model.setTELEFONO(rs.getString("vch_clietelefono"));
                model.setEMAIL(rs.getString("vch_clieemail"));
                lista.add(model);
            }
            rs.close();
            pstm.close();
        } catch (Exception e) 
        {
            e.printStackTrace();
        }finally
        {
            try 
            {
                cn.close();
            } catch (Exception e) 
            {
                
            }
        }
        return lista;
    }
    
    //Actualizar Cliente
    public List<ClienteModel> actualizarCliente(String n1,String n2,String n3,String n4,String n5,String n6,String n7,String n8,String codigo)
    {
        List<ClienteModel> lista = new ArrayList();
        Connection cn = null;
        try 
        {
            cn = AccesoDB.getConnection();
            String sql="update cliente set vch_cliepaterno = ?, " + 
                    "vch_cliematerno = ?, vch_clienombre = ?, chr_cliedni = ?, " + 
                    "vch_clieciudad = ?, vch_cliedireccion = ?, vch_clietelefono = ?, " + 
                    "vch_clieemail = ? where chr_cliecodigo = ? ";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, n1);
            pstm.setString(2, n2);
            pstm.setString(3, n3);
            pstm.setString(4, n4);
            pstm.setString(5, n5);
            pstm.setString(6, n6);
            pstm.setString(7, n7);
            pstm.setString(8, n8);
            pstm.setString(9, codigo);
            ResultSet rs = pstm.executeQuery();
            while(rs.next())
            {
                ClienteModel model = new ClienteModel();
                model.setCODIGO(rs.getString("chr_cliecodigo"));
                model.setPATERNO(rs.getString("vch_cliepaterno"));
                model.setMATERNO(rs.getString("vch_cliematerno"));
                model.setNOMBRE(rs.getString("vch_clienombre"));
                model.setDNI(rs.getString("chr_cliedni"));
                model.setCIUDAD(rs.getString("vch_clieciudad"));
                model.setDIRECCION(rs.getString("vch_cliedireccion"));
                model.setTELEFONO(rs.getString("vch_clietelefono"));
                model.setEMAIL(rs.getString("vch_clieemail"));
                lista.add(model);
            }
            rs.close();
            pstm.close();
        } catch (Exception e) 
        {
            e.printStackTrace();
        }finally
        {
            try 
            {
                cn.close();
            } catch (Exception e) 
            {
                
            }
        }
        return lista;
    }
}
