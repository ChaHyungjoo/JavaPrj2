import java.util.Scanner;
import oop.interf.Exam;
import oop.interf.ExamConsole;

public class NewlecExamConsole extends ExamConsole {
	
	private NewlecExam exam;
	
	@Override
	public Exam newExam() {
		exam = new NewlecExam();
		return exam;
	}
	
	@Override
	public void input() {
		super.input();
		
		Scanner scan = new Scanner(System.in);
		int com=0;
		do{
			 System.out.print("\t\t컴퓨터: ");
			 com = scan.nextInt();
			 if(com<0||com>100) System.out.println("0~100까지의 점수를 입력하세요.");
		 }while(com<0||com>100);
		
		exam.setCom(com);
		
	}

/*	@Override
	protected void onInput(Exam exam) {
		Scanner scan = new Scanner(System.in);
		int com=0;
		do{
			 System.out.print("\t\t컴퓨터: ");
			 com = scan.nextInt();
			 if(com<0||com>100) System.out.println("0~100까지의 점수를 입력하세요.");
		 }while(com<0||com>100);
		
		((NewlecExam)exam).setCom(com);
	}*/

	@Override
	protected void onPrint(Exam exam) {
		int com = this.exam.getCom();
		System.out.printf("\t\t컴퓨터: %d\n", com);
	}
	
}
