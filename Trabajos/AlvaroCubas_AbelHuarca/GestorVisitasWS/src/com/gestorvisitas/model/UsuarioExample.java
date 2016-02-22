package com.gestorvisitas.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UsuarioExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsuarioExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUsuCodigoIsNull() {
            addCriterion("usu_codigo is null");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoIsNotNull() {
            addCriterion("usu_codigo is not null");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoEqualTo(Integer value) {
            addCriterion("usu_codigo =", value, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoNotEqualTo(Integer value) {
            addCriterion("usu_codigo <>", value, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoGreaterThan(Integer value) {
            addCriterion("usu_codigo >", value, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoGreaterThanOrEqualTo(Integer value) {
            addCriterion("usu_codigo >=", value, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoLessThan(Integer value) {
            addCriterion("usu_codigo <", value, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoLessThanOrEqualTo(Integer value) {
            addCriterion("usu_codigo <=", value, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoIn(List<Integer> values) {
            addCriterion("usu_codigo in", values, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoNotIn(List<Integer> values) {
            addCriterion("usu_codigo not in", values, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoBetween(Integer value1, Integer value2) {
            addCriterion("usu_codigo between", value1, value2, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuCodigoNotBetween(Integer value1, Integer value2) {
            addCriterion("usu_codigo not between", value1, value2, "usuCodigo");
            return (Criteria) this;
        }

        public Criteria andRolCodigoIsNull() {
            addCriterion("rol_codigo is null");
            return (Criteria) this;
        }

        public Criteria andRolCodigoIsNotNull() {
            addCriterion("rol_codigo is not null");
            return (Criteria) this;
        }

        public Criteria andRolCodigoEqualTo(Integer value) {
            addCriterion("rol_codigo =", value, "rolCodigo");
            return (Criteria) this;
        }

        public Criteria andRolCodigoNotEqualTo(Integer value) {
            addCriterion("rol_codigo <>", value, "rolCodigo");
            return (Criteria) this;
        }

        public Criteria andRolCodigoGreaterThan(Integer value) {
            addCriterion("rol_codigo >", value, "rolCodigo");
            return (Criteria) this;
        }

        public Criteria andRolCodigoGreaterThanOrEqualTo(Integer value) {
            addCriterion("rol_codigo >=", value, "rolCodigo");
            return (Criteria) this;
        }

        public Criteria andRolCodigoLessThan(Integer value) {
            addCriterion("rol_codigo <", value, "rolCodigo");
            return (Criteria) this;
        }

        public Criteria andRolCodigoLessThanOrEqualTo(Integer value) {
            addCriterion("rol_codigo <=", value, "rolCodigo");
            return (Criteria) this;
        }

        public Criteria andRolCodigoIn(List<Integer> values) {
            addCriterion("rol_codigo in", values, "rolCodigo");
            return (Criteria) this;
        }

        public Criteria andRolCodigoNotIn(List<Integer> values) {
            addCriterion("rol_codigo not in", values, "rolCodigo");
            return (Criteria) this;
        }

        public Criteria andRolCodigoBetween(Integer value1, Integer value2) {
            addCriterion("rol_codigo between", value1, value2, "rolCodigo");
            return (Criteria) this;
        }

        public Criteria andRolCodigoNotBetween(Integer value1, Integer value2) {
            addCriterion("rol_codigo not between", value1, value2, "rolCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuJefeCodigoIsNull() {
            addCriterion("usu_jefe_codigo is null");
            return (Criteria) this;
        }

        public Criteria andUsuJefeCodigoIsNotNull() {
            addCriterion("usu_jefe_codigo is not null");
            return (Criteria) this;
        }

        public Criteria andUsuJefeCodigoEqualTo(Integer value) {
            addCriterion("usu_jefe_codigo =", value, "usuJefeCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuJefeCodigoNotEqualTo(Integer value) {
            addCriterion("usu_jefe_codigo <>", value, "usuJefeCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuJefeCodigoGreaterThan(Integer value) {
            addCriterion("usu_jefe_codigo >", value, "usuJefeCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuJefeCodigoGreaterThanOrEqualTo(Integer value) {
            addCriterion("usu_jefe_codigo >=", value, "usuJefeCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuJefeCodigoLessThan(Integer value) {
            addCriterion("usu_jefe_codigo <", value, "usuJefeCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuJefeCodigoLessThanOrEqualTo(Integer value) {
            addCriterion("usu_jefe_codigo <=", value, "usuJefeCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuJefeCodigoIn(List<Integer> values) {
            addCriterion("usu_jefe_codigo in", values, "usuJefeCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuJefeCodigoNotIn(List<Integer> values) {
            addCriterion("usu_jefe_codigo not in", values, "usuJefeCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuJefeCodigoBetween(Integer value1, Integer value2) {
            addCriterion("usu_jefe_codigo between", value1, value2, "usuJefeCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuJefeCodigoNotBetween(Integer value1, Integer value2) {
            addCriterion("usu_jefe_codigo not between", value1, value2, "usuJefeCodigo");
            return (Criteria) this;
        }

        public Criteria andUsuEstadoIsNull() {
            addCriterion("usu_estado is null");
            return (Criteria) this;
        }

        public Criteria andUsuEstadoIsNotNull() {
            addCriterion("usu_estado is not null");
            return (Criteria) this;
        }

        public Criteria andUsuEstadoEqualTo(Integer value) {
            addCriterion("usu_estado =", value, "usuEstado");
            return (Criteria) this;
        }

        public Criteria andUsuEstadoNotEqualTo(Integer value) {
            addCriterion("usu_estado <>", value, "usuEstado");
            return (Criteria) this;
        }

        public Criteria andUsuEstadoGreaterThan(Integer value) {
            addCriterion("usu_estado >", value, "usuEstado");
            return (Criteria) this;
        }

        public Criteria andUsuEstadoGreaterThanOrEqualTo(Integer value) {
            addCriterion("usu_estado >=", value, "usuEstado");
            return (Criteria) this;
        }

        public Criteria andUsuEstadoLessThan(Integer value) {
            addCriterion("usu_estado <", value, "usuEstado");
            return (Criteria) this;
        }

        public Criteria andUsuEstadoLessThanOrEqualTo(Integer value) {
            addCriterion("usu_estado <=", value, "usuEstado");
            return (Criteria) this;
        }

        public Criteria andUsuEstadoIn(List<Integer> values) {
            addCriterion("usu_estado in", values, "usuEstado");
            return (Criteria) this;
        }

        public Criteria andUsuEstadoNotIn(List<Integer> values) {
            addCriterion("usu_estado not in", values, "usuEstado");
            return (Criteria) this;
        }

        public Criteria andUsuEstadoBetween(Integer value1, Integer value2) {
            addCriterion("usu_estado between", value1, value2, "usuEstado");
            return (Criteria) this;
        }

        public Criteria andUsuEstadoNotBetween(Integer value1, Integer value2) {
            addCriterion("usu_estado not between", value1, value2, "usuEstado");
            return (Criteria) this;
        }

        public Criteria andUsuTipoIsNull() {
            addCriterion("usu_tipo is null");
            return (Criteria) this;
        }

        public Criteria andUsuTipoIsNotNull() {
            addCriterion("usu_tipo is not null");
            return (Criteria) this;
        }

        public Criteria andUsuTipoEqualTo(Integer value) {
            addCriterion("usu_tipo =", value, "usuTipo");
            return (Criteria) this;
        }

        public Criteria andUsuTipoNotEqualTo(Integer value) {
            addCriterion("usu_tipo <>", value, "usuTipo");
            return (Criteria) this;
        }

        public Criteria andUsuTipoGreaterThan(Integer value) {
            addCriterion("usu_tipo >", value, "usuTipo");
            return (Criteria) this;
        }

        public Criteria andUsuTipoGreaterThanOrEqualTo(Integer value) {
            addCriterion("usu_tipo >=", value, "usuTipo");
            return (Criteria) this;
        }

        public Criteria andUsuTipoLessThan(Integer value) {
            addCriterion("usu_tipo <", value, "usuTipo");
            return (Criteria) this;
        }

        public Criteria andUsuTipoLessThanOrEqualTo(Integer value) {
            addCriterion("usu_tipo <=", value, "usuTipo");
            return (Criteria) this;
        }

        public Criteria andUsuTipoIn(List<Integer> values) {
            addCriterion("usu_tipo in", values, "usuTipo");
            return (Criteria) this;
        }

        public Criteria andUsuTipoNotIn(List<Integer> values) {
            addCriterion("usu_tipo not in", values, "usuTipo");
            return (Criteria) this;
        }

        public Criteria andUsuTipoBetween(Integer value1, Integer value2) {
            addCriterion("usu_tipo between", value1, value2, "usuTipo");
            return (Criteria) this;
        }

        public Criteria andUsuTipoNotBetween(Integer value1, Integer value2) {
            addCriterion("usu_tipo not between", value1, value2, "usuTipo");
            return (Criteria) this;
        }

        public Criteria andUsuNombreIsNull() {
            addCriterion("usu_nombre is null");
            return (Criteria) this;
        }

        public Criteria andUsuNombreIsNotNull() {
            addCriterion("usu_nombre is not null");
            return (Criteria) this;
        }

        public Criteria andUsuNombreEqualTo(String value) {
            addCriterion("usu_nombre =", value, "usuNombre");
            return (Criteria) this;
        }

        public Criteria andUsuNombreNotEqualTo(String value) {
            addCriterion("usu_nombre <>", value, "usuNombre");
            return (Criteria) this;
        }

        public Criteria andUsuNombreGreaterThan(String value) {
            addCriterion("usu_nombre >", value, "usuNombre");
            return (Criteria) this;
        }

        public Criteria andUsuNombreGreaterThanOrEqualTo(String value) {
            addCriterion("usu_nombre >=", value, "usuNombre");
            return (Criteria) this;
        }

        public Criteria andUsuNombreLessThan(String value) {
            addCriterion("usu_nombre <", value, "usuNombre");
            return (Criteria) this;
        }

        public Criteria andUsuNombreLessThanOrEqualTo(String value) {
            addCriterion("usu_nombre <=", value, "usuNombre");
            return (Criteria) this;
        }

        public Criteria andUsuNombreLike(String value) {
            addCriterion("usu_nombre like", value, "usuNombre");
            return (Criteria) this;
        }

        public Criteria andUsuNombreNotLike(String value) {
            addCriterion("usu_nombre not like", value, "usuNombre");
            return (Criteria) this;
        }

        public Criteria andUsuNombreIn(List<String> values) {
            addCriterion("usu_nombre in", values, "usuNombre");
            return (Criteria) this;
        }

        public Criteria andUsuNombreNotIn(List<String> values) {
            addCriterion("usu_nombre not in", values, "usuNombre");
            return (Criteria) this;
        }

        public Criteria andUsuNombreBetween(String value1, String value2) {
            addCriterion("usu_nombre between", value1, value2, "usuNombre");
            return (Criteria) this;
        }

        public Criteria andUsuNombreNotBetween(String value1, String value2) {
            addCriterion("usu_nombre not between", value1, value2, "usuNombre");
            return (Criteria) this;
        }

        public Criteria andUsuCorreoIsNull() {
            addCriterion("usu_correo is null");
            return (Criteria) this;
        }

        public Criteria andUsuCorreoIsNotNull() {
            addCriterion("usu_correo is not null");
            return (Criteria) this;
        }

        public Criteria andUsuCorreoEqualTo(String value) {
            addCriterion("usu_correo =", value, "usuCorreo");
            return (Criteria) this;
        }

        public Criteria andUsuCorreoNotEqualTo(String value) {
            addCriterion("usu_correo <>", value, "usuCorreo");
            return (Criteria) this;
        }

        public Criteria andUsuCorreoGreaterThan(String value) {
            addCriterion("usu_correo >", value, "usuCorreo");
            return (Criteria) this;
        }

        public Criteria andUsuCorreoGreaterThanOrEqualTo(String value) {
            addCriterion("usu_correo >=", value, "usuCorreo");
            return (Criteria) this;
        }

        public Criteria andUsuCorreoLessThan(String value) {
            addCriterion("usu_correo <", value, "usuCorreo");
            return (Criteria) this;
        }

        public Criteria andUsuCorreoLessThanOrEqualTo(String value) {
            addCriterion("usu_correo <=", value, "usuCorreo");
            return (Criteria) this;
        }

        public Criteria andUsuCorreoLike(String value) {
            addCriterion("usu_correo like", value, "usuCorreo");
            return (Criteria) this;
        }

        public Criteria andUsuCorreoNotLike(String value) {
            addCriterion("usu_correo not like", value, "usuCorreo");
            return (Criteria) this;
        }

        public Criteria andUsuCorreoIn(List<String> values) {
            addCriterion("usu_correo in", values, "usuCorreo");
            return (Criteria) this;
        }

        public Criteria andUsuCorreoNotIn(List<String> values) {
            addCriterion("usu_correo not in", values, "usuCorreo");
            return (Criteria) this;
        }

        public Criteria andUsuCorreoBetween(String value1, String value2) {
            addCriterion("usu_correo between", value1, value2, "usuCorreo");
            return (Criteria) this;
        }

        public Criteria andUsuCorreoNotBetween(String value1, String value2) {
            addCriterion("usu_correo not between", value1, value2, "usuCorreo");
            return (Criteria) this;
        }

        public Criteria andUsuPasswordIsNull() {
            addCriterion("usu_password is null");
            return (Criteria) this;
        }

        public Criteria andUsuPasswordIsNotNull() {
            addCriterion("usu_password is not null");
            return (Criteria) this;
        }

        public Criteria andUsuPasswordEqualTo(String value) {
            addCriterion("usu_password =", value, "usuPassword");
            return (Criteria) this;
        }

        public Criteria andUsuPasswordNotEqualTo(String value) {
            addCriterion("usu_password <>", value, "usuPassword");
            return (Criteria) this;
        }

        public Criteria andUsuPasswordGreaterThan(String value) {
            addCriterion("usu_password >", value, "usuPassword");
            return (Criteria) this;
        }

        public Criteria andUsuPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("usu_password >=", value, "usuPassword");
            return (Criteria) this;
        }

        public Criteria andUsuPasswordLessThan(String value) {
            addCriterion("usu_password <", value, "usuPassword");
            return (Criteria) this;
        }

        public Criteria andUsuPasswordLessThanOrEqualTo(String value) {
            addCriterion("usu_password <=", value, "usuPassword");
            return (Criteria) this;
        }

        public Criteria andUsuPasswordLike(String value) {
            addCriterion("usu_password like", value, "usuPassword");
            return (Criteria) this;
        }

        public Criteria andUsuPasswordNotLike(String value) {
            addCriterion("usu_password not like", value, "usuPassword");
            return (Criteria) this;
        }

        public Criteria andUsuPasswordIn(List<String> values) {
            addCriterion("usu_password in", values, "usuPassword");
            return (Criteria) this;
        }

        public Criteria andUsuPasswordNotIn(List<String> values) {
            addCriterion("usu_password not in", values, "usuPassword");
            return (Criteria) this;
        }

        public Criteria andUsuPasswordBetween(String value1, String value2) {
            addCriterion("usu_password between", value1, value2, "usuPassword");
            return (Criteria) this;
        }

        public Criteria andUsuPasswordNotBetween(String value1, String value2) {
            addCriterion("usu_password not between", value1, value2, "usuPassword");
            return (Criteria) this;
        }

        public Criteria andUsuFecAltaIsNull() {
            addCriterion("usu_fec_alta is null");
            return (Criteria) this;
        }

        public Criteria andUsuFecAltaIsNotNull() {
            addCriterion("usu_fec_alta is not null");
            return (Criteria) this;
        }

        public Criteria andUsuFecAltaEqualTo(Date value) {
            addCriterionForJDBCDate("usu_fec_alta =", value, "usuFecAlta");
            return (Criteria) this;
        }

        public Criteria andUsuFecAltaNotEqualTo(Date value) {
            addCriterionForJDBCDate("usu_fec_alta <>", value, "usuFecAlta");
            return (Criteria) this;
        }

        public Criteria andUsuFecAltaGreaterThan(Date value) {
            addCriterionForJDBCDate("usu_fec_alta >", value, "usuFecAlta");
            return (Criteria) this;
        }

        public Criteria andUsuFecAltaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("usu_fec_alta >=", value, "usuFecAlta");
            return (Criteria) this;
        }

        public Criteria andUsuFecAltaLessThan(Date value) {
            addCriterionForJDBCDate("usu_fec_alta <", value, "usuFecAlta");
            return (Criteria) this;
        }

        public Criteria andUsuFecAltaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("usu_fec_alta <=", value, "usuFecAlta");
            return (Criteria) this;
        }

        public Criteria andUsuFecAltaIn(List<Date> values) {
            addCriterionForJDBCDate("usu_fec_alta in", values, "usuFecAlta");
            return (Criteria) this;
        }

        public Criteria andUsuFecAltaNotIn(List<Date> values) {
            addCriterionForJDBCDate("usu_fec_alta not in", values, "usuFecAlta");
            return (Criteria) this;
        }

        public Criteria andUsuFecAltaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("usu_fec_alta between", value1, value2, "usuFecAlta");
            return (Criteria) this;
        }

        public Criteria andUsuFecAltaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("usu_fec_alta not between", value1, value2, "usuFecAlta");
            return (Criteria) this;
        }

        public Criteria andUsuFecBajaIsNull() {
            addCriterion("usu_fec_baja is null");
            return (Criteria) this;
        }

        public Criteria andUsuFecBajaIsNotNull() {
            addCriterion("usu_fec_baja is not null");
            return (Criteria) this;
        }

        public Criteria andUsuFecBajaEqualTo(Date value) {
            addCriterionForJDBCDate("usu_fec_baja =", value, "usuFecBaja");
            return (Criteria) this;
        }

        public Criteria andUsuFecBajaNotEqualTo(Date value) {
            addCriterionForJDBCDate("usu_fec_baja <>", value, "usuFecBaja");
            return (Criteria) this;
        }

        public Criteria andUsuFecBajaGreaterThan(Date value) {
            addCriterionForJDBCDate("usu_fec_baja >", value, "usuFecBaja");
            return (Criteria) this;
        }

        public Criteria andUsuFecBajaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("usu_fec_baja >=", value, "usuFecBaja");
            return (Criteria) this;
        }

        public Criteria andUsuFecBajaLessThan(Date value) {
            addCriterionForJDBCDate("usu_fec_baja <", value, "usuFecBaja");
            return (Criteria) this;
        }

        public Criteria andUsuFecBajaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("usu_fec_baja <=", value, "usuFecBaja");
            return (Criteria) this;
        }

        public Criteria andUsuFecBajaIn(List<Date> values) {
            addCriterionForJDBCDate("usu_fec_baja in", values, "usuFecBaja");
            return (Criteria) this;
        }

        public Criteria andUsuFecBajaNotIn(List<Date> values) {
            addCriterionForJDBCDate("usu_fec_baja not in", values, "usuFecBaja");
            return (Criteria) this;
        }

        public Criteria andUsuFecBajaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("usu_fec_baja between", value1, value2, "usuFecBaja");
            return (Criteria) this;
        }

        public Criteria andUsuFecBajaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("usu_fec_baja not between", value1, value2, "usuFecBaja");
            return (Criteria) this;
        }

        public Criteria andUsuFecModificacionIsNull() {
            addCriterion("usu_fec_modificacion is null");
            return (Criteria) this;
        }

        public Criteria andUsuFecModificacionIsNotNull() {
            addCriterion("usu_fec_modificacion is not null");
            return (Criteria) this;
        }

        public Criteria andUsuFecModificacionEqualTo(Date value) {
            addCriterionForJDBCDate("usu_fec_modificacion =", value, "usuFecModificacion");
            return (Criteria) this;
        }

        public Criteria andUsuFecModificacionNotEqualTo(Date value) {
            addCriterionForJDBCDate("usu_fec_modificacion <>", value, "usuFecModificacion");
            return (Criteria) this;
        }

        public Criteria andUsuFecModificacionGreaterThan(Date value) {
            addCriterionForJDBCDate("usu_fec_modificacion >", value, "usuFecModificacion");
            return (Criteria) this;
        }

        public Criteria andUsuFecModificacionGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("usu_fec_modificacion >=", value, "usuFecModificacion");
            return (Criteria) this;
        }

        public Criteria andUsuFecModificacionLessThan(Date value) {
            addCriterionForJDBCDate("usu_fec_modificacion <", value, "usuFecModificacion");
            return (Criteria) this;
        }

        public Criteria andUsuFecModificacionLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("usu_fec_modificacion <=", value, "usuFecModificacion");
            return (Criteria) this;
        }

        public Criteria andUsuFecModificacionIn(List<Date> values) {
            addCriterionForJDBCDate("usu_fec_modificacion in", values, "usuFecModificacion");
            return (Criteria) this;
        }

        public Criteria andUsuFecModificacionNotIn(List<Date> values) {
            addCriterionForJDBCDate("usu_fec_modificacion not in", values, "usuFecModificacion");
            return (Criteria) this;
        }

        public Criteria andUsuFecModificacionBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("usu_fec_modificacion between", value1, value2, "usuFecModificacion");
            return (Criteria) this;
        }

        public Criteria andUsuFecModificacionNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("usu_fec_modificacion not between", value1, value2, "usuFecModificacion");
            return (Criteria) this;
        }

        public Criteria andUsuUsuBajaIsNull() {
            addCriterion("usu_usu_baja is null");
            return (Criteria) this;
        }

        public Criteria andUsuUsuBajaIsNotNull() {
            addCriterion("usu_usu_baja is not null");
            return (Criteria) this;
        }

        public Criteria andUsuUsuBajaEqualTo(Integer value) {
            addCriterion("usu_usu_baja =", value, "usuUsuBaja");
            return (Criteria) this;
        }

        public Criteria andUsuUsuBajaNotEqualTo(Integer value) {
            addCriterion("usu_usu_baja <>", value, "usuUsuBaja");
            return (Criteria) this;
        }

        public Criteria andUsuUsuBajaGreaterThan(Integer value) {
            addCriterion("usu_usu_baja >", value, "usuUsuBaja");
            return (Criteria) this;
        }

        public Criteria andUsuUsuBajaGreaterThanOrEqualTo(Integer value) {
            addCriterion("usu_usu_baja >=", value, "usuUsuBaja");
            return (Criteria) this;
        }

        public Criteria andUsuUsuBajaLessThan(Integer value) {
            addCriterion("usu_usu_baja <", value, "usuUsuBaja");
            return (Criteria) this;
        }

        public Criteria andUsuUsuBajaLessThanOrEqualTo(Integer value) {
            addCriterion("usu_usu_baja <=", value, "usuUsuBaja");
            return (Criteria) this;
        }

        public Criteria andUsuUsuBajaIn(List<Integer> values) {
            addCriterion("usu_usu_baja in", values, "usuUsuBaja");
            return (Criteria) this;
        }

        public Criteria andUsuUsuBajaNotIn(List<Integer> values) {
            addCriterion("usu_usu_baja not in", values, "usuUsuBaja");
            return (Criteria) this;
        }

        public Criteria andUsuUsuBajaBetween(Integer value1, Integer value2) {
            addCriterion("usu_usu_baja between", value1, value2, "usuUsuBaja");
            return (Criteria) this;
        }

        public Criteria andUsuUsuBajaNotBetween(Integer value1, Integer value2) {
            addCriterion("usu_usu_baja not between", value1, value2, "usuUsuBaja");
            return (Criteria) this;
        }

        public Criteria andUsuUsuAltaIsNull() {
            addCriterion("usu_usu_alta is null");
            return (Criteria) this;
        }

        public Criteria andUsuUsuAltaIsNotNull() {
            addCriterion("usu_usu_alta is not null");
            return (Criteria) this;
        }

        public Criteria andUsuUsuAltaEqualTo(Integer value) {
            addCriterion("usu_usu_alta =", value, "usuUsuAlta");
            return (Criteria) this;
        }

        public Criteria andUsuUsuAltaNotEqualTo(Integer value) {
            addCriterion("usu_usu_alta <>", value, "usuUsuAlta");
            return (Criteria) this;
        }

        public Criteria andUsuUsuAltaGreaterThan(Integer value) {
            addCriterion("usu_usu_alta >", value, "usuUsuAlta");
            return (Criteria) this;
        }

        public Criteria andUsuUsuAltaGreaterThanOrEqualTo(Integer value) {
            addCriterion("usu_usu_alta >=", value, "usuUsuAlta");
            return (Criteria) this;
        }

        public Criteria andUsuUsuAltaLessThan(Integer value) {
            addCriterion("usu_usu_alta <", value, "usuUsuAlta");
            return (Criteria) this;
        }

        public Criteria andUsuUsuAltaLessThanOrEqualTo(Integer value) {
            addCriterion("usu_usu_alta <=", value, "usuUsuAlta");
            return (Criteria) this;
        }

        public Criteria andUsuUsuAltaIn(List<Integer> values) {
            addCriterion("usu_usu_alta in", values, "usuUsuAlta");
            return (Criteria) this;
        }

        public Criteria andUsuUsuAltaNotIn(List<Integer> values) {
            addCriterion("usu_usu_alta not in", values, "usuUsuAlta");
            return (Criteria) this;
        }

        public Criteria andUsuUsuAltaBetween(Integer value1, Integer value2) {
            addCriterion("usu_usu_alta between", value1, value2, "usuUsuAlta");
            return (Criteria) this;
        }

        public Criteria andUsuUsuAltaNotBetween(Integer value1, Integer value2) {
            addCriterion("usu_usu_alta not between", value1, value2, "usuUsuAlta");
            return (Criteria) this;
        }

        public Criteria andUsuUsuModificacionIsNull() {
            addCriterion("usu_usu_modificacion is null");
            return (Criteria) this;
        }

        public Criteria andUsuUsuModificacionIsNotNull() {
            addCriterion("usu_usu_modificacion is not null");
            return (Criteria) this;
        }

        public Criteria andUsuUsuModificacionEqualTo(Integer value) {
            addCriterion("usu_usu_modificacion =", value, "usuUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andUsuUsuModificacionNotEqualTo(Integer value) {
            addCriterion("usu_usu_modificacion <>", value, "usuUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andUsuUsuModificacionGreaterThan(Integer value) {
            addCriterion("usu_usu_modificacion >", value, "usuUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andUsuUsuModificacionGreaterThanOrEqualTo(Integer value) {
            addCriterion("usu_usu_modificacion >=", value, "usuUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andUsuUsuModificacionLessThan(Integer value) {
            addCriterion("usu_usu_modificacion <", value, "usuUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andUsuUsuModificacionLessThanOrEqualTo(Integer value) {
            addCriterion("usu_usu_modificacion <=", value, "usuUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andUsuUsuModificacionIn(List<Integer> values) {
            addCriterion("usu_usu_modificacion in", values, "usuUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andUsuUsuModificacionNotIn(List<Integer> values) {
            addCriterion("usu_usu_modificacion not in", values, "usuUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andUsuUsuModificacionBetween(Integer value1, Integer value2) {
            addCriterion("usu_usu_modificacion between", value1, value2, "usuUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andUsuUsuModificacionNotBetween(Integer value1, Integer value2) {
            addCriterion("usu_usu_modificacion not between", value1, value2, "usuUsuModificacion");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}