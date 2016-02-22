package com.gestorvisitas.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RolExample() {
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

        public Criteria andRolEstadoIsNull() {
            addCriterion("rol_estado is null");
            return (Criteria) this;
        }

        public Criteria andRolEstadoIsNotNull() {
            addCriterion("rol_estado is not null");
            return (Criteria) this;
        }

        public Criteria andRolEstadoEqualTo(Integer value) {
            addCriterion("rol_estado =", value, "rolEstado");
            return (Criteria) this;
        }

        public Criteria andRolEstadoNotEqualTo(Integer value) {
            addCriterion("rol_estado <>", value, "rolEstado");
            return (Criteria) this;
        }

        public Criteria andRolEstadoGreaterThan(Integer value) {
            addCriterion("rol_estado >", value, "rolEstado");
            return (Criteria) this;
        }

        public Criteria andRolEstadoGreaterThanOrEqualTo(Integer value) {
            addCriterion("rol_estado >=", value, "rolEstado");
            return (Criteria) this;
        }

        public Criteria andRolEstadoLessThan(Integer value) {
            addCriterion("rol_estado <", value, "rolEstado");
            return (Criteria) this;
        }

        public Criteria andRolEstadoLessThanOrEqualTo(Integer value) {
            addCriterion("rol_estado <=", value, "rolEstado");
            return (Criteria) this;
        }

        public Criteria andRolEstadoIn(List<Integer> values) {
            addCriterion("rol_estado in", values, "rolEstado");
            return (Criteria) this;
        }

        public Criteria andRolEstadoNotIn(List<Integer> values) {
            addCriterion("rol_estado not in", values, "rolEstado");
            return (Criteria) this;
        }

        public Criteria andRolEstadoBetween(Integer value1, Integer value2) {
            addCriterion("rol_estado between", value1, value2, "rolEstado");
            return (Criteria) this;
        }

        public Criteria andRolEstadoNotBetween(Integer value1, Integer value2) {
            addCriterion("rol_estado not between", value1, value2, "rolEstado");
            return (Criteria) this;
        }

        public Criteria andRolJerarquiaIsNull() {
            addCriterion("rol_jerarquia is null");
            return (Criteria) this;
        }

        public Criteria andRolJerarquiaIsNotNull() {
            addCriterion("rol_jerarquia is not null");
            return (Criteria) this;
        }

        public Criteria andRolJerarquiaEqualTo(Integer value) {
            addCriterion("rol_jerarquia =", value, "rolJerarquia");
            return (Criteria) this;
        }

        public Criteria andRolJerarquiaNotEqualTo(Integer value) {
            addCriterion("rol_jerarquia <>", value, "rolJerarquia");
            return (Criteria) this;
        }

        public Criteria andRolJerarquiaGreaterThan(Integer value) {
            addCriterion("rol_jerarquia >", value, "rolJerarquia");
            return (Criteria) this;
        }

        public Criteria andRolJerarquiaGreaterThanOrEqualTo(Integer value) {
            addCriterion("rol_jerarquia >=", value, "rolJerarquia");
            return (Criteria) this;
        }

        public Criteria andRolJerarquiaLessThan(Integer value) {
            addCriterion("rol_jerarquia <", value, "rolJerarquia");
            return (Criteria) this;
        }

        public Criteria andRolJerarquiaLessThanOrEqualTo(Integer value) {
            addCriterion("rol_jerarquia <=", value, "rolJerarquia");
            return (Criteria) this;
        }

        public Criteria andRolJerarquiaIn(List<Integer> values) {
            addCriterion("rol_jerarquia in", values, "rolJerarquia");
            return (Criteria) this;
        }

        public Criteria andRolJerarquiaNotIn(List<Integer> values) {
            addCriterion("rol_jerarquia not in", values, "rolJerarquia");
            return (Criteria) this;
        }

        public Criteria andRolJerarquiaBetween(Integer value1, Integer value2) {
            addCriterion("rol_jerarquia between", value1, value2, "rolJerarquia");
            return (Criteria) this;
        }

        public Criteria andRolJerarquiaNotBetween(Integer value1, Integer value2) {
            addCriterion("rol_jerarquia not between", value1, value2, "rolJerarquia");
            return (Criteria) this;
        }

        public Criteria andRolNombreIsNull() {
            addCriterion("rol_nombre is null");
            return (Criteria) this;
        }

        public Criteria andRolNombreIsNotNull() {
            addCriterion("rol_nombre is not null");
            return (Criteria) this;
        }

        public Criteria andRolNombreEqualTo(String value) {
            addCriterion("rol_nombre =", value, "rolNombre");
            return (Criteria) this;
        }

        public Criteria andRolNombreNotEqualTo(String value) {
            addCriterion("rol_nombre <>", value, "rolNombre");
            return (Criteria) this;
        }

        public Criteria andRolNombreGreaterThan(String value) {
            addCriterion("rol_nombre >", value, "rolNombre");
            return (Criteria) this;
        }

        public Criteria andRolNombreGreaterThanOrEqualTo(String value) {
            addCriterion("rol_nombre >=", value, "rolNombre");
            return (Criteria) this;
        }

        public Criteria andRolNombreLessThan(String value) {
            addCriterion("rol_nombre <", value, "rolNombre");
            return (Criteria) this;
        }

        public Criteria andRolNombreLessThanOrEqualTo(String value) {
            addCriterion("rol_nombre <=", value, "rolNombre");
            return (Criteria) this;
        }

        public Criteria andRolNombreLike(String value) {
            addCriterion("rol_nombre like", value, "rolNombre");
            return (Criteria) this;
        }

        public Criteria andRolNombreNotLike(String value) {
            addCriterion("rol_nombre not like", value, "rolNombre");
            return (Criteria) this;
        }

        public Criteria andRolNombreIn(List<String> values) {
            addCriterion("rol_nombre in", values, "rolNombre");
            return (Criteria) this;
        }

        public Criteria andRolNombreNotIn(List<String> values) {
            addCriterion("rol_nombre not in", values, "rolNombre");
            return (Criteria) this;
        }

        public Criteria andRolNombreBetween(String value1, String value2) {
            addCriterion("rol_nombre between", value1, value2, "rolNombre");
            return (Criteria) this;
        }

        public Criteria andRolNombreNotBetween(String value1, String value2) {
            addCriterion("rol_nombre not between", value1, value2, "rolNombre");
            return (Criteria) this;
        }

        public Criteria andRolDescripcionIsNull() {
            addCriterion("rol_descripcion is null");
            return (Criteria) this;
        }

        public Criteria andRolDescripcionIsNotNull() {
            addCriterion("rol_descripcion is not null");
            return (Criteria) this;
        }

        public Criteria andRolDescripcionEqualTo(String value) {
            addCriterion("rol_descripcion =", value, "rolDescripcion");
            return (Criteria) this;
        }

        public Criteria andRolDescripcionNotEqualTo(String value) {
            addCriterion("rol_descripcion <>", value, "rolDescripcion");
            return (Criteria) this;
        }

        public Criteria andRolDescripcionGreaterThan(String value) {
            addCriterion("rol_descripcion >", value, "rolDescripcion");
            return (Criteria) this;
        }

        public Criteria andRolDescripcionGreaterThanOrEqualTo(String value) {
            addCriterion("rol_descripcion >=", value, "rolDescripcion");
            return (Criteria) this;
        }

        public Criteria andRolDescripcionLessThan(String value) {
            addCriterion("rol_descripcion <", value, "rolDescripcion");
            return (Criteria) this;
        }

        public Criteria andRolDescripcionLessThanOrEqualTo(String value) {
            addCriterion("rol_descripcion <=", value, "rolDescripcion");
            return (Criteria) this;
        }

        public Criteria andRolDescripcionLike(String value) {
            addCriterion("rol_descripcion like", value, "rolDescripcion");
            return (Criteria) this;
        }

        public Criteria andRolDescripcionNotLike(String value) {
            addCriterion("rol_descripcion not like", value, "rolDescripcion");
            return (Criteria) this;
        }

        public Criteria andRolDescripcionIn(List<String> values) {
            addCriterion("rol_descripcion in", values, "rolDescripcion");
            return (Criteria) this;
        }

        public Criteria andRolDescripcionNotIn(List<String> values) {
            addCriterion("rol_descripcion not in", values, "rolDescripcion");
            return (Criteria) this;
        }

        public Criteria andRolDescripcionBetween(String value1, String value2) {
            addCriterion("rol_descripcion between", value1, value2, "rolDescripcion");
            return (Criteria) this;
        }

        public Criteria andRolDescripcionNotBetween(String value1, String value2) {
            addCriterion("rol_descripcion not between", value1, value2, "rolDescripcion");
            return (Criteria) this;
        }

        public Criteria andRolFecAltaIsNull() {
            addCriterion("rol_fec_alta is null");
            return (Criteria) this;
        }

        public Criteria andRolFecAltaIsNotNull() {
            addCriterion("rol_fec_alta is not null");
            return (Criteria) this;
        }

        public Criteria andRolFecAltaEqualTo(Date value) {
            addCriterionForJDBCDate("rol_fec_alta =", value, "rolFecAlta");
            return (Criteria) this;
        }

        public Criteria andRolFecAltaNotEqualTo(Date value) {
            addCriterionForJDBCDate("rol_fec_alta <>", value, "rolFecAlta");
            return (Criteria) this;
        }

        public Criteria andRolFecAltaGreaterThan(Date value) {
            addCriterionForJDBCDate("rol_fec_alta >", value, "rolFecAlta");
            return (Criteria) this;
        }

        public Criteria andRolFecAltaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rol_fec_alta >=", value, "rolFecAlta");
            return (Criteria) this;
        }

        public Criteria andRolFecAltaLessThan(Date value) {
            addCriterionForJDBCDate("rol_fec_alta <", value, "rolFecAlta");
            return (Criteria) this;
        }

        public Criteria andRolFecAltaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rol_fec_alta <=", value, "rolFecAlta");
            return (Criteria) this;
        }

        public Criteria andRolFecAltaIn(List<Date> values) {
            addCriterionForJDBCDate("rol_fec_alta in", values, "rolFecAlta");
            return (Criteria) this;
        }

        public Criteria andRolFecAltaNotIn(List<Date> values) {
            addCriterionForJDBCDate("rol_fec_alta not in", values, "rolFecAlta");
            return (Criteria) this;
        }

        public Criteria andRolFecAltaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rol_fec_alta between", value1, value2, "rolFecAlta");
            return (Criteria) this;
        }

        public Criteria andRolFecAltaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rol_fec_alta not between", value1, value2, "rolFecAlta");
            return (Criteria) this;
        }

        public Criteria andRolFecBajaIsNull() {
            addCriterion("rol_fec_baja is null");
            return (Criteria) this;
        }

        public Criteria andRolFecBajaIsNotNull() {
            addCriterion("rol_fec_baja is not null");
            return (Criteria) this;
        }

        public Criteria andRolFecBajaEqualTo(Date value) {
            addCriterionForJDBCDate("rol_fec_baja =", value, "rolFecBaja");
            return (Criteria) this;
        }

        public Criteria andRolFecBajaNotEqualTo(Date value) {
            addCriterionForJDBCDate("rol_fec_baja <>", value, "rolFecBaja");
            return (Criteria) this;
        }

        public Criteria andRolFecBajaGreaterThan(Date value) {
            addCriterionForJDBCDate("rol_fec_baja >", value, "rolFecBaja");
            return (Criteria) this;
        }

        public Criteria andRolFecBajaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rol_fec_baja >=", value, "rolFecBaja");
            return (Criteria) this;
        }

        public Criteria andRolFecBajaLessThan(Date value) {
            addCriterionForJDBCDate("rol_fec_baja <", value, "rolFecBaja");
            return (Criteria) this;
        }

        public Criteria andRolFecBajaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rol_fec_baja <=", value, "rolFecBaja");
            return (Criteria) this;
        }

        public Criteria andRolFecBajaIn(List<Date> values) {
            addCriterionForJDBCDate("rol_fec_baja in", values, "rolFecBaja");
            return (Criteria) this;
        }

        public Criteria andRolFecBajaNotIn(List<Date> values) {
            addCriterionForJDBCDate("rol_fec_baja not in", values, "rolFecBaja");
            return (Criteria) this;
        }

        public Criteria andRolFecBajaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rol_fec_baja between", value1, value2, "rolFecBaja");
            return (Criteria) this;
        }

        public Criteria andRolFecBajaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rol_fec_baja not between", value1, value2, "rolFecBaja");
            return (Criteria) this;
        }

        public Criteria andRolFecModificacionIsNull() {
            addCriterion("rol_fec_modificacion is null");
            return (Criteria) this;
        }

        public Criteria andRolFecModificacionIsNotNull() {
            addCriterion("rol_fec_modificacion is not null");
            return (Criteria) this;
        }

        public Criteria andRolFecModificacionEqualTo(Date value) {
            addCriterionForJDBCDate("rol_fec_modificacion =", value, "rolFecModificacion");
            return (Criteria) this;
        }

        public Criteria andRolFecModificacionNotEqualTo(Date value) {
            addCriterionForJDBCDate("rol_fec_modificacion <>", value, "rolFecModificacion");
            return (Criteria) this;
        }

        public Criteria andRolFecModificacionGreaterThan(Date value) {
            addCriterionForJDBCDate("rol_fec_modificacion >", value, "rolFecModificacion");
            return (Criteria) this;
        }

        public Criteria andRolFecModificacionGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rol_fec_modificacion >=", value, "rolFecModificacion");
            return (Criteria) this;
        }

        public Criteria andRolFecModificacionLessThan(Date value) {
            addCriterionForJDBCDate("rol_fec_modificacion <", value, "rolFecModificacion");
            return (Criteria) this;
        }

        public Criteria andRolFecModificacionLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rol_fec_modificacion <=", value, "rolFecModificacion");
            return (Criteria) this;
        }

        public Criteria andRolFecModificacionIn(List<Date> values) {
            addCriterionForJDBCDate("rol_fec_modificacion in", values, "rolFecModificacion");
            return (Criteria) this;
        }

        public Criteria andRolFecModificacionNotIn(List<Date> values) {
            addCriterionForJDBCDate("rol_fec_modificacion not in", values, "rolFecModificacion");
            return (Criteria) this;
        }

        public Criteria andRolFecModificacionBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rol_fec_modificacion between", value1, value2, "rolFecModificacion");
            return (Criteria) this;
        }

        public Criteria andRolFecModificacionNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rol_fec_modificacion not between", value1, value2, "rolFecModificacion");
            return (Criteria) this;
        }

        public Criteria andRolUsuAltaIsNull() {
            addCriterion("rol_usu_alta is null");
            return (Criteria) this;
        }

        public Criteria andRolUsuAltaIsNotNull() {
            addCriterion("rol_usu_alta is not null");
            return (Criteria) this;
        }

        public Criteria andRolUsuAltaEqualTo(Integer value) {
            addCriterion("rol_usu_alta =", value, "rolUsuAlta");
            return (Criteria) this;
        }

        public Criteria andRolUsuAltaNotEqualTo(Integer value) {
            addCriterion("rol_usu_alta <>", value, "rolUsuAlta");
            return (Criteria) this;
        }

        public Criteria andRolUsuAltaGreaterThan(Integer value) {
            addCriterion("rol_usu_alta >", value, "rolUsuAlta");
            return (Criteria) this;
        }

        public Criteria andRolUsuAltaGreaterThanOrEqualTo(Integer value) {
            addCriterion("rol_usu_alta >=", value, "rolUsuAlta");
            return (Criteria) this;
        }

        public Criteria andRolUsuAltaLessThan(Integer value) {
            addCriterion("rol_usu_alta <", value, "rolUsuAlta");
            return (Criteria) this;
        }

        public Criteria andRolUsuAltaLessThanOrEqualTo(Integer value) {
            addCriterion("rol_usu_alta <=", value, "rolUsuAlta");
            return (Criteria) this;
        }

        public Criteria andRolUsuAltaIn(List<Integer> values) {
            addCriterion("rol_usu_alta in", values, "rolUsuAlta");
            return (Criteria) this;
        }

        public Criteria andRolUsuAltaNotIn(List<Integer> values) {
            addCriterion("rol_usu_alta not in", values, "rolUsuAlta");
            return (Criteria) this;
        }

        public Criteria andRolUsuAltaBetween(Integer value1, Integer value2) {
            addCriterion("rol_usu_alta between", value1, value2, "rolUsuAlta");
            return (Criteria) this;
        }

        public Criteria andRolUsuAltaNotBetween(Integer value1, Integer value2) {
            addCriterion("rol_usu_alta not between", value1, value2, "rolUsuAlta");
            return (Criteria) this;
        }

        public Criteria andRolUsuBajaIsNull() {
            addCriterion("rol_usu_baja is null");
            return (Criteria) this;
        }

        public Criteria andRolUsuBajaIsNotNull() {
            addCriterion("rol_usu_baja is not null");
            return (Criteria) this;
        }

        public Criteria andRolUsuBajaEqualTo(Integer value) {
            addCriterion("rol_usu_baja =", value, "rolUsuBaja");
            return (Criteria) this;
        }

        public Criteria andRolUsuBajaNotEqualTo(Integer value) {
            addCriterion("rol_usu_baja <>", value, "rolUsuBaja");
            return (Criteria) this;
        }

        public Criteria andRolUsuBajaGreaterThan(Integer value) {
            addCriterion("rol_usu_baja >", value, "rolUsuBaja");
            return (Criteria) this;
        }

        public Criteria andRolUsuBajaGreaterThanOrEqualTo(Integer value) {
            addCriterion("rol_usu_baja >=", value, "rolUsuBaja");
            return (Criteria) this;
        }

        public Criteria andRolUsuBajaLessThan(Integer value) {
            addCriterion("rol_usu_baja <", value, "rolUsuBaja");
            return (Criteria) this;
        }

        public Criteria andRolUsuBajaLessThanOrEqualTo(Integer value) {
            addCriterion("rol_usu_baja <=", value, "rolUsuBaja");
            return (Criteria) this;
        }

        public Criteria andRolUsuBajaIn(List<Integer> values) {
            addCriterion("rol_usu_baja in", values, "rolUsuBaja");
            return (Criteria) this;
        }

        public Criteria andRolUsuBajaNotIn(List<Integer> values) {
            addCriterion("rol_usu_baja not in", values, "rolUsuBaja");
            return (Criteria) this;
        }

        public Criteria andRolUsuBajaBetween(Integer value1, Integer value2) {
            addCriterion("rol_usu_baja between", value1, value2, "rolUsuBaja");
            return (Criteria) this;
        }

        public Criteria andRolUsuBajaNotBetween(Integer value1, Integer value2) {
            addCriterion("rol_usu_baja not between", value1, value2, "rolUsuBaja");
            return (Criteria) this;
        }

        public Criteria andRolUsuModificacionIsNull() {
            addCriterion("rol_usu_modificacion is null");
            return (Criteria) this;
        }

        public Criteria andRolUsuModificacionIsNotNull() {
            addCriterion("rol_usu_modificacion is not null");
            return (Criteria) this;
        }

        public Criteria andRolUsuModificacionEqualTo(Integer value) {
            addCriterion("rol_usu_modificacion =", value, "rolUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andRolUsuModificacionNotEqualTo(Integer value) {
            addCriterion("rol_usu_modificacion <>", value, "rolUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andRolUsuModificacionGreaterThan(Integer value) {
            addCriterion("rol_usu_modificacion >", value, "rolUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andRolUsuModificacionGreaterThanOrEqualTo(Integer value) {
            addCriterion("rol_usu_modificacion >=", value, "rolUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andRolUsuModificacionLessThan(Integer value) {
            addCriterion("rol_usu_modificacion <", value, "rolUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andRolUsuModificacionLessThanOrEqualTo(Integer value) {
            addCriterion("rol_usu_modificacion <=", value, "rolUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andRolUsuModificacionIn(List<Integer> values) {
            addCriterion("rol_usu_modificacion in", values, "rolUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andRolUsuModificacionNotIn(List<Integer> values) {
            addCriterion("rol_usu_modificacion not in", values, "rolUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andRolUsuModificacionBetween(Integer value1, Integer value2) {
            addCriterion("rol_usu_modificacion between", value1, value2, "rolUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andRolUsuModificacionNotBetween(Integer value1, Integer value2) {
            addCriterion("rol_usu_modificacion not between", value1, value2, "rolUsuModificacion");
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