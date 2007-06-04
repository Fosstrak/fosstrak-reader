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
// Generated on: 2006.07.05 at 05:03:34 PM CEST 
//


package org.accada.reader.rprm.core.msg.command;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.accada.reader.rprm.core.msg.command.TagFieldValueParamType;


/**
 * Tag Field name and value pair
 * 
 * <p>Java class for TagFieldValueParamType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TagFieldValueParamType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tagFieldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tagFieldValue" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TagFieldValueParamType", propOrder = {
    "tagFieldName",
    "tagFieldValue"
})
public class TagFieldValueParamType {

    protected String tagFieldName;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] tagFieldValue;

    /**
     * Gets the value of the tagFieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagFieldName() {
        return tagFieldName;
    }

    /**
     * Sets the value of the tagFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagFieldName(String value) {
        this.tagFieldName = value;
    }

    /**
     * Gets the value of the tagFieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getTagFieldValue() {
        return tagFieldValue;
    }

    /**
     * Sets the value of the tagFieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagFieldValue(byte[] value) {
        this.tagFieldValue = ((byte[]) value);
    }

}
