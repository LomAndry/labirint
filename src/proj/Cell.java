package proj;

public class Cell {
	// Строка пройти
	String proh;
	private boolean n;
	private boolean s;
	private boolean w;
	private boolean e;
	
	public Cell(String proh) {
		this.proh = proh;
	}

	/**
	 * @return the proh
	 */
	public String getProi() {
		return proh;
	}

	/**
	 * @param proh the proh to set
	 */
	public void setProh(String proh) {
		this.proh = proh;
	}

	/**
	 * @return the n
	 */
	public boolean isN() {
		return n;
	}

	/**
	 * @param n the n to set
	 */
	public void setN(boolean n) {
		this.n = n;
	}

	/**
	 * @return the s
	 */
	public boolean isS() {
		return s;
	}

	/**
	 * @param s the s to set
	 */
	public void setS(boolean s) {
		this.s = s;
	}

	/**
	 * @return the w
	 */
	public boolean isW() {
		return w;
	}

	/**
	 * @param w the w to set
	 */
	public void setW(boolean w) {
		this.w = w;
	}

	/**
	 * @return the e
	 */
	public boolean isE() {
		return e;
	}

	/**
	 * @param e the e to set
	 */
	public void setE(boolean e) {
		this.e = e;
	}
	
}
