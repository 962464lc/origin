package com.hxzy.springbootOA.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * @author Ryo Liu
 * @category 简历表
 * 
 */
@Entity
@Table(name="t_resume")
public class TResume implements Serializable {
	private static final long serialVersionUID = 1L;
	//ID
	private int resumeId;
	//年龄
	private int age;
	//学历
	private String education;
	//工作经验
	private String experience;
	//姓名
	private String name;
	//性别
	private String sex;
	//职业技能
	private String skill;
	//专业
	private String speciality;

	public TResume() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="resume_id")
	public int getResumeId() {
		return this.resumeId;
	}

	public void setResumeId(int resumeId) {
		this.resumeId = resumeId;
	}


	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public String getEducation() {
		return this.education;
	}

	public void setEducation(String education) {
		this.education = education;
	}


	public String getExperience() {
		return this.experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getSkill() {
		return this.skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}


	public String getSpeciality() {
		return this.speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

}