package com.naver;

public class NaverVO {

	private String id;
	private String pw;
	private String name;
	private String gender;
	private String birth;
	private String email;
	private int tel;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(int gender) {
		
		if(gender==1) {
			this.gender = "��";
		}else if(gender ==2) {
			this.gender = "��";
		}
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {

		String str = String.format("%15s %15s %6s %2s %8s %20s %11d \n",
									id, pw, name, gender, birth, email, tel);

		return str;
	}

}
