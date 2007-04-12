/*
 * Copyright (C) 2007 ETH Zurich
 *
 * This file is part of Accada (www.accada.org).
 *
 * Accada is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1, as published by the Free Software Foundation.
 *
 * Accada is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Accada; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA  02110-1301  USA
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b26-ea3 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.07.05 at 05:26:35 PM CEST 
//


package org.accada.reader.rprm.core.msg.reply;

import javax.xml.bind.annotation.AccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;

import org.accada.reader.rprm.core.msg.reply.AddressReturnType;
import org.accada.reader.rprm.core.msg.reply.DataSelectorReturnType;
import org.accada.reader.rprm.core.msg.reply.IntReturnType;
import org.accada.reader.rprm.core.msg.reply.NoParamType;
import org.accada.reader.rprm.core.msg.reply.NotificationChannelReply;
import org.accada.reader.rprm.core.msg.reply.NotificationChannelReturnType;
import org.accada.reader.rprm.core.msg.reply.ReadReportType;
import org.accada.reader.rprm.core.msg.reply.SourceListReturnType;
import org.accada.reader.rprm.core.msg.reply.SourceReturnType;
import org.accada.reader.rprm.core.msg.reply.StringReturnType;
import org.accada.reader.rprm.core.msg.reply.TriggerListReturnType;
import org.accada.reader.rprm.core.msg.reply.TriggerReturnType;
import org.accada.reader.rprm.core.msg.reply.NotificationChannelReply.ReadQueuedData;
import org.w3c.dom.Element;


/**
 *  Notification channel object replies 
 * 
 * <p>Java class for NotificationChannelReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationChannelReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="create" type="{urn:epcglobal:rp:xsd:1}NotificationChannelReturnType"/>
 *         &lt;element name="getName" type="{urn:epcglobal:rp:xsd:1}stringReturnType"/>
 *         &lt;element name="getAddress" type="{urn:epcglobal:rp:xsd:1}AddressReturnType"/>
 *         &lt;element name="getEffectiveAddress" type="{urn:epcglobal:rp:xsd:1}AddressReturnType"/>
 *         &lt;element name="setAddress" type="{urn:epcglobal:rp:xsd:1}intReturnType"/>
 *         &lt;element name="getDataSelector" type="{urn:epcglobal:rp:xsd:1}DataSelectorReturnType"/>
 *         &lt;element name="setDataSelector" type="{urn:epcglobal:rp:xsd:1}noParamType"/>
 *         &lt;element name="addSources" type="{urn:epcglobal:rp:xsd:1}noParamType"/>
 *         &lt;element name="removeSources" type="{urn:epcglobal:rp:xsd:1}noParamType"/>
 *         &lt;element name="removeAllSources" type="{urn:epcglobal:rp:xsd:1}noParamType"/>
 *         &lt;element name="getSource" type="{urn:epcglobal:rp:xsd:1}SourceReturnType"/>
 *         &lt;element name="getAllSources" type="{urn:epcglobal:rp:xsd:1}SourceListReturnType"/>
 *         &lt;element name="addNotificationTriggers" type="{urn:epcglobal:rp:xsd:1}noParamType"/>
 *         &lt;element name="removeNotificationTriggers" type="{urn:epcglobal:rp:xsd:1}noParamType"/>
 *         &lt;element name="removeAllNotificationTriggers" type="{urn:epcglobal:rp:xsd:1}noParamType"/>
 *         &lt;element name="getNotificationTrigger" type="{urn:epcglobal:rp:xsd:1}TriggerReturnType"/>
 *         &lt;element name="getAllNotificationTriggers" type="{urn:epcglobal:rp:xsd:1}TriggerListReturnType"/>
 *         &lt;element name="readQueuedData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="returnValue" type="{urn:epcglobal:rp:xsd:1}ReadReportType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;any/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(AccessType.FIELD)
@XmlType(name = "NotificationChannelReply", propOrder = {
    "create",
    "getName",
    "getAddress",
    "getEffectiveAddress",
    "setAddress",
    "getDataSelector",
    "setDataSelector",
    "addSources",
    "removeSources",
    "removeAllSources",
    "getSource",
    "getAllSources",
    "addNotificationTriggers",
    "removeNotificationTriggers",
    "removeAllNotificationTriggers",
    "getNotificationTrigger",
    "getAllNotificationTriggers",
    "readQueuedData",
    "any"
})
public class NotificationChannelReply {

    protected NotificationChannelReturnType create;
    protected StringReturnType getName;
    protected AddressReturnType getAddress;
    protected AddressReturnType getEffectiveAddress;
    protected IntReturnType setAddress;
    protected DataSelectorReturnType getDataSelector;
    protected NoParamType setDataSelector;
    protected NoParamType addSources;
    protected NoParamType removeSources;
    protected NoParamType removeAllSources;
    protected SourceReturnType getSource;
    protected SourceListReturnType getAllSources;
    protected NoParamType addNotificationTriggers;
    protected NoParamType removeNotificationTriggers;
    protected NoParamType removeAllNotificationTriggers;
    protected TriggerReturnType getNotificationTrigger;
    protected TriggerListReturnType getAllNotificationTriggers;
    protected ReadQueuedData readQueuedData;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the create property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationChannelReturnType }
     *     
     */
    public NotificationChannelReturnType getCreate() {
        return create;
    }

    /**
     * Sets the value of the create property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationChannelReturnType }
     *     
     */
    public void setCreate(NotificationChannelReturnType value) {
        this.create = value;
    }

    /**
     * Gets the value of the getName property.
     * 
     * @return
     *     possible object is
     *     {@link StringReturnType }
     *     
     */
    public StringReturnType getGetName() {
        return getName;
    }

    /**
     * Sets the value of the getName property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringReturnType }
     *     
     */
    public void setGetName(StringReturnType value) {
        this.getName = value;
    }

    /**
     * Gets the value of the getAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressReturnType }
     *     
     */
    public AddressReturnType getGetAddress() {
        return getAddress;
    }

    /**
     * Sets the value of the getAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressReturnType }
     *     
     */
    public void setGetAddress(AddressReturnType value) {
        this.getAddress = value;
    }

    /**
     * Gets the value of the getEffectiveAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressReturnType }
     *     
     */
    public AddressReturnType getGetEffectiveAddress() {
        return getEffectiveAddress;
    }

    /**
     * Sets the value of the getEffectiveAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressReturnType }
     *     
     */
    public void setGetEffectiveAddress(AddressReturnType value) {
        this.getEffectiveAddress = value;
    }

    /**
     * Gets the value of the setAddress property.
     * 
     * @return
     *     possible object is
     *     {@link IntReturnType }
     *     
     */
    public IntReturnType getSetAddress() {
        return setAddress;
    }

    /**
     * Sets the value of the setAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntReturnType }
     *     
     */
    public void setSetAddress(IntReturnType value) {
        this.setAddress = value;
    }

    /**
     * Gets the value of the getDataSelector property.
     * 
     * @return
     *     possible object is
     *     {@link DataSelectorReturnType }
     *     
     */
    public DataSelectorReturnType getGetDataSelector() {
        return getDataSelector;
    }

    /**
     * Sets the value of the getDataSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSelectorReturnType }
     *     
     */
    public void setGetDataSelector(DataSelectorReturnType value) {
        this.getDataSelector = value;
    }

    /**
     * Gets the value of the setDataSelector property.
     * 
     * @return
     *     possible object is
     *     {@link NoParamType }
     *     
     */
    public NoParamType getSetDataSelector() {
        return setDataSelector;
    }

    /**
     * Sets the value of the setDataSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoParamType }
     *     
     */
    public void setSetDataSelector(NoParamType value) {
        this.setDataSelector = value;
    }

    /**
     * Gets the value of the addSources property.
     * 
     * @return
     *     possible object is
     *     {@link NoParamType }
     *     
     */
    public NoParamType getAddSources() {
        return addSources;
    }

    /**
     * Sets the value of the addSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoParamType }
     *     
     */
    public void setAddSources(NoParamType value) {
        this.addSources = value;
    }

    /**
     * Gets the value of the removeSources property.
     * 
     * @return
     *     possible object is
     *     {@link NoParamType }
     *     
     */
    public NoParamType getRemoveSources() {
        return removeSources;
    }

    /**
     * Sets the value of the removeSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoParamType }
     *     
     */
    public void setRemoveSources(NoParamType value) {
        this.removeSources = value;
    }

    /**
     * Gets the value of the removeAllSources property.
     * 
     * @return
     *     possible object is
     *     {@link NoParamType }
     *     
     */
    public NoParamType getRemoveAllSources() {
        return removeAllSources;
    }

    /**
     * Sets the value of the removeAllSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoParamType }
     *     
     */
    public void setRemoveAllSources(NoParamType value) {
        this.removeAllSources = value;
    }

    /**
     * Gets the value of the getSource property.
     * 
     * @return
     *     possible object is
     *     {@link SourceReturnType }
     *     
     */
    public SourceReturnType getGetSource() {
        return getSource;
    }

    /**
     * Sets the value of the getSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceReturnType }
     *     
     */
    public void setGetSource(SourceReturnType value) {
        this.getSource = value;
    }

    /**
     * Gets the value of the getAllSources property.
     * 
     * @return
     *     possible object is
     *     {@link SourceListReturnType }
     *     
     */
    public SourceListReturnType getGetAllSources() {
        return getAllSources;
    }

    /**
     * Sets the value of the getAllSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceListReturnType }
     *     
     */
    public void setGetAllSources(SourceListReturnType value) {
        this.getAllSources = value;
    }

    /**
     * Gets the value of the addNotificationTriggers property.
     * 
     * @return
     *     possible object is
     *     {@link NoParamType }
     *     
     */
    public NoParamType getAddNotificationTriggers() {
        return addNotificationTriggers;
    }

    /**
     * Sets the value of the addNotificationTriggers property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoParamType }
     *     
     */
    public void setAddNotificationTriggers(NoParamType value) {
        this.addNotificationTriggers = value;
    }

    /**
     * Gets the value of the removeNotificationTriggers property.
     * 
     * @return
     *     possible object is
     *     {@link NoParamType }
     *     
     */
    public NoParamType getRemoveNotificationTriggers() {
        return removeNotificationTriggers;
    }

    /**
     * Sets the value of the removeNotificationTriggers property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoParamType }
     *     
     */
    public void setRemoveNotificationTriggers(NoParamType value) {
        this.removeNotificationTriggers = value;
    }

    /**
     * Gets the value of the removeAllNotificationTriggers property.
     * 
     * @return
     *     possible object is
     *     {@link NoParamType }
     *     
     */
    public NoParamType getRemoveAllNotificationTriggers() {
        return removeAllNotificationTriggers;
    }

    /**
     * Sets the value of the removeAllNotificationTriggers property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoParamType }
     *     
     */
    public void setRemoveAllNotificationTriggers(NoParamType value) {
        this.removeAllNotificationTriggers = value;
    }

    /**
     * Gets the value of the getNotificationTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerReturnType }
     *     
     */
    public TriggerReturnType getGetNotificationTrigger() {
        return getNotificationTrigger;
    }

    /**
     * Sets the value of the getNotificationTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerReturnType }
     *     
     */
    public void setGetNotificationTrigger(TriggerReturnType value) {
        this.getNotificationTrigger = value;
    }

    /**
     * Gets the value of the getAllNotificationTriggers property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerListReturnType }
     *     
     */
    public TriggerListReturnType getGetAllNotificationTriggers() {
        return getAllNotificationTriggers;
    }

    /**
     * Sets the value of the getAllNotificationTriggers property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerListReturnType }
     *     
     */
    public void setGetAllNotificationTriggers(TriggerListReturnType value) {
        this.getAllNotificationTriggers = value;
    }

    /**
     * Gets the value of the readQueuedData property.
     * 
     * @return
     *     possible object is
     *     {@link ReadQueuedData }
     *     
     */
    public ReadQueuedData getReadQueuedData() {
        return readQueuedData;
    }

    /**
     * Sets the value of the readQueuedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadQueuedData }
     *     
     */
    public void setReadQueuedData(ReadQueuedData value) {
        this.readQueuedData = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
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
     *         &lt;element name="returnValue" type="{urn:epcglobal:rp:xsd:1}ReadReportType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(AccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "returnValue"
    })
    public static class ReadQueuedData {

        protected ReadReportType returnValue;

        /**
         * Gets the value of the returnValue property.
         * 
         * @return
         *     possible object is
         *     {@link ReadReportType }
         *     
         */
        public ReadReportType getReturnValue() {
            return returnValue;
        }

        /**
         * Sets the value of the returnValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReadReportType }
         *     
         */
        public void setReturnValue(ReadReportType value) {
            this.returnValue = value;
        }

    }

}
