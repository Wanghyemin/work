package com.score6;

public class ScoreDTO { // data transfer object // DB�� ���~!

	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int mat;

	private int tot;
	private int ave;
	private int rank;

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public int getAve() {
		return ave;
	}

	public void setAve(int ave) {
		this.ave = ave;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		
		String str;
		
		str = String.format("%6s %8s %4d %4d %4d %4d %4d %4d", 
				hak, name, kor, eng, mat, tot, ave, rank);

		return str;

		
		
		
		
	}

}
