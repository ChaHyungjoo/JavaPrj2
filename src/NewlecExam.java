import oop.interf.AvgListener;
import oop.interf.Exam;

public class NewlecExam extends Exam {
	
	private int com;
	
	public NewlecExam() {
		this(0,0,0,0);
	}
	
	public NewlecExam(int kor, int eng, int math, int com) {
		super(kor, eng, math);
		this.com = com;
		
/*		class AAA  implements AvgListener {	//내부클래스, 중첩클래스
			
			@Override
			public double avg() {
				
				return total()/4.0;
			}
		}*/
/*		AvgListener a = new AvgListener() {	//익명클래스
			
			@Override
			public double avg() {
				
				return total()/4.0;
			}
		};*/
		
//		setAvgListener(this);
//		setAvgListener(new AAA());
//		setAvgListener(a);
/*		setAvgListener(new AvgListener() {
			
			@Override
			public double avg() {
				
				return total()/4.0;
			}
		});*/
		
		setAvgListener(()-> total()/4.0);	//람다식??
	}
	
	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}
	
	@Override
	public int total() {
		return super.total() + com;
	}
	
/*	@Override
	public double avg() {
		return this.total()/5.0;
	}*/
	

	
	
}
