package myservice.mynamespace.DemoRestApi;

public class TestResult {
	private int review;
	private int fail;
	private int pass;
	
	public TestResult(int review, int fail, int pass) {
        this.review = review;
        this.fail = fail;
        this.pass = pass;
    }
	
	public int getReview() {
		return review;
	}
	public void setReview(int review) {
		this.review = review;
	}
	public int getFail() {
		return fail;
	}
	public void setFail(int fail) {
		this.fail = fail;
	}
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	
}
