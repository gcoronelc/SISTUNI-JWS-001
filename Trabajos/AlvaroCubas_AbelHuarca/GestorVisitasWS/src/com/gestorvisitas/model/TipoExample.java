package com.gestorvisitas.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TipoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TipoExample() {
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

        public Criteria andTipCodigoIsNull() {
            addCriterion("tip_codigo is null");
            return (Criteria) this;
        }

        public Criteria andTipCodigoIsNotNull() {
            addCriterion("tip_codigo is not null");
            return (Criteria) this;
        }

        public Criteria andTipCodigoEqualTo(Integer value) {
            addCriterion("tip_codigo =", value, "tipCodigo");
            return (Criteria) this;
        }

        public Criteria andTipCodigoNotEqualTo(Integer value) {
            addCriterion("tip_codigo <>", value, "tipCodigo");
            return (Criteria) this;
        }

        public Criteria andTipCodigoGreaterThan(Integer value) {
            addCriterion("tip_codigo >", value, "tipCodigo");
            return (Criteria) this;
        }

        public Criteria andTipCodigoGreaterThanOrEqualTo(Integer value) {
            addCriterion("tip_codigo >=", value, "tipCodigo");
            return (Criteria) this;
        }

        public Criteria andTipCodigoLessThan(Integer value) {
            addCriterion("tip_codigo <", value, "tipCodigo");
            return (Criteria) this;
        }

        public Criteria andTipCodigoLessThanOrEqualTo(Integer value) {
            addCriterion("tip_codigo <=", value, "tipCodigo");
            return (Criteria) this;
        }

        public Criteria andTipCodigoIn(List<Integer> values) {
            addCriterion("tip_codigo in", values, "tipCodigo");
            return (Criteria) this;
        }

        public Criteria andTipCodigoNotIn(List<Integer> values) {
            addCriterion("tip_codigo not in", values, "tipCodigo");
            return (Criteria) this;
        }

        public Criteria andTipCodigoBetween(Integer value1, Integer value2) {
            addCriterion("tip_codigo between", value1, value2, "tipCodigo");
            return (Criteria) this;
        }

        public Criteria andTipCodigoNotBetween(Integer value1, Integer value2) {
            addCriterion("tip_codigo not between", value1, value2, "tipCodigo");
            return (Criteria) this;
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

        public Criteria andTipEstadoIsNull() {
            addCriterion("tip_estado is null");
            return (Criteria) this;
        }

        public Criteria andTipEstadoIsNotNull() {
            addCriterion("tip_estado is not null");
            return (Criteria) this;
        }

        public Criteria andTipEstadoEqualTo(Integer value) {
            addCriterion("tip_estado =", value, "tipEstado");
            return (Criteria) this;
        }

        public Criteria andTipEstadoNotEqualTo(Integer value) {
            addCriterion("tip_estado <>", value, "tipEstado");
            return (Criteria) this;
        }

        public Criteria andTipEstadoGreaterThan(Integer value) {
            addCriterion("tip_estado >", value, "tipEstado");
            return (Criteria) this;
        }

        public Criteria andTipEstadoGreaterThanOrEqualTo(Integer value) {
            addCriterion("tip_estado >=", value, "tipEstado");
            return (Criteria) this;
        }

        public Criteria andTipEstadoLessThan(Integer value) {
            addCriterion("tip_estado <", value, "tipEstado");
            return (Criteria) this;
        }

        public Criteria andTipEstadoLessThanOrEqualTo(Integer value) {
            addCriterion("tip_estado <=", value, "tipEstado");
            return (Criteria) this;
        }

        public Criteria andTipEstadoIn(List<Integer> values) {
            addCriterion("tip_estado in", values, "tipEstado");
            return (Criteria) this;
        }

        public Criteria andTipEstadoNotIn(List<Integer> values) {
            addCriterion("tip_estado not in", values, "tipEstado");
            return (Criteria) this;
        }

        public Criteria andTipEstadoBetween(Integer value1, Integer value2) {
            addCriterion("tip_estado between", value1, value2, "tipEstado");
            return (Criteria) this;
        }

        public Criteria andTipEstadoNotBetween(Integer value1, Integer value2) {
            addCriterion("tip_estado not between", value1, value2, "tipEstado");
            return (Criteria) this;
        }

        public Criteria andTipNombreIsNull() {
            addCriterion("tip_nombre is null");
            return (Criteria) this;
        }

        public Criteria andTipNombreIsNotNull() {
            addCriterion("tip_nombre is not null");
            return (Criteria) this;
        }

        public Criteria andTipNombreEqualTo(String value) {
            addCriterion("tip_nombre =", value, "tipNombre");
            return (Criteria) this;
        }

        public Criteria andTipNombreNotEqualTo(String value) {
            addCriterion("tip_nombre <>", value, "tipNombre");
            return (Criteria) this;
        }

        public Criteria andTipNombreGreaterThan(String value) {
            addCriterion("tip_nombre >", value, "tipNombre");
            return (Criteria) this;
        }

        public Criteria andTipNombreGreaterThanOrEqualTo(String value) {
            addCriterion("tip_nombre >=", value, "tipNombre");
            return (Criteria) this;
        }

        public Criteria andTipNombreLessThan(String value) {
            addCriterion("tip_nombre <", value, "tipNombre");
            return (Criteria) this;
        }

        public Criteria andTipNombreLessThanOrEqualTo(String value) {
            addCriterion("tip_nombre <=", value, "tipNombre");
            return (Criteria) this;
        }

        public Criteria andTipNombreLike(String value) {
            addCriterion("tip_nombre like", value, "tipNombre");
            return (Criteria) this;
        }

        public Criteria andTipNombreNotLike(String value) {
            addCriterion("tip_nombre not like", value, "tipNombre");
            return (Criteria) this;
        }

        public Criteria andTipNombreIn(List<String> values) {
            addCriterion("tip_nombre in", values, "tipNombre");
            return (Criteria) this;
        }

        public Criteria andTipNombreNotIn(List<String> values) {
            addCriterion("tip_nombre not in", values, "tipNombre");
            return (Criteria) this;
        }

        public Criteria andTipNombreBetween(String value1, String value2) {
            addCriterion("tip_nombre between", value1, value2, "tipNombre");
            return (Criteria) this;
        }

        public Criteria andTipNombreNotBetween(String value1, String value2) {
            addCriterion("tip_nombre not between", value1, value2, "tipNombre");
            return (Criteria) this;
        }

        public Criteria andTipDescripcionIsNull() {
            addCriterion("tip_descripcion is null");
            return (Criteria) this;
        }

        public Criteria andTipDescripcionIsNotNull() {
            addCriterion("tip_descripcion is not null");
            return (Criteria) this;
        }

        public Criteria andTipDescripcionEqualTo(String value) {
            addCriterion("tip_descripcion =", value, "tipDescripcion");
            return (Criteria) this;
        }

        public Criteria andTipDescripcionNotEqualTo(String value) {
            addCriterion("tip_descripcion <>", value, "tipDescripcion");
            return (Criteria) this;
        }

        public Criteria andTipDescripcionGreaterThan(String value) {
            addCriterion("tip_descripcion >", value, "tipDescripcion");
            return (Criteria) this;
        }

        public Criteria andTipDescripcionGreaterThanOrEqualTo(String value) {
            addCriterion("tip_descripcion >=", value, "tipDescripcion");
            return (Criteria) this;
        }

        public Criteria andTipDescripcionLessThan(String value) {
            addCriterion("tip_descripcion <", value, "tipDescripcion");
            return (Criteria) this;
        }

        public Criteria andTipDescripcionLessThanOrEqualTo(String value) {
            addCriterion("tip_descripcion <=", value, "tipDescripcion");
            return (Criteria) this;
        }

        public Criteria andTipDescripcionLike(String value) {
            addCriterion("tip_descripcion like", value, "tipDescripcion");
            return (Criteria) this;
        }

        public Criteria andTipDescripcionNotLike(String value) {
            addCriterion("tip_descripcion not like", value, "tipDescripcion");
            return (Criteria) this;
        }

        public Criteria andTipDescripcionIn(List<String> values) {
            addCriterion("tip_descripcion in", values, "tipDescripcion");
            return (Criteria) this;
        }

        public Criteria andTipDescripcionNotIn(List<String> values) {
            addCriterion("tip_descripcion not in", values, "tipDescripcion");
            return (Criteria) this;
        }

        public Criteria andTipDescripcionBetween(String value1, String value2) {
            addCriterion("tip_descripcion between", value1, value2, "tipDescripcion");
            return (Criteria) this;
        }

        public Criteria andTipDescripcionNotBetween(String value1, String value2) {
            addCriterion("tip_descripcion not between", value1, value2, "tipDescripcion");
            return (Criteria) this;
        }

        public Criteria andTipFecAltaIsNull() {
            addCriterion("tip_fec_alta is null");
            return (Criteria) this;
        }

        public Criteria andTipFecAltaIsNotNull() {
            addCriterion("tip_fec_alta is not null");
            return (Criteria) this;
        }

        public Criteria andTipFecAltaEqualTo(Date value) {
            addCriterionForJDBCDate("tip_fec_alta =", value, "tipFecAlta");
            return (Criteria) this;
        }

        public Criteria andTipFecAltaNotEqualTo(Date value) {
            addCriterionForJDBCDate("tip_fec_alta <>", value, "tipFecAlta");
            return (Criteria) this;
        }

        public Criteria andTipFecAltaGreaterThan(Date value) {
            addCriterionForJDBCDate("tip_fec_alta >", value, "tipFecAlta");
            return (Criteria) this;
        }

        public Criteria andTipFecAltaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tip_fec_alta >=", value, "tipFecAlta");
            return (Criteria) this;
        }

        public Criteria andTipFecAltaLessThan(Date value) {
            addCriterionForJDBCDate("tip_fec_alta <", value, "tipFecAlta");
            return (Criteria) this;
        }

        public Criteria andTipFecAltaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tip_fec_alta <=", value, "tipFecAlta");
            return (Criteria) this;
        }

        public Criteria andTipFecAltaIn(List<Date> values) {
            addCriterionForJDBCDate("tip_fec_alta in", values, "tipFecAlta");
            return (Criteria) this;
        }

        public Criteria andTipFecAltaNotIn(List<Date> values) {
            addCriterionForJDBCDate("tip_fec_alta not in", values, "tipFecAlta");
            return (Criteria) this;
        }

        public Criteria andTipFecAltaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tip_fec_alta between", value1, value2, "tipFecAlta");
            return (Criteria) this;
        }

        public Criteria andTipFecAltaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tip_fec_alta not between", value1, value2, "tipFecAlta");
            return (Criteria) this;
        }

        public Criteria andTipFecBajaIsNull() {
            addCriterion("tip_fec_baja is null");
            return (Criteria) this;
        }

        public Criteria andTipFecBajaIsNotNull() {
            addCriterion("tip_fec_baja is not null");
            return (Criteria) this;
        }

        public Criteria andTipFecBajaEqualTo(Date value) {
            addCriterionForJDBCDate("tip_fec_baja =", value, "tipFecBaja");
            return (Criteria) this;
        }

        public Criteria andTipFecBajaNotEqualTo(Date value) {
            addCriterionForJDBCDate("tip_fec_baja <>", value, "tipFecBaja");
            return (Criteria) this;
        }

        public Criteria andTipFecBajaGreaterThan(Date value) {
            addCriterionForJDBCDate("tip_fec_baja >", value, "tipFecBaja");
            return (Criteria) this;
        }

        public Criteria andTipFecBajaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tip_fec_baja >=", value, "tipFecBaja");
            return (Criteria) this;
        }

        public Criteria andTipFecBajaLessThan(Date value) {
            addCriterionForJDBCDate("tip_fec_baja <", value, "tipFecBaja");
            return (Criteria) this;
        }

        public Criteria andTipFecBajaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tip_fec_baja <=", value, "tipFecBaja");
            return (Criteria) this;
        }

        public Criteria andTipFecBajaIn(List<Date> values) {
            addCriterionForJDBCDate("tip_fec_baja in", values, "tipFecBaja");
            return (Criteria) this;
        }

        public Criteria andTipFecBajaNotIn(List<Date> values) {
            addCriterionForJDBCDate("tip_fec_baja not in", values, "tipFecBaja");
            return (Criteria) this;
        }

        public Criteria andTipFecBajaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tip_fec_baja between", value1, value2, "tipFecBaja");
            return (Criteria) this;
        }

        public Criteria andTipFecBajaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tip_fec_baja not between", value1, value2, "tipFecBaja");
            return (Criteria) this;
        }

        public Criteria andTipFecModificacionIsNull() {
            addCriterion("tip_fec_modificacion is null");
            return (Criteria) this;
        }

        public Criteria andTipFecModificacionIsNotNull() {
            addCriterion("tip_fec_modificacion is not null");
            return (Criteria) this;
        }

        public Criteria andTipFecModificacionEqualTo(Date value) {
            addCriterionForJDBCDate("tip_fec_modificacion =", value, "tipFecModificacion");
            return (Criteria) this;
        }

        public Criteria andTipFecModificacionNotEqualTo(Date value) {
            addCriterionForJDBCDate("tip_fec_modificacion <>", value, "tipFecModificacion");
            return (Criteria) this;
        }

        public Criteria andTipFecModificacionGreaterThan(Date value) {
            addCriterionForJDBCDate("tip_fec_modificacion >", value, "tipFecModificacion");
            return (Criteria) this;
        }

        public Criteria andTipFecModificacionGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tip_fec_modificacion >=", value, "tipFecModificacion");
            return (Criteria) this;
        }

        public Criteria andTipFecModificacionLessThan(Date value) {
            addCriterionForJDBCDate("tip_fec_modificacion <", value, "tipFecModificacion");
            return (Criteria) this;
        }

        public Criteria andTipFecModificacionLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tip_fec_modificacion <=", value, "tipFecModificacion");
            return (Criteria) this;
        }

        public Criteria andTipFecModificacionIn(List<Date> values) {
            addCriterionForJDBCDate("tip_fec_modificacion in", values, "tipFecModificacion");
            return (Criteria) this;
        }

        public Criteria andTipFecModificacionNotIn(List<Date> values) {
            addCriterionForJDBCDate("tip_fec_modificacion not in", values, "tipFecModificacion");
            return (Criteria) this;
        }

        public Criteria andTipFecModificacionBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tip_fec_modificacion between", value1, value2, "tipFecModificacion");
            return (Criteria) this;
        }

        public Criteria andTipFecModificacionNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tip_fec_modificacion not between", value1, value2, "tipFecModificacion");
            return (Criteria) this;
        }

        public Criteria andTipUsuAltaIsNull() {
            addCriterion("tip_usu_alta is null");
            return (Criteria) this;
        }

        public Criteria andTipUsuAltaIsNotNull() {
            addCriterion("tip_usu_alta is not null");
            return (Criteria) this;
        }

        public Criteria andTipUsuAltaEqualTo(Integer value) {
            addCriterion("tip_usu_alta =", value, "tipUsuAlta");
            return (Criteria) this;
        }

        public Criteria andTipUsuAltaNotEqualTo(Integer value) {
            addCriterion("tip_usu_alta <>", value, "tipUsuAlta");
            return (Criteria) this;
        }

        public Criteria andTipUsuAltaGreaterThan(Integer value) {
            addCriterion("tip_usu_alta >", value, "tipUsuAlta");
            return (Criteria) this;
        }

        public Criteria andTipUsuAltaGreaterThanOrEqualTo(Integer value) {
            addCriterion("tip_usu_alta >=", value, "tipUsuAlta");
            return (Criteria) this;
        }

        public Criteria andTipUsuAltaLessThan(Integer value) {
            addCriterion("tip_usu_alta <", value, "tipUsuAlta");
            return (Criteria) this;
        }

        public Criteria andTipUsuAltaLessThanOrEqualTo(Integer value) {
            addCriterion("tip_usu_alta <=", value, "tipUsuAlta");
            return (Criteria) this;
        }

        public Criteria andTipUsuAltaIn(List<Integer> values) {
            addCriterion("tip_usu_alta in", values, "tipUsuAlta");
            return (Criteria) this;
        }

        public Criteria andTipUsuAltaNotIn(List<Integer> values) {
            addCriterion("tip_usu_alta not in", values, "tipUsuAlta");
            return (Criteria) this;
        }

        public Criteria andTipUsuAltaBetween(Integer value1, Integer value2) {
            addCriterion("tip_usu_alta between", value1, value2, "tipUsuAlta");
            return (Criteria) this;
        }

        public Criteria andTipUsuAltaNotBetween(Integer value1, Integer value2) {
            addCriterion("tip_usu_alta not between", value1, value2, "tipUsuAlta");
            return (Criteria) this;
        }

        public Criteria andTipUsuBajaIsNull() {
            addCriterion("tip_usu_baja is null");
            return (Criteria) this;
        }

        public Criteria andTipUsuBajaIsNotNull() {
            addCriterion("tip_usu_baja is not null");
            return (Criteria) this;
        }

        public Criteria andTipUsuBajaEqualTo(Integer value) {
            addCriterion("tip_usu_baja =", value, "tipUsuBaja");
            return (Criteria) this;
        }

        public Criteria andTipUsuBajaNotEqualTo(Integer value) {
            addCriterion("tip_usu_baja <>", value, "tipUsuBaja");
            return (Criteria) this;
        }

        public Criteria andTipUsuBajaGreaterThan(Integer value) {
            addCriterion("tip_usu_baja >", value, "tipUsuBaja");
            return (Criteria) this;
        }

        public Criteria andTipUsuBajaGreaterThanOrEqualTo(Integer value) {
            addCriterion("tip_usu_baja >=", value, "tipUsuBaja");
            return (Criteria) this;
        }

        public Criteria andTipUsuBajaLessThan(Integer value) {
            addCriterion("tip_usu_baja <", value, "tipUsuBaja");
            return (Criteria) this;
        }

        public Criteria andTipUsuBajaLessThanOrEqualTo(Integer value) {
            addCriterion("tip_usu_baja <=", value, "tipUsuBaja");
            return (Criteria) this;
        }

        public Criteria andTipUsuBajaIn(List<Integer> values) {
            addCriterion("tip_usu_baja in", values, "tipUsuBaja");
            return (Criteria) this;
        }

        public Criteria andTipUsuBajaNotIn(List<Integer> values) {
            addCriterion("tip_usu_baja not in", values, "tipUsuBaja");
            return (Criteria) this;
        }

        public Criteria andTipUsuBajaBetween(Integer value1, Integer value2) {
            addCriterion("tip_usu_baja between", value1, value2, "tipUsuBaja");
            return (Criteria) this;
        }

        public Criteria andTipUsuBajaNotBetween(Integer value1, Integer value2) {
            addCriterion("tip_usu_baja not between", value1, value2, "tipUsuBaja");
            return (Criteria) this;
        }

        public Criteria andTipUsuModificacionIsNull() {
            addCriterion("tip_usu_modificacion is null");
            return (Criteria) this;
        }

        public Criteria andTipUsuModificacionIsNotNull() {
            addCriterion("tip_usu_modificacion is not null");
            return (Criteria) this;
        }

        public Criteria andTipUsuModificacionEqualTo(Integer value) {
            addCriterion("tip_usu_modificacion =", value, "tipUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andTipUsuModificacionNotEqualTo(Integer value) {
            addCriterion("tip_usu_modificacion <>", value, "tipUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andTipUsuModificacionGreaterThan(Integer value) {
            addCriterion("tip_usu_modificacion >", value, "tipUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andTipUsuModificacionGreaterThanOrEqualTo(Integer value) {
            addCriterion("tip_usu_modificacion >=", value, "tipUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andTipUsuModificacionLessThan(Integer value) {
            addCriterion("tip_usu_modificacion <", value, "tipUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andTipUsuModificacionLessThanOrEqualTo(Integer value) {
            addCriterion("tip_usu_modificacion <=", value, "tipUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andTipUsuModificacionIn(List<Integer> values) {
            addCriterion("tip_usu_modificacion in", values, "tipUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andTipUsuModificacionNotIn(List<Integer> values) {
            addCriterion("tip_usu_modificacion not in", values, "tipUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andTipUsuModificacionBetween(Integer value1, Integer value2) {
            addCriterion("tip_usu_modificacion between", value1, value2, "tipUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andTipUsuModificacionNotBetween(Integer value1, Integer value2) {
            addCriterion("tip_usu_modificacion not between", value1, value2, "tipUsuModificacion");
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