package com.spr.travel.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

import java.util.Date;


/**
 * The persistent class for the boards database table.
 * 
 */
@Entity
@Table(name="board")
@NamedQuery(name="Board.findAll", query="SELECT b FROM Board b")
@Data
public class Board implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length=11)
	private int brdNo;

	@Column(length=200)
	private String title;

	@Lob
	private String content;
	
	private String fileName;

	@Temporal(TemporalType.TIMESTAMP)
	private Date regDate;

	@Column(length=2)
	private int cateNo;
	
	@Column(length=2)
	private int voteNo;

	@Column(length=10)
	private int cnt;

	@Column(length=11)	
	private String userId;

	
	public Board() {
	
	}

	public Board(String title, String content, int cateNo) {
		super();
		this.title = title;
		this.content = content;
		this.cateNo = cateNo;
	}
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}


}