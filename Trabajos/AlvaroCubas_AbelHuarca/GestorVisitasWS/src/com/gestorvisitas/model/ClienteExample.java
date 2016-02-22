package com.gestorvisitas.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ClienteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClienteExample() {
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

        public Criteria andCliRucIsNull() {
            addCriterion("cli_ruc is null");
            return (Criteria) this;
        }

        public Criteria andCliRucIsNotNull() {
            addCriterion("cli_ruc is not null");
            return (Criteria) this;
        }

        public Criteria andCliRucEqualTo(String value) {
            addCriterion("cli_ruc =", value, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucNotEqualTo(String value) {
            addCriterion("cli_ruc <>", value, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucGreaterThan(String value) {
            addCriterion("cli_ruc >", value, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucGreaterThanOrEqualTo(String value) {
            addCriterion("cli_ruc >=", value, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucLessThan(String value) {
            addCriterion("cli_ruc <", value, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucLessThanOrEqualTo(String value) {
            addCriterion("cli_ruc <=", value, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucLike(String value) {
            addCriterion("cli_ruc like", value, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucNotLike(String value) {
            addCriterion("cli_ruc not like", value, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucIn(List<String> values) {
            addCriterion("cli_ruc in", values, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucNotIn(List<String> values) {
            addCriterion("cli_ruc not in", values, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucBetween(String value1, String value2) {
            addCriterion("cli_ruc between", value1, value2, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliRucNotBetween(String value1, String value2) {
            addCriterion("cli_ruc not between", value1, value2, "cliRuc");
            return (Criteria) this;
        }

        public Criteria andCliEstadoIsNull() {
            addCriterion("cli_estado is null");
            return (Criteria) this;
        }

        public Criteria andCliEstadoIsNotNull() {
            addCriterion("cli_estado is not null");
            return (Criteria) this;
        }

        public Criteria andCliEstadoEqualTo(Integer value) {
            addCriterion("cli_estado =", value, "cliEstado");
            return (Criteria) this;
        }

        public Criteria andCliEstadoNotEqualTo(Integer value) {
            addCriterion("cli_estado <>", value, "cliEstado");
            return (Criteria) this;
        }

        public Criteria andCliEstadoGreaterThan(Integer value) {
            addCriterion("cli_estado >", value, "cliEstado");
            return (Criteria) this;
        }

        public Criteria andCliEstadoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cli_estado >=", value, "cliEstado");
            return (Criteria) this;
        }

        public Criteria andCliEstadoLessThan(Integer value) {
            addCriterion("cli_estado <", value, "cliEstado");
            return (Criteria) this;
        }

        public Criteria andCliEstadoLessThanOrEqualTo(Integer value) {
            addCriterion("cli_estado <=", value, "cliEstado");
            return (Criteria) this;
        }

        public Criteria andCliEstadoIn(List<Integer> values) {
            addCriterion("cli_estado in", values, "cliEstado");
            return (Criteria) this;
        }

        public Criteria andCliEstadoNotIn(List<Integer> values) {
            addCriterion("cli_estado not in", values, "cliEstado");
            return (Criteria) this;
        }

        public Criteria andCliEstadoBetween(Integer value1, Integer value2) {
            addCriterion("cli_estado between", value1, value2, "cliEstado");
            return (Criteria) this;
        }

        public Criteria andCliEstadoNotBetween(Integer value1, Integer value2) {
            addCriterion("cli_estado not between", value1, value2, "cliEstado");
            return (Criteria) this;
        }

        public Criteria andCliRazonSocialIsNull() {
            addCriterion("cli_razon_social is null");
            return (Criteria) this;
        }

        public Criteria andCliRazonSocialIsNotNull() {
            addCriterion("cli_razon_social is not null");
            return (Criteria) this;
        }

        public Criteria andCliRazonSocialEqualTo(String value) {
            addCriterion("cli_razon_social =", value, "cliRazonSocial");
            return (Criteria) this;
        }

        public Criteria andCliRazonSocialNotEqualTo(String value) {
            addCriterion("cli_razon_social <>", value, "cliRazonSocial");
            return (Criteria) this;
        }

        public Criteria andCliRazonSocialGreaterThan(String value) {
            addCriterion("cli_razon_social >", value, "cliRazonSocial");
            return (Criteria) this;
        }

        public Criteria andCliRazonSocialGreaterThanOrEqualTo(String value) {
            addCriterion("cli_razon_social >=", value, "cliRazonSocial");
            return (Criteria) this;
        }

        public Criteria andCliRazonSocialLessThan(String value) {
            addCriterion("cli_razon_social <", value, "cliRazonSocial");
            return (Criteria) this;
        }

        public Criteria andCliRazonSocialLessThanOrEqualTo(String value) {
            addCriterion("cli_razon_social <=", value, "cliRazonSocial");
            return (Criteria) this;
        }

        public Criteria andCliRazonSocialLike(String value) {
            addCriterion("cli_razon_social like", value, "cliRazonSocial");
            return (Criteria) this;
        }

        public Criteria andCliRazonSocialNotLike(String value) {
            addCriterion("cli_razon_social not like", value, "cliRazonSocial");
            return (Criteria) this;
        }

        public Criteria andCliRazonSocialIn(List<String> values) {
            addCriterion("cli_razon_social in", values, "cliRazonSocial");
            return (Criteria) this;
        }

        public Criteria andCliRazonSocialNotIn(List<String> values) {
            addCriterion("cli_razon_social not in", values, "cliRazonSocial");
            return (Criteria) this;
        }

        public Criteria andCliRazonSocialBetween(String value1, String value2) {
            addCriterion("cli_razon_social between", value1, value2, "cliRazonSocial");
            return (Criteria) this;
        }

        public Criteria andCliRazonSocialNotBetween(String value1, String value2) {
            addCriterion("cli_razon_social not between", value1, value2, "cliRazonSocial");
            return (Criteria) this;
        }

        public Criteria andCliGerenteGeneralIsNull() {
            addCriterion("cli_gerente_general is null");
            return (Criteria) this;
        }

        public Criteria andCliGerenteGeneralIsNotNull() {
            addCriterion("cli_gerente_general is not null");
            return (Criteria) this;
        }

        public Criteria andCliGerenteGeneralEqualTo(String value) {
            addCriterion("cli_gerente_general =", value, "cliGerenteGeneral");
            return (Criteria) this;
        }

        public Criteria andCliGerenteGeneralNotEqualTo(String value) {
            addCriterion("cli_gerente_general <>", value, "cliGerenteGeneral");
            return (Criteria) this;
        }

        public Criteria andCliGerenteGeneralGreaterThan(String value) {
            addCriterion("cli_gerente_general >", value, "cliGerenteGeneral");
            return (Criteria) this;
        }

        public Criteria andCliGerenteGeneralGreaterThanOrEqualTo(String value) {
            addCriterion("cli_gerente_general >=", value, "cliGerenteGeneral");
            return (Criteria) this;
        }

        public Criteria andCliGerenteGeneralLessThan(String value) {
            addCriterion("cli_gerente_general <", value, "cliGerenteGeneral");
            return (Criteria) this;
        }

        public Criteria andCliGerenteGeneralLessThanOrEqualTo(String value) {
            addCriterion("cli_gerente_general <=", value, "cliGerenteGeneral");
            return (Criteria) this;
        }

        public Criteria andCliGerenteGeneralLike(String value) {
            addCriterion("cli_gerente_general like", value, "cliGerenteGeneral");
            return (Criteria) this;
        }

        public Criteria andCliGerenteGeneralNotLike(String value) {
            addCriterion("cli_gerente_general not like", value, "cliGerenteGeneral");
            return (Criteria) this;
        }

        public Criteria andCliGerenteGeneralIn(List<String> values) {
            addCriterion("cli_gerente_general in", values, "cliGerenteGeneral");
            return (Criteria) this;
        }

        public Criteria andCliGerenteGeneralNotIn(List<String> values) {
            addCriterion("cli_gerente_general not in", values, "cliGerenteGeneral");
            return (Criteria) this;
        }

        public Criteria andCliGerenteGeneralBetween(String value1, String value2) {
            addCriterion("cli_gerente_general between", value1, value2, "cliGerenteGeneral");
            return (Criteria) this;
        }

        public Criteria andCliGerenteGeneralNotBetween(String value1, String value2) {
            addCriterion("cli_gerente_general not between", value1, value2, "cliGerenteGeneral");
            return (Criteria) this;
        }

        public Criteria andCliGerenteCuentaIsNull() {
            addCriterion("cli_gerente_cuenta is null");
            return (Criteria) this;
        }

        public Criteria andCliGerenteCuentaIsNotNull() {
            addCriterion("cli_gerente_cuenta is not null");
            return (Criteria) this;
        }

        public Criteria andCliGerenteCuentaEqualTo(String value) {
            addCriterion("cli_gerente_cuenta =", value, "cliGerenteCuenta");
            return (Criteria) this;
        }

        public Criteria andCliGerenteCuentaNotEqualTo(String value) {
            addCriterion("cli_gerente_cuenta <>", value, "cliGerenteCuenta");
            return (Criteria) this;
        }

        public Criteria andCliGerenteCuentaGreaterThan(String value) {
            addCriterion("cli_gerente_cuenta >", value, "cliGerenteCuenta");
            return (Criteria) this;
        }

        public Criteria andCliGerenteCuentaGreaterThanOrEqualTo(String value) {
            addCriterion("cli_gerente_cuenta >=", value, "cliGerenteCuenta");
            return (Criteria) this;
        }

        public Criteria andCliGerenteCuentaLessThan(String value) {
            addCriterion("cli_gerente_cuenta <", value, "cliGerenteCuenta");
            return (Criteria) this;
        }

        public Criteria andCliGerenteCuentaLessThanOrEqualTo(String value) {
            addCriterion("cli_gerente_cuenta <=", value, "cliGerenteCuenta");
            return (Criteria) this;
        }

        public Criteria andCliGerenteCuentaLike(String value) {
            addCriterion("cli_gerente_cuenta like", value, "cliGerenteCuenta");
            return (Criteria) this;
        }

        public Criteria andCliGerenteCuentaNotLike(String value) {
            addCriterion("cli_gerente_cuenta not like", value, "cliGerenteCuenta");
            return (Criteria) this;
        }

        public Criteria andCliGerenteCuentaIn(List<String> values) {
            addCriterion("cli_gerente_cuenta in", values, "cliGerenteCuenta");
            return (Criteria) this;
        }

        public Criteria andCliGerenteCuentaNotIn(List<String> values) {
            addCriterion("cli_gerente_cuenta not in", values, "cliGerenteCuenta");
            return (Criteria) this;
        }

        public Criteria andCliGerenteCuentaBetween(String value1, String value2) {
            addCriterion("cli_gerente_cuenta between", value1, value2, "cliGerenteCuenta");
            return (Criteria) this;
        }

        public Criteria andCliGerenteCuentaNotBetween(String value1, String value2) {
            addCriterion("cli_gerente_cuenta not between", value1, value2, "cliGerenteCuenta");
            return (Criteria) this;
        }

        public Criteria andCliSectorComercialIsNull() {
            addCriterion("cli_sector_comercial is null");
            return (Criteria) this;
        }

        public Criteria andCliSectorComercialIsNotNull() {
            addCriterion("cli_sector_comercial is not null");
            return (Criteria) this;
        }

        public Criteria andCliSectorComercialEqualTo(String value) {
            addCriterion("cli_sector_comercial =", value, "cliSectorComercial");
            return (Criteria) this;
        }

        public Criteria andCliSectorComercialNotEqualTo(String value) {
            addCriterion("cli_sector_comercial <>", value, "cliSectorComercial");
            return (Criteria) this;
        }

        public Criteria andCliSectorComercialGreaterThan(String value) {
            addCriterion("cli_sector_comercial >", value, "cliSectorComercial");
            return (Criteria) this;
        }

        public Criteria andCliSectorComercialGreaterThanOrEqualTo(String value) {
            addCriterion("cli_sector_comercial >=", value, "cliSectorComercial");
            return (Criteria) this;
        }

        public Criteria andCliSectorComercialLessThan(String value) {
            addCriterion("cli_sector_comercial <", value, "cliSectorComercial");
            return (Criteria) this;
        }

        public Criteria andCliSectorComercialLessThanOrEqualTo(String value) {
            addCriterion("cli_sector_comercial <=", value, "cliSectorComercial");
            return (Criteria) this;
        }

        public Criteria andCliSectorComercialLike(String value) {
            addCriterion("cli_sector_comercial like", value, "cliSectorComercial");
            return (Criteria) this;
        }

        public Criteria andCliSectorComercialNotLike(String value) {
            addCriterion("cli_sector_comercial not like", value, "cliSectorComercial");
            return (Criteria) this;
        }

        public Criteria andCliSectorComercialIn(List<String> values) {
            addCriterion("cli_sector_comercial in", values, "cliSectorComercial");
            return (Criteria) this;
        }

        public Criteria andCliSectorComercialNotIn(List<String> values) {
            addCriterion("cli_sector_comercial not in", values, "cliSectorComercial");
            return (Criteria) this;
        }

        public Criteria andCliSectorComercialBetween(String value1, String value2) {
            addCriterion("cli_sector_comercial between", value1, value2, "cliSectorComercial");
            return (Criteria) this;
        }

        public Criteria andCliSectorComercialNotBetween(String value1, String value2) {
            addCriterion("cli_sector_comercial not between", value1, value2, "cliSectorComercial");
            return (Criteria) this;
        }

        public Criteria andCliLiderVentaIsNull() {
            addCriterion("cli_lider_venta is null");
            return (Criteria) this;
        }

        public Criteria andCliLiderVentaIsNotNull() {
            addCriterion("cli_lider_venta is not null");
            return (Criteria) this;
        }

        public Criteria andCliLiderVentaEqualTo(String value) {
            addCriterion("cli_lider_venta =", value, "cliLiderVenta");
            return (Criteria) this;
        }

        public Criteria andCliLiderVentaNotEqualTo(String value) {
            addCriterion("cli_lider_venta <>", value, "cliLiderVenta");
            return (Criteria) this;
        }

        public Criteria andCliLiderVentaGreaterThan(String value) {
            addCriterion("cli_lider_venta >", value, "cliLiderVenta");
            return (Criteria) this;
        }

        public Criteria andCliLiderVentaGreaterThanOrEqualTo(String value) {
            addCriterion("cli_lider_venta >=", value, "cliLiderVenta");
            return (Criteria) this;
        }

        public Criteria andCliLiderVentaLessThan(String value) {
            addCriterion("cli_lider_venta <", value, "cliLiderVenta");
            return (Criteria) this;
        }

        public Criteria andCliLiderVentaLessThanOrEqualTo(String value) {
            addCriterion("cli_lider_venta <=", value, "cliLiderVenta");
            return (Criteria) this;
        }

        public Criteria andCliLiderVentaLike(String value) {
            addCriterion("cli_lider_venta like", value, "cliLiderVenta");
            return (Criteria) this;
        }

        public Criteria andCliLiderVentaNotLike(String value) {
            addCriterion("cli_lider_venta not like", value, "cliLiderVenta");
            return (Criteria) this;
        }

        public Criteria andCliLiderVentaIn(List<String> values) {
            addCriterion("cli_lider_venta in", values, "cliLiderVenta");
            return (Criteria) this;
        }

        public Criteria andCliLiderVentaNotIn(List<String> values) {
            addCriterion("cli_lider_venta not in", values, "cliLiderVenta");
            return (Criteria) this;
        }

        public Criteria andCliLiderVentaBetween(String value1, String value2) {
            addCriterion("cli_lider_venta between", value1, value2, "cliLiderVenta");
            return (Criteria) this;
        }

        public Criteria andCliLiderVentaNotBetween(String value1, String value2) {
            addCriterion("cli_lider_venta not between", value1, value2, "cliLiderVenta");
            return (Criteria) this;
        }

        public Criteria andCliDireccionIsNull() {
            addCriterion("cli_direccion is null");
            return (Criteria) this;
        }

        public Criteria andCliDireccionIsNotNull() {
            addCriterion("cli_direccion is not null");
            return (Criteria) this;
        }

        public Criteria andCliDireccionEqualTo(String value) {
            addCriterion("cli_direccion =", value, "cliDireccion");
            return (Criteria) this;
        }

        public Criteria andCliDireccionNotEqualTo(String value) {
            addCriterion("cli_direccion <>", value, "cliDireccion");
            return (Criteria) this;
        }

        public Criteria andCliDireccionGreaterThan(String value) {
            addCriterion("cli_direccion >", value, "cliDireccion");
            return (Criteria) this;
        }

        public Criteria andCliDireccionGreaterThanOrEqualTo(String value) {
            addCriterion("cli_direccion >=", value, "cliDireccion");
            return (Criteria) this;
        }

        public Criteria andCliDireccionLessThan(String value) {
            addCriterion("cli_direccion <", value, "cliDireccion");
            return (Criteria) this;
        }

        public Criteria andCliDireccionLessThanOrEqualTo(String value) {
            addCriterion("cli_direccion <=", value, "cliDireccion");
            return (Criteria) this;
        }

        public Criteria andCliDireccionLike(String value) {
            addCriterion("cli_direccion like", value, "cliDireccion");
            return (Criteria) this;
        }

        public Criteria andCliDireccionNotLike(String value) {
            addCriterion("cli_direccion not like", value, "cliDireccion");
            return (Criteria) this;
        }

        public Criteria andCliDireccionIn(List<String> values) {
            addCriterion("cli_direccion in", values, "cliDireccion");
            return (Criteria) this;
        }

        public Criteria andCliDireccionNotIn(List<String> values) {
            addCriterion("cli_direccion not in", values, "cliDireccion");
            return (Criteria) this;
        }

        public Criteria andCliDireccionBetween(String value1, String value2) {
            addCriterion("cli_direccion between", value1, value2, "cliDireccion");
            return (Criteria) this;
        }

        public Criteria andCliDireccionNotBetween(String value1, String value2) {
            addCriterion("cli_direccion not between", value1, value2, "cliDireccion");
            return (Criteria) this;
        }

        public Criteria andCliTelefonoIsNull() {
            addCriterion("cli_telefono is null");
            return (Criteria) this;
        }

        public Criteria andCliTelefonoIsNotNull() {
            addCriterion("cli_telefono is not null");
            return (Criteria) this;
        }

        public Criteria andCliTelefonoEqualTo(String value) {
            addCriterion("cli_telefono =", value, "cliTelefono");
            return (Criteria) this;
        }

        public Criteria andCliTelefonoNotEqualTo(String value) {
            addCriterion("cli_telefono <>", value, "cliTelefono");
            return (Criteria) this;
        }

        public Criteria andCliTelefonoGreaterThan(String value) {
            addCriterion("cli_telefono >", value, "cliTelefono");
            return (Criteria) this;
        }

        public Criteria andCliTelefonoGreaterThanOrEqualTo(String value) {
            addCriterion("cli_telefono >=", value, "cliTelefono");
            return (Criteria) this;
        }

        public Criteria andCliTelefonoLessThan(String value) {
            addCriterion("cli_telefono <", value, "cliTelefono");
            return (Criteria) this;
        }

        public Criteria andCliTelefonoLessThanOrEqualTo(String value) {
            addCriterion("cli_telefono <=", value, "cliTelefono");
            return (Criteria) this;
        }

        public Criteria andCliTelefonoLike(String value) {
            addCriterion("cli_telefono like", value, "cliTelefono");
            return (Criteria) this;
        }

        public Criteria andCliTelefonoNotLike(String value) {
            addCriterion("cli_telefono not like", value, "cliTelefono");
            return (Criteria) this;
        }

        public Criteria andCliTelefonoIn(List<String> values) {
            addCriterion("cli_telefono in", values, "cliTelefono");
            return (Criteria) this;
        }

        public Criteria andCliTelefonoNotIn(List<String> values) {
            addCriterion("cli_telefono not in", values, "cliTelefono");
            return (Criteria) this;
        }

        public Criteria andCliTelefonoBetween(String value1, String value2) {
            addCriterion("cli_telefono between", value1, value2, "cliTelefono");
            return (Criteria) this;
        }

        public Criteria andCliTelefonoNotBetween(String value1, String value2) {
            addCriterion("cli_telefono not between", value1, value2, "cliTelefono");
            return (Criteria) this;
        }

        public Criteria andCliCorreoIsNull() {
            addCriterion("cli_correo is null");
            return (Criteria) this;
        }

        public Criteria andCliCorreoIsNotNull() {
            addCriterion("cli_correo is not null");
            return (Criteria) this;
        }

        public Criteria andCliCorreoEqualTo(String value) {
            addCriterion("cli_correo =", value, "cliCorreo");
            return (Criteria) this;
        }

        public Criteria andCliCorreoNotEqualTo(String value) {
            addCriterion("cli_correo <>", value, "cliCorreo");
            return (Criteria) this;
        }

        public Criteria andCliCorreoGreaterThan(String value) {
            addCriterion("cli_correo >", value, "cliCorreo");
            return (Criteria) this;
        }

        public Criteria andCliCorreoGreaterThanOrEqualTo(String value) {
            addCriterion("cli_correo >=", value, "cliCorreo");
            return (Criteria) this;
        }

        public Criteria andCliCorreoLessThan(String value) {
            addCriterion("cli_correo <", value, "cliCorreo");
            return (Criteria) this;
        }

        public Criteria andCliCorreoLessThanOrEqualTo(String value) {
            addCriterion("cli_correo <=", value, "cliCorreo");
            return (Criteria) this;
        }

        public Criteria andCliCorreoLike(String value) {
            addCriterion("cli_correo like", value, "cliCorreo");
            return (Criteria) this;
        }

        public Criteria andCliCorreoNotLike(String value) {
            addCriterion("cli_correo not like", value, "cliCorreo");
            return (Criteria) this;
        }

        public Criteria andCliCorreoIn(List<String> values) {
            addCriterion("cli_correo in", values, "cliCorreo");
            return (Criteria) this;
        }

        public Criteria andCliCorreoNotIn(List<String> values) {
            addCriterion("cli_correo not in", values, "cliCorreo");
            return (Criteria) this;
        }

        public Criteria andCliCorreoBetween(String value1, String value2) {
            addCriterion("cli_correo between", value1, value2, "cliCorreo");
            return (Criteria) this;
        }

        public Criteria andCliCorreoNotBetween(String value1, String value2) {
            addCriterion("cli_correo not between", value1, value2, "cliCorreo");
            return (Criteria) this;
        }

        public Criteria andCliFecAltaIsNull() {
            addCriterion("cli_fec_alta is null");
            return (Criteria) this;
        }

        public Criteria andCliFecAltaIsNotNull() {
            addCriterion("cli_fec_alta is not null");
            return (Criteria) this;
        }

        public Criteria andCliFecAltaEqualTo(Date value) {
            addCriterionForJDBCDate("cli_fec_alta =", value, "cliFecAlta");
            return (Criteria) this;
        }

        public Criteria andCliFecAltaNotEqualTo(Date value) {
            addCriterionForJDBCDate("cli_fec_alta <>", value, "cliFecAlta");
            return (Criteria) this;
        }

        public Criteria andCliFecAltaGreaterThan(Date value) {
            addCriterionForJDBCDate("cli_fec_alta >", value, "cliFecAlta");
            return (Criteria) this;
        }

        public Criteria andCliFecAltaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cli_fec_alta >=", value, "cliFecAlta");
            return (Criteria) this;
        }

        public Criteria andCliFecAltaLessThan(Date value) {
            addCriterionForJDBCDate("cli_fec_alta <", value, "cliFecAlta");
            return (Criteria) this;
        }

        public Criteria andCliFecAltaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cli_fec_alta <=", value, "cliFecAlta");
            return (Criteria) this;
        }

        public Criteria andCliFecAltaIn(List<Date> values) {
            addCriterionForJDBCDate("cli_fec_alta in", values, "cliFecAlta");
            return (Criteria) this;
        }

        public Criteria andCliFecAltaNotIn(List<Date> values) {
            addCriterionForJDBCDate("cli_fec_alta not in", values, "cliFecAlta");
            return (Criteria) this;
        }

        public Criteria andCliFecAltaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cli_fec_alta between", value1, value2, "cliFecAlta");
            return (Criteria) this;
        }

        public Criteria andCliFecAltaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cli_fec_alta not between", value1, value2, "cliFecAlta");
            return (Criteria) this;
        }

        public Criteria andCliFecBajaIsNull() {
            addCriterion("cli_fec_baja is null");
            return (Criteria) this;
        }

        public Criteria andCliFecBajaIsNotNull() {
            addCriterion("cli_fec_baja is not null");
            return (Criteria) this;
        }

        public Criteria andCliFecBajaEqualTo(Date value) {
            addCriterionForJDBCDate("cli_fec_baja =", value, "cliFecBaja");
            return (Criteria) this;
        }

        public Criteria andCliFecBajaNotEqualTo(Date value) {
            addCriterionForJDBCDate("cli_fec_baja <>", value, "cliFecBaja");
            return (Criteria) this;
        }

        public Criteria andCliFecBajaGreaterThan(Date value) {
            addCriterionForJDBCDate("cli_fec_baja >", value, "cliFecBaja");
            return (Criteria) this;
        }

        public Criteria andCliFecBajaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cli_fec_baja >=", value, "cliFecBaja");
            return (Criteria) this;
        }

        public Criteria andCliFecBajaLessThan(Date value) {
            addCriterionForJDBCDate("cli_fec_baja <", value, "cliFecBaja");
            return (Criteria) this;
        }

        public Criteria andCliFecBajaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cli_fec_baja <=", value, "cliFecBaja");
            return (Criteria) this;
        }

        public Criteria andCliFecBajaIn(List<Date> values) {
            addCriterionForJDBCDate("cli_fec_baja in", values, "cliFecBaja");
            return (Criteria) this;
        }

        public Criteria andCliFecBajaNotIn(List<Date> values) {
            addCriterionForJDBCDate("cli_fec_baja not in", values, "cliFecBaja");
            return (Criteria) this;
        }

        public Criteria andCliFecBajaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cli_fec_baja between", value1, value2, "cliFecBaja");
            return (Criteria) this;
        }

        public Criteria andCliFecBajaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cli_fec_baja not between", value1, value2, "cliFecBaja");
            return (Criteria) this;
        }

        public Criteria andCliFecModificacionIsNull() {
            addCriterion("cli_fec_modificacion is null");
            return (Criteria) this;
        }

        public Criteria andCliFecModificacionIsNotNull() {
            addCriterion("cli_fec_modificacion is not null");
            return (Criteria) this;
        }

        public Criteria andCliFecModificacionEqualTo(Date value) {
            addCriterionForJDBCDate("cli_fec_modificacion =", value, "cliFecModificacion");
            return (Criteria) this;
        }

        public Criteria andCliFecModificacionNotEqualTo(Date value) {
            addCriterionForJDBCDate("cli_fec_modificacion <>", value, "cliFecModificacion");
            return (Criteria) this;
        }

        public Criteria andCliFecModificacionGreaterThan(Date value) {
            addCriterionForJDBCDate("cli_fec_modificacion >", value, "cliFecModificacion");
            return (Criteria) this;
        }

        public Criteria andCliFecModificacionGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cli_fec_modificacion >=", value, "cliFecModificacion");
            return (Criteria) this;
        }

        public Criteria andCliFecModificacionLessThan(Date value) {
            addCriterionForJDBCDate("cli_fec_modificacion <", value, "cliFecModificacion");
            return (Criteria) this;
        }

        public Criteria andCliFecModificacionLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cli_fec_modificacion <=", value, "cliFecModificacion");
            return (Criteria) this;
        }

        public Criteria andCliFecModificacionIn(List<Date> values) {
            addCriterionForJDBCDate("cli_fec_modificacion in", values, "cliFecModificacion");
            return (Criteria) this;
        }

        public Criteria andCliFecModificacionNotIn(List<Date> values) {
            addCriterionForJDBCDate("cli_fec_modificacion not in", values, "cliFecModificacion");
            return (Criteria) this;
        }

        public Criteria andCliFecModificacionBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cli_fec_modificacion between", value1, value2, "cliFecModificacion");
            return (Criteria) this;
        }

        public Criteria andCliFecModificacionNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cli_fec_modificacion not between", value1, value2, "cliFecModificacion");
            return (Criteria) this;
        }

        public Criteria andCliUsuAltaIsNull() {
            addCriterion("cli_usu_alta is null");
            return (Criteria) this;
        }

        public Criteria andCliUsuAltaIsNotNull() {
            addCriterion("cli_usu_alta is not null");
            return (Criteria) this;
        }

        public Criteria andCliUsuAltaEqualTo(Integer value) {
            addCriterion("cli_usu_alta =", value, "cliUsuAlta");
            return (Criteria) this;
        }

        public Criteria andCliUsuAltaNotEqualTo(Integer value) {
            addCriterion("cli_usu_alta <>", value, "cliUsuAlta");
            return (Criteria) this;
        }

        public Criteria andCliUsuAltaGreaterThan(Integer value) {
            addCriterion("cli_usu_alta >", value, "cliUsuAlta");
            return (Criteria) this;
        }

        public Criteria andCliUsuAltaGreaterThanOrEqualTo(Integer value) {
            addCriterion("cli_usu_alta >=", value, "cliUsuAlta");
            return (Criteria) this;
        }

        public Criteria andCliUsuAltaLessThan(Integer value) {
            addCriterion("cli_usu_alta <", value, "cliUsuAlta");
            return (Criteria) this;
        }

        public Criteria andCliUsuAltaLessThanOrEqualTo(Integer value) {
            addCriterion("cli_usu_alta <=", value, "cliUsuAlta");
            return (Criteria) this;
        }

        public Criteria andCliUsuAltaIn(List<Integer> values) {
            addCriterion("cli_usu_alta in", values, "cliUsuAlta");
            return (Criteria) this;
        }

        public Criteria andCliUsuAltaNotIn(List<Integer> values) {
            addCriterion("cli_usu_alta not in", values, "cliUsuAlta");
            return (Criteria) this;
        }

        public Criteria andCliUsuAltaBetween(Integer value1, Integer value2) {
            addCriterion("cli_usu_alta between", value1, value2, "cliUsuAlta");
            return (Criteria) this;
        }

        public Criteria andCliUsuAltaNotBetween(Integer value1, Integer value2) {
            addCriterion("cli_usu_alta not between", value1, value2, "cliUsuAlta");
            return (Criteria) this;
        }

        public Criteria andCliUsuBajaIsNull() {
            addCriterion("cli_usu_baja is null");
            return (Criteria) this;
        }

        public Criteria andCliUsuBajaIsNotNull() {
            addCriterion("cli_usu_baja is not null");
            return (Criteria) this;
        }

        public Criteria andCliUsuBajaEqualTo(Integer value) {
            addCriterion("cli_usu_baja =", value, "cliUsuBaja");
            return (Criteria) this;
        }

        public Criteria andCliUsuBajaNotEqualTo(Integer value) {
            addCriterion("cli_usu_baja <>", value, "cliUsuBaja");
            return (Criteria) this;
        }

        public Criteria andCliUsuBajaGreaterThan(Integer value) {
            addCriterion("cli_usu_baja >", value, "cliUsuBaja");
            return (Criteria) this;
        }

        public Criteria andCliUsuBajaGreaterThanOrEqualTo(Integer value) {
            addCriterion("cli_usu_baja >=", value, "cliUsuBaja");
            return (Criteria) this;
        }

        public Criteria andCliUsuBajaLessThan(Integer value) {
            addCriterion("cli_usu_baja <", value, "cliUsuBaja");
            return (Criteria) this;
        }

        public Criteria andCliUsuBajaLessThanOrEqualTo(Integer value) {
            addCriterion("cli_usu_baja <=", value, "cliUsuBaja");
            return (Criteria) this;
        }

        public Criteria andCliUsuBajaIn(List<Integer> values) {
            addCriterion("cli_usu_baja in", values, "cliUsuBaja");
            return (Criteria) this;
        }

        public Criteria andCliUsuBajaNotIn(List<Integer> values) {
            addCriterion("cli_usu_baja not in", values, "cliUsuBaja");
            return (Criteria) this;
        }

        public Criteria andCliUsuBajaBetween(Integer value1, Integer value2) {
            addCriterion("cli_usu_baja between", value1, value2, "cliUsuBaja");
            return (Criteria) this;
        }

        public Criteria andCliUsuBajaNotBetween(Integer value1, Integer value2) {
            addCriterion("cli_usu_baja not between", value1, value2, "cliUsuBaja");
            return (Criteria) this;
        }

        public Criteria andCliUsuModificacionIsNull() {
            addCriterion("cli_usu_modificacion is null");
            return (Criteria) this;
        }

        public Criteria andCliUsuModificacionIsNotNull() {
            addCriterion("cli_usu_modificacion is not null");
            return (Criteria) this;
        }

        public Criteria andCliUsuModificacionEqualTo(Integer value) {
            addCriterion("cli_usu_modificacion =", value, "cliUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andCliUsuModificacionNotEqualTo(Integer value) {
            addCriterion("cli_usu_modificacion <>", value, "cliUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andCliUsuModificacionGreaterThan(Integer value) {
            addCriterion("cli_usu_modificacion >", value, "cliUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andCliUsuModificacionGreaterThanOrEqualTo(Integer value) {
            addCriterion("cli_usu_modificacion >=", value, "cliUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andCliUsuModificacionLessThan(Integer value) {
            addCriterion("cli_usu_modificacion <", value, "cliUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andCliUsuModificacionLessThanOrEqualTo(Integer value) {
            addCriterion("cli_usu_modificacion <=", value, "cliUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andCliUsuModificacionIn(List<Integer> values) {
            addCriterion("cli_usu_modificacion in", values, "cliUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andCliUsuModificacionNotIn(List<Integer> values) {
            addCriterion("cli_usu_modificacion not in", values, "cliUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andCliUsuModificacionBetween(Integer value1, Integer value2) {
            addCriterion("cli_usu_modificacion between", value1, value2, "cliUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andCliUsuModificacionNotBetween(Integer value1, Integer value2) {
            addCriterion("cli_usu_modificacion not between", value1, value2, "cliUsuModificacion");
            return (Criteria) this;
        }

        public Criteria andCliNombreComercialIsNull() {
            addCriterion("cli_nombre_comercial is null");
            return (Criteria) this;
        }

        public Criteria andCliNombreComercialIsNotNull() {
            addCriterion("cli_nombre_comercial is not null");
            return (Criteria) this;
        }

        public Criteria andCliNombreComercialEqualTo(String value) {
            addCriterion("cli_nombre_comercial =", value, "cliNombreComercial");
            return (Criteria) this;
        }

        public Criteria andCliNombreComercialNotEqualTo(String value) {
            addCriterion("cli_nombre_comercial <>", value, "cliNombreComercial");
            return (Criteria) this;
        }

        public Criteria andCliNombreComercialGreaterThan(String value) {
            addCriterion("cli_nombre_comercial >", value, "cliNombreComercial");
            return (Criteria) this;
        }

        public Criteria andCliNombreComercialGreaterThanOrEqualTo(String value) {
            addCriterion("cli_nombre_comercial >=", value, "cliNombreComercial");
            return (Criteria) this;
        }

        public Criteria andCliNombreComercialLessThan(String value) {
            addCriterion("cli_nombre_comercial <", value, "cliNombreComercial");
            return (Criteria) this;
        }

        public Criteria andCliNombreComercialLessThanOrEqualTo(String value) {
            addCriterion("cli_nombre_comercial <=", value, "cliNombreComercial");
            return (Criteria) this;
        }

        public Criteria andCliNombreComercialLike(String value) {
            addCriterion("cli_nombre_comercial like", value, "cliNombreComercial");
            return (Criteria) this;
        }

        public Criteria andCliNombreComercialNotLike(String value) {
            addCriterion("cli_nombre_comercial not like", value, "cliNombreComercial");
            return (Criteria) this;
        }

        public Criteria andCliNombreComercialIn(List<String> values) {
            addCriterion("cli_nombre_comercial in", values, "cliNombreComercial");
            return (Criteria) this;
        }

        public Criteria andCliNombreComercialNotIn(List<String> values) {
            addCriterion("cli_nombre_comercial not in", values, "cliNombreComercial");
            return (Criteria) this;
        }

        public Criteria andCliNombreComercialBetween(String value1, String value2) {
            addCriterion("cli_nombre_comercial between", value1, value2, "cliNombreComercial");
            return (Criteria) this;
        }

        public Criteria andCliNombreComercialNotBetween(String value1, String value2) {
            addCriterion("cli_nombre_comercial not between", value1, value2, "cliNombreComercial");
            return (Criteria) this;
        }

        public Criteria andCliGrupoIsNull() {
            addCriterion("cli_grupo is null");
            return (Criteria) this;
        }

        public Criteria andCliGrupoIsNotNull() {
            addCriterion("cli_grupo is not null");
            return (Criteria) this;
        }

        public Criteria andCliGrupoEqualTo(String value) {
            addCriterion("cli_grupo =", value, "cliGrupo");
            return (Criteria) this;
        }

        public Criteria andCliGrupoNotEqualTo(String value) {
            addCriterion("cli_grupo <>", value, "cliGrupo");
            return (Criteria) this;
        }

        public Criteria andCliGrupoGreaterThan(String value) {
            addCriterion("cli_grupo >", value, "cliGrupo");
            return (Criteria) this;
        }

        public Criteria andCliGrupoGreaterThanOrEqualTo(String value) {
            addCriterion("cli_grupo >=", value, "cliGrupo");
            return (Criteria) this;
        }

        public Criteria andCliGrupoLessThan(String value) {
            addCriterion("cli_grupo <", value, "cliGrupo");
            return (Criteria) this;
        }

        public Criteria andCliGrupoLessThanOrEqualTo(String value) {
            addCriterion("cli_grupo <=", value, "cliGrupo");
            return (Criteria) this;
        }

        public Criteria andCliGrupoLike(String value) {
            addCriterion("cli_grupo like", value, "cliGrupo");
            return (Criteria) this;
        }

        public Criteria andCliGrupoNotLike(String value) {
            addCriterion("cli_grupo not like", value, "cliGrupo");
            return (Criteria) this;
        }

        public Criteria andCliGrupoIn(List<String> values) {
            addCriterion("cli_grupo in", values, "cliGrupo");
            return (Criteria) this;
        }

        public Criteria andCliGrupoNotIn(List<String> values) {
            addCriterion("cli_grupo not in", values, "cliGrupo");
            return (Criteria) this;
        }

        public Criteria andCliGrupoBetween(String value1, String value2) {
            addCriterion("cli_grupo between", value1, value2, "cliGrupo");
            return (Criteria) this;
        }

        public Criteria andCliGrupoNotBetween(String value1, String value2) {
            addCriterion("cli_grupo not between", value1, value2, "cliGrupo");
            return (Criteria) this;
        }

        public Criteria andCliDireccionComercialIsNull() {
            addCriterion("cli_direccion_comercial is null");
            return (Criteria) this;
        }

        public Criteria andCliDireccionComercialIsNotNull() {
            addCriterion("cli_direccion_comercial is not null");
            return (Criteria) this;
        }

        public Criteria andCliDireccionComercialEqualTo(String value) {
            addCriterion("cli_direccion_comercial =", value, "cliDireccionComercial");
            return (Criteria) this;
        }

        public Criteria andCliDireccionComercialNotEqualTo(String value) {
            addCriterion("cli_direccion_comercial <>", value, "cliDireccionComercial");
            return (Criteria) this;
        }

        public Criteria andCliDireccionComercialGreaterThan(String value) {
            addCriterion("cli_direccion_comercial >", value, "cliDireccionComercial");
            return (Criteria) this;
        }

        public Criteria andCliDireccionComercialGreaterThanOrEqualTo(String value) {
            addCriterion("cli_direccion_comercial >=", value, "cliDireccionComercial");
            return (Criteria) this;
        }

        public Criteria andCliDireccionComercialLessThan(String value) {
            addCriterion("cli_direccion_comercial <", value, "cliDireccionComercial");
            return (Criteria) this;
        }

        public Criteria andCliDireccionComercialLessThanOrEqualTo(String value) {
            addCriterion("cli_direccion_comercial <=", value, "cliDireccionComercial");
            return (Criteria) this;
        }

        public Criteria andCliDireccionComercialLike(String value) {
            addCriterion("cli_direccion_comercial like", value, "cliDireccionComercial");
            return (Criteria) this;
        }

        public Criteria andCliDireccionComercialNotLike(String value) {
            addCriterion("cli_direccion_comercial not like", value, "cliDireccionComercial");
            return (Criteria) this;
        }

        public Criteria andCliDireccionComercialIn(List<String> values) {
            addCriterion("cli_direccion_comercial in", values, "cliDireccionComercial");
            return (Criteria) this;
        }

        public Criteria andCliDireccionComercialNotIn(List<String> values) {
            addCriterion("cli_direccion_comercial not in", values, "cliDireccionComercial");
            return (Criteria) this;
        }

        public Criteria andCliDireccionComercialBetween(String value1, String value2) {
            addCriterion("cli_direccion_comercial between", value1, value2, "cliDireccionComercial");
            return (Criteria) this;
        }

        public Criteria andCliDireccionComercialNotBetween(String value1, String value2) {
            addCriterion("cli_direccion_comercial not between", value1, value2, "cliDireccionComercial");
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