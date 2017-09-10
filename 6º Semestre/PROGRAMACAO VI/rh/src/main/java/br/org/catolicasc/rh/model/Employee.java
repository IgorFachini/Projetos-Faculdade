package br.org.catolicasc.rh.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlEnum
@XmlType(name = "Employee")
public enum Employee {
	YES,NOT
}
