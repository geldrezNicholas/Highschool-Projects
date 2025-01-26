package assignments;

public class Hispanic {

	String indicator = "";
	String unit = "";
	String unitNum = "";
	String stubName = "";
	String stubNameNum = "";
	String stubLabel = "";
	String stubLabelNum = "";
	String year = "";
	String yearNum = "";
	String age = "";
	String ageNum = "";
	String estimate = "";
	String flag = "";

	// Default Constructor
	public Hispanic() {

		this.indicator = "";
		this.unit = "";
		this.unitNum = "";
		this.stubName = "";
		this.stubNameNum = "";
		this.stubLabel = "";
		this.stubLabelNum = "";
		this.year = "";
		this.yearNum = "";
		this.age = "";
		this.ageNum = "";
		this.estimate = "";
		this.flag = "";

	}

	// Parameterized Constructor
	public Hispanic(String i, String u, String un, String s, String sn, String sl, String sln, String y, String yn,
			String a, String an, String e, String f) {

		this.indicator = i;
		this.unit = u;
		this.unitNum = un;
		this.stubName = s;
		this.stubNameNum = sn;
		this.stubLabel = sl;
		this.stubLabelNum = sln;
		this.year = y;
		this.yearNum = yn;
		this.age = a;
		this.ageNum = an;
		this.estimate = e;
		this.flag = f;

	}

	public String getInd() {

		return this.indicator;

	}

	public String getUnit() {

		return this.unit;

	}

	public String getUnitNum() {

		return this.unitNum;

	}

	public String getStubName() {

		return this.stubName;

	}

	public String getstubNameNum() {

		return this.stubNameNum;

	}

	public String getStubLabel() {

		return this.stubLabel;

	}

	public String getStubLabelNum() {

		return this.stubLabelNum;

	}

	public String getYear() {

		return this.year;

	}

	public String getYearNum() {

		return this.yearNum;

	}

	public String getAge() {

		return this.age;

	}

	public String getAgeNum() {

		return this.ageNum;

	}

	public String getEstimate() {

		return this.estimate;

	}

	public String getFlag() {

		return this.flag;

	}

	public void setIndicator(String i) {

		this.indicator = i;

	}

	public void setUnit(String u) {

		this.unit = u;

	}

	public void setUnitNum(String un) {

		this.unitNum = un;

	}

	public void setStubName(String s) {

		this.stubName = s;

	}

	public void setStubNameNum(String sn) {

		this.stubNameNum = sn;

	}

	public void setstubLabel(String sl) {

		this.stubLabel = sl;

	}

	public void setStubLabelNum(String sln) {

		this.stubLabelNum = sln;

	}

	public void setYear(String y) {

		this.year = y;

	}

	public void setYearNum(String yn) {

		this.yearNum = yn;

	}

	public void setAge(String a) {

		this.age = a;

	}

	public void setAgeNum(String an) {

		this.ageNum = an;

	}

	public void setStatus(String e) {

		this.estimate = e;

	}

	public void setSymbol(String f) {

		this.flag = f;

	}

	@Override
	public String toString() {

		return super.toString() + "." + this.indicator + "." + this.unit + "." + this.unitNum + "." + this.stubName
				+ "." + this.stubNameNum + "." + this.stubLabel + "." + this.stubLabelNum + "." + this.year + "."
				+ this.yearNum + "." + this.yearNum + "." + this.age + "." + this.ageNum + "." + this.estimate + "."
				+ this.flag;

	}

}
