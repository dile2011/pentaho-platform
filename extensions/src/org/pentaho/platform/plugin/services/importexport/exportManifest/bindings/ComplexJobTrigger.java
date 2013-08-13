//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.25 at 11:25:28 AM EDT 
//


package org.pentaho.platform.plugin.services.importexport.exportManifest.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for complexJobTrigger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complexJobTrigger">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pentaho.com/schema/}jobTrigger">
 *       &lt;sequence>
 *         &lt;element name="dayOfMonthRecurrences" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element ref="{http://www.pentaho.com/schema/}sequentialRecurrence"/>
 *                     &lt;element ref="{http://www.pentaho.com/schema/}incrementalRecurrence"/>
 *                     &lt;element ref="{http://www.pentaho.com/schema/}qualifiedDayOfMonth"/>
 *                     &lt;element ref="{http://www.pentaho.com/schema/}recurrenceList"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dayOfWeekRecurrences" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element ref="{http://www.pentaho.com/schema/}sequentialRecurrence"/>
 *                     &lt;element ref="{http://www.pentaho.com/schema/}incrementalRecurrence"/>
 *                     &lt;element ref="{http://www.pentaho.com/schema/}recurrenceList"/>
 *                     &lt;element ref="{http://www.pentaho.com/schema/}qualifiedDayOfWeek"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="hourlyRecurrences" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element ref="{http://www.pentaho.com/schema/}sequentialRecurrence"/>
 *                     &lt;element ref="{http://www.pentaho.com/schema/}incrementalRecurrence"/>
 *                     &lt;element ref="{http://www.pentaho.com/schema/}recurrenceList"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="minuteRecurrences" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element ref="{http://www.pentaho.com/schema/}sequentialRecurrence"/>
 *                     &lt;element ref="{http://www.pentaho.com/schema/}incrementalRecurrence"/>
 *                     &lt;element ref="{http://www.pentaho.com/schema/}recurrenceList"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="monthlyRecurrences" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element ref="{http://www.pentaho.com/schema/}sequentialRecurrence"/>
 *                     &lt;element ref="{http://www.pentaho.com/schema/}incrementalRecurrence"/>
 *                     &lt;element ref="{http://www.pentaho.com/schema/}recurrenceList"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="secondRecurrences" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element ref="{http://www.pentaho.com/schema/}sequentialRecurrence"/>
 *                     &lt;element ref="{http://www.pentaho.com/schema/}incrementalRecurrence"/>
 *                     &lt;element ref="{http://www.pentaho.com/schema/}recurrenceList"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="yearlyRecurrences" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element ref="{http://www.pentaho.com/schema/}sequentialRecurrence"/>
 *                     &lt;element ref="{http://www.pentaho.com/schema/}incrementalRecurrence"/>
 *                     &lt;element ref="{http://www.pentaho.com/schema/}recurrenceList"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complexJobTrigger", propOrder = {
    "dayOfMonthRecurrences",
    "dayOfWeekRecurrences",
    "hourlyRecurrences",
    "minuteRecurrences",
    "monthlyRecurrences",
    "secondRecurrences",
    "yearlyRecurrences"
})
public class ComplexJobTrigger
    extends JobTrigger
{

    protected ComplexJobTrigger.DayOfMonthRecurrences dayOfMonthRecurrences;
    protected ComplexJobTrigger.DayOfWeekRecurrences dayOfWeekRecurrences;
    protected ComplexJobTrigger.HourlyRecurrences hourlyRecurrences;
    protected ComplexJobTrigger.MinuteRecurrences minuteRecurrences;
    protected ComplexJobTrigger.MonthlyRecurrences monthlyRecurrences;
    protected ComplexJobTrigger.SecondRecurrences secondRecurrences;
    protected ComplexJobTrigger.YearlyRecurrences yearlyRecurrences;

    /**
     * Gets the value of the dayOfMonthRecurrences property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexJobTrigger.DayOfMonthRecurrences }
     *     
     */
    public ComplexJobTrigger.DayOfMonthRecurrences getDayOfMonthRecurrences() {
        return dayOfMonthRecurrences;
    }

    /**
     * Sets the value of the dayOfMonthRecurrences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexJobTrigger.DayOfMonthRecurrences }
     *     
     */
    public void setDayOfMonthRecurrences(ComplexJobTrigger.DayOfMonthRecurrences value) {
        this.dayOfMonthRecurrences = value;
    }

    /**
     * Gets the value of the dayOfWeekRecurrences property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexJobTrigger.DayOfWeekRecurrences }
     *     
     */
    public ComplexJobTrigger.DayOfWeekRecurrences getDayOfWeekRecurrences() {
        return dayOfWeekRecurrences;
    }

    /**
     * Sets the value of the dayOfWeekRecurrences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexJobTrigger.DayOfWeekRecurrences }
     *     
     */
    public void setDayOfWeekRecurrences(ComplexJobTrigger.DayOfWeekRecurrences value) {
        this.dayOfWeekRecurrences = value;
    }

    /**
     * Gets the value of the hourlyRecurrences property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexJobTrigger.HourlyRecurrences }
     *     
     */
    public ComplexJobTrigger.HourlyRecurrences getHourlyRecurrences() {
        return hourlyRecurrences;
    }

    /**
     * Sets the value of the hourlyRecurrences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexJobTrigger.HourlyRecurrences }
     *     
     */
    public void setHourlyRecurrences(ComplexJobTrigger.HourlyRecurrences value) {
        this.hourlyRecurrences = value;
    }

    /**
     * Gets the value of the minuteRecurrences property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexJobTrigger.MinuteRecurrences }
     *     
     */
    public ComplexJobTrigger.MinuteRecurrences getMinuteRecurrences() {
        return minuteRecurrences;
    }

    /**
     * Sets the value of the minuteRecurrences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexJobTrigger.MinuteRecurrences }
     *     
     */
    public void setMinuteRecurrences(ComplexJobTrigger.MinuteRecurrences value) {
        this.minuteRecurrences = value;
    }

    /**
     * Gets the value of the monthlyRecurrences property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexJobTrigger.MonthlyRecurrences }
     *     
     */
    public ComplexJobTrigger.MonthlyRecurrences getMonthlyRecurrences() {
        return monthlyRecurrences;
    }

    /**
     * Sets the value of the monthlyRecurrences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexJobTrigger.MonthlyRecurrences }
     *     
     */
    public void setMonthlyRecurrences(ComplexJobTrigger.MonthlyRecurrences value) {
        this.monthlyRecurrences = value;
    }

    /**
     * Gets the value of the secondRecurrences property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexJobTrigger.SecondRecurrences }
     *     
     */
    public ComplexJobTrigger.SecondRecurrences getSecondRecurrences() {
        return secondRecurrences;
    }

    /**
     * Sets the value of the secondRecurrences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexJobTrigger.SecondRecurrences }
     *     
     */
    public void setSecondRecurrences(ComplexJobTrigger.SecondRecurrences value) {
        this.secondRecurrences = value;
    }

    /**
     * Gets the value of the yearlyRecurrences property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexJobTrigger.YearlyRecurrences }
     *     
     */
    public ComplexJobTrigger.YearlyRecurrences getYearlyRecurrences() {
        return yearlyRecurrences;
    }

    /**
     * Sets the value of the yearlyRecurrences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexJobTrigger.YearlyRecurrences }
     *     
     */
    public void setYearlyRecurrences(ComplexJobTrigger.YearlyRecurrences value) {
        this.yearlyRecurrences = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element ref="{http://www.pentaho.com/schema/}sequentialRecurrence"/>
     *           &lt;element ref="{http://www.pentaho.com/schema/}incrementalRecurrence"/>
     *           &lt;element ref="{http://www.pentaho.com/schema/}qualifiedDayOfMonth"/>
     *           &lt;element ref="{http://www.pentaho.com/schema/}recurrenceList"/>
     *         &lt;/choice>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sequentialRecurrenceOrIncrementalRecurrenceOrQualifiedDayOfMonth"
    })
    public static class DayOfMonthRecurrences {

        @XmlElements({
            @XmlElement(name = "sequentialRecurrence", namespace = "http://www.pentaho.com/schema/", type = SequentialRecurrence.class),
            @XmlElement(name = "incrementalRecurrence", namespace = "http://www.pentaho.com/schema/", type = IncrementalRecurrence.class),
            @XmlElement(name = "qualifiedDayOfMonth", namespace = "http://www.pentaho.com/schema/", type = QualifiedDayOfMonth.class),
            @XmlElement(name = "recurrenceList", namespace = "http://www.pentaho.com/schema/", type = RecurrenceList.class)
        })
        protected List<Object> sequentialRecurrenceOrIncrementalRecurrenceOrQualifiedDayOfMonth;

        /**
         * Gets the value of the sequentialRecurrenceOrIncrementalRecurrenceOrQualifiedDayOfMonth property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sequentialRecurrenceOrIncrementalRecurrenceOrQualifiedDayOfMonth property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSequentialRecurrenceOrIncrementalRecurrenceOrQualifiedDayOfMonth().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SequentialRecurrence }
         * {@link IncrementalRecurrence }
         * {@link QualifiedDayOfMonth }
         * {@link RecurrenceList }
         * 
         * 
         */
        public List<Object> getSequentialRecurrenceOrIncrementalRecurrenceOrQualifiedDayOfMonth() {
            if (sequentialRecurrenceOrIncrementalRecurrenceOrQualifiedDayOfMonth == null) {
                sequentialRecurrenceOrIncrementalRecurrenceOrQualifiedDayOfMonth = new ArrayList<Object>();
            }
            return this.sequentialRecurrenceOrIncrementalRecurrenceOrQualifiedDayOfMonth;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element ref="{http://www.pentaho.com/schema/}sequentialRecurrence"/>
     *           &lt;element ref="{http://www.pentaho.com/schema/}incrementalRecurrence"/>
     *           &lt;element ref="{http://www.pentaho.com/schema/}recurrenceList"/>
     *           &lt;element ref="{http://www.pentaho.com/schema/}qualifiedDayOfWeek"/>
     *         &lt;/choice>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList"
    })
    public static class DayOfWeekRecurrences {

        @XmlElements({
            @XmlElement(name = "sequentialRecurrence", namespace = "http://www.pentaho.com/schema/", type = SequentialRecurrence.class),
            @XmlElement(name = "incrementalRecurrence", namespace = "http://www.pentaho.com/schema/", type = IncrementalRecurrence.class),
            @XmlElement(name = "recurrenceList", namespace = "http://www.pentaho.com/schema/", type = RecurrenceList.class),
            @XmlElement(name = "qualifiedDayOfWeek", namespace = "http://www.pentaho.com/schema/", type = QualifiedDayOfWeek.class)
        })
        protected List<Object> sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList;

        /**
         * Gets the value of the sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SequentialRecurrence }
         * {@link IncrementalRecurrence }
         * {@link RecurrenceList }
         * {@link QualifiedDayOfWeek }
         * 
         * 
         */
        public List<Object> getSequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList() {
            if (sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList == null) {
                sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList = new ArrayList<Object>();
            }
            return this.sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element ref="{http://www.pentaho.com/schema/}sequentialRecurrence"/>
     *           &lt;element ref="{http://www.pentaho.com/schema/}incrementalRecurrence"/>
     *           &lt;element ref="{http://www.pentaho.com/schema/}recurrenceList"/>
     *         &lt;/choice>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList"
    })
    public static class HourlyRecurrences {

        @XmlElements({
            @XmlElement(name = "sequentialRecurrence", namespace = "http://www.pentaho.com/schema/", type = SequentialRecurrence.class),
            @XmlElement(name = "incrementalRecurrence", namespace = "http://www.pentaho.com/schema/", type = IncrementalRecurrence.class),
            @XmlElement(name = "recurrenceList", namespace = "http://www.pentaho.com/schema/", type = RecurrenceList.class)
        })
        protected List<Object> sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList;

        /**
         * Gets the value of the sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SequentialRecurrence }
         * {@link IncrementalRecurrence }
         * {@link RecurrenceList }
         * 
         * 
         */
        public List<Object> getSequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList() {
            if (sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList == null) {
                sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList = new ArrayList<Object>();
            }
            return this.sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element ref="{http://www.pentaho.com/schema/}sequentialRecurrence"/>
     *           &lt;element ref="{http://www.pentaho.com/schema/}incrementalRecurrence"/>
     *           &lt;element ref="{http://www.pentaho.com/schema/}recurrenceList"/>
     *         &lt;/choice>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList"
    })
    public static class MinuteRecurrences {

        @XmlElements({
            @XmlElement(name = "sequentialRecurrence", namespace = "http://www.pentaho.com/schema/", type = SequentialRecurrence.class),
            @XmlElement(name = "incrementalRecurrence", namespace = "http://www.pentaho.com/schema/", type = IncrementalRecurrence.class),
            @XmlElement(name = "recurrenceList", namespace = "http://www.pentaho.com/schema/", type = RecurrenceList.class)
        })
        protected List<Object> sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList;

        /**
         * Gets the value of the sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SequentialRecurrence }
         * {@link IncrementalRecurrence }
         * {@link RecurrenceList }
         * 
         * 
         */
        public List<Object> getSequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList() {
            if (sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList == null) {
                sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList = new ArrayList<Object>();
            }
            return this.sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element ref="{http://www.pentaho.com/schema/}sequentialRecurrence"/>
     *           &lt;element ref="{http://www.pentaho.com/schema/}incrementalRecurrence"/>
     *           &lt;element ref="{http://www.pentaho.com/schema/}recurrenceList"/>
     *         &lt;/choice>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList"
    })
    public static class MonthlyRecurrences {

        @XmlElements({
            @XmlElement(name = "sequentialRecurrence", namespace = "http://www.pentaho.com/schema/", type = SequentialRecurrence.class),
            @XmlElement(name = "incrementalRecurrence", namespace = "http://www.pentaho.com/schema/", type = IncrementalRecurrence.class),
            @XmlElement(name = "recurrenceList", namespace = "http://www.pentaho.com/schema/", type = RecurrenceList.class)
        })
        protected List<Object> sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList;

        /**
         * Gets the value of the sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SequentialRecurrence }
         * {@link IncrementalRecurrence }
         * {@link RecurrenceList }
         * 
         * 
         */
        public List<Object> getSequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList() {
            if (sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList == null) {
                sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList = new ArrayList<Object>();
            }
            return this.sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element ref="{http://www.pentaho.com/schema/}sequentialRecurrence"/>
     *           &lt;element ref="{http://www.pentaho.com/schema/}incrementalRecurrence"/>
     *           &lt;element ref="{http://www.pentaho.com/schema/}recurrenceList"/>
     *         &lt;/choice>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList"
    })
    public static class SecondRecurrences {

        @XmlElements({
            @XmlElement(name = "sequentialRecurrence", namespace = "http://www.pentaho.com/schema/", type = SequentialRecurrence.class),
            @XmlElement(name = "incrementalRecurrence", namespace = "http://www.pentaho.com/schema/", type = IncrementalRecurrence.class),
            @XmlElement(name = "recurrenceList", namespace = "http://www.pentaho.com/schema/", type = RecurrenceList.class)
        })
        protected List<Object> sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList;

        /**
         * Gets the value of the sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SequentialRecurrence }
         * {@link IncrementalRecurrence }
         * {@link RecurrenceList }
         * 
         * 
         */
        public List<Object> getSequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList() {
            if (sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList == null) {
                sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList = new ArrayList<Object>();
            }
            return this.sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element ref="{http://www.pentaho.com/schema/}sequentialRecurrence"/>
     *           &lt;element ref="{http://www.pentaho.com/schema/}incrementalRecurrence"/>
     *           &lt;element ref="{http://www.pentaho.com/schema/}recurrenceList"/>
     *         &lt;/choice>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList"
    })
    public static class YearlyRecurrences {

        @XmlElements({
            @XmlElement(name = "sequentialRecurrence", namespace = "http://www.pentaho.com/schema/", type = SequentialRecurrence.class),
            @XmlElement(name = "incrementalRecurrence", namespace = "http://www.pentaho.com/schema/", type = IncrementalRecurrence.class),
            @XmlElement(name = "recurrenceList", namespace = "http://www.pentaho.com/schema/", type = RecurrenceList.class)
        })
        protected List<Object> sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList;

        /**
         * Gets the value of the sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SequentialRecurrence }
         * {@link IncrementalRecurrence }
         * {@link RecurrenceList }
         * 
         * 
         */
        public List<Object> getSequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList() {
            if (sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList == null) {
                sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList = new ArrayList<Object>();
            }
            return this.sequentialRecurrenceOrIncrementalRecurrenceOrRecurrenceList;
        }

    }

}
