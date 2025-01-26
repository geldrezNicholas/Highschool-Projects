package assignments;

public class Maple {

	String refDate = "";
	String geo = "";
	String dguid = "";
	String mapleProd = "";
	String uom = "";
	String uomId = "";
	String scalarFactor = "";
	String scalarID = "";
	String vector = "";
	String coordinate = "";
	String value = "";
	String status = "";
	String symbol = "";
	String terminated = "";
	String decimals = "";

	// Default Constructor
	public Maple() {

		this.refDate = "";
		this.geo = "";
		this.dguid = "";
		this.mapleProd = "";
		this.uom = "";
		this.uomId = "";
		this.scalarFactor = "";
		this.scalarID = "";
		this.vector = "";
		this.coordinate = "";
		this.value = "";
		this.status = "";
		this.symbol = "";
		this.terminated = "";
		this.decimals = "";

	}

	// Parameterized Constructor
	public Maple(String r, String g, String d, String m, String u, String uo, String s, String sc, String v, String c,
			String va, String st, String sy, String t, String de) {

		this.refDate = r;
		this.geo = g;
		this.dguid = d;
		this.mapleProd = m;
		this.uom = u;
		this.uomId = uo;
		this.scalarFactor = s;
		this.scalarID = sc;
		this.vector = v;
		this.coordinate = c;
		this.value = va;
		this.status = st;
		this.symbol = sy;
		this.terminated = t;
		this.decimals = de;

	}

	public String getRef() {

		return this.refDate;

	}

	public String getGeo() {

		return this.geo;

	}

	public String getDGUID() {

		return this.dguid;

	}

	public String getMapleProd() {

		return this.mapleProd;

	}

	public String getUOM() {

		return this.uom;

	}

	public String getUOMID() {

		return this.uomId;

	}

	public String getScalarFactor() {

		return this.scalarFactor;

	}

	public String getScalarID() {

		return this.refDate;

	}

	public String getVector() {

		return this.vector;

	}

	public String getCoordinate() {

		return this.coordinate;

	}

	public String getValue() {

		return this.value;

	}

	public String getStatus() {

		return this.status;

	}

	public String getSymbol() {

		return this.symbol;

	}

	public String getTerminated() {

		return this.terminated;

	}

	public String getDecimals() {

		return this.decimals;

	}

	public void getRefDate(String r) {

		this.refDate = r;

	}

	public void setGeo(String g) {

		this.geo = g;

	}

	public void setDGUID(String d) {

		this.dguid = d;

	}

	public void setMapleProd(String m) {

		this.mapleProd = m;

	}

	public void setUOM(String u) {

		this.uom = u;

	}

	public void setUOMID(String uo) {

		this.uomId = uo;

	}

	public void setScalarFactor(String s) {

		this.scalarFactor = s;

	}

	public void setScalarID(String sc) {

		this.scalarID = sc;

	}

	public void setVector(String v) {

		this.vector = v;

	}

	public void setCoordinate(String c) {

		this.coordinate = c;

	}

	public void setValue(String v) {

		this.value = v;

	}

	public void setStatus(String st) {

		this.status = st;

	}

	public void setSymbol(String sy) {

		this.symbol = sy;

	}

	public void setTerminated(String t) {

		this.terminated = t;

	}

	public void setDecimals(String d) {

		this.decimals = d;

	}

	@Override
	public String toString() {

		return super.toString() + "." + this.refDate + "." + this.geo + "." + this.dguid + "." + this.mapleProd + "."
				+ this.uom + "." + this.uomId + "." + this.scalarFactor + "." + this.scalarID + "." + this.vector + "."
				+ this.coordinate + "." + this.value + "." + this.status + "." + this.symbol + "." + this.terminated
				+ "." + this.decimals;

	}

}
