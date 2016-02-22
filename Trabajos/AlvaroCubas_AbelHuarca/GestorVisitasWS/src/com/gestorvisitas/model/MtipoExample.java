package com.gestorvisitas.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MtipoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MtipoExample() {
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

        public Criteria andMtiCodigoIsNull() {
            addCriterion("mti_codigo is null");
            return (Criteria) this;
        }

        public Criteria andMtiCodigoIsNotNull() {
            addCriterion("mti_codigo is not null");
            return (Criteria) this;
        }

        public Criteria andMtiCodigoEqualTo(Integer value) {
            addCriterion("mti_codigo =", value, "mtiCodigo");
            return (Criteria) this;
        }

        public Criteria andMtiCodigoNotEqualTo(Integer value) {
            addCriterion("mti_codigo <>", value, "mtiCodigo");
            return (Criteria) this;
        }

        public Criteria andMtiCodigoGreaterThan(Integer value) {
            addCriterion("mti_codigo >", value, "mtiCodigo");
            return (Criteria) this;
        }

        public Criteria andMtiCodigoGreaterThanOrEqualTo(Integer value) {
            addCriterion("mti_codigo >=", value, "mtiCodigo");
            return (Criteria) this;
        }

        public Criteria andMtiCodigoLessThan(Integer value) {
            addCriterion("mti_codigo <", value, "mtiCodigo");
            return (Criteria) this;
        }

        public Criteria andMtiCodigoLessThanOrEqualTo(Integer value) {
            addCriterion("mti_codigo <=", value, "mtiCodigo");
            return (Criteria) this;
        }

        public Criteria andMtiCodigoIn(List<Integer> values) {
            addCriterion("mti_codigo in", values, "mtiCodigo");
            return (Criteria) this;
        }

        public Criteria andMtiCodigoNotIn(List<Integer> values) {
            addCriterion("mti_codigo not in", values, "mtiCodigo");
            return (Criteria) this;
        }

        public Criteria andMtiCodigoBetween(Integer value1, Integer value2) {
            addCriterion("mti_codigo between", value1, value2, "mtiCodigo");
            return (Criteria) this;
        }

        public Criteria andMtiCodigoNotBetween(Integer value1, Integer value2) {
            addCriterion("mti_codigo not between", value1, value2, "mtiCodigo");
            return (Criteria) this;
        }

        public Criteria andMtiEstadoIsNull() {
            addCriterion("mti_estado is null");
            return (Criteria) this;
        }

        public Criteria andMtiEstadoIsNotNull() {
            addCriterion("mti_estado is not null");
            return (Criteria) this;
        }

        public Criteria andMtiEstadoEqualTo(Integer value) {
            addCriterion("mti_estado =", value, "mtiEstado");
            return (Criteria) this;
        }

        public Criteria andMtiEstadoNotEqualTo(Integer value) {
            addCriterion("mti_estado <>", value, "mtiEstado");
            return (Criteria) this;
        }

        public Criteria andMtiEstadoGreaterThan(Integer value) {
            addCriterion("mti_estado >", value, "mtiEstado");
            return (Criteria) this;
        }

        public Criteria andMtiEstadoGreaterThanOrEqualTo(Integer value) {
            addCriterion("mti_estado >=", value, "mtiEstado");
            return (Criteria) this;
        }

        public Criteria andMtiEstadoLessThan(Integer value) {
            addCriterion("mti_estado <", value, "mtiEstado");
            return (Criteria) this;
        }

        public Criteria andMtiEstadoLessThanOrEqualTo(Integer value) {
            addCriterion("mti_estado <=", value, "mtiEstado");
            return (Criteria) this;
        }

        public Criteria andMtiEstadoIn(List<Integer> values) {
            addCriterion("mti_estado in", values, "mtiEstado");
            return (Criteria) this;
        }

        public Criteria andMtiEstadoNotIn(List<Integer> values) {
            addCriterion("mti_estado not in", values, "mtiEstado");
            return (Criteria) this;
        }

        public Criteria andMtiEstadoBetween(Integer value1, Integer value2) {
            addCriterion("mti_estado between", value1, value2, "mtiEstado");
            return (Criteria) this;
        }

        public Criteria andMtiEstadoNotBetween(Integer value1, Integer value2) {
            addCriterion("mti_estado not between", value1, value2, "mtiEstado");
            return (Criteria) this;
        }

        public Criteria andMtiNombreIsNull() {
            addCriterion("mti_nombre is null");
            return (Criteria) this;
        }

        public Criteria andMtiNombreIsNotNull() {
            addCriterion("mti_nombre is not null");
            return (Criteria) this;
        }

        public Criteria andMtiNombreEqualTo(String value) {
            addCriterion("mti_nombre =", value, "mtiNombre");
            return (Criteria) this;
        }

        public Criteria andMtiNombreNotEqualTo(String value) {
            addCriterion("mti_nombre <>", value, "mtiNombre");
            return (Criteria) this;
        }

        public Criteria andMtiNombreGreaterThan(String value) {
            addCriterion("mti_nombre >", value, "mtiNombre");
            return (Criteria) this;
        }

        public Criteria andMtiNombreGreaterThanOrEqualTo(String value) {
            addCriterion("mti_nombre >=", value, "mtiNombre");
            return (Criteria) this;
        }

        public Criteria andMtiNombreLessThan(String value) {
            addCriterion("mti_nombre <", value, "mtiNombre");
            return (Criteria) this;
        }

        public Criteria andMtiNombreLessThanOrEqualTo(String value) {
            addCriterion("mti_nombre <=", value, "mtiNombre");
            return (Criteria) this;
        }

        public Criteria andMtiNombreLike(String value) {
            addCriterion("mti_nombre like", value, "mtiNombre");
            return (Criteria) this;
        }

        public Criteria andMtiNombreNotLike(String value) {
            addCriterion("mti_nombre not like", value, "mtiNombre");
            return (Criteria) this;
        }

        public Criteria andMtiNombreIn(List<String> values) {
            addCriterion("mti_nombre in", values, "mtiNombre");
            return (Criteria) this;
        }

        public Criteria andMtiNombreNotIn(List<String> values) {
            addCriterion("mti_nombre not in", values, "mtiNombre");
            return (Criteria) this;
        }

        public Criteria andMtiNombreBetween(String value1, String value2) {
            addCriterion("mti_nombre between", value1, value2, "mtiNombre");
            return (Criteria) this;
        }

        public Criteria andMtiNombreNotBetween(String value1, String value2) {
            addCriterion("mti_nombre not between", value1, value2, "mtiNombre");
            return (Criteria) this;
        }

        public Criteria andMtiDescripcionIsNull() {
            addCriterion("mti_descripcion is null");
            return (Criteria) this;
        }

        public Criteria andMtiDescripcionIsNotNull() {
            addCriterion("mti_descripcion is not null");
            return (Criteria) this;
        }

        public Criteria andMtiDescripcionEqualTo(String value) {
            addCriterion("mti_descripcion =", value, "mtiDescripcion");
            return (Criteria) this;
        }

        public Criteria andMtiDescripcionNotEqualTo(String value) {
            addCriterion("mti_descripcion <>", value, "mtiDescripcion");
            return (Criteria) this;
        }

        public Criteria andMtiDescripcionGreaterThan(String value) {
            addCriterion("mti_descripcion >", value, "mtiDescripcion");
            return (Criteria) this;
        }

        public Criteria andMtiDescripcionGreaterThanOrEqualTo(String value) {
            addCriterion("mti_descripcion >=", value, "mtiDescripcion");
            return (Criteria) this;
        }

        public Criteria andMtiDescripcionLessThan(String value) {
            addCriterion("mti_descripcion <", value, "mtiDescripcion");
            return (Criteria) this;
        }

        public Criteria andMtiDescripcionLessThanOrEqualTo(String value) {
            addCriterion("mti_descripcion <=", value, "mtiDescripcion");
            return (Criteria) this;
        }

        public Criteria andMtiDescripcionLike(String value) {
            addCriterion("mti_descripcion like", value, "mtiDescripcion");
            return (Criteria) this;
        }

        public Criteria andMtiDescripcionNotLike(String value) {
            addCriterion("mti_descripcion not like", value, "mtiDescripcion");
            return (Criteria) this;
        }

        public Criteria andMtiDescripcionIn(List<String> values) {
            addCriterion("mti_descripcion in", values, "mtiDescripcion");
            return (Criteria) this;
        }

        public Criteria andMtiDescripcionNotIn(List<String> values) {
            addCriterion("mti_descripcion not in", values, "mtiDescripcion");
            return (Criteria) this;
        }

        public Criteria andMtiDescripcionBetween(String value1, String value2) {
            addCriterion("mti_descripcion between", value1, value2, "mtiDescripcion");
            return (Criteria) this;
        }

        public Criteria andMtiDescripcionNotBetween(String value1, String value2) {
            addCriterion("mti_descripcion not between", value1, value2, "mtiDescripcion");
            return (Criteria) this;
        }

        public Criteria andMtiFecAltaIsNull() {
            addCriterion("mti_fec_alta is null");
            return (Criteria) this;
        }

        public Criteria andMtiFecAltaIsNotNull() {
            addCriterion("mti_fec_alta is not null");
            return (Criteria) this;
        }

        public Criteria andMtiFecAltaEqualTo(Date value) {
            addCriterionForJDBCDate("mti_fec_alta =", value, "mtiFecAlta");
            return (Criteria) this;
        }

        public Criteria andMtiFecAltaNotEqualTo(Date value) {
            addCriterionForJDBCDate("mti_fec_alta <>", value, "mtiFecAlta");
            return (Criteria) this;
        }

        public Criteria andMtiFecAltaGreaterThan(Date value) {
            addCriterionForJDBCDate("mti_fec_alta >", value, "mtiFecAlta");
            return (Criteria) this;
        }

        public Criteria andMtiFecAltaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mti_fec_alta >=", value, "mtiFecAlta");
            return (Criteria) this;
        }

        public Criteria andMtiFecAltaLessThan(Date value) {
            addCriterionForJDBCDate("mti_fec_alta <", value, "mtiFecAlta");
            return (Criteria) this;
        }

        public Criteria andMtiFecAltaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mti_fec_alta <=", value, "mtiFecAlta");
            return (Criteria) this;
        }

        public Criteria andMtiFecAltaIn(List<Date> values) {
            addCriterionForJDBCDate("mti_fec_alta in", values, "mtiFecAlta");
            return (Criteria) this;
        }

        public Criteria andMtiFecAltaNotIn(List<Date> values) {
            addCriterionForJDBCDate("mti_fec_alta not in", values, "mtiFecAlta");
            return (Criteria) this;
        }

        public Criteria andMtiFecAltaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mti_fec_alta between", value1, value2, "mtiFecAlta");
            return (Criteria) this;
        }

        public Criteria andMtiFecAltaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mti_fec_alta not between", value1, value2, "mtiFecAlta");
            return (Criteria) this;
        }

        public Criteria andMtiFecBajaIsNull() {
            addCriterion("mti_fec_baja is null");
            return (Criteria) this;
        }

        public Criteria andMtiFecBajaIsNotNull() {
            addCriterion("mti_fec_baja is not null");
            return (Criteria) this;
        }

        public Criteria andMtiFecBajaEqualTo(Date value) {
            addCriterionForJDBCDate("mti_fec_baja =", value, "mtiFecBaja");
            return (Criteria) this;
        }

        public Criteria andMtiFecBajaNotEqualTo(Date value) {
            addCriterionForJDBCDate("mti_fec_baja <>", value, "mtiFecBaja");
            return (Criteria) this;
        }

        public Criteria andMtiFecBajaGreaterThan(Date value) {
            addCriterionForJDBCDate("mti_fec_baja >", value, "mtiFecBaja");
            return (Criteria) this;
        }

        public Criteria andMtiFecBajaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mti_fec_baja >=", value, "mtiFecBaja");
            return (Criteria) this;
        }

        public Criteria andMtiFecBajaLessThan(Date value) {
            addCriterionForJDBCDate("mti_fec_baja <", value, "mtiFecBaja");
            return (Criteria) this;
        }

        public Criteria andMtiFecBajaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mti_fec_baja <=", value, "mtiFecBaja");
            return (Criteria) this;
        }

        public Criteria andMtiFecBajaIn(List<Date> values) {
            addCriterionForJDBCDate("mti_fec_baja in", values, "mtiFecBaja");
            return (Criteria) this;
        }

        public Criteria andMtiFecBajaNotIn(List<Date> values) {
            addCriterionForJDBCDate("mti_fec_baja not in", values, "mtiFecBaja");
            return (Criteria) this;
        }

        public Criteria andMtiFecBajaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mti_fec_baja between", value1, value2, "mtiFecBaja");
            return (Criteria) this;
        }

        public Criteria andMtiFecBajaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mti_fec_baja not between", value1, value2, "mtiFecBaja");
            return (Criteria) this;
        }

        public Criteria andMtiFecModificacionIsNull() {
            addCriterion("mti_fec_modificacion is null");
            return (Criteria) this;
        }

        public Criteria andMtiFecModificacionIsNotNull() {
            addCriterion("mti_fec_modificacion is not null");
            return (Criteria) this;
        }

        public Criteria andMtiFecModificacionEqualTo(Date value) {
            addCriterionForJDBCDate("mti_fec_modificacion =", value, "mtiFecModificacion");
            return (Criteria) this;
        }

        public Criteria andMtiFecModificacionNotEqualTo(Date value) {
            addCriterionForJDBCDate("mti_fec_modificacion <>", value, "mtiFecModificacion");
            return (Criteria) this;
        }

        public Criteria andMtiFecModificacionGreaterThan(Date value) {
            addCriterionForJDBCDate("mti_fec_modificacion >", value, "mtiFecModificacion");
            return (Criteria) this;
        }

        public Criteria andMtiFecModificacionGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mti_fec_modificacion >=", value, "mtiFecModificacion");
            return (Criteria) this;
        }

        public Criteria andMtiFecModificacionLessThan(Date value) {
            addCriterionForJDBCDate("mti_fec_modificacion <", value, "mtiFecModificacion");
            return (Criteria) this;
        }

        public Criteria andMtiFecModificacionLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mti_fec_modificacion <=", value, "mtiFecModificacion");
            return (Criteria) this;
        }

        public Criteria andMtiFecModificacionIn(List<Date> values) {
            addCriterionForJDBCDate("mti_fec_modificacion in", values, "mtiFecModificacion");
            return (Criteria) this;
        }

        public Criteria andMtiFecModificacionNotIn(List<Date> values) {
            addCriterionForJDBCDate("mti_fec_modificacion not in", values, "mtiFecModificacion");
            return (Criteria) this;
        }

        public Criteria andMtiFecModificacionBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mti_fec_modificacion between", value1, value2, "mtiFecModificacion");
            return (Criteria) this;
        }

        public Criteria andMtiFecModificacionNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mti_fec_modificacion not between", value1, value2, "mtiFecModificacion");
            return (Criteria) this;
        }

        public Criteria andMtiUsuAltaIsNull() {
            addCriterion("mti_usu_alta is null");
            return (Criteria) this;
        }

        public Criteria andMtiUsuAltaIsNotNull() {
            addCriterion("mti_usu_alta is not null");
            return (Criteria) this;
        }

        public Criteria andMtiUsuAltaEqualTo(Integer value) {
            addCriterion("mti_usu_alta =", value, "mtiUsuAlta");
            return (Criteria) this;
        }

        public Criteria andMtiUsuAltaNotEqualTo(Integer value) {
            addCriterion("mti_usu_alta <>", value, "mtiUsuAlta");
            return (Criteria) this;
        }

        public Criteria andMtiUsuAltaGreaterThan(Integer value) {
            addCriterion("mti_usu_alta >", value, "mtiUsuAlta");
            return (Criteria) this;
        }

        public Criteria andMtiUsuAltaGreaterThanOrEqualTo(Integer value) {
            addCriterion("mti_usu_alta >=", value, "mtiUsuAlta");
            return (Criteria) this;
        }

        public Criteria andMtiUsuAltaLessThan(Integer value) {
            addCriterion("mti_usu_alta <", value, "mtiUsuAlta");
            return (Criteria) this;
        }

        public Criteria andMtiUsuAltaLessThanOrEqualTo(Integer value) {
            addCriterion("mti_usu_alta <=", value, "mtiUsuAlta");
            return (Criteria) this;
        }

        public Criteria andMtiUsuAltaIn(List<Integer> values) {
            addCriterion("mti_usu_alta in", values, "mtiUsuAlta");
            return (Criteria) this;
        }

        public Criteria andMtiUsuAltaNotIn(List<Integer> values) {
            addCriterion("mti_usu_alta not in", values, "mtiUsuAlta");
            return (Criteria) this;
        }

        public Criteria andMtiUsuAltaBetween(Integer value1, Integer value2) {
            addCriterion("mti_usu_alta between", value1, value2, "mtiUsuAlta");
            return (Criteria) this;
        }

        public Criteria andMtiUsuAltaNotBetween(Integer value1, Integer value2) {
            addCriterion("mti_usu_alta not between", value1, value2, "mtiUsuAlta");
            return (Criteria) this;
        }

        public Criteria andMtiUsuBajaIsNull() {
            addCriterion("mti_usu_baja is null");
            return (Criteria) this;
        }

        public Criteria andMtiUsuBajaIsNotNull() {
            addCriterion("mti_usu_baja is not null");
            return (Criteria) this;
        }

        public Criteria andMtiUsuBajaEqualTo(Integer value) {
            addCriterion("mti_usu_baja =", value, "mtiUsuBaja");
            return (Criteria) this;
        }

        public Criteria andMtiUsuBajaNotEqualTo(Integer value) {
            addCriterion("mti_usu_baja <>", value, "mtiUsuBaja");
            return (Criteria) this;
        }

        public Criteria andMtiUsuBajaGreaterThan(Integer value) {
            addCriterion("mti_usu_baja >", value, "mtiUsuBaja");
            return (Criteria) this;
        }

        public Criteria andMtiUsuBajaGreaterThanOrEqualTo(Integer value) {
            addCriterion("mti_usu_baja >=", value, "mtiUsuBaja");
            return (Criteria) this;
        }

        public Criteria andMtiUsuBajaLessThan(Integer value) {
            addCriterion("mti_usu_baja <", value, "mtiUsuBaja");
            return (Criteria) this;
        }

        public Criteria andMtiUsuBajaLessThanOrEqualTo(Integer value) {
            addCriterion("mti_usu_baja <=", value, "mtiUsuBaja");
            return (Criteria) this;
        }

        public Criteria andMtiUsuBajaIn(List<Integer> values) {
            addCriterion("mti_usu_baja in", values, "mtiUsuBaja");
            return (Criteria) this;
        }

        public Criteria andMtiUsuBajaNotIn(List<Integer> values) {
            addCriterion("mti_usu_baja not in", values, "mtiUsuBaja");
            return (Criteria) this;
        }

        public Criteria andMtiUsuBajaBetween(Integer value1, Integer value2) {
            addCriterion("mti_usu_baja between", value1, value2, "mtiUsuBaja");
            return (Criteria) this;
        }

        public Criteria andMtiUsuBajaNotBetween(Integer value1, Integer value2) {
            addCriterion("mti_usu_baja not between", value1, value2, "mtiUsuBaja");
            return (Criteria) this;
        }

        public Criteria andMtiUsuModificacionIsNull() {
            addCriterion("mti_usu_modificacion is null");
            return (Criteria) this;
        }

        public Criteria andMtiUsuModificacionIsNotNull() {
            addCriterion("mti_usu_modificacion is not null");
            return (Criteria) this;
        }

        public Criteria andMtiUsuModificacionEqualTo(Integer value) {
            addCriterion("mti_usu_modificacion =", value, "mtiUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andMtiUsuModificacionNotEqualTo(Integer value) {
            addCriterion("mti_usu_modificacion <>", value, "mtiUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andMtiUsuModificacionGreaterThan(Integer value) {
            addCriterion("mti_usu_modificacion >", value, "mtiUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andMtiUsuModificacionGreaterThanOrEqualTo(Integer value) {
            addCriterion("mti_usu_modificacion >=", value, "mtiUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andMtiUsuModificacionLessThan(Integer value) {
            addCriterion("mti_usu_modificacion <", value, "mtiUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andMtiUsuModificacionLessThanOrEqualTo(Integer value) {
            addCriterion("mti_usu_modificacion <=", value, "mtiUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andMtiUsuModificacionIn(List<Integer> values) {
            addCriterion("mti_usu_modificacion in", values, "mtiUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andMtiUsuModificacionNotIn(List<Integer> values) {
            addCriterion("mti_usu_modificacion not in", values, "mtiUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andMtiUsuModificacionBetween(Integer value1, Integer value2) {
            addCriterion("mti_usu_modificacion between", value1, value2, "mtiUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andMtiUsuModificacionNotBetween(Integer value1, Integer value2) {
            addCriterion("mti_usu_modificacion not between", value1, value2, "mtiUsuModificacion");
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