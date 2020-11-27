package com;

class Student {
	//学生属性
	String name;							//学生姓名
	String number;							//学生编号
	String sex;							    //学生性别
	String age;								//学生年龄
	String grade;							//学生班级

	//构造函数
	Student(){								//无参构造函数
		
	}
	Student(String name,String number){
		this.name=name;
		this.number=number;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	

	public String toString() {				//重写toString()方法
		String information = "姓名："+name+"学号："+number+"性别："+sex+"年龄："+age+"班级："+grade;
		return information;
	}
	
	
}
