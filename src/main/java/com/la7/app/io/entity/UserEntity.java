package com.la7.app.io.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class UserEntity implements Serializable {

	private static final long serialVersionUID = -1635261962224344252L;
	
	@Id
	@GeneratedValue
	private long id;

}
