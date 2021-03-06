package com.majin.bit.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;

@Entity
@Getter
@Table(name = "member")
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mid")
	private int mid;
	@Column(name = "id")
	private String id;
	@Column(name = "pw")
	private String pw;
	@Column(name = "name")
	private String name;
	@Column(name = "nick")
	private String nick;
	@Column(name = "email")
	private String email;
	@Column(name = "role")
	private String role;
	@Column(name = "able", columnDefinition = "TINYINT", length=1)
	private int able; //회원탈퇴시1
			
	public Member() {
	}
		
	public Member(int mid, String id, String pw, String name, String nick, String email, String role,int able) {
		this.mid = mid;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.nick = nick;
		this.email = email;
		this.role = role;
		this.able = able;
	}
}
